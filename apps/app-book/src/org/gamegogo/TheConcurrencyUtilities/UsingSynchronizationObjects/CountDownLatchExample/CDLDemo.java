package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.CountDownLatchExample;

// An example of CountDownLatch.
import java.util.concurrent.CountDownLatch;
class CDLDemo {
    public static void main(String args[]) {
        /*A synchronization aid that allows one or
        more threads to wait until a set of operations being performed
        in other threads completes.*/
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Starting");
        new MyThread(cdl);
        try {
            /*Causes the current thread to wait until the latch has counted
            down to zero, unless the thread is interrupted.*/
            System.out.println("Awaiting for CountDownLatch");
            cdl.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Done");
    }
}
