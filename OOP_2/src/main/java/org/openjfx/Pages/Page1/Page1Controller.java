package org.openjfx.Pages.Page1;

import org.openjfx.App;
import org.openjfx.Pages.Page1.Page1;

public class Page1Controller {
    
    public static void showPage1() {
        App.getRoot().setCenter(new Page1());
    }
}