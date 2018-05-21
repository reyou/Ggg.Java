package org.gamegogo.inputOutput;

// Demonstrate FileReader.
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.*;

class FileReaderDemo {
    public static void main(String args[]) {
        String fileName = "D:\\Git\\Ggg\\Ggg.Java\\app\\src\\org\\gamegogo\\inputOutput\\FileReaderDemo.java";
        try (FileReader fr = new FileReader(fileName)) {
            int c;
// Read and display the file.
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}