package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.CyclicBarrierExample;

// An example of CyclicBarrier.
import java.util.concurrent.*;
class BarDemo {
    public static void main(String args[]) {
        /*A synchronization aid that allows a set of threads to all wait
        for each other to reach a common barrier point. */
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction() );
        System.out.println("Starting");
        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
        new MyThread(cb, "X");
        new MyThread(cb, "Y");
        new MyThread(cb, "Z");

    }
}
