package org.gamegogo.enumAutoboxingAnnotations;

// Demonstrate autoboxing/unboxing.
class AutoBox {
    public static void main(String args[]) {
        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        // displays 100 100
        System.out.println(i + " " + iOb);
    }
}
