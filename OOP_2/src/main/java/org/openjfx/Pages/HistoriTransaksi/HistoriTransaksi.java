package org.openjfx.Pages.HistoriTransaksi;


import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.cell.*;
import javafx.scene.shape.*;
import javafx.collections.*;

public class HistoriTransaksi extends HBox {

    public HistoriTransaksi() {
        
        // Create a label for the dropdown
        Label dropdownLabel = new Label("Choose Customer's ID:");

        // Create a list of options for the dropdown
        ObservableList<String> options = FXCollections.observableArrayList(
                "Option 1",
                "Option 2",
                "Option 3"
        );

        // Create the ComboBox and set its options
        ComboBox<String> dropdown = new ComboBox<String>(options);

        VBox.setMargin(dropdownLabel, new Insets(20, 20, 20, 20));
        VBox.setMargin(dropdown, new Insets(0, 0, 0, 20));

        // Create the search form
        Label searchLabel = new Label("Search member name:");
        TextField searchField = new TextField();
        searchField.setPrefWidth(150);
        searchField.setMaxWidth(150);

        // Create the white block
        Rectangle whiteBlock = new Rectangle(250, 150);
        whiteBlock.setFill(Color.WHITE);
        VBox.setMargin(whiteBlock, new Insets(20, 0,0,0));

        // Create a VBox to contain the search form and white block
        VBox searchBox = new VBox();
        searchBox.setAlignment(Pos.CENTER);
        searchBox.setPadding(new Insets(150, 0, 0, 0));
        searchBox.getChildren().addAll(searchLabel, searchField, whiteBlock);

        // Add the dropdown and search box to the left side VBox
        VBox leftSide = new VBox();
        leftSide.getStyleClass().addAll("page");
        leftSide.setPrefWidth(300);
        leftSide.setMaxWidth(300);
        leftSide.setAlignment(Pos.TOP_LEFT);

        leftSide.getChildren().addAll(searchBox,dropdownLabel, dropdown);

        //===================+RIGHTSIDE========================


         //========================TITLE========================
        // Create a new box for the title
        VBox titleBox = new VBox();
        titleBox.getStyleClass().addAll("box2");
        titleBox.setPrefSize(1000, 30);
        titleBox.setMaxWidth(1000);
        titleBox.setMaxHeight(30);

        // Add label as a title
        Label daftarLabel = new Label("Histori Transaksi");
        daftarLabel.setFont(Font.font("Inter", FontWeight.BOLD, 75)); 
        daftarLabel.setTextFill(Color.WHITE);
        VBox.setMargin(daftarLabel, new Insets(0, 0, 0, 0));
        titleBox.getChildren().add(daftarLabel);
        titleBox.setAlignment(Pos.CENTER);
        
        


        // Create the content box
        VBox contentBox = new VBox();
        contentBox.getStyleClass().addAll("content-box");
        contentBox.setPrefHeight(650);
        contentBox.setMaxWidth(900);
        VBox.setMargin(contentBox, new Insets(50, 100, 50, 100));
        contentBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        // Create the button box
        VBox buttonBox = new VBox();
        buttonBox.setPrefHeight(150);
        buttonBox.setMaxWidth(1000);
    

        // Create the Print button
        Button printButton = new Button("Print");
        VBox.setMargin(printButton, new Insets(0, 0, 10, 900));

        // Add the buttons to the buttonBox
        buttonBox.getChildren().addAll(printButton);
        buttonBox.setAlignment(Pos.CENTER);

        // Add the content box to the right side VBox
        VBox rightSide = new VBox();
        rightSide.getStyleClass().addAll("box");
        rightSide.setPrefWidth(1000);
        rightSide.setMaxWidth(1000);
        rightSide.getChildren().addAll(titleBox, contentBox, buttonBox);

        
        //Homepage
        HBox homePage = new HBox();
        homePage.getStyleClass().addAll("page");
        homePage.getChildren().addAll(leftSide);
        homePage.getChildren().addAll(rightSide);

        getChildren().add(homePage);
    }
}