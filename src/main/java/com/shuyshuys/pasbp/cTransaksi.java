package com.shuyshuys.pasbp;

public class cTransaksi extends cObject {
    boolean isMember;
    cTransaksi next;

    cTransaksi(int kodeTr,
            String nama,
            cBarang barang,
            int jumlah,
            int status,
            int subTotal,
            int bayar,
            int kembalian,
            boolean isMember) {
        super(kodeTr, nama, barang, jumlah, status, subTotal, bayar, kembalian);
        this.isMember = isMember;
        System.out.println("    Transaksi " + nama + " ditambahkan");
    }

    public void setStatus(int status) {
        this.status = status;
    }

    int getStatus() {
        return status;
    }

    // public void setNamaPembeli(String namaPembeli) {
    // this.namaPembeli = namaPembeli;
    // }

    public void setBarang(cBarang barang) {
        this.barang = barang;
    }

    public cBarang getBarang() {
        return barang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlah = jumlahBarang;
    }

    public int getJumlahBarang() {
        return jumlah;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getBayar() {
        return bayar;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public boolean getIsMember() {
        return isMember;
    }

    // public String getNamaPembeli() {
    // return namaPembeli;
    // }

    public String toString() {
        return "Kode Transaksi: " + id + "\nNama Pembeli: " + nama + "\nNama Barang: " + barang.getNama()
                + "\nHarga Barang: " + barang.getHarga() + "\nJumlah Barang: " + jumlah + "\nStatus Transaksi: "
                + status;
    }
}
