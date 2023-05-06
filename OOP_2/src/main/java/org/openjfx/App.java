package org.openjfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class App extends Application {

    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {
        // create root layout
        root = new BorderPane();
        
        // create menu bar
        VBox menuBar = new VBox();
        menuBar.setPadding(new Insets(10));
        menuBar.setSpacing(5);

        Button homeBtn = new Button("Home");
        homeBtn.setOnAction(e -> showHomePage());

        Button page1Btn = new Button("Page 1");
        page1Btn.setOnAction(e -> showPage1());
        page1Btn.getStyleClass().addAll("bottom-left-button", "button");

        // set button position to bottom left
        VBox.setMargin(page1Btn, new Insets(0,0,0,0));
        menuBar.getChildren().addAll(homeBtn, page1Btn);
        VBox.setMargin(menuBar, new Insets(0,0,0,0));

        root.setLeft(menuBar);

        // create home page
        Label homeLabel = new Label("Welcome to the home page!");
        VBox homePane = new VBox(homeLabel);
        homePane.setPadding(new Insets(10));
        homePane.setSpacing(5);

        root.setCenter(homePane);

        // create page 1
        Label page1Label = new Label("This is page 1!");
        VBox page1Pane = new VBox(page1Label);
        page1Pane.setPadding(new Insets(10));
        page1Pane.setSpacing(5);

        // create scene
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setTitle("My App");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // set alignment of menuBar to bottom left
        menuBar.setAlignment(Pos.BOTTOM_LEFT);
    }

    private void showHomePage() {
        Label homeLabel = new Label("Welcome to the home page!");
        VBox homePane = new VBox(homeLabel);
        homePane.setPadding(new Insets(10));
        homePane.setSpacing(5);

        root.setCenter(homePane);
    }

    private void showPage1() {
        Label page1Label = new Label("This is page 1!");
        VBox page1Pane = new VBox(page1Label);
        page1Pane.setPadding(new Insets(10));
        page1Pane.setSpacing(5);

        root.setCenter(page1Pane);
    }

    
    public static void main(String[] args) {
        launch();
    }

}
