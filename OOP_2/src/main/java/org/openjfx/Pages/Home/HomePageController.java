package org.openjfx.Pages.Home;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openjfx.App;
import org.openjfx.Pages.Home.HomePage;

import javafx.application.Platform;

public class HomePageController {

    public static void showHomePage() {
        App.getRoot().setCenter(new HomePage());
    }
}