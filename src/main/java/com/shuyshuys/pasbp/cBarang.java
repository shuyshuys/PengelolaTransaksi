package com.shuyshuys.pasbp;

public class cBarang {
    String nama;
    int harga;

    cBarang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        System.out.println("Barang " + nama + " berhasil ditambahkan");
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
