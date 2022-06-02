package com.shuyshuys.pasbp;

public class cTransaksi {
    String kode;
    String namaPembeli;
    cBarang barang;
    int jumlahBarang;
    int statusTransaksi;
    cTransaksi next;

    cTransaksi(String kode, String namaPembeli, cBarang barang, int jumlahBarang, int statusTransaksi) {
        this.kode = kode;
        this.namaPembeli = namaPembeli;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
        this.statusTransaksi = statusTransaksi;
        this.next = null;
    }

    public void setStatus(int status) {
        this.statusTransaksi = status;
    }

    public void setNext(cTransaksi next) {
        this.next = next;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setBarang(cBarang barang) {
        this.barang = barang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getStatus() {
        return statusTransaksi;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public cBarang getBarang() {
        return barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public cTransaksi getNext() {
        return next;
    }

    public String toString() {
        return "Kode Transaksi: " + kode + "\nNama Pembeli: " + namaPembeli + "\nNama Barang: " + barang.getNama()
                + "\nHarga Barang: " + barang.getHarga() + "\nJumlah Barang: " + jumlahBarang + "\nStatus Transaksi: "
                + statusTransaksi;
    }
}
