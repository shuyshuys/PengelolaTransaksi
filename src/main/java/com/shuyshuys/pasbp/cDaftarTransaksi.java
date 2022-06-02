package com.shuyshuys.pasbp;

public class cDaftarTransaksi {
    cTransaksi head, tail;
    int jumlah;

    cDaftarTransaksi() {
        head = tail = null;
        jumlah = 0;
    }

    public void tambahTransaksi(cTransaksi baru) {
        if (tail == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
        System.out.println("Transaksi berhasil ditambahkan");
    }

    public void lihatTransaksi() {
        int i = 1;
        System.out.println("Daftar Transaksi");
        for (cTransaksi t = head; t != null; t = t.next) {
            System.out.println(i + ". " + t.getKode() + " " + t.getNamaPembeli() + " " + t.getBarang().getNama() + " "
                    + t.getJumlahBarang() + " " + t.getStatus());
            i++;
        }
    }
}
