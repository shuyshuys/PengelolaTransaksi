package com.shuyshuys.pasbp;

public class cDaftarBarang {
    cBarang head, tail;
    int jumlah;

    void cDaftarMember() {
        head = tail = null;
        jumlah = 0;
    }

    void tambahBarang(cBarang baru) {
        if (tail == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
        System.out.println("Barang berhasil ditambahkan");
    }

    void lihatBarang() {
        int i = 1;
        System.out.println("Daftar Barang");
        for (cBarang m = head; m != null; m = m.next) {
            System.out.println(i + ". " + m.getNama() + " " + m.getHarga());
            i++;
        }
    }
}
