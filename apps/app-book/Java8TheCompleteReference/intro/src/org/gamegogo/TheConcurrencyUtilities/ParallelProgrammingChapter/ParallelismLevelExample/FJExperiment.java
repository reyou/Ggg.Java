package org.gamegogo.TheConcurrencyUtilities.ParallelProgrammingChapter.ParallelismLevelExample;

import java.util.concurrent.ForkJoinPool;

// Demonstrate parallel execution.
class FJExperiment {
    public static void main(String args[]) {
        int pLevel = 3;
        int threshold = 10;
// These variables are used to time the task.

// Create a task pool. Notice that the parallelism level is set.
// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinPool.html
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[100];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = (double) i;
        }
        Transform task = new Transform(nums, 0, nums.length, threshold);
// Starting timing.
        long beginTime = System.nanoTime();
// Start the main ForkJoinTask.
        // Await and obtain result
        fjp.invoke(task);
// End timing.
       long endTime = System.nanoTime();
        System.out.println("Level of parallelism: " + pLevel);
        System.out.println("Sequential threshold: " + threshold);
        System.out.println("Elapsed time: " + (endTime - beginTime) + " ns");
        System.out.println();
    }
}
