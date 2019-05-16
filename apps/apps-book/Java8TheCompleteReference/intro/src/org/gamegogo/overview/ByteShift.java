package org.gamegogo.overview;

// Left shifting a byte value.
class ByteShift {
    public static void main(String args[]) {
        System.out.println("ByteShiftFun");
        byte a = 64, b;
        int i;
        // Left shifting a byte value
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
        System.out.println("\n");
    }
}
