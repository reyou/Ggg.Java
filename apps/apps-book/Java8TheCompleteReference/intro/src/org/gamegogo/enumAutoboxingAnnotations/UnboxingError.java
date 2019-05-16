package org.gamegogo.enumAutoboxingAnnotations;

// An error produced by manual unboxing.
/*This program displays not the expected value of 1000, but –24!
The reason is that the value inside iOb is manually unboxed by calling byteValue( ),
which causes the truncation of the value stored in iOb, which is 1,000.
This results in the garbage value of –24 being assigned to i.
Auto-unboxing prevents this type of error because the value in iOb will always
auto-unbox into a value compatible with int.*/
class UnboxingError {
    public static void main(String args[]) {
        Integer iOb = 1000; // autobox the value 1000
        int i = iOb.byteValue(); // manually unbox as byte !!!
        System.out.println(i); // does not display 1000 !
    }
}
