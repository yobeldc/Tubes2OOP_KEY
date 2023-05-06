package org.openjfx.Setting;

import org.openjfx.App;
import org.openjfx.SettingPage;

public class SettingPageController {
    
    public static void showSettingPage() {
        App.getRoot().setCenter(new SettingPage());
    }
}