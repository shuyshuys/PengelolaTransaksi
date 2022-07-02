package com.shuyshuys.pasbp;

public class cBarang extends cObject {
    cBarang next;

    cBarang(String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.laporanHarga = 0;
    }
}
