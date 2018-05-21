package org.gamegogo.closerLookAtMethodsAndClasses;

// Objects may be passed to methods.
class Test {
    int a, b;


    Test(int i) {
        a = i;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else return false;
    }
}
