package org.gamegogo.AWT.HandlingEventsFrameWindow;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowAdapter implements WindowListener {
    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.sampleFrame = sampleFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        sampleFrame.setVisible(false);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
