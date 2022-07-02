package com.shuyshuys.pasbp;

public class cDaftarBarang extends cDaftar {

    cSimpul getHead() {
        return head;
    }

    // @Override
    public void peek(int indent) {
        add.border();
        head.getDataBarang(head, indent);
        add.border();
    }

    void searchBarang(String namaBarang) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                add.border();
                System.out.println("    Harga semula\t: " + b.getHargaBarang());
                System.out.print("    Input harga baru\t: ");
                int harga = add.sc().nextInt();
                b.setHargaBarang(harga);
                add.border();
                System.out.println("    Nama Barang\t\t: " + b.getNamaBarang());
                System.out.println("    Harga Barang\t: " + b.getHargaBarang());
                add.sleep(1500);
            } else {

            }
        }
    }

    void setLaporanHarga(String namaBarang, int laporanHarga) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                b.setLaporanBarang(laporanHarga);
            } else {
                // System.out.println("");
            }
        }
    }

    void getLaporanBarang() {
        System.out.println("Laporan Barang");
        for (cSimpul b = head; b != null; b = b.next) {
            add.sBorder();
            System.out.println("Nama Barang: " + b.getNamaBarang());
            System.out.println("Harga Barang: " + b.getLaporanBarang());
        }
    }

    cSimpul getLaporanBarang(String namaBarang) {
        cSimpul b = head;

        return b;
    }

    void setLaporanMember(String namaBarang, int laporanHarga) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                b.setLaporanMember(laporanHarga);
            } else {

            }
        }
    }

    void getLaporanMember() {
        System.out.println("Laporan Member");
        for (cSimpul b = head; b != null; b = b.next) {
            add.sBorder();
            if (true) {
                System.out.println("Nama Barang: " + b.getNamaBarang());
                System.out.println("Harga Barang: " + b.getLaporanMember());
            }
        }
    }
}