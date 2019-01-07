package org.gamegogo.inputOutput;

// Demonstrate unread().
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.*;

class PushbackInputStreamDemo {
    public static void main(String args[]) {
        String s = "if (a == 4) a = 0;\n";
        byte buf[] = s.getBytes();
        /*A ByteArrayInputStream contains an internal buffer that contains bytes that
        may be read from the stream. An internal counter keeps track of the next byte
        to be supplied by the read method.
Closing a ByteArrayInputStream has no effect. The methods in this class can be called
after the stream has been closed without generating an IOException.*/
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        /*A PushbackInputStream adds functionality to another input stream, namely the
        ability to "push back" or "unread" one byte. This is useful in situations
        where it is convenient for a fragment of code to read an indefinite number
        of data bytes that are delimited by a particular byte value; after reading
        the terminating byte, the code fragment can "unread" it, so that the next read
        operation on the input stream will reread the byte that was pushed back.
        For example, bytes representing the characters constituting an identifier might be
        terminated by a byte representing an operator character; a method whose job is to
        read just an identifier can read until it sees the operator and then push the
        operator back to be re-read.*/
        try (PushbackInputStream f = new PushbackInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=')
                            System.out.print(".eq.");
                        else {
                            System.out.print("<-");
                            // Pushes back a byte by copying it to the front of the pushback buffer.
                            // After this method returns, the next byte to be read will have the
                            // value (byte)b.
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}