package org.openjfx;

import org.openjfx.Bar.Sidebar;
import org.openjfx.Pages.Home.HomePageController;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import org.openjfx.Pages.Home.*;
import org.openjfx.Bar.*;
import org.openjfx.Data.*;
import org.openjfx.Structs.Barang.*;
import org.openjfx.Data.JsonParser.*;


public class App extends Application {

    private static BorderPane root;

    @Override
    public void start(Stage primaryStage) {
        // create root layout
        root = new BorderPane();
        root.setStyle("-fx-background-color: #206EB4;");

        // Create the header
        // Header header = new Header();
        // root.setTop(header);
        
        // create menu bar
        Sidebar sideBar = new Sidebar();
        root.setTop(sideBar);

        // show initial homepage
        HomePageController.showHomePage();

        // create scene      
        Scene scene = new Scene(root, 1300, 750);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setTitle("My App");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static BorderPane getRoot() {
        return root;
    }

    public static void main(String[] args) {
        // Data data = new Data("test.json");
        
    
        launch();
    }
}