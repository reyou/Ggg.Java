package org.gamegogo.generics.UsingaGenericSuperclass;

// A subclass of Gen that defines a second
// type parameter, called V.
class Gen3<T, V> extends Gen<T> {
    V ob2;

    Gen3(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}

