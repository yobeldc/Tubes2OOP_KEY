package org.openjfx.Pages.Inventori;

import org.openjfx.App;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;


import org.openjfx.Structs.Barang.*;
import org.openjfx.Structs.Harga.*;
import org.openjfx.Data.JsonParser.*;
import org.openjfx.Data.*;

public class InventoriPageController {
    
    public static void showInventoriPage() {
        App.getRoot().setCenter(new InventoriPage());
    }

    public static void initiateTable(TableView<Barang> table){
        TableColumn<Barang, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));

        TableColumn<Barang, String> kategoriCol = new TableColumn<>("Kategori");
        kategoriCol.setCellValueFactory(new PropertyValueFactory<>("kategori"));

        TableColumn<Barang, Float> hargaBeliCol = new TableColumn<>("HargaBeli");
        hargaBeliCol.setCellValueFactory(new PropertyValueFactory<>("hargaBeli"));

        TableColumn<Barang, Float> hargaJualCol = new TableColumn<>("HargaJual");
        hargaJualCol.setCellValueFactory(new PropertyValueFactory<>("hargaJual"));

        TableColumn<Barang, Integer> stokCol = new TableColumn<>("Stok");
        stokCol.setCellValueFactory(new PropertyValueFactory<>("stok"));

        TableColumn<Barang, String> gambarCol = new TableColumn<>("Gambar");
        gambarCol.setCellValueFactory(new PropertyValueFactory<>("gambar"));

        table.getColumns().addAll(namaCol, kategoriCol, hargaBeliCol,hargaJualCol, stokCol, gambarCol);

        TableColumn<Barang, Void> buttonCol = new TableColumn<>("Actions");
        buttonCol.setCellFactory(param -> new TableCell<Barang, Void>() {
            private final Button deleteButton = new Button("Delete");
            {
                deleteButton.setOnAction(event -> {
                    Barang barang = getTableView().getItems().get(getIndex());
                    // Handle delete button click with barang
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });

        table.getColumns().add(buttonCol);

        
    }

    public static void fillTable(TableView<Barang> table){
        JsonParser json = new JsonParser("data/test.json");
        DataInventori inv = new DataInventori();
        inv.parseData(json.getheJson());
        var inventory = inv.gettheData();
        

    }
}
