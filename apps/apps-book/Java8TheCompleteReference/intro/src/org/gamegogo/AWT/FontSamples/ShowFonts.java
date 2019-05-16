package org.gamegogo.AWT.FontSamples;

// Display Fonts
/*
<applet code="ShowFonts" width=550 height=60>
</applet>
*/

import java.applet.*;
import java.awt.*;

public class ShowFonts extends Applet {
    public void paint(Graphics g) {
        String msg = "";
        String FontList[];
        /*The GraphicsEnvironment class describes the collection of GraphicsDevice objects and Font objects
        available to a Java(tm) application on a particular platform. The resources in this GraphicsEnvironment
        might be local or on a remote machine. GraphicsDevice objects can be screens, printers or image
        buffers and are the destination of Graphics2D drawing methods. Each GraphicsDevice has a number of
        GraphicsConfiguration objects associated with it. These objects specify the different configurations in
        which the GraphicsDevice can be used.*/
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        FontList = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < FontList.length; i++) {
            msg += FontList[i] + " ";
        }
        g.drawString(msg, 4, 16);
    }
}
