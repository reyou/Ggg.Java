package org.gamegogo.AWT.CreatingWindowedProgram;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseAdapter implements MouseListener {
    private final AppWindow appWindow;

    public MyMouseAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        appWindow.mouseX = e.getX();
        appWindow.mouseY = e.getY();
        appWindow.mousemsg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
