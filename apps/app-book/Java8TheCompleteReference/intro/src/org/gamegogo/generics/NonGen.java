package org.gamegogo.generics;

// NonGen is functionally equivalent to Gen
// but does not use generics.
class NonGen {
    // ob is now of type Object
    Object ob;

    // Pass the constructor a reference to
// an object of type Object
    NonGen(Object o) {
        ob = o;
    }

    // Return type Object.
    Object getob() {
        return ob;
    }

    // Show type of ob.
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

