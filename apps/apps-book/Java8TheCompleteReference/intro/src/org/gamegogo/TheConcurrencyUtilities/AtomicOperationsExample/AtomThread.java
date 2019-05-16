package org.gamegogo.TheConcurrencyUtilities.AtomicOperationsExample;

// A thread of execution that increments count.
class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);
        for(int i=1; i <= 3; i++)
            System.out.println(name + " got: " +
                    Shared.ai.getAndSet(i));
    }
}
