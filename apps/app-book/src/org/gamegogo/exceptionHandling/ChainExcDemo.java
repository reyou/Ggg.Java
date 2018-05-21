package org.gamegogo.exceptionHandling;

// Demonstrate exception chaining.
public class ChainExcDemo {
    static void demoproc() {
        // create an exception
        NullPointerException e = new NullPointerException("top layer");

        // add a cause
        /*Initializes the cause of this throwable to the specified value.
        (The cause is the throwable that caused this throwable to get thrown.)
This method can be called at most once. It is generally called from within
the constructor, or immediately after creating the throwable.*/
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);

            // display cause exception
            /*Returns the cause of this throwable or null if the cause is
            nonexistent or unknown. (The cause is the throwable that caused
            this throwable to get thrown.)*/
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
