package org.gamegogo.inheritence;

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show("This is k: "); // this calls show() in B
        subOb.show2(); // this calls show() in A
    }
}
