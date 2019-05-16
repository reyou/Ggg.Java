package org.gamegogo.controlStatements;

// Using break as a civilized form of goto.
public class Break {
    public static void main(String args[]) {
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println("Before the break.");
                    if(t){
                        // break out of second block
                        break second;
                    }
                    System.out.println("This won't execute (third block)");
                }
                System.out.println("This won't execute (second block)");
            }
            System.out.println("This is after second block (first block)");
        }
    }
}
