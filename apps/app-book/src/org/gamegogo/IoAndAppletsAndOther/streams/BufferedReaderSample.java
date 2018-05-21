package org.gamegogo.IoAndAppletsAndOther.streams;

import java.io.*;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        /*After this statement executes, br is a character-based stream
        that is linked to the console through System.in.*/
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(streamReader);
    }
}
