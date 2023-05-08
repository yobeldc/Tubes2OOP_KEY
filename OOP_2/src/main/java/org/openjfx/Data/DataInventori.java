package org.openjfx.Data;

import java.util.ArrayList;
import java.util.List;
import org.openjfx.Structs.Barang.*;
import org.openjfx.Structs.Harga.Harga;
import org.json.simple.*;

public class DataInventori extends Data {
    public DataInventori() {
        super();
    }

    @Override
    public List<Barang> gettheData() {
        return (List<Barang>) this.theData;
    }

    @Override
    public void parseData(JSONArray arr) {
        ArrayList<Barang> arraybarang = new ArrayList<Barang>();
        arr.forEach(barangJSON -> {
            // Get employee object within list
            JSONObject barang = (JSONObject) barangJSON;
            String nama = (String) barang.get("nama");
            String kategori = (String) barang.get("kategori");
            JSONObject harga_json = (JSONObject) barang.get("harga");
            Harga harga = new Harga(((Double) harga_json.get("hargaBeli")).floatValue(), ((Double) harga_json.get("hargaJual")).floatValue(), "IDR");
            int stok = ((Long) barang.get("stok")).intValue();
            String gambar = (String) barang.get("gambar");
            arraybarang.add(new Barang(nama, kategori, harga, stok, gambar));
        });
        this.theData = arraybarang;
    }
}