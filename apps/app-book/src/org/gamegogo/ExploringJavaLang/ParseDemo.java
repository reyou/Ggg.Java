package org.gamegogo.ExploringJavaLang;

/* This program sums a list of numbers entered
by the user. It converts the string representation
of each number into an int using parseInt().
*/

import java.io.*;

class ParseDemo {
    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String str;
        int i;
        int sum = 0;
        System.out.println("Enter numbers, 0 to quit.");
        do {
            str = bufferedReader.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        }
        while (i != 0);
    }
}