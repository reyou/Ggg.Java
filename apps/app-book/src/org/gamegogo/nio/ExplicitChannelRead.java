package org.gamegogo.nio;

// Use Channel I/O to read a file. Requires JDK 7 or later.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String args[]) {
        int count;
        Path filepath = null;
// First, obtain a path to the file.
        try {
            // This class consists exclusively of static methods that
            // return a Path by converting a path string or URI.
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }
// Next, obtain a channel to that file within a try-with-resources block.
        /*
A byte channel that maintains a current position and allows the position to be changed.
A seekable byte channel is connected to an entity, typically a file, that
contains a variable-length sequence of bytes that can be read and written.
The current position can be queried and modified. The channel also provides access
to the current size of the entity to which the channel is connected.
The size increases when bytes are written beyond its current size; the size
decreases when it is truncated.*/
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
// Allocate a buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
// Read a buffer.
                count = fChan.read(mBuf);
// Stop when end of file is reached.
                if (count != -1) {
// Rewind the buffer so that it can be read.
                    /*Rewinds (geri sarmak) this buffer. The position is set to zero and the mark is discarded.
Invoke this method before a sequence of channel-write or get operations, assuming that
the limit has already been set appropriately.*/
                    mBuf.rewind();
// Read bytes from the buffer and show
// them on the screen as characters.
                    for (int i = 0; i < count; i++)
                    {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
