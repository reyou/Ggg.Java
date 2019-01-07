package org.gamegogo.generics.AGenericSubclass;

// A generic subclass.
class Gen<T> extends NonGen {
    // declare an object of type T
    T ob;

    // Pass the constructor a reference to
// an object of type T.
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

