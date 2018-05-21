package org.gamegogo.imagesSamples;

/*
 * <applet code="MemoryImageGenerator" width=256 height=256>
 * </applet>
 */

import java.applet.*;
import java.awt.*;
import java.awt.image.*;

public class MemoryImageGenerator extends Applet {
    Image img;

    @Override
    public void init() {
        Dimension d = getSize();
        int w = d.width;
        int h = d.height;
        System.out.println("w:" + w);
        System.out.println("h:" + h);
        if (w == 0) {
            w = 640;
        }
        if (h == 0) {
            h = 480;
        }
        System.out.println("w:" + w);
        System.out.println("h:" + h);
        int pixels[] = new int[w * h];
        int i = 0;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int r = (x ^ y) & 0xff;
                int g = (x * 2 ^ y * 2) & 0xff;
                int b = (x * 4 ^ y * 4) & 0xff;
                pixels[i++] = (255 << 24) | (r << 16) | (g << 8) | b;
            }
        }
        /*Constructs an ImageProducer object which uses an array of integers
        in the default RGB ColorModel to produce data for an Image object.*/
        img = createImage(new MemoryImageSource(w, h, pixels, 0, w));
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
}
