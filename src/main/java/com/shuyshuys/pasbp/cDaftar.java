package com.shuyshuys.pasbp;

public class cDaftar {
    cSimpul head, tail;

    // cTransaksi head, tail;
    int jumlah;

    cDaftar() {
        head = tail = null;
        jumlah = 0;
    }

    public void enqueue(cSimpul simpulBaru) {
        if (tail == null) {
            head = tail = simpulBaru;
        } else {
            tail.next = simpulBaru;
            tail = simpulBaru;
        }
        jumlah++;
        System.out.println("      Simpul berhasil Disambungkan...");
    }

    public void dequeue() { // admin atau pembeli
        cSimpul temp;
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

    // public void peek() {
    // int i = 1;
    // System.out.println("Daftar ");
    // cSimpul b = head;
    // for (cSimpul m = head; m != null; m = m.next) {
    // System.out.println(i + ". " + m.getNama() + " " + m.getHarga());
    // i++;
    // }
    // b.getDataBarang();
    // }

    public int size() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Boolean isEmpty() {
        Boolean isEmpty;
        if (jumlah == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        return isEmpty;
    }

    public Boolean isFull() {
        Boolean isFull;
        if (jumlah == 10) {
            isFull = true;
        } else {
            isFull = false;
        }
        return isFull;
    }

    cSimpul searchPembeli(String namaPembeli) {
        Boolean found = false;
        cSimpul temp = head;
        while (temp != null && !found) {
            if (temp.getNamaTransaksi().equalsIgnoreCase(namaPembeli)) {
                found = true;
            } else {
                temp = temp.next;
            }
        }
        return temp;
    }

    Boolean kodeTransaksiIsFound(int kodeTransaksi) {
        Boolean found = false;
        cSimpul temp = head;
        while (temp != null && !found) {
            if (temp.getIDTransaksi() == kodeTransaksi) {
                found = true;
            } else {
                temp = temp.next;
            }
        }
        return found;
    }

    public void edit() {

    }

}
