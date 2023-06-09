package org.openjfx.Pages.Inventori;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;

import javafx.collections.*;

import org.openjfx.Structs.Barang.*;



public class InventoriPage extends VBox {
    public InventoriPage() {
        setPadding(new Insets(10));
        setSpacing(5);
        getStyleClass().addAll("page");

        //========================TITLE========================
        // Create a new box for the title
        VBox titleBox = new VBox();
        titleBox.getStyleClass().addAll("box2");
        titleBox.setPrefSize(1200, 30);
        titleBox.setMaxWidth(1200);
        titleBox.setMaxHeight(30);
        titleBox.setStyle("-fx-border-radius: 20;");
        titleBox.setStyle("-fx-background-radius: 20;");

        // Add label as a title
        Label daftarLabel = new Label("INVENTORI");
        daftarLabel.setFont(Font.font("Inter", FontWeight.BOLD, 75)); 
        daftarLabel.setTextFill(Color.WHITE);
        VBox.setMargin(daftarLabel, new Insets(0, 0, 0, 0));
        titleBox.getChildren().add(daftarLabel);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setAlignment(Pos.CENTER);

        //========================CUSTOMIZE========================
        // Create a new customize box 
        HBox customizeBox = new HBox();
        customizeBox.getStyleClass().addAll("box");
        customizeBox.setPrefSize(1200, 75);
        customizeBox.setMaxWidth(1200);
        customizeBox.setMaxHeight(150);
        customizeBox.setStyle("-fx-border-radius: 20;");
        customizeBox.setStyle("-fx-background-radius:20;");

        // Create a new HBox for the left corner buttons
        HBox leftButtonsBox = new HBox();
        leftButtonsBox.setAlignment(Pos.CENTER_LEFT);
        leftButtonsBox.setSpacing(15);
        leftButtonsBox.setPadding(new Insets(10, 10, 10, 25));

        // Add "Ubah Nomor Telepon" text field to leftButtonsBox
        TextField searchField = new TextField();
        searchField.setPromptText("Cari Barang");
        searchField.setStyle("-fx-border-radius: 10; -fx-background-radius: 10");
        searchField.setPrefWidth(200);
        searchField.setPrefHeight(25);
        leftButtonsBox.getChildren().add(searchField);

        // Add "Mode Edit" button to leftButtonsBox
        Button modeEditButton = new Button("Mode Edit");
        modeEditButton.setPrefHeight(25);
        modeEditButton.setStyle("-fx-background-color: #FFFFFF; -fx-border-radius: 10; -fx-background-radius: 10");
        leftButtonsBox.getChildren().add(modeEditButton);

        // Create a new Region node
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); // Set the region to grow horizontally

        // Create a new HBox for the right corner buttons
        HBox rightButtonsBox = new HBox();
        rightButtonsBox.setAlignment(Pos.CENTER_RIGHT);
        rightButtonsBox.setSpacing(15);
        rightButtonsBox.setPadding(new Insets(10, 25, 10, 10));

        // Add "Hapus Perubahan" button to rightButtonsBox
        Button hapusButton = new Button("Hapus Perubahan");
        hapusButton.setStyle("-fx-background-color: #F24D4D; -fx-border-radius: 10; -fx-background-radius: 10; -fx-text-fill: #FFFFFF;");
        hapusButton.setPrefHeight(25);
        rightButtonsBox.getChildren().add(hapusButton);

        // Add "Simpan Perubahan" button to rightButtonsBox
        Button simpanButton = new Button("Simpan Perubahan");
        simpanButton.setPrefHeight(25);
        simpanButton.setStyle("-fx-background-color: #84E182; -fx-border-radius: 10; -fx-background-radius: 10; -fx-text-fill: #FFFFFF;");
        rightButtonsBox.getChildren().add(simpanButton);

        // Add the leftButtonsBox, spacer, and rightButtonsBox to customizeBox
        customizeBox.getChildren().addAll(leftButtonsBox, spacer, rightButtonsBox);
        customizeBox.setAlignment(Pos.CENTER);

        //========================LIST========================
        // Create a new box for the list
        VBox listBox = new VBox();
        listBox.getStyleClass().addAll("box2");
        listBox.setPrefSize(1250, 400);
        listBox.setMaxWidth(1250);
        listBox.setMaxHeight(400);
        listBox.setAlignment(Pos.CENTER);

       // Create the table and columns
        TableView<Barang> table = new TableView<>();
        
        InventoriPageController.initiateTable(table);
        // Create an ObservableList to hold the data for the TableView
        // ObservableList<Barang> data = FXCollections.observableArrayList();
        // Add the Barang data to the ObservableListnew Barang("heee", "pnom", 10, 30000, 20000)
        // data.add(new Barang("heee", "pnom", 10, 30000, 20000));


        // Set the items of the TableView to the ObservableList
       
        // table.setItems(data);

        
        // Add the table to the list box
        listBox.getChildren().add(table);

       

        //=================================================


        // Add the titleBox, customizeBox, and listBox to the StackPane
        getChildren().addAll(titleBox, customizeBox, listBox);
        setAlignment(Pos.TOP_CENTER);

        //========================AddBarang========================
        // Create a new VBox for the green button
        VBox addBarangBox = new VBox();
        addBarangBox.setPadding(new Insets(20));
        addBarangBox.setSpacing(10);
        addBarangBox.setAlignment(Pos.BOTTOM_RIGHT);

        // Create a green button
        Button addBarang = new Button("+ Tambah Barang");
        addBarang.setPrefHeight(35);
        addBarang.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-background-radius: 10; -fx-border-radius: 10");

        // Add the green button to the addBarangBox
        addBarangBox.getChildren().add(addBarang);

        // Add the addBarangBox to the StackPane with margins
        StackPane.setMargin(addBarangBox, new Insets(10));
        StackPane.setAlignment(addBarangBox, Pos.BOTTOM_RIGHT);
        getChildren().add(addBarangBox);
    }
}










