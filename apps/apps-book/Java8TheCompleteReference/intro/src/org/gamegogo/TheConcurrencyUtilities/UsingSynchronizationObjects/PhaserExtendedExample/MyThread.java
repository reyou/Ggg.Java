package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.PhaserExtendedExample;

import java.util.concurrent.Phaser;

// A thread of execution that uses a Phaser.
class MyThread implements Runnable {
    Phaser phsr;
    String name;
    MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }
    public void run() {
        while(!phsr.isTerminated()) {
            System.out.println("Thread " + name + " Beginning Phase " +
                    phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
// Pause a bit to prevent jumbled output. This is for illustration
// only. It is not required for the proper operation of the phaser.
            try {
                Thread.sleep(10);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
