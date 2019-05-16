package org.gamegogo.multithreadedProgramming.isAlive;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread One is alive: " + ob1.thread.isAlive());
        System.out.println("Thread Two is alive: " + ob2.thread.isAlive());
        System.out.println("Thread Three is alive: " + ob3.thread.isAlive());

        try {
            System.out.println("Waiting for threads to finish.");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException ex) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: " + ob1.thread.isAlive());
        System.out.println("Thread Two is alive: " + ob2.thread.isAlive());
        System.out.println("Thread Three is alive: " + ob3.thread.isAlive());
        System.out.println("Main thread exiting.");
    }
}
