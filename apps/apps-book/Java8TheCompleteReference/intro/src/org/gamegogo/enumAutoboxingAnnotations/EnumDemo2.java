package org.gamegogo.enumAutoboxingAnnotations;

class EnumDemo2 {
    // Use the built-in enumeration methods.
    // An enumeration of apple varieties.
    enum Apple {
        Jonathan, GoldenDel, RedDel, Winesap, Cortland
    }

    public static void main(String args[]) {
        Apple ap;
        System.out.println("Here are all Apple constants:");
// use values()
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
        {
            System.out.println(a);
        }
        System.out.println();
// use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}