package org.gamegogo.IoAndAppletsAndOther.applets;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    /* The paint( ) method has one parameter of type Graphics.
    This parameter contains the graphics context, which describes
    the graphics environment in which the applet is running.
    This context is used whenever output to the applet is required.*/
    /*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
    public void paint(Graphics g) {
        g.drawString("A simple Appler", 20, 20);
    }
}
