package org.gamegogo.TheCollectionsFramework;

// Demonstrate iterators.

import java.util.*;

class IteratorDemo {
    public static void main(String args[]) {
// Create an array list.
        /*Resizable-array implementation of the List interface.
        Implements all optional list operations, and permits all elements,
        including null. In addition to implementing the List interface,
        this class provides methods to manipulate the size of the array that is
        used internally to store the list. (This class is roughly equivalent to
        Vector, except that it is unsynchronized.)*/
        ArrayList<String> al = new ArrayList<String>();
// Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
// Use iterator to display contents of al.
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
// Modify objects being iterated.
/*An iterator for lists that allows the programmer to traverse the list in
either direction, modify the list during iteration, and obtain the
iterator's current position in the list. A ListIterator has no current
element; its cursor position always lies between the element that would be
returned by a call to previous() and the element that would be returned by a
call to next(). An iterator for a list of length n has n+1 possible cursor positions.*/
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
// Now, display the list backwards.
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
