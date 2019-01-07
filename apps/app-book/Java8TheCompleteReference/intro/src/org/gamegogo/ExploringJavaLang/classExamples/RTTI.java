package org.gamegogo.ExploringJavaLang.classExamples;

class RTTI {
    public static void main(String args[]) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;

        // get Class reference
        clObj = x.getClass();
        System.out.println("x is object of type: " + clObj.getName());

        // get Class reference
        clObj = y.getClass();
        System.out.println("y is object of type: " + clObj.getName());

        clObj = clObj.getSuperclass();
        System.out.println("y's superclass is " + clObj.getName());
    }
}
