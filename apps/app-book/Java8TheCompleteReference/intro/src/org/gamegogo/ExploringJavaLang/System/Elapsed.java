package org.gamegogo.ExploringJavaLang.System;

// Timing program execution.
class Elapsed {
    public static void main(String args[]) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");
// time a for loop from 0 to 100,000,000
        start = System.currentTimeMillis(); // get starting time
        for (long i = 0; i < 100000000L; i++) ;
        end = System.currentTimeMillis(); // get ending time

        // nano time
        start = System.nanoTime(); // get starting time
        for(long i=0; i < 100000000L; i++) ;
        end = System.nanoTime(); // get ending time


        System.out.println("Elapsed time: " + (end - start));
        System.out.println("Elapsed nano time: " + (end - start));
    }
}
