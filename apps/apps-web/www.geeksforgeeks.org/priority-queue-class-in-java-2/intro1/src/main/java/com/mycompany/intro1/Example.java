/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intro1;

import java.util.*;

/**
 *
 * @author dj_re
 */
public class Example {

    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        // Adding items to the pQueue using add()
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");

        // Printing the most priority element
        System.out.println("Head value using peek function: "
                + pQueue.peek());

        // Printing all elements
        System.out.println("\nThe queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("\nAfter removing an element"
                + "with poll function:");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Removing Java using remove() 
        pQueue.remove("Java");
        System.out.println("\nAfter removing Java with"
                + " remove function:");

        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Check if an element is present using contains()
        boolean b = pQueue.contains("C");
        System.out.println("\nPriority queue conteins C "
                + "or not?: " + b);
        
        // Getting objects from the queue using toArray()
        // in an array and print the array
        Object[] arr = pQueue.toArray();
        System.out.println("\nValue in array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Value: " + arr[i].toString());
        }
        
    }
}
