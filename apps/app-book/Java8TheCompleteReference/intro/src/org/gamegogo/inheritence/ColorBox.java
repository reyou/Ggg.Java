package org.gamegogo.inheritence;

public class ColorBox extends Box {
    public static void main(String[] args) {
        ColorBox colorBox = new ColorBox(10, 10, 10, 10);
    }

    // color of box
    int color;

    ColorBox(double w, double h, double d, int c) {
        super(w, h, d);
        System.out.println("Constructor called.");
        color = c;
    }

    static {
        System.out.println("Static 1 is called.");
    }

    static {
        System.out.println("Static 2 is called.");
    }
}
