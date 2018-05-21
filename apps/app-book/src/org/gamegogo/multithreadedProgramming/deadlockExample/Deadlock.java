package org.gamegogo.multithreadedProgramming.deadlockExample;

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();


    Deadlock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        // get lock on a in this thread.
        a.foo(b);
        System.out.println("Back in main thread");
    }

    @Override
    public void run() {
        // get lock on b in other thread.
        b.bar(a);
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}
