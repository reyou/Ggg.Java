package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.SemSecondDemo;

// An implementation of a producer and consumer
// that use semaphores to control synchronization.
import java.util.concurrent.Semaphore;
class Q {
    int n;
    // Start with consumer semaphore unavailable.
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);
    void get() {
        try {
            semCon.acquire();
        } catch(InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Got: " + n);
        System.out.println("ThreadId: " + Thread.currentThread().getId());
        System.out.println("\n");
        semProd.release();
    }
    void put(int n) {
        try {
            semProd.acquire();
        } catch(InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.n = n;
        System.out.println("Put: " + n);
        System.out.println("ThreadId: " + Thread.currentThread().getId());
        System.out.println("\n");
        semCon.release();
    }
}

