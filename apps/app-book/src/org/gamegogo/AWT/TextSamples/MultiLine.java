package org.gamegogo.AWT.TextSamples;

// Demonstrate multiline output.

import java.applet.*;
import java.awt.*;
/*
<applet code="MultiLine" width=300 height=100>
</applet>
*/

public class MultiLine extends Applet {
    int curX = 0, curY = 0; // current position

    public void init() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
/*Sets the font of this container.
This method changes layout-related information,
and therefore, invalidates the component hierarchy.*/
        setFont(f);
    }
/*Paints the container. This forwards the paint to any lightweight
components that are children of this container.
If this method is reimplemented, super.paint(g) should be
called so that lightweight components are properly rendered.
If a child component is entirely clipped by the current clipping setting
in g, paint() will not be forwarded to that child.*/
    @Override
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        nextLine("This is on line one.", g);
        nextLine("This is on line two.", g);
        sameLine(" This is on same line.", g);
        sameLine(" This, too.", g);
        nextLine("This is on line three.", g);
        curX = curY = 0; // Reset coordinates for each repaint.
    }

    // Advance to next line.
    void nextLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight(); // advance to next line
        curX = 0;
        g.drawString(s, curX, curY);
        curX = fm.stringWidth(s); // advance to end of line
    }

    // Display on same line.
    void sameLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s); // advance to end of line
    }
}
