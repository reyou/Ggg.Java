package Java8CompleteReference.ExploringSwing.TheSwingButtons.JButtonExample;

// Demonstrate an icon-based JButton.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="JButtonDemo" width=250 height=750>
</applet>
*/
public class JButtonDemo extends JApplet
        implements ActionListener {
    JLabel jlab;

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
// Change to flow layout.
        setLayout(new FlowLayout());
// Add buttons to content pane.
        ImageIcon hourglass = new ImageIcon("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\TheSwingButtons\\JButtonExample\\hourglass.png");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("Hourglass");
        jb.addActionListener(this);
        add(jb);
        ImageIcon analog = new ImageIcon("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\TheSwingButtons\\JButtonExample\\analog.png");
        jb = new JButton(analog);
        jb.setActionCommand("Analog Clock");
        jb.addActionListener(this);
        add(jb);
        ImageIcon digital = new ImageIcon("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\TheSwingButtons\\JButtonExample\\digital.png");
        jb = new JButton(digital);
        jb.setActionCommand("Digital Clock");
        jb.addActionListener(this);
        add(jb);
        ImageIcon stopwatch = new ImageIcon("C:\\Github\\Ggg.Github\\Ggg.Java\\apps\\app-book-swing\\src\\Java8CompleteReference\\ExploringSwing\\TheSwingButtons\\JButtonExample\\stopwatch.png");
        jb = new JButton(stopwatch);
        jb.setActionCommand("Stopwatch");
        jb.addActionListener(this);
        add(jb);
// Create and add the label to content pane.
        jlab = new JLabel("Choose a Timepiece");
        add(jlab);
    }

    // Handle button events.
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand());
    }
}