package org.gamegogo.inputOutput;

// Demonstrate DataInputStream and DataOutputStream.
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.*;

class DataIODemo {
    public static void main(String args[]) throws FileNotFoundException {
// First, write the data.
        FileOutputStream outputStream = new FileOutputStream("Test.dat");
        try (DataOutputStream dout = new DataOutputStream(outputStream)) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
// Now, read the data back.
        FileInputStream fileInputStream = new FileInputStream("Test.dat");
        try (DataInputStream din = new DataInputStream(fileInputStream)) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}