package org.openjfx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import org.openjfx.Home.HomePageController;
import org.openjfx.Member.MemberPageController;
import org.openjfx.Page1.Page1Controller;
import org.openjfx.UpdateMember.UpdateMemberPageController;

public class MenuBar extends VBox {

    public MenuBar() {
        setPadding(new Insets(10));
        setSpacing(5);

        Button homeBtn = new Button("Home");
        homeBtn.setOnAction(e -> HomePageController.showHomePage());
        
        Button page1Btn = new Button("Page 1");
        page1Btn.setOnAction(e -> Page1Controller.showPage1());
        page1Btn.getStyleClass().addAll("bottom-left-button", "button");
        
        Button memberButton = new Button("Pendaftaran Member");
        memberButton.setOnAction(e -> MemberPageController.showMemberPage());
        
        Button updateMemberBtn = new Button("Update Membership");
        updateMemberBtn.setOnAction(e -> UpdateMemberPageController.showUpdateMemberPage());

        // set button position to bottom left
        VBox.setMargin(page1Btn, new Insets(0,0,0,0));

        getChildren().addAll(homeBtn, page1Btn, memberButton, updateMemberBtn);
        VBox.setMargin(this, new Insets(0,0,0,0));
        setAlignment(Pos.BOTTOM_LEFT);
    }
}