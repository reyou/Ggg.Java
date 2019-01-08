// Use an image with a button.
package com.company;

// A simple demonstration of Radio Buttons.
//
// This program responds to the action events generated
// by a radio button selection. It also shows how to
// fire the button under program control.

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {
    Label response;

    public static void main(String[] args) {
        // Start the JavaFX application by calling launch().
        PrintThreadInfo("main");
        launch(args);
    }

    // Override the start() method.
    public void start(Stage myStage) {
        // Give the stage a title.
        myStage.setTitle("Demonstrate Radio Buttons");
// Use a FlowPane for the root node. In this case,
// vertical and horizontal gaps of 10.
        FlowPane rootNode = new FlowPane(10, 10);
// Center the controls in the scene.
        rootNode.setAlignment(Pos.CENTER);
// Create a scene.
        Scene myScene = new Scene(rootNode, 220, 120);
// Set the scene on the stage.
        myStage.setScene(myScene);
// Create a label that will report the selection.
        response = new Label("");
// Create the radio buttons.
        RadioButton rbTrain = new RadioButton("Train");
        RadioButton rbCar = new RadioButton("Car");
        RadioButton rbPlane = new RadioButton("Airplane");

        // Create a toggle group.
        ToggleGroup tg = new ToggleGroup();

        tg.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            // Cast new to RadioButton.
            RadioButton rb = (RadioButton) newValue;
            PrintThreadInfo("addListener");
            // Display the selection
            response.setText("Transport selected is " + rb.getText());
        });

// Add each button to a toggle group.
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        rbTrain.setSelected(true);
// Add the label and buttons to the scene graph.
        rootNode.getChildren().addAll(rbTrain, rbCar, rbPlane, response);
// Show the stage and its scene.
        myStage.show();
    }

    private static void PrintThreadInfo(String message) {
        Thread currentThread = Thread.currentThread();
        System.out.println(message + " Current Thread Id: " + currentThread.getId());
    }
}