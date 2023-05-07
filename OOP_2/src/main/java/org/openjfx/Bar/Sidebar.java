package org.openjfx.Bar;

import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import org.openjfx.Pages.HistoriTransaksi.*;
import org.openjfx.Pages.Home.*;
import org.openjfx.Pages.Inventori.*;
import org.openjfx.Pages.Laporan.LaporanPageController;
import org.openjfx.Pages.UpdateMember.*;
import org.openjfx.Pages.Member.*;
import org.openjfx.Pages.Sales.*;



public class Sidebar extends HBox {
    public Sidebar() {
        Button hamburgerButton = new Button();
        hamburgerButton.getStyleClass().add("hamburger");
        ImageView icon = new ImageView(new Image(getClass().getResource("/hamburger.png").toExternalForm()));
        icon.setFitHeight(20);
        icon.setFitWidth(20);
        hamburgerButton.setGraphic(icon);

        ContextMenu menu = new ContextMenu();
        
        MenuItem halamanUtamaItem = new MenuItem("Halaman Utama");
        halamanUtamaItem.setOnAction(e -> HomePageController.showHomePage());
        
        MenuItem penjualanItem = new MenuItem("Penjualan");
        penjualanItem.setOnAction(e -> SalesPageController.showSalesPage());

        MenuItem inventoriItem = new MenuItem("Inventori");
        inventoriItem.setOnAction(e -> InventoriPageController.showInventoriPage());

        MenuItem laporanItem = new MenuItem("Laporan");
        laporanItem.setOnAction(e -> LaporanPageController.showLaporanPage());

        MenuItem updateMemItem = new MenuItem("Update Member / VIP");
        updateMemItem.setOnAction(e -> UpdateMemberPageController.showUpdateMemberPage());

        MenuItem pendaftaranItem = new MenuItem("Pendaftaran Member");
        pendaftaranItem.setOnAction(e -> MemberPageController.showMemberPage());

        MenuItem historiItem = new MenuItem("Histori Transaksi");
        historiItem.setOnAction(e -> HistoriTransaksiController.showHistoriTransaksiPage());

        MenuItem pengaturanItem = new MenuItem("Pengaturan");

        MenuItem pluginItem = new MenuItem("Plugin Statistik");
        
        
        menu.getItems().addAll(halamanUtamaItem, penjualanItem, inventoriItem, laporanItem, updateMemItem, pendaftaranItem, historiItem, pengaturanItem, pluginItem);
        hamburgerButton.setContextMenu(menu);
        hamburgerButton.setOnAction(event -> {
            menu.show(hamburgerButton, Side.BOTTOM, 0, 0);
        });
        getChildren().add(hamburgerButton);
    }
}
