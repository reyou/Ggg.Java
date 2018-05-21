package org.gamegogo.IoAndAppletsAndOther.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* Copy a file.
To use this program, specify the name
of the source file and the destination file.
For example, to copy a file called FIRST.TXT
to a file called SECOND.TXT, use the following
command line.
java CopyFile FIRST.TXT SECOND.TXT
*/
public class CopyFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, confirm that both files have been specified.
        String file1 = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum.txt";
        String file2 = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum-copy.txt";
        // Copy a File
        try {
            // Attempt to open the files
            fin = new FileInputStream(file1);
            fout = new FileOutputStream(file2);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                } else {
                    System.out.println(file1 + " has been copied to " + file2);
                }
            }
            while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing Output File");
            }
        }

    }
}
