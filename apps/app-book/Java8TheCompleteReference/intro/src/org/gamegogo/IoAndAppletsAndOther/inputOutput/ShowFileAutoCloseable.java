package org.gamegogo.IoAndAppletsAndOther.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* This version of the ShowFile program uses a try-with-resources
statement to automatically close a file after it is no longer needed.
Note: This code requires JDK 7 or later.
*/
public class ShowFileAutoCloseable {
    public static void main(String args[]) {
        int i;
        String filePath = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum.txt";
        // The following code uses a try-with-resources statement to open
        // a file and then automatically close it when the try block is left.
        try (FileInputStream fin = new FileInputStream(filePath)) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }
    }
}
