package org.openjfx.Home;

import org.openjfx.Home.HomePage;
import org.openjfx.App;

public class HomePageController {
    
    public static void showHomePage() {
        App.getRoot().setCenter(new HomePage());
    }
}