package org.gamegogo.exceptionHandling;
// Handle an exception and move on.

import java.util.Random;

class HandleError {
    public static void main(String args[]) {
        int a, b, c;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero. " + e);
                // set a to zero and continue
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}

