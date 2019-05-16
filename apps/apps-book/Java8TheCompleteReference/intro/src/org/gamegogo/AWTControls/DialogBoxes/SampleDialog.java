package org.gamegogo.AWTControls.DialogBoxes;

// Demonstrate Dialog box.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="DialogDemo" width=250 height=250>
</applet>
*/
// Create a subclass of Dialog.
class SampleDialog extends Dialog implements ActionListener {
    SampleDialog(Frame parent, String title) {
        super(parent, title, false);
        setLayout(new FlowLayout());
        setSize(300, 200);
        add(new Label("Press this button:"));
        Button b;
        add(b = new Button("Cancel"));
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }

    public void paint(Graphics g) {
        g.drawString("This is in the dialog box", 10, 70);
    }
}

