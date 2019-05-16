package org.gamegogo.inputOutput;

import java.io.*;

/*Instances of classes that implement this interface are used to filter filenames.
These instances are used to filter directory listings in the list method of class File,
and by the Abstract Window Toolkit's file dialog component.*/
public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String args[]) {
        String dirname = "/temp/";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

