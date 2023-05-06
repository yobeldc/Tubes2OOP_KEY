package org.openjfx.Home;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomePage extends VBox {

    public HomePage() {
        Label homeLabel = new Label("Welcome to the home page!");
        VBox homePane = new VBox(homeLabel);
        homePane.setPadding(new Insets(10));
        homePane.setSpacing(5);
        HBox.setMargin(homePane, new Insets(0, 0, 0, 200)); // Adjust the margin to center the content
        getChildren().add(homePane);
    }
}