package org.openjfx.Structs.Barang;

public class Makanan {
    private int idMakanan;
    private String namaMakanan;
    private double harga;

    public Makanan(int idMakanan, String namaMakanan, double harga) {
        this.idMakanan = idMakanan;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public int getIdMakanan() {
        return idMakanan;
    }

    public void setIdMakanan(int idMakanan) {
        this.idMakanan = idMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
