package org.gamegogo.EventHandling;

// This applet does NOT use an inner class.

import java.applet.*;
import java.awt.event.*;

/*
<applet code="MousePressedDemo" width=200 height=100>
</applet>
*/
public class MousePressedDemo extends Applet {
    public void init() {
        addMouseListener(new MyMouseAdapter2(this));
    }
}

class MyMouseAdapter2 extends MouseAdapter {
    MousePressedDemo mousePressedDemo;

    public MyMouseAdapter2(MousePressedDemo mousePressedDemo) {
        this.mousePressedDemo = mousePressedDemo;
    }

    public void mousePressed(MouseEvent me) {
        mousePressedDemo.showStatus("Mouse Pressed.");
    }
}
