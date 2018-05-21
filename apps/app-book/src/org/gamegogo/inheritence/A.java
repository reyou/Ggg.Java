package org.gamegogo.inheritence;

// A simple example of inheritance.
// Create a superclass.
class A {
    int i;
    int j;

    A() {

    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }

    public void show2() {
        System.out.println("show2 i and j: " + i + " " + j);
    }

    void callme() {
        System.out.println("Inside A's callme method");
    }
}

