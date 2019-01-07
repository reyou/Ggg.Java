package org.gamegogo.AWTControls.FileDialog;

/* Demonstrate File Dialog box.
This is an application, not an applet.
*/

import java.awt.*;

// Create a subclass of Frame.
// Demonstrate FileDialog.
class FileDialogDemo {
    public static void main(String args[]) {
// create a frame that owns the dialog
        Frame f = new SampleFrame("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100, 100);
        FileDialog fd = new FileDialog(f, "File Dialog");
        fd.setVisible(true);
    }
}