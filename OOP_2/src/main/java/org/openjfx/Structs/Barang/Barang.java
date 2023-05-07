package org.openjfx.Structs.Barang;
import org.openjfx.Structs.Harga.Harga;


public class Barang {
    private String nama;
    private String kategori;
    private Harga harga;
    private int stok;
    private String gambar;

    public Barang(String nama, String kategori, Harga harga, int stok, String gambar) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Harga getHarga() {
        return harga;
    }

    public void setHarga(Harga harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void debug() {
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        harga.debug();
        System.out.println("Stok: " + stok);
        System.out.println("Gambar: " + gambar);
    }
}



