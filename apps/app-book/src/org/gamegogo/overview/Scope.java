package org.gamegogo.overview;

// Demonstrate block scope.
public class Scope {
    public static void main(String args[]) {
        System.out.println("ScopeFun");
        // known to all code within main
        int x;
        x = 10;
        // start new scope
        if (x == 10) {
            // known only to this block
            int y = 20;
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        // x is still known here.
        System.out.println("x is " + x);
        System.out.println("");
    }
}
