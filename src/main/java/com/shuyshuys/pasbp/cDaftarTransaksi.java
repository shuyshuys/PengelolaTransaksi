package com.shuyshuys.pasbp;

public class cDaftarTransaksi extends cDaftar {

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
            System.out.println("Transaksi kosong!");
            add.border();
        } else {
            int i = 1;
            System.out.println("Daftar Transaksi");
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
            System.out.println("Transaksi kosong!");
        } else {
            // cSimpul temp = null;
            cSimpul temp = searchPembeli(namaPembeli);
            if (temp != null) {
                int i = 1;
                System.out.println("Daftar Transaksi");
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
                System.out.println("Transaksi kosong!");
            }
        }
        add.border();
    }

    public void peek(int kode) {
        add.sBorder();
        if (head == null && tail == null) {
            System.out.println("Transaksi kosong!");
        } else {
            Boolean found = false;
            found = kodeTransaksiIsFound(kode);
            if (found == true) {
                int i = 1;
                System.out.println("Daftar Transaksi");
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
                System.out.println("Transaksi kosong!");
            }
        }
    }

    public void peekStatus(int status) {
        add.border();
        if (head == null && tail == null) {
            System.out.println("Transaksi kosong!");
        } else {
            int i = 1;
            if (status == 1) {
                System.out.println("Daftar Transaksi yang SUDAH di Proses");
            } else {
                System.out.println("Daftar Transaksi yang BELUM di Proses");
            }
            System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
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
            System.out.println("  Transaksi ditemukan");
            // Menampilkan transaksi sebelum dilakukan pengubahan status dengan filter
            // kodeTr
            peek(kodeTr);
            System.out.print("Ubah status transaksi? (y/n): ");
            String jawab = add.sc().nextLine();
            // Pengecekan ulang sebelum dilakukan pengubahan status transaksi
            if (jawab.equalsIgnoreCase("y")) {
                for (cSimpul t = head; t != null; t = t.next) {
                    if (t.getIDTransaksi() == kodeTr) {
                        // Mengubah status dari 0 ke 1
                        t.setStatusTransaksi(1);
                        // Update status transaksi dari 0 ke 1 pada database
                        write.updateStatusTransaksiToDB(kodeTr);
                        // Update akumulasi laporan barang
                        b.setLaporanHarga(t.getBarangTransaksi().getNama(), t.getSubTotalTransaksi());
                        // Update akumulasi laporan barang pada database
                        write.updateLaporan(t.getSubTotalTransaksi(),
                                "barang",
                                t.getBarangTransaksi().getID(),
                                "laporan_barang",
                                "id_barang");
                        if (t.getIsMember() == true) {
                            for (cSimpul mm = m.getHead(); mm != null; mm = mm.next) {
                                if (Integer.valueOf(t.getNamaTransaksi()) == mm.getIDMember()) {
                                    // Update akumulasi laporan member
                                    mm.setLaporanMember(t.getSubTotalTransaksi());
                                    // Update akumulasi laporan member pada database
                                    write.updateLaporan(t.getSubTotalTransaksi(),
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
                System.out.println("  Status transaksi tidak diubah");
            }
        } else {
            System.out.println("  Transaksi tidak ditemukan");
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
            System.out.println("Transaksi berhasil dihapus");
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
                    System.out.println("Transaksi berhasil dihapus");
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public int totalTagihanPembeli(String namaPembeli) {
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
}
