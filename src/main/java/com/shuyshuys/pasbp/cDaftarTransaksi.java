package com.shuyshuys.pasbp;

public class cDaftarTransaksi {
    cTransaksi head, tail;
    int jumlah;

    cDaftarTransaksi() {
        head = tail = null;
        jumlah = 0;
    }

    public void enqueueTransaksi(cTransaksi trBaru) {
        if (tail == null) {
            head = tail = trBaru;
        } else {
            tail.next = trBaru;
            tail = trBaru;
        }
        jumlah++;
        System.out.println("Transaksi berhasil ditambahkan");
    }

    public void peekTransaksi() {
        if (head == null && tail == null) {
            System.out.println("Transaksi kosong!");
            add.border();
        } else {
            int i = 1;
            System.out.println("Daftar Transaksi");
            System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
            for (cTransaksi t = head; t != null; t = t.next) {
                if (t.getNamaPembeli().length() >= 6) {
                    if (t.getBarang().getNama().length() >= 6) {
                        System.out.println(i + ".  " +
                                t.getKode() + "  " +
                                t.getNamaPembeli() + "\t[" +
                                t.getBarang().getNama() + "]\t[" +
                                t.getJumlahBarang() + "]\t[" +
                                t.getStatus() + "]");
                        i++;
                    } else {
                        System.out.println(i + ".  " +
                                t.getKode() + "  " +
                                t.getNamaPembeli() + "\t[" +
                                t.getBarang().getNama() + "]\t\t[" +
                                t.getJumlahBarang() + "]\t[" +
                                t.getStatus() + "]");
                        i++;
                    }
                } else {
                    if (t.getBarang().getNama().length() >= 6) {
                        System.out.println(i + ".  " +
                                t.getKode() + "  " +
                                t.getNamaPembeli() + "\t\t[" +
                                t.getBarang().getNama() + "]\t[" +
                                t.getJumlahBarang() + "]\t[" +
                                t.getStatus() + "]");
                        i++;
                    } else {
                        System.out.println(i + ".  " +
                                t.getKode() + "  " +
                                t.getNamaPembeli() + "\t\t[" +
                                t.getBarang().getNama() + "]\t\t[" +
                                t.getJumlahBarang() + "]\t[" +
                                t.getStatus() + "]");
                        i++;
                    }
                }
            }
        }
    }

    public void peekTransaksi(String namaPembeli) {
        if (head == null && tail == null) {
            System.out.println("Transaksi kosong!");
        } else {
            cTransaksi temp = null;
            temp = isFound(namaPembeli);
            if (temp != null) {
                int i = 1;
                System.out.println("Daftar Transaksi");
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
                for (cTransaksi t = head; t != null; t = t.next) {
                    if (t.getNamaPembeli().length() >= 6) {
                        if (t.getBarang().getNama().length() >= 6) {
                            if (t.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t[" +
                                        t.getBarang().getNama() + "]\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        } else {
                            if (t.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t[" +
                                        t.getBarang().getNama() + "]\t\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        }
                    } else {
                        if (t.getBarang().getNama().length() >= 6) {
                            if (t.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t\t[" +
                                        t.getBarang().getNama() + "]\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        } else {
                            if (t.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t\t[" +
                                        t.getBarang().getNama() + "]\t\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
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

    public void peekTransaksi(int kode) {
        if (head == null && tail == null) {
            System.out.println("Transaksi kosong!");
        } else {
            Boolean found = false;
            found = isFound(kode);
            if (found == true) {
                int i = 1;
                System.out.println("Daftar Transaksi");
                System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
                for (cTransaksi t = head; t != null; t = t.next) {
                    if (t.getNamaPembeli().length() >= 6) {
                        if (t.getBarang().getNama().length() >= 6) {
                            if (t.getKode() == kode) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t[" +
                                        t.getBarang().getNama() + "]\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        } else {
                            if (t.getKode() == kode) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t[" +
                                        t.getBarang().getNama() + "]\t\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        }
                    } else {
                        if (t.getBarang().getNama().length() >= 6) {
                            if (t.getKode() == kode) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t\t[" +
                                        t.getBarang().getNama() + "]\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
                                i++;
                            }
                        } else {
                            if (t.getKode() == kode) {
                                System.out.println(i + ".  " +
                                        t.getKode() + "  " +
                                        t.getNamaPembeli() + "\t\t[" +
                                        t.getBarang().getNama() + "]\t\t[" +
                                        t.getJumlahBarang() + "]\t[" +
                                        t.getStatus() + "]");
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

    public void deQueueTransaksi() { // admin atau pemilik
        cTransaksi temp;
        if (head == null) {
            head = null;
            System.out.println("Daftar Transaksi kosong");
        } else if (head.next == null) {
            head = tail = null;
            System.out.println("Dequeue berhasil");
            jumlah--;
        } else {
            temp = head;
            head = head.next;
            temp.next = null;
            jumlah--;
            System.out.println("Dequeue berhasil");
        }
    }

    public void edit() {

    }

    void bayar() {
        // cTransaksi t = head;
        for (cTransaksi t = head; t != null; t = t.next) {
            if (t.getStatus() == 0) {
                System.out.println("Transaksi dengan kode " + t.getKode() + " belum dibayar");

            } else {
                System.out.println("Transaksi dengan kode " + t.getKode() + " sudah dibayar");
            }
        }

    }

    Boolean isFound(int kodeTransaksi) {
        Boolean found = false;
        cTransaksi temp = head;
        while (temp != null && !found) {
            if (temp.getKode() == kodeTransaksi) {
                found = true;
            } else {
                temp = temp.next;
            }
        }
        return found;
    }

    cTransaksi isFound(String namaPembeli) {
        Boolean found = false;
        cTransaksi temp = head;
        while (temp != null && !found) {
            if (temp.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                found = true;
            } else {
                temp = temp.next;
            }
        }
        return temp;
    }

    public Boolean ubahProsesTransaksi(int kodeTransaksi, Boolean found) {
        // boolean found = false;
        found = isFound(kodeTransaksi);
        if (found == true) {
            System.out.println("  Transaksi ditemukan");
            System.out.println("NO  KODE NAMA\t\tBARANG\t\tJUMLAH\tSTATUS");
            peekTransaksi(kodeTransaksi);
            System.out.print("Ubah status transaksi? (y/n): ");
            String jawab = add.sc().nextLine();
            if (jawab.equalsIgnoreCase("y")) {
                for (cTransaksi t = head; t != null; t = t.next) {
                    if (t.getKode() == kodeTransaksi) {
                        t.setStatus(1);
                    }
                }
                peekTransaksi(kodeTransaksi);
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
        cTransaksi temp = head;

        if (temp.getNamaPembeli().equalsIgnoreCase(namaPembeli)
                && temp.getBarang().getNama().equalsIgnoreCase(barang)) {
            if (temp.next == null) {
                temp = tail = null;
            } else {
                temp = temp.next;
            }
            jumlah--;
            System.out.println("Transaksi berhasil dihapus");
        } else {
            while (temp.next != null) {
                if (temp.next.getNamaPembeli().equalsIgnoreCase(namaPembeli)
                        && temp.next.getBarang().getNama().equalsIgnoreCase(barang)) {
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

    public int totalTagihan(String namaPembeli) {
        int total = 0;
        cTransaksi temp = head;
        while (temp != null) {
            if (temp.getNamaPembeli().equalsIgnoreCase(namaPembeli)) {
                total += temp.getSubTotal();
            }
            temp = temp.next;
        }
        return total;
    }
}
