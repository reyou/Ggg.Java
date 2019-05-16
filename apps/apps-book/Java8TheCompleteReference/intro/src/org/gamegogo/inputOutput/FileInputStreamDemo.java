package org.gamegogo.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Demonstrate FileInputStream.
// This program uses try-with-resources. It requires JDK 7 or later.
public class FileInputStreamDemo {
    public static void main(String args[]) {
        int size;
        // Use try-with-resources to close the stream.
        /*A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
FileInputStream is meant for reading streams of raw bytes such as image data.
For reading streams of characters, consider using FileReader.*/
        String path = "D:\\Git\\Ggg\\Ggg.Java\\app\\src\\org\\gamegogo\\inputOutput\\FileInputStreamDemo.java";
        try (FileInputStream f = new FileInputStream(path)) {
            System.out.println("Total Available Bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("First " + n +
                    " bytes of the file one read() at a time");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nStill Available: " + f.available());
            System.out.println("Reading the next " + n + " with one read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("couldn’t read " + n + " bytes.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + (size = f.available()));
            System.out.println("Skipping half of remaining bytes with skip()");
            f.skip(size / 2);
            System.out.println("Still Available: " + f.available());
            System.out.println("Reading " + n / 2 + " into the end of array");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("couldn’t read " + n / 2 + " bytes.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill Available: " + f.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
