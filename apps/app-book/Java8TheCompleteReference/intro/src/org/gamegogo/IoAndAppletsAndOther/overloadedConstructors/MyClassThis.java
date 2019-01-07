package org.gamegogo.IoAndAppletsAndOther.overloadedConstructors;

class MyClassThis {
    int a;
    int b;

    // initialize a and b individually
    MyClassThis(int i, int j) {
        a = i;
        b = j;
    }

    // initialize a and b to the same value
    MyClassThis(int i) {
        this(i, i); // invokes MyClass(i, i)
    }

    // give a and b default values of 0
    MyClassThis() {
        this(0); // invokes MyClass(0)
    }
}

