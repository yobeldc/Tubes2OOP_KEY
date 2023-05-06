package org.openjfx.UpdateMember;

import org.openjfx.App;
import org.openjfx.UpdateMember.UpdateMemberPage;

public class UpdateMemberPageController {
    
    public static void showUpdateMemberPage() {
        App.getRoot().setCenter(new UpdateMemberPage());
    }
}
