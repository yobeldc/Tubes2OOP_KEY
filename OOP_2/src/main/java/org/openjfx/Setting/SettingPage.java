package org.openjfx.Setting;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class SettingPage extends VBox {

    public SettingPage() {
        VBox finalBox = new VBox();
        finalBox.getStyleClass().addAll("page 8");
        finalBox.setPrefSize(800, 700);
        finalBox.setMaxWidth(800);
        finalBox.setMaxHeight(700);
        finalBox.setAlignment(Pos.CENTER);

        VBox SettingPage = new VBox();
        SettingPage.setPadding(new Insets(10));
        SettingPage.setSpacing(5);
        SettingPage.getStyleClass().addAll("page");

        // Create a new box
        VBox inputBox = new VBox();
        inputBox.getStyleClass().addAll("box");
        inputBox.setPrefSize(300, 200);
        inputBox.setMaxWidth(300);
        inputBox.setMaxHeight(200);

        
        // Add label as a title
        Label pluginSetting = new Label("Plugin Settings");
        VBox.setMargin(pluginSetting, new Insets(50, 0, 0, 0));
        inputBox.setAlignment(Pos.TOP_LEFT);

        // Add button "add plugin"
        Button addPlugin = new Button("Add Plugin...");


        // Add name macam" plugin
        Text chart1 = new Text("Chart 1");

        // Add button switch on/off
        Pane root = new Pane();
        root.setPrefSize(300, 300);

        ToggleSwitch toggle = new ToggleSwitch();
        toggle.setTranslateX(100);
        toggle.setTranslateY(100);

        Text text = new Text();
        text.setFont(Font.font(18));
        text.setFill(Color.WHITE);
        text.setTranslateX(100);
        text.setTranslateY(200);
        text.textProperty().bind(Bindings.when(toggle.switchedOnProperty()).then("ON").otherwise("OFF"));

        root.getChildren().addAll(toggle, text);
        return root;

        BooleanProperty switchedOn = new SimpleBooleanProperty(false);
        TranslateTransition translateAnimation = new TranslateTransition(Duration.seconds(0.25), toggle);
        FillTransition fillAnimation = new FillTransition(Duration.seconds(0.25));
        ParallelTransition animation = new ParallelTransition(translateAnimation, fillAnimation);
        
        BooleanProperty switchedOnProperty() {
            return switchedOn;
        }

        ToggleSwitch() {
            getStyleClass().add("toggle-switch");
            Rectangle background = new Rectangle(100, 50);
            background.setArcWidth(50);
            background.setArcHeight(50);
            background.setStroke(Color.LIGHTGRAY);

            Circle trigger = new Circle(25);
            trigger.setCenterX(25);
            trigger.setCenterY(25);
            trigger.setFill(Color.WHITE);
            trigger.setStroke(Color.LIGHTGRAY);

            translateAnimation.setNode(trigger);
            fillAnimation.setShape(background);

            getChildren().addAll(background, trigger);

            switchedOn.addListener((obs, oldState, newState) -> {
                boolean isOn = newState.booleanValue();
                translateAnimation.setToX(isOn ? 100 - 50 : 0);
                fillAnimation.setFromValue(isOn ? Color.WHITE : Color.LIGHTGREEN);
                fillAnimation.setToValue(isOn ? Color.LIGHTGREEN : Color.WHITE);

                animation.play();
            });

            setOnMouseClicked(event -> {
                switchedOn.set(!switchedOn.get());
            });
        }

        // Add name macam" plugin
        Text chart2 = new Text("Chart 2");

        // Add button switch on/off
        Pane root = new Pane();
        root.setPrefSize(300, 300);

        ToggleSwitch toggle = new ToggleSwitch();
        toggle.setTranslateX(100);
        toggle.setTranslateY(100);

        Text text = new Text();
        text.setFont(Font.font(18));
        text.setFill(Color.WHITE);
        text.setTranslateX(100);
        text.setTranslateY(200);
        text.textProperty().bind(Bindings.when(toggle.switchedOnProperty()).then("ON").otherwise("OFF"));

        root.getChildren().addAll(toggle, text);
        return root;

        BooleanProperty switchedOn = new SimpleBooleanProperty(false);
        TranslateTransition translateAnimation = new TranslateTransition(Duration.seconds(0.25), toggle);
        FillTransition fillAnimation = new FillTransition(Duration.seconds(0.25));
        ParallelTransition animation = new ParallelTransition(translateAnimation, fillAnimation);
        
        BooleanProperty switchedOnProperty() {
            return switchedOn;
        }

        ToggleSwitch() {
            getStyleClass().add("toggle-switch");
            Rectangle background = new Rectangle(100, 50);
            background.setArcWidth(50);
            background.setArcHeight(50);
            background.setStroke(Color.LIGHTGRAY);

            Circle trigger = new Circle(25);
            trigger.setCenterX(25);
            trigger.setCenterY(25);
            trigger.setFill(Color.WHITE);
            trigger.setStroke(Color.LIGHTGRAY);

            translateAnimation.setNode(trigger);
            fillAnimation.setShape(background);

            getChildren().addAll(background, trigger);

            switchedOn.addListener((obs, oldState, newState) -> {
                boolean isOn = newState.booleanValue();
                translateAnimation.setToX(isOn ? 100 - 50 : 0);
                fillAnimation.setFromValue(isOn ? Color.WHITE : Color.LIGHTGREEN);
                fillAnimation.setToValue(isOn ? Color.LIGHTGREEN : Color.WHITE);

                animation.play();
            });

            setOnMouseClicked(event -> {
                switchedOn.set(!switchedOn.get());
            });
        }

        // Add name macam" plugin
        Text System1 = new Text("System 1");

        // Add button switch on/off
        Pane root = new Pane();
        root.setPrefSize(300, 300);

        ToggleSwitch toggle = new ToggleSwitch();
        toggle.setTranslateX(100);
        toggle.setTranslateY(100);

        Text text = new Text();
        text.setFont(Font.font(18));
        text.setFill(Color.WHITE);
        text.setTranslateX(100);
        text.setTranslateY(200);
        text.textProperty().bind(Bindings.when(toggle.switchedOnProperty()).then("ON").otherwise("OFF"));

        root.getChildren().addAll(toggle, text);
        return root;

        BooleanProperty switchedOn = new SimpleBooleanProperty(false);
        TranslateTransition translateAnimation = new TranslateTransition(Duration.seconds(0.25), toggle);
        FillTransition fillAnimation = new FillTransition(Duration.seconds(0.25));
        ParallelTransition animation = new ParallelTransition(translateAnimation, fillAnimation);
        
        BooleanProperty switchedOnProperty() {
            return switchedOn;
        }

        ToggleSwitch() {
            getStyleClass().add("toggle-switch");
            Rectangle background = new Rectangle(100, 50);
            background.setArcWidth(50);
            background.setArcHeight(50);
            background.setStroke(Color.LIGHTGRAY);

            Circle trigger = new Circle(25);
            trigger.setCenterX(25);
            trigger.setCenterY(25);
            trigger.setFill(Color.WHITE);
            trigger.setStroke(Color.LIGHTGRAY);

            translateAnimation.setNode(trigger);
            fillAnimation.setShape(background);

            getChildren().addAll(background, trigger);

            switchedOn.addListener((obs, oldState, newState) -> {
                boolean isOn = newState.booleanValue();
                translateAnimation.setToX(isOn ? 100 - 50 : 0);
                fillAnimation.setFromValue(isOn ? Color.WHITE : Color.LIGHTGREEN);
                fillAnimation.setToValue(isOn ? Color.LIGHTGREEN : Color.WHITE);

                animation.play();
            });

            setOnMouseClicked(event -> {
                switchedOn.set(!switchedOn.get());
            });
        }

        // Add name macam" plugin
        Text System2 = new Text("System 2");

        // Add button switch on/off
        Pane root = new Pane();
        root.setPrefSize(300, 300);

        ToggleSwitch toggle = new ToggleSwitch();
        toggle.setTranslateX(100);
        toggle.setTranslateY(100);

        Text text = new Text();
        text.setFont(Font.font(18));
        text.setFill(Color.WHITE);
        text.setTranslateX(100);
        text.setTranslateY(200);
        text.textProperty().bind(Bindings.when(toggle.switchedOnProperty()).then("ON").otherwise("OFF"));

        root.getChildren().addAll(toggle, text);
        return root;

        BooleanProperty switchedOn = new SimpleBooleanProperty(false);
        TranslateTransition translateAnimation = new TranslateTransition(Duration.seconds(0.25), toggle);
        FillTransition fillAnimation = new FillTransition(Duration.seconds(0.25));
        ParallelTransition animation = new ParallelTransition(translateAnimation, fillAnimation);
        
        BooleanProperty switchedOnProperty() {
            return switchedOn;
        }

        ToggleSwitch() {
            getStyleClass().add("toggle-switch");
            Rectangle background = new Rectangle(100, 50);
            background.setArcWidth(50);
            background.setArcHeight(50);
            background.setStroke(Color.LIGHTGRAY);

            Circle trigger = new Circle(25);
            trigger.setCenterX(25);
            trigger.setCenterY(25);
            trigger.setFill(Color.WHITE);
            trigger.setStroke(Color.LIGHTGRAY);

            translateAnimation.setNode(trigger);
            fillAnimation.setShape(background);

            getChildren().addAll(background, trigger);

            switchedOn.addListener((obs, oldState, newState) -> {
                boolean isOn = newState.booleanValue();
                translateAnimation.setToX(isOn ? 100 - 50 : 0);
                fillAnimation.setFromValue(isOn ? Color.WHITE : Color.LIGHTGREEN);
                fillAnimation.setToValue(isOn ? Color.LIGHTGREEN : Color.WHITE);

                animation.play();
            });

            setOnMouseClicked(event -> {
                switchedOn.set(!switchedOn.get());
            });
        }

        // Add label as a title
        Label moneyLabel = new Label("Money Configuration");
        VBox.setMargin(moneyLabel, new Insets(50, 0, 0, 0));
        inputBox.setAlignment(Pos.TOP_CENTER);

        // Add option field for ubah status member
        // Create a combo box for updating member status
        ComboBox<String> moneyConfig = new ComboBox<>();
        moneyConfig.getItems().addAll("IDR", "US", "SGD");
        moneyConfig.setPromptText("IDR");
        moneyConfig.setEditable(false);
        moneyConfig.setPrefSize(335, 45);
        moneyConfig.setMaxWidth(335);
        moneyConfig.setMaxHeight(335);
        VBox.setMargin(moneyConfig, new Insets(50, 0, 0, 0));

        // Set layout properties for the combo box
        moneyConfig.setLayoutX(200);
        moneyConfig.setLayoutY(200);

        // Add label as a title
        Label fileConfig = new Label("File Configuration");
        VBox.setMargin(fileConfig, new Insets(50, 0, 0, 0));
        inputBox.setAlignment(Pos.TOP_CENTER);

        // Add text field for File Configuration
        TextField fileField = new TextField();
        fileField.setPromptText("input file name...");
        fileField.setPrefSize(335, 45);
        fileField.setMaxWidth(335);
        fileField.setMaxHeight(335);
        VBox.setMargin(fileField, new Insets(50, 0, 0, 0));
        
        // Add Change Directory Button
        Button change = new Button("Change Directory");

        // Add Change Format Button
        Button changeFormat = new Button("Change Format");

        // Add label as a title
        Label taxService = new Label("Tax & Service");
        VBox.setMargin(taxService, new Insets(50, 0, 0, 0));
        inputBox.setAlignment(Pos.TOP_CENTER);

        // Add text field for Tax & Servide
        TextField taxField = new TextField();
        taxField.setPromptText("input amount (in %)...");
        taxField.setPrefSize(335, 45);
        taxField.setMaxWidth(335);
        taxField.setMaxHeight(335);
        VBox.setMargin(taxField, new Insets(50, 0, 0, 0));

        
        // Add text field for Tax & Servide
        TextField serviceField = new TextField();
        serviceField.setPromptText("input amount (in %)...");
        serviceField.setPrefSize(335, 45);
        serviceField.setMaxWidth(335);
        serviceField.setMaxHeight(335);
        VBox.setMargin(serviceField, new Insets(50, 0, 0, 0));
        
        // Add Change Directory Button
        Button applyTax = new Button("Apply");

        // Add Change Format Button
        Button applyService = new Button("Apply");

        inputBox.getChildren().add(pluginSetting);
        inputBox.getChildren().add(addPlugin);
        inputBox.getChildren().add(chart1);
        inputBox.getChildren().add(chart2);
        inputBox.getChildren().add(System1);
        inputBox.getChildren().add(System2);
        inputBox.getChildren().add(moneyLabel);
        inputBox.getChildren().add(moneyConfig);
        inputBox.getChildren().add(fileConfig);
        inputBox.getChildren().add(fileField);
        inputBox.getChildren().add(change);
        inputBox.getChildren().add(changeFormat);
        inputBox.getChildren().add(taxService);
        inputBox.getChildren().add(taxField);
        inputBox.getChildren().add(serviceField);
        inputBox.getChildren().add(applyTax);
        inputBox.getChildren().add(applyService);

        applyTax.setPrefSize(335, 45);
        applyTax.setMaxWidth(335);
        applyTax.setMaxHeight(335);
        VBox.setMargin(applyTax, new Insets(50, 0, 0, 0));

        applyService.setPrefSize(335, 45);
        applyService.setMaxWidth(335);
        applyService.setMaxHeight(335);
        VBox.setMargin(applyService, new Insets(50, 0, 0, 0));

        addPlugin.setPrefSize(335, 45);
        addPlugin.setMaxWidth(335);
        addPlugin.setMaxHeight(335);
        VBox.setMargin(addPlugin, new Insets(50, 0, 0, 0));

        change.setPrefSize(335, 45);
        change.setMaxWidth(335);
        change.setMaxHeight(335);
        VBox.setMargin(change, new Insets(50, 0, 0, 0));
    }
}