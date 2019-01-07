package org.gamegogo.AWT.CreatingWindowedProgram;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*The listener interface for receiving keyboard events (keystrokes).
The class that is interested in processing a keyboard event either implements
this interface (and all the methods it contains) or extends the abstract KeyAdapter
class (overriding only the methods of interest).
The listener object created from that class is then registered with a component
using the component's addKeyListener method. A keyboard event is generated when a
key is pressed, released, or typed. The relevant method in the listener object is
then invoked, and the KeyEvent is passed to it.*/
public class MyKeyAdapter implements KeyListener {
    AppWindow appWindow;

    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    /*Indicates that a method declaration is intended to override a method
    declaration in a supertype. If a method is annotated with this annotation
    type compilers are required to generate an error message unless at least
    one of the following conditions hold:
The method does override or implement a method declared in a supertype.
The method has a signature that is override-equivalent to that of any
public method declared in Object.*/
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
