package org.gamegogo.AWT.CreatingWindowedProgram;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyAdapter implements KeyListener {
    AppWindow appWindow;

    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        appWindow.keymsg += e.getKeyChar();
        appWindow.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
