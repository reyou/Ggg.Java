package org.gamegogo.overview;

// Demonstrate ?.
public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        // get absolute value of i
        k = i < 0 ? -i : i;
        System.out.println("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        // get absolute value of i
        k = i < 0 ? -i : i;
        System.out.println("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
