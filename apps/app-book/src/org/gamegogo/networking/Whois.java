package org.gamegogo.networking;
// Demonstrate Sockets.

import java.net.*;
import java.io.*;

public class Whois {
    public static void main(String args[]) throws IOException {
        int c;
        // Create a socket connected to internic.net, port 43 (who is).
        Socket socket = new Socket("whois.internic.net", 43);

        // Obtain input and output streams.
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        // Construct a request string.
        String str = (args.length == 0 ? "eksisozluk.com" : args[0]) + "\n";
        // Convert to bytes.
        byte buf[] = str.getBytes();

        // Send request.
        out.write(buf);

        // Read and display response.
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        socket.close();
    }
}
