package com.shuyshuys.pasbp;

public class cDaftarTransaksi {
    cTransaksi head, tail;
    int jumlah;

    cDaftarTransaksi() {
        head = tail = null;
        jumlah = 0;
    }

    public void tambahTransaksi(cTransaksi trBaru) {
        if (tail == null) {
            head = tail = trBaru;
        } else {
            tail.next = trBaru;
            tail = trBaru;
        }
        jumlah++;
        System.out.println("Transaksi berhasil ditambahkan");
    }

    public void lihatTransaksi() {
        int i = 1;
        System.out.println("Daftar Transaksi");
        System.out.println("NO  KODE NAMA\tBARANG\t\tJUMLAH\tSTATUS");
        for (cTransaksi t = head; t != null; t = t.next) {
            System.out.println(i + ".  " + t.getKode() + "  " + t.getNamaPembeli() + "\t[" + t.getBarang().getNama()
                    + "]\t[" + t.getJumlahBarang() + "]\t[" + t.getStatus() + "]");
            i++;
        }
    }

    public void deQueue() { // admin atau pembeli
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

    cTransaksi cariBarang(String cariBarang) {
        for (cTransaksi trBarang = head; trBarang != null; trBarang = trBarang.next) {
            if (trBarang.getBarang().getNama().equalsIgnoreCase(cariBarang)) {
                System.out.println("Barang ditemukan");
                return trBarang;
            }
        }
        return null;
    }

    public void hapusTransaksi(String namaPembeli, String barang) {
        cTransaksi temp = head;
        if (temp.getNamaPembeli().equalsIgnoreCase(namaPembeli)
                && temp.getBarang().getNama().equalsIgnoreCase(barang)) {
            System.out.println("temp.getNamaPembeli() = " + temp.getNamaPembeli());
            System.out.println("temp.getBarang().getNama() = " + temp.getBarang().getNama());
            head = head.next;
            temp.next = null;
            jumlah--;
            System.out.println("Transaksi berhasil dihapus");
        } else {
            while (temp.next != null) {
                if (temp.next.getNamaPembeli().equalsIgnoreCase(namaPembeli)
                        && temp.next.getBarang().getNama().equalsIgnoreCase(barang)) {
                    System.out.println("temp.next.getNamaPembeli() = " + temp.next.getNamaPembeli());
                    System.out.println("temp.next.getBarang().getNama() = " + temp.next.getBarang().getNama());

                    if (temp.next.next != null) {
                        temp.next = temp.next.next;
                        temp.next.next = null;
                        System.out.println("if terhapus");
                    } else {
                        // temp = temp.next;
                        temp.next = null;
                        System.out.println("else terhapus");
                    }
                    jumlah--;
                    System.out.println("Transaksi berhasil dihapus");
                    break;
                }
                temp = temp.next;
                System.out.println("tidak ditemukan, try next");
            }
        }
    }
}
