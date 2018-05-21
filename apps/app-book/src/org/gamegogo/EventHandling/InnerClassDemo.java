package org.gamegogo.EventHandling;
// Inner class demo.

import java.applet.*;
import java.awt.event.*;

/*
<applet code="InnerClassDemo" width=200 height=100>
</applet>
*/
public class InnerClassDemo extends Applet {
    public void init() {
        addMouseListener(new MyMouseAdapterInner());
    }

    class MyMouseAdapterInner extends MouseAdapter {
        public void mousePressed(MouseEvent me) {
            showStatus("Mouse Pressed");
        }
    }
}