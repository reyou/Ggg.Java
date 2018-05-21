package org.gamegogo.TheCollectionsFramework;

// Demonstrate TreeSet.

import java.util.*;

class TreeSetDemo {
    public static void main(String args[]) {
// Create a tree set.
        // This implementation provides guaranteed log(n) time
        // cost for the basic operations (add, remove and contains).
        TreeSet<String> ts = new TreeSet<String>();
// Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}

