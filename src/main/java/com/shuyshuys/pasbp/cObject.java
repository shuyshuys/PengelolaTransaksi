package com.shuyshuys.pasbp;

public class cObject {
    String nama;
    int harga;
    int id;
    cBarang barang;
    int jumlah;
    int status;
    int subTotal;
    int bayar;
    int kembalian;
    int laporanHarga;

    cObject next;

    cObject(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    cObject(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        System.out.println("Barang " + nama + " berhasil ditambahkan");
    }

    cObject(int id,
            String nama,
            cBarang barang,
            int jumlah,
            int status,
            int subTotal,
            int bayar,
            int kembalian) {
        this.id = id;
        this.nama = nama;
        this.barang = barang;
        this.jumlah = jumlah;
        this.status = status;
        this.next = null;
        this.subTotal = subTotal;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }

    public int getID() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    void setLaporanHarga(int laporanHarga) {
        this.laporanHarga = laporanHarga;
    }

    int getLaporanHarga() {
        return laporanHarga;
    }
}
