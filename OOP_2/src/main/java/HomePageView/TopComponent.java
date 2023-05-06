package HomePageView;

import javafx.scene.control.*;

public class TopComponent {

    private MenuBar menuBar;
    private TabPane tabPane;

    public void setTopComponent() {
        menuBar = new MenuBar();
        Menu menuUtama = new Menu("MENU");

        MenuItem halamanUtamaItem = new MenuItem("Halaman Utama");
        MenuItem penjualanItem = new MenuItem("Penjualan");
        MenuItem inventoriItem = new MenuItem("Inventori");
        MenuItem laporanItem = new MenuItem("Laporan");
        MenuItem updateMemItem = new MenuItem("Update Member / VIP");
        MenuItem pendaftaranItem = new MenuItem("Pendaftaran Member");
        MenuItem historiItem = new MenuItem("Histori Transaksi");
        MenuItem pengaturanItem = new MenuItem("Pengaturan");
        MenuItem pluginItem = new MenuItem("Plugin Statistik");

        menuUtama.getItems().addAll(halamanUtamaItem, penjualanItem, inventoriItem, laporanItem, updateMemItem, pendaftaranItem, historiItem, pengaturanItem, pluginItem);

        menuBar.getMenus().addAll(menuUtama);

        tabPane = new TabPane();

        Tab halamanUtamaTab = new Tab("Halaman Utama");
        Tab penjualanTab = new Tab("Penjualan");
        Tab inventoriTab = new Tab("Inventori");
        Tab laporanTab = new Tab("Laporan");
        Tab updateMemTab = new Tab("Update Member / VIP");
        Tab pendaftaranTab = new Tab("Pendaftaran Member");
        Tab historiTab = new Tab("Histori Transaksi");
        Tab pengaturanTab = new Tab("Pengaturan");
        Tab pluginTab = new Tab("Plugin Statistik");

        TextArea halamanUtamaContent = new TextArea("ini adalah halaman Utama");
        TextArea penjualanContent = new TextArea("ini adalah halaman Penjualan");
        TextArea inventoriContent = new TextArea("ini adalah halaman Inventori");
        TextArea laporanContent = new TextArea("ini adalah halaman Laporan");
        TextArea updateMemContent = new TextArea("ini adalah halaman Update Member / VIP");
        TextArea pendaftaranContent = new TextArea("ini adalah halaman Pendaftaran Member");
        TextArea historiContent = new TextArea("ini adalah halaman Histori Transaksi");
        TextArea pengaturanContent = new TextArea("ini adalah halaman Pengaturan");
        TextArea pluginContent = new TextArea("ini adalah halaman Plugin Statistik");

        halamanUtamaTab.setContent(halamanUtamaContent);
        penjualanTab.setContent(penjualanContent);
        inventoriTab.setContent(inventoriContent);
        laporanTab.setContent(laporanContent);
        updateMemTab.setContent(updateMemContent);
        pendaftaranTab.setContent(pendaftaranContent);
        historiTab.setContent(historiContent);
        pengaturanTab.setContent(pengaturanContent);
        pluginTab.setContent(pluginContent);

        halamanUtamaItem.setOnAction((event -> tabPane.getSelectionModel().select(halamanUtamaTab)));
        penjualanItem.setOnAction((event -> tabPane.getSelectionModel().select(penjualanTab)));
        inventoriItem.setOnAction((event -> tabPane.getSelectionModel().select(inventoriTab)));
        laporanItem.setOnAction((event -> tabPane.getSelectionModel().select(laporanTab)));
        updateMemItem.setOnAction((event -> tabPane.getSelectionModel().select(updateMemTab)));
        pendaftaranItem.setOnAction((event -> tabPane.getSelectionModel().select(pendaftaranTab)));
        historiItem.setOnAction((event -> tabPane.getSelectionModel().select(historiTab)));
        pengaturanItem.setOnAction((event -> tabPane.getSelectionModel().select(pengaturanTab)));
        pluginItem.setOnAction((event -> tabPane.getSelectionModel().select(pluginTab)));

        tabPane.getTabs().addAll(halamanUtamaTab, penjualanTab, inventoriTab, laporanTab, updateMemTab, pendaftaranTab, historiTab, pengaturanTab, pluginTab);

    }

    public MenuBar getMenuBar(){
        return this.menuBar;
    }

    public TabPane getTabPane(){
        return this.tabPane;
    }

}