package org.gamegogo.LambdaExpressions.ConstructorReferencesGeneric;

class MyClass<T> {
    private T val;

    // A constructor that takes an argument.
    MyClass(T v) {
        val = v;
    }

    // This is the default constructor.
    MyClass() {
        val = null;
    }

    // ...
    T getVal() {
        return val;
    }
}
