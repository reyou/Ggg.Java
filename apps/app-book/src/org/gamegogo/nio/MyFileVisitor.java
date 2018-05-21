package org.gamegogo.nio;

// A simple example that uses walkFileTree( ) to display a directory tree.
// Requires JDK 7 or later.

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

// Create a custom version of SimpleFileVisitor that overrides
// the visitFile( ) method.
/*A simple visitor of files with default behavior to visit
all files and to re-throw I/O errors.
Methods in this class may be overridden subject
to their general contract.*/
class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String args[]) {
        String dirname = GetCurrentDirectory();
        System.out.println("Directory tree starting with " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }

    private static String GetCurrentDirectory() {
        String property = System.getProperty("user.dir");
        return property;
    }
}