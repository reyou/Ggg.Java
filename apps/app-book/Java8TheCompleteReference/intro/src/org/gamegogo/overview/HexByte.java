package org.gamegogo.overview;

// Masking sign extension.
class HexByte {
    static public void main(String args[]) {
        System.out.println("HexByteFun");
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("\nExample 2:");
        System.out.println("Right shifting as a quick way to divide by 2.\n");
        int num2 = 2048;
        for (int i = 0; i < 10; i++) {
            num2 = num2 >> 1;
            System.out.println(num2);
        }
        System.out.println("\n");
    }
}


