package org.gamegogo.generics.RawTypesandLegacyCode;

// Demonstrate a raw type.
class Gen<T> {
    // declare an object of type T
    T ob;

    // Pass the constructor a reference to
// an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}

