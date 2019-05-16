package org.gamegogo.inheritence;

// Create another subclass by extending B.
class C extends B {
    C() {

        System.out.println("Inside C's constructor.");
    }
    // override callme()
    void callme() {
        System.out.println("Inside C's callme method");
    }
}
