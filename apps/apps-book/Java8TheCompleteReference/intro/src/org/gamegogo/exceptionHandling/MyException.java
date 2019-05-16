package org.gamegogo.exceptionHandling;

// This program creates a custom exception type.
public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + "]";
    }
}
