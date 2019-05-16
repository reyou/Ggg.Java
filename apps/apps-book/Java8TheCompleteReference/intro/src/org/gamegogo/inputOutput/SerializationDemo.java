package org.gamegogo.inputOutput;

// A serialization demo.
// This program uses try-with-resources. It requires JDK 7 or later.

import java.io.*;

public class SerializationDemo {
    public static void main(String args[]) throws FileNotFoundException {
// Object serialization
        FileOutputStream serial = new FileOutputStream("serial");
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(serial)) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }
// Object deserialization
        FileInputStream fileInputStream = new FileInputStream("serial");
        try (ObjectInputStream objIStrm = new ObjectInputStream(fileInputStream)) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during deserialization: " + e);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}