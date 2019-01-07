package org.gamegogo.ExploringJavaLang.clone;

class CloneDemo {
    public static void main(String args[]) {
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        // clone x1
        x2 = x1.cloneTest();

        x1.a += 1;
        x1.b += 1;

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);

    }
}
