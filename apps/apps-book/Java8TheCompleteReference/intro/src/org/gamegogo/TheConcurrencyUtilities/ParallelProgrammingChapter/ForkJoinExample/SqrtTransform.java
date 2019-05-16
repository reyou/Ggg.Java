package org.gamegogo.TheConcurrencyUtilities.ParallelProgrammingChapter.ForkJoinExample;

// A simple example of the basic divide-and-conquer strategy.
// In this case, RecursiveAction is used.
import java.util.concurrent.*;
import java.util.*;
// A ForkJoinTask (via RecursiveAction) that transforms
// the elements in an array of doubles into their square roots.
// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/RecursiveAction.html
class SqrtTransform extends RecursiveAction {
    // The threshold value is arbitrarily set at 1,000 in this example.
// In real-world code, its optimal value can be determined by
// profiling and experimentation.
    final int seqThreshold = 1000;
    // Array to be accessed.
    double[] data;
    // Determines what part of data to process.
    int start, end;
    SqrtTransform(double[] vals, int startParam, int endParam ) {
        data = vals;
        start = startParam;
        end = endParam;
    }
    // This is the method in which parallel computation will occur.
    protected void compute() {
// If number of elements is below the sequential threshold,
// then process sequentially.
        System.out.println("(end - start) < seqThreshold: " + ((end - start) < seqThreshold));
        // https://dzone.com/articles/java-string-format-examples
        System.out.println(String.format("(%s - %s) < %s: \n",end,start,seqThreshold));
        if((end - start) < seqThreshold) {
// Transform each element into its square root.
            System.out.println(String.format("Current ThreadId: %s",Thread.currentThread().getId()));
            for(int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
// Otherwise, continue to break the data into smaller pieces.
// Find the midpoint.
            int middle = (start + end) / 2;
// Invoke new tasks, using the subdivided data.
// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinTask.html
// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinTask.html#invokeAll-java.util.concurrent.ForkJoinTask...-
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}
