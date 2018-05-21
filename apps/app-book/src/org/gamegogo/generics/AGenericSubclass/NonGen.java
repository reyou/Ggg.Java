package org.gamegogo.generics.AGenericSubclass;

// A non-generic class can be the superclass
// of a generic subclass.
// A non-generic class.
class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}
