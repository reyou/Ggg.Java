package org.gamegogo.TheConcurrencyUtilities.ParallelProgrammingChapter.RecursiveTaskExample;

// A simple example that uses RecursiveTask<V>.
import java.util.concurrent.*;
// A RecursiveTask that computes the summation of an array of doubles.
class Sum extends RecursiveTask<Double> {
    // The sequential threshold value.
    final int seqThresHold = 10;
    // Array to be accessed.
    double[] data;
    // Determines what part of data to process.
    int start, end;
    Sum(double[] vals, int s, int e ) {
        data = vals;
        start = s;
        end = e;
    }
    // Find the summation of an array of doubles.
    protected Double compute() {
        double sum = 0;
// If number of elements is below the sequential threshold,
// then process sequentially.
        if((end - start) < seqThresHold) {
// Sum the elements.
            System.out.println(String.format("ThreadId: %s",Thread.currentThread().getId()));
            for(int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else {
// Otherwise, continue to break the data into smaller pieces.
// Find the midpoint.
            int middle = (start + end) / 2;
// Invoke new tasks, using the subdivided data.
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);
// Start each subtask by forking.
            subTaskA.fork();
            subTaskB.fork();
// Wait for the subtasks to return, and aggregate the results.
            sum = subTaskA.join() + subTaskB.join();
        }
// Return the final sum.
        return sum;
    }
}
