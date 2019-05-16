package org.gamegogo.multithreadedProgramming;

// Create a second thread.
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo thread");
        System.out.println("Child thread: " + t);
        // start the thread
        t.start();
    }

    // This is the entry point for the second thread.
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
