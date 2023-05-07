package org.openjfx.Pages.Home;

import org.openjfx.App;
import org.openjfx.Pages.Home.HomePage;

public class HomePageController {
    
    public static void showHomePage() {
        App.getRoot().setCenter(new HomePage());
    }
}