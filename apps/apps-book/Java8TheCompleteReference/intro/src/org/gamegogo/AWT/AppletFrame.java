package org.gamegogo.AWT;

import java.applet.Applet;
import java.awt.*;

// Create frame window.
public class AppletFrame extends Applet {
    Frame f;

    public void init() {
        f = new SampleFrame("A frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(false);
    }

    public void paint(Graphics g) {
        g.drawString("This is in applet window", 10, 20);
    }
}
