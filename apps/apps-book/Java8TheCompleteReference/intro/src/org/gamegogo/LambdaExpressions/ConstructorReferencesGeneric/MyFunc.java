package org.gamegogo.LambdaExpressions.ConstructorReferencesGeneric;

// Demonstrate a constructor reference with a generic class.
// MyFunc is now a generic functional interface.
interface MyFunc<T> {
    MyClass<T> func(T n);
}

