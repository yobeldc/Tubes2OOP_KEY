package org.openjfx.Pages.Member;

import org.openjfx.App;
import org.openjfx.Pages.Member.MemberPage;

public class MemberPageController {
    
    public static void showMemberPage() {
        App.getRoot().setCenter(new MemberPage());
    }
}
