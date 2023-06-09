package org.openjfx.Pages.Member;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class MemberPage extends VBox {

    public MemberPage() {
        setPadding(new Insets(10));
        setSpacing(5);
        getStyleClass().addAll("page");

        // Create a new box
        VBox textBox = new VBox();
        textBox.getStyleClass().addAll("box");
        textBox.setStyle("-fx-border-radius: 25; -fx-background-radius: 25; -fx-background-color: #7CBAF2;");
        textBox.setPrefSize(416, 529);
        textBox.setMaxWidth(416);
        textBox.setMaxHeight(529);

        // Add label as a title
        Label daftarLabel = new Label("DAFTAR MEMBER BARU");
        daftarLabel.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        daftarLabel.setStyle("-fx-text-fill: #FFFFFF;");
        VBox.setMargin(daftarLabel, new Insets(50, 0, 0, 0));
        textBox.getChildren().add(daftarLabel);
        textBox.setAlignment(Pos.TOP_CENTER);

        // Add text field for Nama
        TextField nameField = new TextField();
        nameField.setPromptText("Nama");
        nameField.setStyle("-fx-border-radius: 10; -fx-background-radius: 10; -fx-text-fill: #0B4A83; -fx-font-size: 16px;");
        textBox.getChildren().add(nameField);
        nameField.setPrefSize(335, 45);
        nameField.setMaxWidth(335);
        nameField.setMaxHeight(335);
        VBox.setMargin(nameField, new Insets(50, 0, 0, 0));

        // Add text field for Nomor Telepon
        TextField telephoneField = new TextField();
        telephoneField.setPromptText("Nomor Telepon");
        telephoneField.setStyle("-fx-border-radius: 10; -fx-background-radius: 10; -fx-text-fill: #0B4A83; -fx-font-size: 16px;");


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
        daftar.setStyle("-fx-border-radius: 10; -fx-background-radius: 10; -fx-font-size: 20px; -fx-text-fill: #FFFFFF; -fx-background-color: #0B4A83; -fx-font-weight: bold");

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
        getChildren().add(textBox);
        setAlignment(Pos.CENTER);
    }
}