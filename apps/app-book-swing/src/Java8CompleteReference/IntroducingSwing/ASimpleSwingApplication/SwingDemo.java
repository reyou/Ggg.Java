package Java8CompleteReference.IntroducingSwing.ASimpleSwingApplication;

// A simple Swing application.

import javax.swing.*;

public class SwingDemo {

    SwingDemo(){

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A simple Swing Application");

        // Give the frame an initial size.
        jfrm.setSize(275,100);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        JLabel jlab = new JLabel(" Swing means powerful GUIs");

        // Add the label to the content pane.
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    public static void main(String args[]){
        // Create the frame on the event dispatching thread.
        // https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingUtilities.html#invokeLater-java.lang.Runnable-
        /* The difference between the two methods is that invokeLater( ) returns immediately,
but invokeAndWait( ) waits until obj.run( ) returns.*/
        SwingUtilities.invokeLater(() -> new SwingDemo());
    }

}
