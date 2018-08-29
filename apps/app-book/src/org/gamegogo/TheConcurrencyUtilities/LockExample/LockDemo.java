package org.gamegogo.TheConcurrencyUtilities.LockExample;

// A simple lock example.
import java.util.concurrent.locks.*;
class LockDemo {
    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}
