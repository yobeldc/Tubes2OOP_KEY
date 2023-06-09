package org.openjfx.Pages.Home;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HomePage extends HBox {

    public HomePage() {
        // Left side of the page (title and group name)
        VBox leftSide = new VBox();
        leftSide.getStyleClass().addAll("page");
        leftSide.setPrefWidth(659);
        leftSide.setMaxWidth(659);
        
        // TITLE
        VBox title = new VBox();
        title.getStyleClass().addAll("box");
        title.setStyle("-fx-border-radius: 25; -fx-background-radius: 25;");
        title.setPrefSize(439, 242);
        title.setMaxWidth(439);
        title.setMaxHeight(242);
        
        Label titleLabel = new Label("BILLIFY");
        titleLabel.setFont(Font.font("Inter", FontWeight.BOLD, 50));
        titleLabel.setTextFill(Color.WHITE);
        title.getChildren().add(titleLabel);
        
        Label quote = new Label("Make Your Life Easy");
        quote.setFont(Font.font("Inter", 30));
        quote.setTextFill(Color.WHITE);
        VBox.setMargin(quote, new Insets(20, 0, 0, 0));
        title.getChildren().add(quote);
        
        title.setAlignment(Pos.CENTER);
        leftSide.getChildren().addAll(title);
        leftSide.setAlignment(Pos.BOTTOM_CENTER);
        
        // GROUP DATA
        VBox group = new VBox();
        group.setPrefSize(439, 242);
        group.setMaxWidth(439);
        group.setMaxHeight(242);
        
        HBox createdBy = new HBox();
        createdBy.setPrefSize(659, 40);
        createdBy.setMaxWidth(659);
        createdBy.setMaxHeight(40);
        
        Label created = new Label("created by");
        created.setFont(Font.font("Inter", 14));
        created.setStyle("-fx-text-fill: #0B4A83;");

        created.setTextFill(Color.BLACK);
        
        // Create a new box
        VBox chumbucket = new VBox();
        HBox.setMargin(chumbucket, new Insets(0, 0, 0, 10));
        chumbucket.getStyleClass().addAll("box");
        chumbucket.setStyle("-fx-border-radius: 10; -fx-background-radius: 10;");
        chumbucket.setPrefSize(279, 39);
        chumbucket.setMaxWidth(279);
        chumbucket.setMaxHeight(39);
        
        // Add label as a title
        Label groupName = new Label("ChumBucket");
        groupName.setFont(Font.font("Inter", FontWeight.BOLD, 17));
        groupName.setStyle("-fx-text-fill: #FFFFFF;");
        chumbucket.getChildren().add(groupName);
        chumbucket.setAlignment(Pos.CENTER);
        
        createdBy.getChildren().addAll(created, chumbucket);
        createdBy.setAlignment(Pos.CENTER_LEFT);
        
        group.getChildren().add(createdBy);
        
        // Nama anggota kelompok
        Label yobel = new Label("13521067 - YOBEL DEAN CHRISTOPHER");
        yobel.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        yobel.setStyle("-fx-text-fill: #428FD4;");
        group.getChildren().add(yobel);
        VBox.setMargin(yobel, new Insets(15, 0, 0, 0));
        
        Label hobert = new Label("13521079 - HOBERT ANTHONY JONATAN");
        hobert.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        hobert.setStyle("-fx-text-fill: #428FD4;");
        group.getChildren().add(hobert);
        VBox.setMargin(hobert, new Insets(15, 0, 0, 0));
        
        Label jerry = new Label("13521131 - JEREMYA DHARMAWAN RAHARJO");
        jerry.setFont(Font.font("Inter", FontWeight.BOLD,14));
        jerry.setStyle("-fx-text-fill: #428FD4;");
        group.getChildren().add(jerry);
        VBox.setMargin(jerry, new Insets(15, 0, 0, 0));
        
        Label ferin = new Label("13521161 - FERINDYA AULIA BERLIANTI");
        ferin.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        ferin.setStyle("-fx-text-fill: #428FD4;");
        group.getChildren().add(ferin);
        VBox.setMargin(ferin, new Insets(15, 0, 0, 0));
        
        Label iwan = new Label("13521164 - AKHMAD SETIAWAN");
        iwan.setFont(Font.font("Inter", FontWeight.BOLD, 14));
        iwan.setStyle("-fx-text-fill: #428FD4;");
        group.getChildren().add(iwan);
        VBox.setMargin(iwan, new Insets(15, 0, 0, 0));
        
        group.setAlignment(Pos.BOTTOM_LEFT);
        
        leftSide.getChildren().addAll(group);
        leftSide.setAlignment(Pos.CENTER);
        
        // Right side of the page (date and time)
        VBox rightSide = new VBox();
        rightSide.getStyleClass().addAll("page2");
        rightSide.setPrefWidth(853);
        rightSide.setMaxWidth(853);
        
        VBox timeDate = new VBox();
        timeDate.getStyleClass().addAll("box");
        timeDate.setStyle("-fx-border-radius: 25; -fx-background-radius: 25");
        timeDate.setPrefSize(439, 242);
        timeDate.setMaxWidth(439);
        timeDate.setMaxHeight(242);
        timeDate.setAlignment(Pos.CENTER);

        Label dateLabel = new Label();
        dateLabel.setFont(Font.font("Inter", 38));
        dateLabel.setTextFill(Color.WHITE);
        timeDate.getChildren().add(dateLabel);
        
        Label timeLabel = new Label();
        timeLabel.setFont(Font.font("Inter", FontWeight.BOLD, 48));
        timeLabel.setTextFill(Color.WHITE);
        VBox.setMargin(timeLabel, new Insets(20, 0, 0, 0));
        timeDate.getChildren().add(timeLabel);
        
        // Threading to showing realtime date and time
        new Thread(() -> {
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                String date = now.format(DateTimeFormatter.ofPattern("EEEE, d MMMM uuuu"));
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                Platform.runLater(() -> dateLabel.setText(date));
                Platform.runLater(() -> timeLabel.setText(time));
    
                // Wait for 1 second before getting the new date and time
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        VBox.setMargin(timeDate, new Insets(30, 0, 0, 0));
        rightSide.getChildren().addAll(timeDate);
        rightSide.setAlignment(Pos.TOP_CENTER);
        
        HBox homePage = new HBox();
        homePage.setSpacing(5);
        homePage.getStyleClass().addAll("page");
        homePage.getChildren().addAll(leftSide);
        homePage.getChildren().addAll(rightSide);

        getChildren().add(homePage);
    }
}