package org.gamegogo.networking;

// Demonstrate URLConnection.

import java.net.*;
import java.io.*;
import java.util.Date;

class UCDemo {
    public static void main(String args[]) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        /*The abstract class URLConnection is the superclass of all classes
        that represent a communications link between the application and a URL.
        Instances of this class can be used both to read from and to write to the
        resource referenced by the URL. In general, creating a connection to a URL is a
        multistep process:*/
        // Returns a URLConnection instance that represents a
        // connection to the remote object referred to by the URL.
        URLConnection hpCon = hp.openConnection();
// get date
        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("No date information.");
        } else {
            System.out.println("Date: " + new Date(d));
        }
// get content type
        System.out.println("Content-Type: " + hpCon.getContentType());
// get expiration date
        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("No expiration information.");
        } else {
            System.out.println("Expires: " + new Date(d));
        }
// get last-modified date
        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("No last-modified information.");
        } else {
            System.out.println("Last-Modified: " + new Date(d));
        }
// get content length
        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("Content length unavailable.");
        } else {
            System.out.println("Content-Length: " + len);
        }
        if (len != 0) {
            System.out.println("=== Content ===");
            /*Returns an input stream that reads from this open connection.
            A SocketTimeoutException can be thrown when reading from the returned
            input stream if the read timeout expires before data is available for read.*/
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No content available.");
        }
    }
}