package com.shuyshuys.pasbp;

public class cDaftarMember extends cDaftar {
    // cMember head, tail;
    // int jumlah;

    // cDaftarMember() {
    // head = tail = null;
    // jumlah = 0;
    // }

    // void tambahMember(cMember baru) {
    // if (tail == null) {
    // head = tail = baru;
    // } else {
    // tail.next = baru;
    // tail = baru;
    // }
    // jumlah++;
    // System.out.println("Transaksi berhasil ditambahkan");
    // }

    // void lihatMember() {
    // int i = 1;
    // System.out.println("Daftar Member");
    // for (cMember m = head; m != null; m = m.next) {
    // System.out.println(i + ". " + m.getID() + " " + m.getNama() + " " +
    // m.getPassword());
    // i++;
    // }
    // }

    // void deQueue() { // admin atau pembeli
    // cMember temp;
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

    boolean cariMember(String user, String password) {
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getNamaMember().equals(user) && m.getPasswordMember().equals(password)) {
                System.out.println("Member ditemukan");
                return true;
            }
        }
        System.out.println("Member tidak ditemukan");
        return false;
    }

    int cariIdMember(String user) {
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getNamaMember().equals(user)) {
                return m.getIDMember();
            }
        }
        return 0;
    }
}
