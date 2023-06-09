package org.openjfx.Pages.UpdateMember;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class UpdateMemberPage extends VBox {

    public UpdateMemberPage() {
        VBox finalBox = new VBox();
        finalBox.getStyleClass().addAll("page3");
        finalBox.setPrefSize(800, 675);
        finalBox.setStyle("-fx-border-radius: 25; -fx-background-radius: 25;");
        finalBox.setMaxWidth(800);
        finalBox.setMaxHeight(675);
        finalBox.setAlignment(Pos.CENTER);

        VBox UpdateMemberPage = new VBox();
        UpdateMemberPage.setPadding(new Insets(10));
        UpdateMemberPage.setSpacing(5);
        UpdateMemberPage.getStyleClass().addAll("page");
        
        // Create a new box
        VBox searchBox = new VBox();
        searchBox.getStyleClass().addAll("box");
        searchBox.setStyle("-fx-border-radius: 15; -fx-background-radius: 15;");
        searchBox.setPrefSize(600, 75);
        searchBox.setMaxWidth(600);
        searchBox.setMaxHeight(75);
        VBox.setMargin(searchBox, new Insets(0, 0, 10, 0));
        
        HBox search = new HBox();
        search.setAlignment(Pos.CENTER_LEFT);
        search.getStyleClass().addAll("box");
        search.setPrefSize(400, 47);
        search.setMaxWidth(400);
        search.setMaxHeight(47);

        // Create the icon
        Button searchBtn = new Button();
        searchBtn.setPrefSize(30, 30);
        searchBtn.setMaxWidth(30);
        searchBtn.setMaxHeight(30);
        ImageView icon = new ImageView(new Image(getClass().getResource("/search.png").toExternalForm()));
        icon.setFitHeight(20);
        icon.setFitWidth(20);
        searchBtn.setGraphic(icon);
        
        // Create the text field
        TextField memberField = new TextField();
        memberField.setPromptText("Cari Nama Member");
        memberField.setPrefSize(290, 30);
        memberField.setMaxWidth(290);
        memberField.setMaxHeight(30);
        
        // Add the icon and text field to the HBox
        search.getChildren().addAll(searchBtn, memberField);
        HBox.setMargin(searchBtn, new Insets(0, 0, 0, 40));
        
        searchBox.getChildren().addAll(search);
        searchBox.setAlignment(Pos.CENTER);
        
        // Create a new box
        VBox inputBox = new VBox();
        inputBox.getStyleClass().addAll("box");
        inputBox.setStyle("-fx-border-radius: 25; -fx-background-radius: 25;");
        inputBox.setPrefSize(416, 500);
        inputBox.setMaxWidth(416);
        inputBox.setMaxHeight(500);

        // Add label as a title
        Label updateLabel = new Label("PERBARUI INFORMASI MEMBER");
        updateLabel.setStyle("-fx-text-fill: #FFFFFF;");
        updateLabel.setFont(Font.font("Inter", FontWeight.BOLD, 24));
        VBox.setMargin(updateLabel, new Insets(50, 0, 0, 0));
        inputBox.setAlignment(Pos.TOP_CENTER);
        
        // Add text field for Ubah Nama
        TextField nameField = new TextField();
        nameField.setPromptText("Ubah Nama");
        nameField.setStyle("-fx-border-radius:10; -fx-background-radius:10;");
        nameField.setPrefSize(335, 45);
        nameField.setMaxWidth(335);
        nameField.setMaxHeight(335);
        VBox.setMargin(nameField, new Insets(50, 0, 0, 0));
        
        // Add text field for Ubah Nomor Telepon
        TextField telephoneField = new TextField();
        telephoneField.setPromptText("Ubah Nomor Telepon");
        telephoneField.setStyle("-fx-border-radius:10; -fx-background-radius:10;");

        // Add option field for ubah status member
        // Create a combo box for updating member status
        ComboBox<String> updateStatus = new ComboBox<>();
        updateStatus.getItems().addAll("Non-VIP", "VIP");
        updateStatus.setPromptText("Ubah Status Member");
        updateStatus.setEditable(false);
        updateStatus.setStyle("-fx-border-radius: 10; -fx-background-radius:10; -fx-background-color: #FFFFFF;");
        updateStatus.setPrefSize(335, 45);
        updateStatus.setMaxWidth(335);
        updateStatus.setMaxHeight(335);
        VBox.setMargin(updateStatus, new Insets(50, 0, 0, 0));

        // Set layout properties for the combo box
        updateStatus.setLayoutX(200);
        updateStatus.setLayoutY(200);

        // Add a listener to the text field to validate user input
        telephoneField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                telephoneField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        // Add Ubah Nomor Telepon field to the VBox
        telephoneField.setPrefSize(335, 45);
        telephoneField.setMaxWidth(335);
        telephoneField.setMaxHeight(335);
        VBox.setMargin(telephoneField, new Insets(50, 0, 0, 0));

        // Add Submit Button
        Button submit = new Button("Submit");
        submit.setStyle("-fx-border-radius: 10; -fx-background-radius: 10; -fx-background-color: #0B4A83; -fx-text-fill: #FFFFFF; -fx-font-size: 20px; -fx-font-weight: bold");

        // TODO
        // update.setOnAction(e -> {
            // String inputNama = nameField.getText();
            // String inputNoTelp = telephoneField.getText();
            // String inputMembership = comboBox.getValue();
            // updateMember(inputNama, inputNoTelp, inputMembership);
            // }
            // );

        inputBox.getChildren().add(updateLabel);
        inputBox.getChildren().add(nameField);
        inputBox.getChildren().add(telephoneField);
        inputBox.getChildren().add(updateStatus);
        inputBox.getChildren().add(submit);
        submit.setPrefSize(335, 45);
        submit.setMaxWidth(335);
        submit.setMaxHeight(335);
        VBox.setMargin(submit, new Insets(50, 0, 0, 0));

        // Add the new box as a child of the UpdateMemberPage VBox
        finalBox.getChildren().addAll(searchBox, inputBox);
        getChildren().add(finalBox);
        setAlignment(Pos.CENTER);
    }
}
