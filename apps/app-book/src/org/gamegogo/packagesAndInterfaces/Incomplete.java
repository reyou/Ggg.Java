package org.gamegogo.packagesAndInterfaces;

/*If a class includes an interface but does not fully implement the methods required by that
interface, then that class must be declared as abstract. For example:*/
abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}

class GggBooks extends Incomplete {

    @Override
    public void callback(int param) {

    }
}
