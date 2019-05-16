package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.SemSecondDemo;

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        for(int i=0; i < 20; i++) {
            q.get();
        }
    }
}

