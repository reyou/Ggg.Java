package org.gamegogo.multithreadedProgramming.incorrectProducerConsumer;

class PC {
    /*Although the put( ) and get( ) methods on Q are synchronized, nothing stops the producer
from overrunning the consumer, nor will anything stop the consumer from consuming the
same queue value twice. Thus, you get the erroneous output shown here (the exact output
will vary with processor speed and task load):*/
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
