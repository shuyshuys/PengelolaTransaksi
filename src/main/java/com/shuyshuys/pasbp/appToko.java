package com.shuyshuys.pasbp;

import java.util.Scanner;

public class appToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cBarang tas = new cBarang("Tas", 100000);
        cBarang sandal = new cBarang("Sandal", 50000);
        cBarang sepatu = new cBarang("Sepatu", 150000);

        cMember budi = new cMember(101, "Budi", "budi");
        cMember siti = new cMember(102, "Siti", "siti");
        cMember sri = new cMember(103, "Sri", "sri");

        cDaftarMember llMember = new cDaftarMember();
        llMember.tambahMember(budi);
        llMember.tambahMember(siti);
        llMember.tambahMember(sri);

        String username;
        String password;

        String userAdmin = "admin";
        String passAdmin = "admin";

        String userPemilik = "pemilik";
        String passPemilik = "pemilik";

        // cDaftarTransaksi llMember = new cDaftarTransaksi();
        // llMember.tambahMember(m1);

        cDaftarTransaksi beli = new cDaftarTransaksi();
        int pilih = 0, pilih2 = 0;
        int kode = 200;
        do {
            add.cls();
            add.border();
            System.out.println("Menu level pengguna");
            add.border();
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota / Member");
            System.out.println("3. Admin");
            System.out.println("4. Pemilik");
            System.out.println("5. Anggota Kelompok");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu = ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    // Pembeli
                    // Pembeli : diikuti pengisian data nama
                    kode++;
                    System.out.println("\n  Menu Pembeli");
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.next();
                    do {
                        System.out.println("\n");
                        add.border();
                        System.out.println("  Pembeli [" + namaPembeli + "]");
                        add.border();
                        System.out.println("  1. Tambah Transaksi");
                        System.out.println("  2. Hapus Transaksi");
                        System.out.println("  3. Lihat Transaksi");
                        System.out.println("  4. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.println("1. [" + tas.getNama() + "]  [" + tas.getHarga() + "]");
                                System.out.println("2. [" + sandal.getNama() + "]  [" + sandal.getHarga() + "]");
                                System.out.println("3. [" + sepatu.getNama() + "]  [" + sepatu.getHarga() + "]");
                                System.out.print("pilih barang: ");
                                int pilihBarang = sc.nextInt();
                                System.out.print("jumlah barang: ");
                                int jumlahBarang = sc.nextInt();
                                switch (pilihBarang) {
                                    case 1:
                                        beli.tambahTransaksi(
                                                new cTransaksi(kode,
                                                        namaPembeli,
                                                        tas,
                                                        jumlahBarang,
                                                        0));
                                        break;
                                    case 2:
                                        beli.tambahTransaksi(
                                                new cTransaksi(kode,
                                                        namaPembeli,
                                                        sandal,
                                                        jumlahBarang,
                                                        0));
                                        break;
                                    case 3:
                                        beli.tambahTransaksi(
                                                new cTransaksi(kode,
                                                        namaPembeli,
                                                        sepatu,
                                                        jumlahBarang,
                                                        0));
                                        break;
                                    default:
                                        System.out.println("Barang tidak ditemukan");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.print("Barang yang dihapus: ");
                                String barang = sc.next();
                                beli.hapusTransaksi(namaPembeli, barang);
                                break;
                            case 3:
                                beli.lihatTransaksi();
                                break;
                            case 4:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 2:
                    // Anggota
                    // Member/anggota : diikuti pengisian login ID dan password. Untuk sebagai
                    // contoh, bisa disiapkan 3 akun anggota terlebih dulu
                    add.cls();
                    add.border();
                    System.out.println("\n  Menu Anggota");
                    add.border();
                    System.out.print("Masukkan username: ");
                    username = sc.next();
                    System.out.print("Masukkan password: ");
                    password = sc.next();
                    if (llMember.cariMember(username, password) == true) {
                        System.out.println("  Selamat datang " + username);
                        do {
                            System.out.println("  Menu Anggota");
                            System.out.println("  1. Tambah Transaksi");
                            System.out.println("  2. Hapus Transaksi");
                            System.out.println("  3. Lihat Transaksi");
                            System.out.println("  4. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = sc.nextInt();
                            switch (pilih2) {
                                case 1:
                                    System.out.println("1. [" + tas.getNama() + "]  [" + tas.getHarga() + "]");
                                    System.out.println("2. [" + sandal.getNama() + "]  [" + sandal.getHarga() + "]");
                                    System.out.println("3. [" + sepatu.getNama() + "]  [" + sepatu.getHarga() + "]");
                                    System.out.print("pilih barang: ");
                                    int pilihBarang = sc.nextInt();
                                    System.out.print("jumlah barang: ");
                                    int jumlahBarang = sc.nextInt();
                                    switch (pilihBarang) {
                                        case 1:
                                            // beli.tambahTransaksi(new cTransaksi(kode, llMember.getNama(username),
                                            // tas,
                                            // jumlahBarang, 0));
                                            break;
                                        case 2:
                                            // beli.tambahTransaksi(
                                            // new cTransaksi(kode, llMember.getNama(username), sandal,
                                            // jumlahBarang, 0));
                                            break;
                                        case 3:
                                            // beli.tambahTransaksi(
                                            // new cTransaksi(kode, llMember.getNama(username), sepatu,
                                            // jumlahBarang, 0));
                                            break;
                                        default:
                                            System.out.println("Barang tidak ditemukan");
                                            break;
                                    }
                            }
                        } while (pilih2 != 4);
                    } else {
                        add.salahLogin();
                    }

                    break;
                case 3:
                    // Admin
                    // Admin : diikuti dengan pengisian password.
                    add.cls();
                    add.border();
                    System.out.println("\n  Menu Admin");
                    add.border();
                    System.out.print("Masukkan username: ");
                    username = sc.next();
                    System.out.print("Masukkan password: ");
                    password = sc.next();
                    if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {

                    } else {
                        add.salahLogin();
                    }
                    break;
                case 4:
                    // Pemilik
                    // Pemilik : diikuti dengan pengisian password.
                    add.cls();
                    add.border();
                    System.out.println("\n  Menu Pemilik");
                    add.border();
                    System.out.print("Masukkan username: ");
                    username = sc.next();
                    System.out.print("Masukkan password: ");
                    password = sc.next();
                    if (username.equalsIgnoreCase(userPemilik) && password.equalsIgnoreCase(passPemilik)) {

                    } else {
                        add.salahLogin();
                    }
                    break;
                case 5:
                    add.cls();
                    add.namaKelompok();
                    add.sleep10s();
                    break;
                case 6:
                    // Keluar
                    add.exit();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (pilih != 6);
        sc.close();
    }
}
