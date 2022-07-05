package com.shuyshuys.pasbp;

public class cDaftarTransaksi extends cDaftar {

    cSimpul getHead() {
        return head;
    }

    cSimpul getTail() {
        return tail;
    }

    public void beli(int kodeTr, String namaPembeli, cBarang barang, int jumlahBarang,
            cDaftarTransaksi daftarTransaksi,
            boolean isMember) {
        int laporanHarga = countLaporanHarga(barang.getHarga(), jumlahBarang,
                isMember);
        daftarTransaksi.enqueue(
                new cSimpul(
                        new cTransaksi(kodeTr,
                                namaPembeli,
                                barang,
                                jumlahBarang,
                                0,
                                laporanHarga,
                                0,
                                0,
                                isMember)));
    }

    public int countLaporanHarga(int hargaBarang, int jumlahBarang, boolean isMember) {
        int laporanHarga = 0;
        if (isMember) {
            laporanHarga = hargaBarang * jumlahBarang * 95 / 100;
        } else {
            laporanHarga = hargaBarang * jumlahBarang;
        }
        return laporanHarga;
    }

    public void peek() {
        if (head == null && tail == null) {
            System.out.println("TRANSAKSI KOSONG!");
            add.border();
        } else {
            int i = 1;
            add.sBorder();
            System.out.println("DAFTAR TRANSAKSI");
            add.sBorder();
            System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
            for (cSimpul t = head; t != null; t = t.next) {
                if (t.getNamaTransaksi().length() >= 6) {
                    if (t.getNamaTransaksi().length() >= 6) {
                        System.out.println(i + ".  " +
                                t.getIDTransaksi() + "  " +
                                t.getNamaTransaksi() + "\t[" +
                                t.getBarangTransaksi().getNama() + "]\t[" +
                                t.getJumlahBarangTransaksi() + "]\t[" +
                                t.getStatusTransaksi() + "]");
                        i++;
                    } else {
                        System.out.println(i + ".  " +
                                t.getIDTransaksi() + "  " +
                                t.getNamaTransaksi() + "\t[" +
                                t.getBarangTransaksi().getNama() + "]\t\t[" +
                                t.getJumlahBarangTransaksi() + "]\t[" +
                                t.getStatusTransaksi() + "]");
                        i++;
                    }
                } else {
                    if (t.getBarangTransaksi().getNama().length() >= 6) {
                        System.out.println(i + ".  " +
                                t.getIDTransaksi() + "  " +
                                t.getNamaTransaksi() + "\t\t[" +
                                t.getBarangTransaksi().getNama() + "]\t[" +
                                t.getJumlahBarangTransaksi() + "]\t[" +
                                t.getStatusTransaksi() + "]");
                        i++;
                    } else {
                        System.out.println(i + ".  " +
                                t.getIDTransaksi() + "  " +
                                t.getNamaTransaksi() + "\t\t[" +
                                t.getBarangTransaksi().getNama() + "]\t\t[" +
                                t.getJumlahBarangTransaksi() + "]\t[" +
                                t.getStatusTransaksi() + "]");
                        i++;
                    }
                }
            }
        }
    }

    public void peek(String namaPembeli) {
        add.border();
        if (head == null && tail == null) {
            System.out.println("TRANSAKSI KOSONG!");
        } else {
            // cSimpul temp = null;
            cSimpul temp = searchPembeli(namaPembeli);
            if (temp != null) {
                int i = 1;
                add.sBorder();
                System.out.println("DAFTAR TRANSAKSI");
                add.sBorder();
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
                for (cSimpul t = head; t != null; t = t.next) {
                    if (t.getNamaTransaksi().length() >= 6) {
                        if (t.getBarangTransaksi().getNama().length() >= 6) {
                            if (t.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        } else {
                            if (t.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        }
                    } else {
                        if (t.getBarangTransaksi().getNama().length() >= 6) {
                            if (t.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        } else {
                            if (t.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        }
                    }
                }
            } else {
                System.out.println("TRANSAKSI KOSONG!");
            }
        }
        add.border();
    }

    public void peek(int kode) {
        add.sBorder();
        if (head == null && tail == null) {
            System.out.println("TRANSAKSI KOSONG!");
        } else {
            Boolean found = false;
            found = kodeTransaksiIsFound(kode);
            if (found == true) {
                int i = 1;
                System.out.println("DAFTAR TRANSAKSI");
                add.sBorder();
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
                for (cSimpul t = head; t != null; t = t.next) {
                    if (t.getNamaTransaksi().length() >= 6) {
                        if (t.getBarangTransaksi().getNama().length() >= 6) {
                            if (t.getIDTransaksi() == kode) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        } else {
                            if (t.getIDTransaksi() == kode) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        }
                    } else {
                        if (t.getBarangTransaksi().getNama().length() >= 6) {
                            if (t.getIDTransaksi() == kode) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        } else {
                            if (t.getIDTransaksi() == kode) {
                                System.out.println(i + ".  " +
                                        t.getIDTransaksi() + "  " +
                                        t.getNamaTransaksi() + "\t\t[" +
                                        t.getBarangTransaksi().getNama() + "]\t\t[" +
                                        t.getJumlahBarangTransaksi() + "]\t[" +
                                        t.getStatusTransaksi() + "]");
                                i++;
                            }
                        }
                    }
                }
            } else {
                System.out.println("TRANSAKSI KOSONG!");
            }
        }
    }

    public void peekStatus(int status) {
        add.sBorder();
        if (head == null && tail == null) {
            System.out.println("TRANSAKSI KOSONG!");
        } else {
            int i = 1;
            if (status == 1) {
                System.out.println("Daftar Transaksi yang SUDAH di Proses");
                add.sBorder();
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
            } else {
                System.out.println("Daftar Transaksi yang BELUM di Proses");
                add.sBorder();
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
            }
            for (cSimpul t = head; t != null; t = t.next) {
                if (t.getNamaTransaksi().length() >= 6) {
                    if (t.getBarangTransaksi().getNama().length() >= 6) {
                        if (t.getStatusTransaksi() == status) {
                            System.out.println(i + ".  " +
                                    t.getIDTransaksi() + "  " +
                                    t.getNamaTransaksi() + "\t[" +
                                    t.getBarangTransaksi().getNama() + "]\t[" +
                                    t.getJumlahBarangTransaksi() + "]\t[" +
                                    t.getStatusTransaksi() + "]");
                            i++;
                        }
                    } else {
                        if (t.getStatusTransaksi() == status) {
                            System.out.println(i + ".  " +
                                    t.getIDTransaksi() + "  " +
                                    t.getNamaTransaksi() + "\t[" +
                                    t.getBarangTransaksi().getNama() + "]\t\t[" +
                                    t.getJumlahBarangTransaksi() + "]\t[" +
                                    t.getStatusTransaksi() + "]");
                            i++;
                        }
                    }
                } else {
                    if (t.getBarangTransaksi().getNama().length() >= 6) {
                        if (t.getStatusTransaksi() == status) {
                            System.out.println(i + ".  " +
                                    t.getIDTransaksi() + "  " +
                                    t.getNamaTransaksi() + "\t\t[" +
                                    t.getBarangTransaksi().getNama() + "]\t[" +
                                    t.getJumlahBarangTransaksi() + "]\t[" +
                                    t.getStatusTransaksi() + "]");
                            i++;
                        }
                    } else {
                        if (t.getStatusTransaksi() == status) {
                            System.out.println(i + ".  " +
                                    t.getIDTransaksi() + "  " +
                                    t.getNamaTransaksi() + "\t\t[" +
                                    t.getBarangTransaksi().getNama() + "]\t\t[" +
                                    t.getJumlahBarangTransaksi() + "]\t[" +
                                    t.getStatusTransaksi() + "]");
                            i++;
                        }
                    }

                }
            }
        }
    }

    public void edit() {

    }

    void bayar() {
        // cSImpul t = head;
        for (cSimpul t = head; t != null; t = t.next) {
            if (t.getStatusTransaksi() == 0) {
                System.out.println("Transaksi dengan kode " + t.getIDTransaksi() + " belum dibayar");

            } else {
                System.out.println("Transaksi dengan kode " + t.getIDTransaksi() + " sudah dibayar");
            }
        }

    }

    public Boolean ubahProsesTransaksi(int kodeTr, Boolean found, cDaftarBarang b, cDaftarMember m) {
        mineWriter write = new mineWriter();
        // Melakukan perbandingan kodeTr yang dicari dengan yang terdapat pada
        // daftarTransaksi
        found = kodeTransaksiIsFound(kodeTr);
        if (found == true) {
            System.out.println("  TRANSAKSI DITEMUKAN!");
            // Menampilkan transaksi sebelum dilakukan pengubahan status dengan filter
            // kodeTr
            peek(kodeTr);
            System.out.print("Ubah status transaksi? (y/n): ");
            String jawab = add.sc().nextLine();
            // Pengecekan ulang sebelum dilakukan pengubahan status transaksi
            if (jawab.equalsIgnoreCase("y")) {
                for (cSimpul t = head; t != null; t = t.next) {
                    String namaBarang = t.getBarangTransaksi().getNama();
                    if (t.getIDTransaksi() == kodeTr) {
                        // Mengubah status dari 0 ke 1
                        t.setStatusTransaksi(1);
                        // Update status transaksi dari 0 ke 1 pada database
                        write.updateStatusTransaksiToDB(kodeTr);
                        // Update akumulasi laporan barang pada local
                        b.setLaporanHarga(namaBarang, t.getSubTotalTransaksi());

                        int laporanHarga = 0;
                        for (cSimpul bb = b.getHead(); bb != null; bb = bb.next) {
                            if (namaBarang.equalsIgnoreCase(bb.getBarang().getNama())) {
                                laporanHarga = bb.getLaporanBarang();
                            }
                        }
                        // Update akumulasi laporan barang pada database
                        write.updateLaporan(laporanHarga,
                                "barang",
                                t.getBarangTransaksi().getID(),
                                "laporan_barang",
                                "id_barang");
                        if (t.getIsMember() == true) {
                            for (cSimpul mm = m.getHead(); mm != null; mm = mm.next) {
                                if (Integer.valueOf(t.getNamaTransaksi()) == mm.getIDMember()) {
                                    // Update akumulasi laporan member pada local
                                    mm.setLaporanMember(t.getSubTotalTransaksi());
                                    // Update akumulasi laporan member pada database
                                    laporanHarga = t.getSubTotalTransaksi() + mm.getLaporanMember();
                                    write.updateLaporan(laporanHarga,
                                            "member",
                                            mm.getIDMember(),
                                            "laporan_member",
                                            "id_member");
                                }
                            }
                        }
                    }
                }
                // Menampilkan transaksi setelah dilakukan perubahan status dengan filter kodeTr
                peek(kodeTr);
                found = true;
                System.out.println("  Status transaksi berhasil diubah");
            } else {
                System.out.println("  STATUS TRANSAKSI TIDAK DIUBAH!");
            }
        } else {
            System.out.println("  TRANSAKSI TIDAK DITEMUKAN!");
        }
        return found;
    }

    public void cariHapusTransaksi(String namaPembeli, String barang) {
        cSimpul temp = head;
        if (temp.getNamaTransaksi().equalsIgnoreCase(namaPembeli)
                && temp.getBarangTransaksi().getNama().equalsIgnoreCase(barang)) {
            if (temp.next == null) {
                temp = tail = null;
            } else {
                temp = temp.next;
            }
            jumlah--;
            System.out.println("TRANSAKSI BERHASIL DIHAPUS");
        } else {
            while (temp.next != null) {
                if (temp.next.getNamaTransaksi().equalsIgnoreCase(namaPembeli)
                        && temp.next.getBarangTransaksi().getNama().equalsIgnoreCase(barang)) {
                    if (temp.next.next != null) {
                        temp.next = temp.next.next;
                        tail = temp.next;
                    } else {
                        tail = temp;
                        temp.next = null;
                    }
                    jumlah--;
                    System.out.println("TRANSAKSI BERHASIL DIHAPUS");
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public int totalTagihan(String namaPembeli) {
        int total = 0;
        cSimpul temp = head;
        while (temp != null) {
            if (temp.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                total += temp.getSubTotalTransaksi();
            }
            temp = temp.next;
        }
        return total;
    }

    void getGrafikPenjualan(cSimpul t) {
        add.sBorder();
        while (t != null) {
            int max = pembulatanKeBawah(t.getLaporanBarang());
            System.out.print(t.getNamaBarang() + "\t: ");
            for (int i = 0; i < max; i++) {
                System.out.print("X");
            }
            System.out.println(" [" + t.getLaporanBarang() + "]");
            t = t.next;
        }
    }

    int pembulatanKeBawah(int harga) {
        int index = 0;
        while (harga > 9999) {
            harga = harga - 10000;
            index++;
        }
        return index;
    }

    public void sambungTransaksi(cDaftarTransaksi daftarTransaksi, cDaftarTransaksi tempDaftarTransaksi) {
        cSimpul headTr = daftarTransaksi.getHead();
        cSimpul tailTr = daftarTransaksi.getTail();
        cSimpul headTempTr = tempDaftarTransaksi.getHead();
        cSimpul tailTempTr = tempDaftarTransaksi.getTail();
        if (headTr == null) {
            headTr = headTempTr;
            tailTr = tailTempTr;
        } else {
            tailTr.next = headTempTr;
            tailTr = tailTempTr;
        }
    }

    public void hapusTransaksi(int kodeTransaksi) {
        cSimpul t = head;
        if (t.getIDTransaksi() == kodeTransaksi) {
            if (t.next == null) {
                t = tail = null;
            } else {
                t = t.next;
            }
            jumlah--;
            System.out.println("TRANSAKSI BERHASIL DIHAPUS");
        } else {
            for (; t.next != null;) {
                if (t.next.getIDTransaksi() == kodeTransaksi) {
                    if (t.next.next != null) {
                        t.next = t.next.next;
                        // tail = t.next;
                    } else {
                        tail = t;
                        t.next = null;
                    }
                    jumlah--;
                    System.out.println("TRANSAKSI BERHASIL DIHAPUS");
                    // break;
                } else {
                    t = t.next;
                }
            }
        }
    }

    public void setBayar(int uang, int kembalian, int kodeTr) {
        for (cSimpul t = head; t != null; t = t.next) {
            if (t.getIDTransaksi() == kodeTr) {
                t.setBayarTransaksi(uang);
                t.setKembalian(kembalian);
            }
        }
    }
}
