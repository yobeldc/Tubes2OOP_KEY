package org.openjfx.Member;

import org.openjfx.App;
import org.openjfx.Member.MemberPage;

public class MemberPageController {
    
    public static void showMemberPage() {
        App.getRoot().setCenter(new MemberPage());
    }
}
