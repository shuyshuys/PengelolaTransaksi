package com.shuyshuys.pasbp;

public class cTransaksi {
    private int kode;
    private String namaPembeli;
    private cBarang barang;
    private int jumlahBarang;
    private int statusTransaksi;
    private int subTotal;
    private int bayar;
    private int kembalian;
    cTransaksi next;

    cTransaksi(int kode,
            String namaPembeli,
            cBarang barang,
            int jumlahBarang,
            int statusTransaksi,
            int subTotal,
            int bayar,
            int kembalian) {
        this.kode = kode;
        this.namaPembeli = namaPembeli;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
        this.statusTransaksi = statusTransaksi;
        this.next = null;
        this.subTotal = subTotal;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }

    public void setStatus(int status) {
        this.statusTransaksi = status;
    }

    public void setNext(cTransaksi next) {
        this.next = next;
    }

    public void setKode(int kode) {
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

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public int getStatus() {
        return statusTransaksi;
    }

    public int getKode() {
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

    public int getSubTotal() {
        return subTotal;
    }

    public int getBayar() {
        return bayar;
    }

    public int getKembalian() {
        return kembalian;
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
