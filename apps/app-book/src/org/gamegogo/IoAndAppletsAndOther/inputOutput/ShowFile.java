package org.gamegogo.IoAndAppletsAndOther.inputOutput;

import java.io.*;

/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
*/
public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;

        // Attempt to open the file.
        try {
            String filePath = "D:\\Git\\Ggg\\Ggg.Sandbox\\textFiles\\lipsum.txt";
            fin = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
// Close the file.
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error Closing File");
        }

    }
}
