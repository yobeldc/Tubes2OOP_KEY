package org.openjfx.Pages.Setting;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*; 
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.util.*;

public class SettingPage extends HBox {

    public SettingPage() {
        HBox finalBox = new HBox();
        finalBox.getStyleClass().addAll("page");
        
        VBox plugin = new VBox();
        plugin.setPadding(new Insets(20, 20, 20, 20));
        plugin.setAlignment(Pos.TOP_CENTER);
        
        VBox pluginTitle = new VBox();
        pluginTitle.setPrefSize(250, 50);
        pluginTitle.setMaxWidth(250);
        pluginTitle.setMaxHeight(50);
    
        // Add label as a title
        Label pluginSetting = new Label("Plugin Settings");
        pluginTitle.setAlignment(Pos.CENTER);
        pluginTitle.getChildren().addAll(pluginSetting);
        
        Button addPlugin = new Button("add plugin");
        VBox.setMargin(addPlugin, new Insets(10, 0, 0, 0));
        
        HBox chart1 = new HBox();
        VBox.setMargin(chart1, new Insets(10, 0, 0, 0));
        Label c1 = new Label("Chart 1");
        HBox.setMargin(c1, new Insets(0, 150, 0, 0));
        
        ToggleButton togglec1 = new ToggleButton("Off");
        togglec1.setPrefSize(40, 40);
        
        // handle the toggle button action to switch between "on" and "off" states
        togglec1.setOnAction(e -> {
            if (togglec1.isSelected()) {
                togglec1.setText("On");
                // TODO
            } else {
                togglec1.setText("Off");
                // TODO
            }
        });
        
        chart1.setAlignment(Pos.CENTER_RIGHT);
        chart1.getChildren().addAll(c1, togglec1);
        
        HBox chart2 = new HBox();
        VBox.setMargin(chart2, new Insets(10, 0, 0, 0));
        Label c2 = new Label("Chart 2");
        HBox.setMargin(c2, new Insets(0, 150, 0, 0));
        
        ToggleButton togglec2 = new ToggleButton("Off");
        togglec2.setPrefSize(40, 40);
        
        // handle the toggle button action to switch between "on" and "off" states
        togglec2.setOnAction(e -> {
            if (togglec2.isSelected()) {
                togglec2.setText("On");
                // TODO
            } else {
                togglec2.setText("Off");
                // TODO
            }
        });
        
        chart2.setAlignment(Pos.CENTER_RIGHT);
        chart2.getChildren().addAll(c2, togglec2);
        
        HBox system1 = new HBox();
        VBox.setMargin(system1, new Insets(10, 0, 0, 0));
        Label s1 = new Label("System 1");
        HBox.setMargin(s1, new Insets(0, 150, 0, 0));
        
        ToggleButton toggles1 = new ToggleButton("Off");
        toggles1.setPrefSize(40, 40);
        
        // handle the toggle button action to switch between "on" and "off" states
        toggles1.setOnAction(e -> {
            if (toggles1.isSelected()) {
                toggles1.setText("On");
                // TODO
            } else {
                toggles1.setText("Off");
                // TODO
            }
        });
        
        system1.setAlignment(Pos.CENTER_RIGHT);
        system1.getChildren().addAll(s1, toggles1);
        
        HBox system2 = new HBox();
        VBox.setMargin(system2, new Insets(10, 0, 0, 0));
        Label s2 = new Label("System 1");
        HBox.setMargin(s2, new Insets(0, 150, 0, 0));
        
        ToggleButton toggles2 = new ToggleButton("Off");
        toggles2.setPrefSize(40, 40);
        
        // handle the toggle button action to switch between "on" and "off" states
        toggles2.setOnAction(e -> {
            if (toggles2.isSelected()) {
                toggles2.setText("On");
                // TODO
            } else {
                toggles2.setText("Off");
                // TODO
            }
        });
        
        system2.setAlignment(Pos.CENTER_RIGHT);
        system2.getChildren().addAll(s2, toggles2);
        
        plugin.getChildren().addAll(pluginTitle);
        plugin.getChildren().addAll(addPlugin);
        plugin.getChildren().addAll(chart1);
        plugin.getChildren().addAll(chart2);
        plugin.getChildren().addAll(system1);
        plugin.getChildren().addAll(system2);
        VBox.setMargin(plugin, new Insets(0, 0, 20, 0));

        // FILE CONFIG
        VBox file = new VBox();
        VBox.setMargin(file, new Insets(20, 0, 0, 0));
        file.setPadding(new Insets(20, 20, 20, 20));
        file.setAlignment(Pos.TOP_CENTER);

        VBox fileConfig = new VBox();
        Label fc = new Label("File Configuration");
        fileConfig.setAlignment(Pos.CENTER);
        fileConfig.getChildren().addAll(fc);

        TextField textField = new TextField();
        textField.setPromptText("Enter your folder path");

        Button openButton = new Button("Open File");
        openButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            File selectedFile = fileChooser.showOpenDialog(openButton.getScene().getWindow());
            if (selectedFile != null) {
                textField.setText(selectedFile.getAbsolutePath());
            }
        });

        HBox hbox = new HBox(textField, openButton);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10));

        Button cd = new Button("Change Directory");
        Button cf = new Button("Change Format");
        
        HBox submit = new HBox(cd, cf);
        submit.setSpacing(20);
        submit.setPadding(new Insets(10));

        HBox.setHgrow(textField, javafx.scene.layout.Priority.ALWAYS);

        
        // MONEY CONFIG
        VBox money = new VBox();
        VBox.setMargin(money, new Insets(20, 0, 0, 0));
        money.setPadding(new Insets(20, 20, 20, 20));
        money.setAlignment(Pos.TOP_CENTER);  
        
        VBox kursTitle = new VBox();
        Label mc = new Label("Money Configuration");
        kursTitle.setAlignment(Pos.CENTER);
        kursTitle.getChildren().addAll(mc);
        
        ComboBox<String> options = new ComboBox<>();
        options.getItems().addAll("IDR", "US", "SGD");
        // options.setPromptText("IDR");
        // options.setPromptText("Select currency");
        options.setValue("IDR");
        options.setEditable(false);
        options.setPrefSize(260, 30);
        options.setMaxWidth(260);
        options.setMaxHeight(30);
        VBox.setMargin(options, new Insets(50, 0, 0, 0));
        
        
        // TAX SERVICE
        VBox tns = new VBox();
        VBox.setMargin(tns, new Insets(20, 0, 0, 0));
        tns.setPadding(new Insets(20, 20, 20, 20));
        tns.setAlignment(Pos.TOP_CENTER);
        
        VBox tnsTitle = new VBox();
        Label ts = new Label("Tax & Service");
        tnsTitle.setAlignment(Pos.CENTER);
        tnsTitle.getChildren().addAll(ts);
        
        Label taxLabel = new Label("Tax");
        HBox.setMargin(taxLabel, new Insets(0, 26, 0, 0));
        TextField taxField = new TextField();
        taxField.setPromptText("input amount in %");
        
        Button addTax = new Button("Apply");
        
        HBox tax = new HBox();
        tax.setSpacing(10);
        tax.setPadding(new Insets(10));
        tax.getChildren().addAll(taxLabel, taxField, addTax);
        
        Label serviceLabel = new Label("Service");
        TextField serviceField = new TextField();
        serviceField.setPromptText("input amount in %");
        
        Button addService = new Button("Apply");
        
        HBox service = new HBox();
        service.setSpacing(10);
        service.setPadding(new Insets(10));
        service.getChildren().addAll(serviceLabel, serviceField, addService);
        
        file.getChildren().addAll(fileConfig, hbox, submit);
        tns.getChildren().addAll(tnsTitle, tax, service);
        money.getChildren().addAll(kursTitle, options);
        
        finalBox.getChildren().addAll(plugin, file, money, tns);
        finalBox.setAlignment(Pos.CENTER);
        
        getChildren().addAll(finalBox);
    }
}