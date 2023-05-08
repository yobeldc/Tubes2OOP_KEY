package org.openjfx.Structs.Harga;

public class Harga implements IHarga {
    private float hargaBeli;
    private float hargaJual;
    private String mataUang;

    public Harga(float hargaBeli, float hargaJual, String mataUang) {
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.mataUang = mataUang;

    }

    public void setHargaBeli(float hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public void setHargaJual(float hargaJual) {
        this.hargaJual = hargaJual;
    }

    @Override
    public double getHargaJual(double kursRasio) {
        return hargaJual * kursRasio;
    }

    @Override
    public double getHargaBeli(double kursRasio) {
        return hargaBeli * kursRasio;
    }

    public String getMataUang(){
        return this.mataUang;
    }

    public void debug() {
        System.out.println("HargaBeli: " + hargaBeli);
        System.out.println("HargaJual: " + hargaJual);
        System.out.println("MataUang: " + mataUang);
    }
}