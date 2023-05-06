package org.openjfx.Pages.Inventori;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.scene.control.cell.*;
import javafx.collections.*;





public class InventoriPage extends VBox {
    public InventoriPage() {
        setPadding(new Insets(10));
        setSpacing(5);
        getStyleClass().addAll("page");

        //========================TITLE========================
        // Create a new box for the title
        VBox titleBox = new VBox();
        titleBox.getStyleClass().addAll("box2");
        titleBox.setPrefSize(1200, 30);
        titleBox.setMaxWidth(1200);
        titleBox.setMaxHeight(30);

        // Add label as a title
        Label daftarLabel = new Label("INVENTORI");
        daftarLabel.setFont(Font.font("Inter", FontWeight.BOLD, 75)); 
        daftarLabel.setTextFill(Color.WHITE);
        VBox.setMargin(daftarLabel, new Insets(0, 0, 0, 0));
        titleBox.getChildren().add(daftarLabel);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setAlignment(Pos.CENTER);

        //========================CUSTOMIZE========================
        // Create a new customize box 
        HBox customizeBox = new HBox();
        customizeBox.getStyleClass().addAll("box");
        customizeBox.setPrefSize(1200, 75);
        customizeBox.setMaxWidth(1200);
        customizeBox.setMaxHeight(150);

        // Create a new HBox for the left corner buttons
        HBox leftButtonsBox = new HBox();
        leftButtonsBox.setAlignment(Pos.CENTER_LEFT);
        leftButtonsBox.setSpacing(10);

        // Add "Ubah Nomor Telepon" text field to leftButtonsBox
        TextField searchField = new TextField();
        searchField.setPromptText("Cari Barang");
        leftButtonsBox.getChildren().add(searchField);

        // Add "Mode Edit" button to leftButtonsBox
        Button modeEditButton = new Button("Mode Edit");
        leftButtonsBox.getChildren().add(modeEditButton);

        // Create a new Region node
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); // Set the region to grow horizontally

        // Create a new HBox for the right corner buttons
        HBox rightButtonsBox = new HBox();
        rightButtonsBox.setAlignment(Pos.CENTER_RIGHT);
        rightButtonsBox.setSpacing(10);

        // Add "Hapus Perubahan" button to rightButtonsBox
        Button hapusButton = new Button("Hapus Perubahan");
        rightButtonsBox.getChildren().add(hapusButton);

        // Add "Simpan Perubahan" button to rightButtonsBox
        Button simpanButton = new Button("Simpan Perubahan");
        rightButtonsBox.getChildren().add(simpanButton);

        // Add the leftButtonsBox, spacer, and rightButtonsBox to customizeBox
        customizeBox.getChildren().addAll(leftButtonsBox, spacer, rightButtonsBox);
        customizeBox.setAlignment(Pos.CENTER);

        //========================LIST========================
        // Create a new box for the list
        VBox listBox = new VBox();
        listBox.getStyleClass().addAll("box2");
        listBox.setPrefSize(1250, 400);
        listBox.setMaxWidth(1250);
        listBox.setMaxHeight(400);
        listBox.setAlignment(Pos.CENTER);
        
        //========================DATA========================
         // Create the table and columns
         TableView<Barang> table = new TableView<>();
         TableColumn<Barang, String> gambarCol = new TableColumn<>("Gambar");
         TableColumn<Barang, String> namaBarangCol = new TableColumn<>("Nama Barang");
         TableColumn<Barang, Integer> stokCol = new TableColumn<>("Stok");
         TableColumn<Barang, Double> hargaJualCol = new TableColumn<>("Harga Jual");
         TableColumn<Barang, Double> hargaBeliCol = new TableColumn<>("Harga Beli");
         TableColumn<Barang, Void> ubahGambarCol = new TableColumn<>("Ubah Gambar");
 
         // Set the cell value factories for each column
         gambarCol.setCellValueFactory(new PropertyValueFactory<>("gambar"));
         namaBarangCol.setCellValueFactory(new PropertyValueFactory<>("namaBarang"));
         stokCol.setCellValueFactory(new PropertyValueFactory<>("stok"));
         hargaJualCol.setCellValueFactory(new PropertyValueFactory<>("hargaJual"));
         hargaBeliCol.setCellValueFactory(new PropertyValueFactory<>("hargaBeli"));
 
         // Add the columns to the table
         table.getColumns().addAll(gambarCol, namaBarangCol, stokCol, hargaJualCol, hargaBeliCol, ubahGambarCol);
 
         // Add the table to the list box
         listBox.getChildren().add(table);
        // Add some sample data to the table
        ObservableList<Barang> data = FXCollections.observableArrayList(
                new Barang("gambar1.png", "Barang A", 10, 100.0, 50.0),
                new Barang("gambar2.png", "Barang B", 20, 200.0, 100.0),
                new Barang("gambar3.png", "Barang C", 30, 300.0, 150.0),
                new Barang("gambar4.png", "Barang D", 40, 400.0, 200.0),
                new Barang("gambar5.png", "Barang E", 50, 500.0, 250.0)
        );
        table.setItems(data);


       

        //=================================================


        // Add the titleBox, customizeBox, and listBox to the StackPane
        getChildren().addAll(titleBox, customizeBox, listBox);
        setAlignment(Pos.TOP_CENTER);

        //========================AddBarang========================
        // Create a new VBox for the green button
        VBox addBarangBox = new VBox();
        addBarangBox.setPadding(new Insets(10));
        addBarangBox.setSpacing(10);
        addBarangBox.setAlignment(Pos.BOTTOM_RIGHT);

        // Create a green button
        Button addBarang = new Button("Green Button");
        addBarang.setStyle("-fx-background-color: green; -fx-text-fill: white;");

        // Add the green button to the addBarangBox
        addBarangBox.getChildren().add(addBarang);

        // Add the addBarangBox to the StackPane with margins
        StackPane.setMargin(addBarangBox, new Insets(10));
        StackPane.setAlignment(addBarangBox, Pos.BOTTOM_RIGHT);
        getChildren().add(addBarangBox);
    }

    private static class Barang {
        private final String gambar;
        private final String namaBarang;
        private final int stok;
        private final double hargaJual;
        private final double hargaBeli;

        public Barang(String gambar, String namaBarang, int stok, double hargaJual, double hargaBeli) {
            this.gambar = gambar;
            this.namaBarang = namaBarang;
            this.stok = stok;
            this.hargaJual = hargaJual;
            this.hargaBeli = hargaBeli;
        }

        public String getGambar() {
            return gambar;
        }

        public String getNamaBarang() {
            return namaBarang;
        }

        public int getStok() {
            return stok;
        }

        public double getHargaJual() {
            return hargaJual;
        }

        public double getHargaBeli() {
            return hargaBeli;
        }
    }
}










