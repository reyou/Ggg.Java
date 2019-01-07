package org.gamegogo.overview;

// Left shifting as a quick way to multiply by 2.
class MultByTwo {
    public static void main(String args[]) {
        System.out.println("MultByTwoFun");
        int i;
        int num = 0xFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
        System.out.println("\nExample 2:");
        System.out.println("Left shifting as a quick way to multiply by 2.\n");
        int num2 = 2;
        for (i = 0; i < 10; i++) {
            num2 = num2 << 1;
            System.out.println(num2);
        }
        System.out.println("\n");
    }
}

