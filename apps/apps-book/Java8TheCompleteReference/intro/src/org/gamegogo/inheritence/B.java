package org.gamegogo.inheritence;

// Create a subclass by extending class A.
class B extends A {
    int i; // this i hides the i in A
    int k;
    B() {

    }

    B(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        super.showij();
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {

        System.out.println("i+j+k: " + (i + j + k));
    }
    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }


}

