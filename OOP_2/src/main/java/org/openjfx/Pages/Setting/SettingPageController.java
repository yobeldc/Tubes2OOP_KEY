package org.openjfx.Pages.Setting;

import org.openjfx.App;

public class SettingPageController {
    
    public static void showSettingPage() {
        App.getRoot().setCenter(new SettingPage());
    }
}