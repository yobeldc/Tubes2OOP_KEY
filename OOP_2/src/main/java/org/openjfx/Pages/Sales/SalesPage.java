package org.openjfx.Pages.Sales;

import java.io.File;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class SalesPage extends HBox{
    private Integer currentBill = 1;
    private MenuItem currentMenuItem;

    public SalesPage() {
        
        VBox rightSide = new VBox();
        rightSide.setPrefWidth(411);
        rightSide.setMaxWidth(411);
        rightSide.setMinWidth(411);
        rightSide.getStyleClass().addAll("page");

        HBox header = new HBox();
        header.setPrefHeight(40);
        header.setMinHeight(40);
        header.getStyleClass().addAll("page2");

        Button hamburgerButton = new Button();
        hamburgerButton.getStyleClass().add("hamburger");
        ImageView icon = new ImageView(new Image(getClass().getResource("/hamburger.png").toExternalForm()));
        icon.setFitHeight(28);
        icon.setFitWidth(28);
        hamburgerButton.setGraphic(icon);
        
        Label bill = new Label("On Going Bill " + currentBill);
        bill.setFont(new Font(16));
        HBox.setMargin(bill, new Insets(0, 100, 0, 100));
        
        MenuItem billMenuItem = new MenuItem();
        billMenuItem.setText(bill.getText());
        ContextMenu menu = new ContextMenu();
        menu.getItems().addAll(billMenuItem);
        
        currentMenuItem = billMenuItem;
        
        Button addBtn = new Button("+");
        addBtn.setStyle("-fx-text-fill: white;");
        addBtn.getStyleClass().add("hamburger");
        addBtn.setFont( new Font(20));
        addBtn.setPrefWidth(20);
        addBtn.setPrefHeight(20);
        addBtn.setOnAction(event -> {
            // add a new menu item and set its action
            MenuItem newItem = createMenuItem("On Going Bill " + ++currentBill);
            newItem.setOnAction(e -> handleMenuItemSelection(newItem, bill));
            menu.getItems().add(newItem);
        });

        hamburgerButton.setContextMenu(menu);
        hamburgerButton.setOnAction(event -> {
            menu.show(hamburgerButton, Side.BOTTOM, 0, 0);
        });

        header.getChildren().addAll(hamburgerButton, bill, addBtn);
        header.setAlignment(Pos.CENTER);

        // THIS IS WHERE LIST OF FOOD
        Region body = new Region();
        body.getStyleClass().addAll("white");
        VBox.setVgrow(body, Priority.ALWAYS);

        // THIS IS HOW MUCH YOU PAY
        VBox body2 = new VBox();
        body2.setPrefHeight(175);
        body2.getStyleClass().addAll("page3");
        
        // THIS CONTAINS SIMPAN DAN BAYAR BUTTON
        HBox footer = new HBox();
        footer.setPrefHeight(65);
        footer.getStyleClass().addAll("page");

        VBox simpan = new VBox();
        simpan.setPrefSize(110, 28);
        simpan.setMaxWidth(110);
        simpan.setMaxHeight(28);
        simpan.getStyleClass().addAll("boxButton");
        Text textsimpan = new Text("Simpan");
        
        simpan.setOnMouseClicked(e -> {
            // TODO
            System.out.println("Simpan");
        });

        simpan.getChildren().add(textsimpan);
        HBox.setMargin(simpan, new Insets(0, 10, 0, 0));
        simpan.setAlignment(Pos.CENTER);
        
        VBox bayar = new VBox();
        bayar.setPrefSize(110, 28);
        bayar.setMaxWidth(110);
        bayar.setMaxHeight(28);
        bayar.getStyleClass().addAll("boxButton");
        Text textbayar = new Text("Bayar");

        bayar.setOnMouseClicked(e -> {
            // TODO
            System.out.println("Bayar");
        });
        
        bayar.getChildren().add(textbayar);
        HBox.setMargin(bayar, new Insets(0, 0, 0, 10));
        bayar.setAlignment(Pos.CENTER);
        
        footer.getChildren().addAll(simpan, bayar);
        footer.setAlignment(Pos.CENTER);
        
        rightSide.getChildren().addAll(header, body, body2, footer);
        
        VBox leftSide = new VBox();
        leftSide.setPrefWidth(1100);
        leftSide.setMaxWidth(1100);
        leftSide.getStyleClass().addAll("page");
        
        // Create a TilePane to hold the ImageView nodes
        TilePane gallery = new TilePane();
        
        // Set the TilePane properties
        gallery.setPadding(new Insets(30, 30, 30, 30));
        gallery.setVgap(50);
        gallery.setHgap(50);
        
        // Set the maximum number of columns
        gallery.setPrefColumns(4);
        
        // Loop through the images and create ImageView nodes for each one
        for (int i = 1; i <= 21; i++) { // looping ke semua barang yang ada di inventory
            VBox vbox = new VBox();
            vbox.getStyleClass().addAll("white");
            vbox.setAlignment(Pos.CENTER);
            
            String caption = "barang ke-" + i;
            javafx.scene.text.Text captionText = new javafx.scene.text.Text(caption);
            VBox.setMargin(captionText, new Insets(10, 0, 0, 0));
            
            String harga = "harganya berapa?";
            javafx.scene.text.Text harganya = new javafx.scene.text.Text(harga);
            VBox.setMargin(harganya, new Insets(10, 0, 0, 0));
            
            Integer stok = 100; // misalkan stok di inventory cuma ada 100, spinner maxnya cuma ngisi 100
            Spinner<Integer> spinner = new Spinner<>(0, stok, 0, 1);
            spinner.setMaxWidth(80);
            VBox.setMargin(spinner, new Insets(10, 0, 10, 0));
            
            // Load the image file
            String imageUrl = "OOP_2/src/main/resources/kwetiaw.jpg";
            File imageFile = new File(imageUrl);
            
            // Create the ImageView node
            Image image = new Image(imageFile.toURI().toString());
            ImageView imageView = new ImageView(image);
            
            // Set the ImageView properties
            imageView.setFitWidth(150);
            imageView.setPreserveRatio(true);
            
            // Add the ImageView to the TilePane
            vbox.getChildren().addAll(imageView, captionText, harganya, spinner);
            gallery.getChildren().add(vbox);
        }
        
        gallery.setPrefWidth(1100);
        gallery.setMaxWidth(1100);
        gallery.setAlignment(Pos.CENTER);
        gallery.getStyleClass().addAll("page");
        
        // Wrap the TilePane in a ScrollPan
        ScrollPane scrollPane = new ScrollPane(gallery);
        scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        
        leftSide.getChildren().addAll(scrollPane);
        leftSide.setAlignment(Pos.CENTER);
        
        HBox salespage = new HBox();
        salespage.setSpacing(13);
        salespage.getChildren().addAll(leftSide);
        salespage.getChildren().addAll(rightSide);
        salespage.setAlignment(Pos.CENTER_RIGHT);
        
        getChildren().add(salespage);
    }

    private MenuItem createMenuItem(String text) {
        MenuItem item = new MenuItem(text);
        item.setOnAction(event -> handleMenuItemSelection(item, null));
        return item;
    }

    private void handleMenuItemSelection(MenuItem menuItem, Label label) {
        // update the current menu item and content
        currentMenuItem = menuItem;
        if (label != null) {
            label.setText(currentMenuItem.getText());
        }
    }
}
