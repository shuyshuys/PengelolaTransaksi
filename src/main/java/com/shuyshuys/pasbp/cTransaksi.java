package com.shuyshuys.pasbp;

public class cTransaksi extends cObject {
    // private int kode;
    // private String namaPembeli;
    // private cBarang barang;
    // private int jumlahBarang;
    // private int statusTransaksi;
    // private int subTotal;
    // private int bayar;
    // private int kembalian;
    boolean isMember;
    cTransaksi next;

    cTransaksi(int id,
            String nama,
            cBarang barang,
            int jumlah,
            int status,
            int subTotal,
            int bayar,
            int kembalian,
            boolean isMember) {
        super(id, nama, barang, jumlah, status, subTotal, bayar, kembalian);
        this.isMember = isMember;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNext(cTransaksi next) {
        this.next = next;
    }

    // public void setKode(int kode) {
    // this.kode = kode;
    // }

    // public void setNamaPembeli(String namaPembeli) {
    // this.namaPembeli = namaPembeli;
    // }

    public void setBarang(cBarang barang) {
        this.barang = barang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlah = jumlahBarang;
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

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public int getStatus() {
        return status;
    }

    // public int getKode() {
    // return kode;
    // }

    // public String getNamaPembeli() {
    // return namaPembeli;
    // }

    public cBarang getBarang() {
        return barang;
    }

    public int getJumlahBarang() {
        return jumlah;
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

    public boolean getIsMember() {
        return isMember;
    }

    public cTransaksi getNext() {
        return next;
    }

    public String toString() {
        return "Kode Transaksi: " + id + "\nNama Pembeli: " + nama + "\nNama Barang: " + barang.getNama()
                + "\nHarga Barang: " + barang.getHarga() + "\nJumlah Barang: " + jumlah + "\nStatus Transaksi: "
                + status;
    }
}
