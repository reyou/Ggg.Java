package org.gamegogo.generics.OverridingMethods;

// Overriding a generic method in a generic class.
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
        System.out.print("Gen's getob(): ");
        return ob;
    }
}

