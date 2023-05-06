package org.openjfx.Pages.Home;
import org.openjfx.App;

public class HomePageController {
    
    public static void showHomePage() {
        App.getRoot().setCenter(new HomePage());
    }
}