package org.gamegogo.multithreadedProgramming.overridesExamples;

public class ExtendThread {
    public static void main(String[] args) {
        // Create a new thread.
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");

        }
        System.out.println("Main thread exiting.");
    }
}
