package org.openjfx;

import HomePageView.*;
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//import javafx.geometry.Pos;
//
//public class App extends Application {
//
//    private BorderPane root;
//
//    @Override
//    public void start(Stage primaryStage) {
//        // create root layout
//        root = new BorderPane();
//
//        // create menu bar
//        VBox menuBar = new VBox();
//        menuBar.setPadding(new Insets(10));
//        menuBar.setSpacing(5);
//
//        Button homeBtn = new Button("Home");
//        homeBtn.setOnAction(e -> showHomePage());
//
//        Button page1Btn = new Button("Page 1");
//        page1Btn.setOnAction(e -> showPage1());
//        page1Btn.getStyleClass().addAll("bottom-left-button", "button");
//
//        // set button position to bottom left
//        VBox.setMargin(page1Btn, new Insets(0,0,0,0));
//        menuBar.getChildren().addAll(homeBtn, page1Btn);
//        VBox.setMargin(menuBar, new Insets(0,0,0,0));
//
//        root.setLeft(menuBar);
//
//        // create home page
//        Label homeLabel = new Label("Welcome to the home page!");
//        VBox homePane = new VBox(homeLabel);
//        homePane.setPadding(new Insets(10));
//        homePane.setSpacing(5);
//
//        root.setCenter(homePane);
//
//        // create page 1
//        Label page1Label = new Label("This is page 1!");
//        VBox page1Pane = new VBox(page1Label);
//        page1Pane.setPadding(new Insets(10));
//        page1Pane.setSpacing(5);
//
//        // create scene
//        Scene scene = new Scene(root, 800, 600);
//        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
//
//        primaryStage.setTitle("My App");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        // set alignment of menuBar to bottom left
//        menuBar.setAlignment(Pos.BOTTOM_LEFT);
//    }
//
//    private void showHomePage() {
//        Label homeLabel = new Label("Welcome to the home page!");
//        VBox homePane = new VBox(homeLabel);
//        homePane.setPadding(new Insets(10));
//        homePane.setSpacing(5);
//
//        root.setCenter(homePane);
//    }
//
//    private void showPage1() {
//        Label page1Label = new Label("This is page 1!");
//        VBox page1Pane = new VBox(page1Label);
//        page1Pane.setPadding(new Insets(10));
//        page1Pane.setSpacing(5);
//
//        root.setCenter(page1Pane);
//    }
//
//
//    public static void main(String[] args) {
//        launch();
//    }
//
//}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();

        TopComponent topComponent = new TopComponent();

        topComponent.setTopComponent();

        MenuBar menuBar = topComponent.getMenuBar();
        TabPane tabPane = topComponent.getTabPane();

        // Set up event handlers for the menu items
//        page1MenuItem.setOnAction(event -> tabPane.getSelectionModel().select(page1Tab));
//        page2MenuItem.setOnAction(event -> tabPane.getSelectionModel().select(page2Tab));

        root.setTop(menuBar);
        root.setCenter(tabPane);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Menu;
//import javafx.scene.control.MenuBar;
//import javafx.scene.control.MenuItem;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class App extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//
//        BorderPane root = new BorderPane();
//
//        // Create a VBox container to hold the MenuBar
//        VBox menuBox = new VBox();
//
//        // Create a MenuBar with some menus and menu items
//        MenuBar menuBar = new MenuBar();
//        Menu fileMenu = new Menu("File");
//        Menu editMenu = new Menu("Edit");
//        MenuItem newItem = new MenuItem("New");
//        MenuItem openItem = new MenuItem("Open");
//        MenuItem saveItem = new MenuItem("Save");
//        MenuItem undoItem = new MenuItem("Undo");
//        MenuItem redoItem = new MenuItem("Redo");
//        fileMenu.getItems().addAll(newItem, openItem, saveItem);
//        editMenu.getItems().addAll(undoItem, redoItem);
//        menuBar.getMenus().addAll(fileMenu, editMenu);
//
//        // Add the MenuBar to the VBox container
//        menuBox.getChildren().add(menuBar);
//
//        // Set the background color of the VBox container
//        menuBox.setStyle("-fx-background-color: #336699;");
//
//        root.setTop(menuBox);
//
//        Scene scene = new Scene(root, 400, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

