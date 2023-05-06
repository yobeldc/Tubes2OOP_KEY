package org.openjfx.Pages.Member;

import org.openjfx.App;


public class MemberPageController {
    
    public static void showMemberPage() {
        App.getRoot().setCenter(new MemberPage());
    }
}
