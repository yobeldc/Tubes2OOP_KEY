package org.openjfx.UpdateMember;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class UpdateMemberPage extends VBox {

    public UpdateMemberPage() {
        VBox UpdateMemberPage = new VBox();
        UpdateMemberPage.setPadding(new Insets(10));
        UpdateMemberPage.setSpacing(5);
        UpdateMemberPage.getStyleClass().addAll("page");

        // Create a new box
        VBox textBox = new VBox();
        textBox.getStyleClass().addAll("box");
        textBox.setPrefSize(416, 529);
        textBox.setMaxWidth(416);
        textBox.setMaxHeight(529);

        // Add label as a title
        Label updateLabel = new Label("Perbaharui Informasi Member");
        VBox.setMargin(updateLabel, new Insets(50, 0, 0, 0));
        textBox.setAlignment(Pos.TOP_CENTER);
        
        // Add text field for Ubah Nama
        TextField nameField = new TextField();
        nameField.setPromptText("Ubah Nama");
        nameField.setPrefSize(335, 45);
        nameField.setMaxWidth(335);
        nameField.setMaxHeight(335);
        VBox.setMargin(nameField, new Insets(50, 0, 0, 0));
        
        // Add text field for Ubah Nomor Telepon
        TextField telephoneField = new TextField();
        telephoneField.setPromptText("Ubah Nomor Telepon");

        // Add option field for ubah status member
        // Create a combo box for updating member status
        ComboBox<String> updateStatus = new ComboBox<>();
        updateStatus.getItems().addAll("Non-VIP", "VIP");
        updateStatus.setPromptText("Ubah Status Member");
        updateStatus.setEditable(false);
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

        // TODO
        // update.setOnAction(e -> {
            // String inputNama = nameField.getText();
            // String inputNoTelp = telephoneField.getText();
            // String inputMembership = comboBox.getValue();
            // updateMember(inputNama, inputNoTelp, inputMembership);
            // }
            // );

        textBox.getChildren().add(updateLabel);
        textBox.getChildren().add(nameField);
        textBox.getChildren().add(telephoneField);
        textBox.getChildren().add(updateStatus);
        textBox.getChildren().add(submit);
        submit.setPrefSize(335, 45);
        submit.setMaxWidth(335);
        submit.setMaxHeight(335);
        VBox.setMargin(submit, new Insets(50, 0, 0, 0));

        // Add the new box as a child of the UpdateMemberPage VBox
        getChildren().add(textBox);
        setAlignment(Pos.CENTER);
    }
}
