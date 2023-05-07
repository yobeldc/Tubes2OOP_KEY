package org.openjfx.Pages.Page1;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Page1 extends VBox {

    public Page1() {
        Label page1Label = new Label("This is page 1!");
        VBox page1Pane = new VBox(page1Label);
        page1Pane.setPadding(new Insets(10));
        page1Pane.setSpacing(5);
        getChildren().add(page1Pane);
    }
}