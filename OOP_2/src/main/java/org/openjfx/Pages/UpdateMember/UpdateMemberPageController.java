package org.openjfx.Pages.UpdateMember;

import org.openjfx.App;
import org.openjfx.Pages.UpdateMember.UpdateMemberPage;

public class UpdateMemberPageController {
    
    public static void showUpdateMemberPage() {
        App.getRoot().setCenter(new UpdateMemberPage());
    }
}
