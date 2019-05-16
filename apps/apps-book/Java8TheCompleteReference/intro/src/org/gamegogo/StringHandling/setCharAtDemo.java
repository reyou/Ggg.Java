package org.gamegogo.StringHandling;

// Demonstrate charAt() and setCharAt().
class setCharAtDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
        // String index out of range: 100
        // System.out.println("charAt(100) after = " + sb.charAt(100));
    }
}
