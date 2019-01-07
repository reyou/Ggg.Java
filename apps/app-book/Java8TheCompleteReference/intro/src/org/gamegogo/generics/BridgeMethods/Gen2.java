package org.gamegogo.generics.BridgeMethods;

// A subclass of Gen.
class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }

    // A String-specific override of getob().
    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}

