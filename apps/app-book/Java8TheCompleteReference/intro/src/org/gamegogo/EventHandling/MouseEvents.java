package org.gamegogo.EventHandling;

// Demonstrate the mouse event handlers.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/


public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // Display msg in applet window at current X,Y location.
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    @Override
    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me) {
// save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
// save coordinates
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Down";
        repaint();
    }

    @Override
    // Handle button released.
    public void mouseReleased(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }


    @Override
    // Handle mouse entered.
    public void mouseEntered(MouseEvent me) {
// save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    }

    @Override
    // Handle mouse exited.
    public void mouseExited(MouseEvent me) {
// save coordinates
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }


    @Override
    // Handle mouse dragged.
    public void mouseDragged(MouseEvent me) {
// save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }


    @Override
    // Handle mouse moved.
    public void mouseMoved(MouseEvent me) {
// show status
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
    }
}
