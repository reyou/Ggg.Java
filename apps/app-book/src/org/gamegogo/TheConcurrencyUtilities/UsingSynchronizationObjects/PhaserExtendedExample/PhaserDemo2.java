package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.PhaserExtendedExample;

// https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Phaser.html
class PhaserDemo2 {
    public static void main(String args[]) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Starting\n");
        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");
// Wait for the specified number of phases to complete.
        while(!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("The Phaser is terminated");
    }
}
