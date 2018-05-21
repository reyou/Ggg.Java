package org.gamegogo.AWT;

// Demonstrate XOR mode.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="XOR" width=400 height=200>
</applet>
*/
public class XOR extends Applet {
    int chsX = 100, chsY = 100;

    public XOR() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                chsX = x - 10;
                chsY = y - 10;
                repaint();
            }
        });
    }
    /*Paints the container. This forwards the paint to any lightweight components that
    are children of this container. If this method is reimplemented, super.paint(g)
    should be called so that lightweight components are properly rendered.
    If a child component is entirely clipped by the current clipping setting in
    g, paint() will not be forwarded to that child.*/
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.setColor(Color.blue);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        g.setColor(Color.green);
        g.drawRect(10, 10, 60, 50);
        g.fillRect(100, 10, 60, 50);
        g.setColor(Color.red);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);
        g.fillRoundRect(70, 90, 140, 100, 30, 40);
        g.setColor(Color.cyan);
        g.drawLine(20, 150, 400, 40);
        g.drawLine(5, 290, 80, 19);
// xor cross hairs
        g.setXORMode(Color.black);
        g.drawLine(chsX - 10, chsY, chsX + 10, chsY);
        g.drawLine(chsX, chsY - 10, chsX, chsY + 10);
        g.setPaintMode();
    }
}
