package com.shuyshuys.pasbp;

public class cBarang extends cObject {
    cBarang next;

    cBarang(int id, String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.id = id;
        this.laporanHarga = 0;
        System.out.println("Barang " + nama + " ditambahkan");
    }

    cBarang(int id, String namaBarang, int hargaBarang, int laporanHarga) {
        super(namaBarang, hargaBarang);
        this.id = id;
        this.laporanHarga = laporanHarga;
        System.out.println("Barang " + nama + " ditambahkan");
    }
}
