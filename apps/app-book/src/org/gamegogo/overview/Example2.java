package org.gamegogo.overview;

/*
Here is another short example.
Call this file "Example2.java".
*/

public class Example2 {
    public static void main(String args[]) {
        // this declares a variable called num
        int num;
        // this assigns num the value 100
        num = 100;
        System.out.println("This is num: " + num);
        num = num * 2;
        System.out.print("The value of num * 2 is ");
        // Prints an integer and then terminate the line.
        // This method behaves as though it invokes print(int)
        // and then println().
        System.out.println(num);
    }

    public void ifFun(int num) {
        if (num < 100) {
            System.out.println("num is less than 100");
        }
    }
}
