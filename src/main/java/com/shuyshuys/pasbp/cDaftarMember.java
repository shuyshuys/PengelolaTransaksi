package com.shuyshuys.pasbp;

public class cDaftarMember extends cDaftar {
    // cMember head, tail;
    // int jumlah;

    cSimpul getHead() {
        return head;
    }

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
                System.out.println("  Member ditemukan");
                return true;
            }
        }
        System.out.println("  Member tidak ditemukan");
        return false;
    }

    boolean cariPassword(String user, String password) {
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getNamaMember().equals(user) && m.getPasswordMember().equals(password)) {
                System.out.println("  Password lama benar!");
                return true;
            }
        }
        System.out.println("  Password lama salah!");
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

    void setPassword(String username, String password) {
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getNamaMember().equals(username)) {
                m.setPasswordMember(password);
            }
        }
    }

    void setLaporanMember(String namaMember, int laporanHarga) {
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getIDMember() == Integer.valueOf(namaMember)) {
                m.setLaporanMember(laporanHarga);
            } else {

            }
        }
    }

    void getLaporanMember() {
        add.sBorder();
        System.out.println("LAPORAN MEMBER");
        for (cSimpul m = head; m != null; m = m.next) {
            add.sBorder();
            System.out.println("Nama / Total: [" + m.getNamaMember() + "] / [" + m.getLaporanMember() + "]");
        }
        add.sBorder();
    }

    public void peek() {
        add.sBorder();
        System.out.println("ID\tNama\t\tPassword");
        for (cSimpul m = head; m != null; m = m.next) {
            if (m.getNamaMember().length() < 6) {
                System.out.println("[" + m.getIDMember() +
                        "]\t[" + m.getNamaMember() +
                        "]\t\t[" + m.getPasswordMember() + "]");
            } else {
                System.out.println("[" + m.getIDMember() +
                        "]\t[" + m.getNamaMember() +
                        "]\t[" + m.getPasswordMember() + "]");
            }
        }
    }
}
