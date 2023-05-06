package org.openjfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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

        Button memberButton = new Button("Pendaftaran Member");
        memberButton.setOnAction(e -> showMemberPage());

        // Create the header
        HBox header = new HBox();
        Button newTabButton = new Button("New Tab");
        header.getChildren().add(newTabButton);

        // Add the header and content area to the BorderPane
        root.setTop(header);
        
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

        menuBar.getChildren().addAll(homeBtn, page1Btn, memberButton);
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
        VBox leftSide = new VBox();
        leftSide.getStyleClass().addAll("box");
        leftSide.setPrefWidth(659);
        leftSide.setMaxWidth(659);
        
        VBox rightSide = new VBox();
        rightSide.getStyleClass().addAll("page");
        rightSide.setPrefWidth(853);
        rightSide.setMaxWidth(853);
    
        HBox homePage = new HBox();
        homePage.setSpacing(5);
        homePage.getStyleClass().addAll("page");
        homePage.getChildren().add(leftSide);
        homePage.getChildren().add(rightSide);
    
        root.setCenter(homePage);
    }

    private void showPage1() {
        Label page1Label = new Label("This is page 1!");
        VBox page1Pane = new VBox(page1Label);
        page1Pane.setPadding(new Insets(10));
        page1Pane.setSpacing(5);
        root.setCenter(page1Pane);
    }

    private void showMemberPage() {
        VBox memberPage = new VBox();
        memberPage.setPadding(new Insets(10));
        memberPage.setSpacing(5);
        memberPage.getStyleClass().addAll("page");
        root.setCenter(memberPage);

        // Create a new box
        VBox textBox = new VBox();
        textBox.getStyleClass().addAll("box");
        textBox.setPrefSize(416, 529);
        textBox.setMaxWidth(416);
        textBox.setMaxHeight(529);

        // Add label as a title
        Label daftarLabel = new Label("Daftar Member Baru");
        VBox.setMargin(daftarLabel, new Insets(50, 0, 0, 0));
        textBox.getChildren().add(daftarLabel);
        textBox.setAlignment(Pos.TOP_CENTER);
        
        // Add text field for Nama
        TextField nameField = new TextField();
        nameField.setPromptText("Nama");
        textBox.getChildren().add(nameField);
        nameField.setPrefSize(335, 45);
        nameField.setMaxWidth(335);
        nameField.setMaxHeight(335);
        VBox.setMargin(nameField, new Insets(50, 0, 0, 0));
        
        // Add text field for Nomor Telepon
        TextField telephoneField = new TextField();
        telephoneField.setPromptText("Nomor Telepon");
        
        // Add a listener to the text field to validate user input
        telephoneField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                telephoneField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        
        // Add Nomor Telepon field to the VBox
        textBox.getChildren().add(telephoneField);
        telephoneField.setPrefSize(335, 45);
        telephoneField.setMaxWidth(335);
        telephoneField.setMaxHeight(335);
        VBox.setMargin(telephoneField, new Insets(50, 0, 0, 0));
        
        // Add Daftar Button
        Button daftar = new Button("Daftar");
        
        // TODO
        // daftar.setOnAction(e -> {
        //     String inputNama = nameField.getText();
        //     String inputNoTelp = telephoneField.getText();
        //     addMember(inputNama, inputNoTelp);
        //     }
        // );
        
        textBox.getChildren().add(daftar);
        daftar.setPrefSize(335, 45);
        daftar.setMaxWidth(335);
        daftar.setMaxHeight(335);
        VBox.setMargin(daftar, new Insets(50, 0, 0, 0));

        // Add the new box as a child of the homePane VBox
        memberPage.getChildren().add(textBox);
        memberPage.setAlignment(Pos.CENTER);
    }

    
    public static void main(String[] args) {
        launch();
    }

}
