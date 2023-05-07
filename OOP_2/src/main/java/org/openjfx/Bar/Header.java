package org.openjfx.Bar;

import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;

public class Header extends HBox {
    public Header() {
        Button newTabButton = new Button("New Tab");
        getChildren().add(newTabButton);
    }
}