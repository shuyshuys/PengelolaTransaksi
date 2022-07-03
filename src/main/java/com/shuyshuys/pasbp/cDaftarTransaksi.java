package com.shuyshuys.pasbp;

public class cDaftarTransaksi extends cDaftar {
    // @Override
    // cSImpul head, tail;
    // int jumlah;

    // cDaftarTransaksi() {
    // head = tail = null;
    // jumlah = 0;
    // }

    // public void enqueueTransaksi(cSImpul trBaru) {
    // if (tail == null) {
    // head = tail = trBaru;
    // } else {
    // tail.next = trBaru;
    // tail = trBaru;
    // }
    // jumlah++;
    // System.out.println("Transaksi berhasil ditambahkan");
    // }

    // @Override
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
            // Boolean found = false;
            // found = kodeTransaksiIsFound(status);
            // if (found == true) {
            int i = 1;
            System.out.println("Daftar Transaksi yang BELUM di Proses");
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
            // } else {
            // System.out.println("Transaksi kosong!");
            // }
        }
    }

    // public void deQueueTransaksi() { // admin atau pemilik
    // cSImpul temp;
    // if (head == null) {
    // head = null;
    // System.out.println("Daftar Transaksi kosong");
    // } else if (head.next == null) {
    // head = tail = null;
    // System.out.println("Dequeue berhasil");
    // jumlah--;
    // } else {
    // temp = head;
    // head = head.next;
    // temp.next = null;
    // jumlah--;
    // System.out.println("Dequeue berhasil");
    // }
    // }

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

    public Boolean ubahProsesTransaksi(int kodeTransaksi, Boolean found, cDaftarBarang b, cDaftarMember m) {
        // boolean found = false;
        found = kodeTransaksiIsFound(kodeTransaksi);
        if (found == true) {
            System.out.println("  Transaksi ditemukan");
            peek(kodeTransaksi);
            System.out.print("Ubah status transaksi? (y/n): ");
            String jawab = add.sc().nextLine();
            // cDaftarBarang b = new cDaftarBarang(); // .getHead();
            if (jawab.equalsIgnoreCase("y")) {
                for (cSimpul t = head; t != null; t = t.next) {
                    if (t.getIDTransaksi() == kodeTransaksi) {
                        // Mengubah status dari 0 ke 1
                        t.setStatusTransaksi(1);
                        b.setLaporanHarga(t.getBarangTransaksi().getNama(), t.getSubTotalTransaksi());
                        // System.out.println("Laporan barang: " + t.getBarangTransaksi().getNama() + "
                        // SubT: " + t.getSubTotalTransaksi());
                        System.out.println("isMember? " + t.getIsMember());
                        if (t.getIsMember() == true) {
                            for (cSimpul temp = m.getHead(); temp != null; temp = temp.next) {
                                if (Integer.valueOf(t.getNamaTransaksi()) == temp.getIDMember()) {
                                    temp.setLaporanMember(t.getSubTotalTransaksi());
                                }
                            }
                            // System.out.println("Laporan member: " + t.getBarangTransaksi().getNama() + "
                            // SubT: "+ t.getSubTotalTransaksi());
                        }
                    }
                }
                peek(kodeTransaksi);
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
