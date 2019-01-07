package org.gamegogo.overview;

// Demonstrate casts.
class Conversion {
    public static void main(String args[]) {
        System.out.println("ConversionFun");
        byte b;
        int  i= 257;
        double d = 323.142;
        System.out.println("\nConversion of int to byte.");
        // When the value 257 is cast into a byte variable,
        // the result is the remainder of the division of 257 by 256
        // (the range of a byte), which is 1 in this case.
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

        // In cases where you understand the consequences of overflow,
        // you should use an explicit cast, such as
        byte b1 = 50;
        b1 = (byte)(b1 * 2);
        System.out.println("\nb1: " + b1);

        System.out.println("");
    }
}

