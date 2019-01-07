package org.gamegogo.multithreadedProgramming.incorrectProducerConsumer;

// The Runnable interface should be implemented by any class whose instances
// are intended to be executed by a thread. The class must define a
// method of no arguments called run.
class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

