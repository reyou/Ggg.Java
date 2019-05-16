package org.gamegogo.AWT.CreatingWindowedProgram;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowAdapter implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
        /*Terminates the currently running Java Virtual Machine.
        The argument serves as a status code; by convention, a nonzero status code
        indicates abnormal termination.
This method calls the exit method in class Runtime.
This method never returns normally.*/
        System.exit(0);
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
