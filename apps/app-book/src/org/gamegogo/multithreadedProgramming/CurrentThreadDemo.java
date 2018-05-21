package org.gamegogo.multithreadedProgramming;

// Controlling the main Thread.
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread: " + t);

        // change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);

        try {
            for (int n = 3; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Main thread interrupted.");
        }
        try {
            MultiException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Exception occured: " + e);
            e.printStackTrace();
        }
    }

    public static void MultiException() throws InterruptedException,
            IllegalAccessException, ArithmeticException {
        for (int i = 0; i < 2; i++) {
            Thread.sleep(1000);
        }
        int a = 0;
        int b = 10;
        int result = b / a;
        throw new IllegalAccessException("demo");

    }
}
