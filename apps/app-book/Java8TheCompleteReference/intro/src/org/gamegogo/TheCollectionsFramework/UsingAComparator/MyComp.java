package org.gamegogo.TheCollectionsFramework.UsingAComparator;

// Use a custom comparator.

import java.util.Comparator;
import java.util.TreeSet;

// A reverse comparator for strings.
/*A comparison function, which imposes a total ordering on some collection of objects.
Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort)
to allow precise control over the sort order. */
public class MyComp implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        // Reverse the comparison.
        return aStr.compareTo(bStr);
    }

    // No need to override equals or the default methods.
}

class CompDemo {
    public static void main(String args[]) {
        // Create a tree set.
        MyComp mc = new MyComp(); // Create a comparator
        TreeSet<String> ts = new TreeSet<>(mc.reversed());

        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Display the elements.
        for (String element : ts) {
            System.out.print(element + " ");
        }

        System.out.println();

    }
}
