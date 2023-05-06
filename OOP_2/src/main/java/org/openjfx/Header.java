package org.openjfx;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Header extends HBox {

    public Header() {
        Button newTabButton = new Button("New Tab");
        getChildren().add(newTabButton);
    }
}