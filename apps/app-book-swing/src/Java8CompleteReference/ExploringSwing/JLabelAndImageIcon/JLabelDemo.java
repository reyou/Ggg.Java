package Java8CompleteReference.ExploringSwing.JLabelAndImageIcon;

// Demonstrate JLabel and ImageIcon.

import javax.swing.*;

/*
<applet code="JLabelDemo" width=250 height=200>
</applet>
*/
public class JLabelDemo extends JApplet {
    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            makeGUI();
                        }
                    }
            );

        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {
// Create an icon.
        System.out.println(new java.io.File("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\JLabelAndImageIcon\\hourglass.png").exists());

        ImageIcon imageIcon = new ImageIcon("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\JLabelAndImageIcon\\hourglass.png");
// Create a label.
        JLabel jl = new JLabel("Hourglass", imageIcon, JLabel.CENTER);
// Add the label to the content pane.
        add(jl);
    }
}
