package org.openjfx.Pages.HistoriTransaksi;

public class Transaksi {

    private String tanggal;
    private String namaMember;
    private String jenisMember;
    private int harga;

    public Transaksi(String tanggal, String namaMember, String jenisMember, int harga) {
        this.tanggal = tanggal;
        this.namaMember = namaMember;
        this.jenisMember = jenisMember;
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
