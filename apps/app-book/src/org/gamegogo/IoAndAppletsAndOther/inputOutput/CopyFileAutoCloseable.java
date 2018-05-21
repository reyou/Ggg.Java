package org.gamegogo.IoAndAppletsAndOther.inputOutput;

/* A version of CopyFile that uses try-with-resources.
It demonstrates two resources (in this case files) being
managed by a single try statement.
*/

import java.io.*;

class CopyFileAutoCloseable {
    public static void main(String args[]) throws IOException {
        int i;
// First, confirm that both files have been specified.
        String file1 = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum.txt";
        String file2 = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum-copy.txt";
// Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(file1);
             FileOutputStream fout = new FileOutputStream(file1)) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
