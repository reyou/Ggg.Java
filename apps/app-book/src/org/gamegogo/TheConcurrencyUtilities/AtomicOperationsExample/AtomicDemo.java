package org.gamegogo.TheConcurrencyUtilities.AtomicOperationsExample;

// A simple example of Atomic.
class AtomicDemo {
    public static void main(String args[]) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
