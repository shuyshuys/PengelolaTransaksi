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

    void ubahHargaBarang(String namaBarang) {
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
        add.sBorder();
        int totalPendapatan = getTotalPendapatan();

        System.out.println("  LAPORAN BARANG");
        System.out.println("Total Pendapatan: [" + totalPendapatan + "]");
        for (cSimpul b = head; b != null; b = b.next) {
            add.sBorder();
            System.out.println("Barang / Total: [" + b.getNamaBarang() + "] / [" + b.getLaporanBarang() + "]");
        }
    }

    int getTotalPendapatan() {
        int totalPendapatan = 0;
        for (cSimpul b = head; b != null; b = b.next) {
            totalPendapatan = totalPendapatan + b.getLaporanBarang();
        }
        return totalPendapatan;
    }

    void setLaporanMember(String namaBarang, int laporanHarga) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                b.setLaporanMember(laporanHarga);
            } else {

            }
        }
    }

    public cBarang cariBarang(String namaBarang) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                return b.getBarang();
            } else {
            }
        }
        return null;
    }

    public cBarang cariBarangInt(int id) {
        for (cSimpul b = head; b != null; b = b.next) {
            if (b.getIdBarang() == id) {
                return b.getBarang();
            } else {
            }
        }
        return null;
    }
}