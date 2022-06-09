package com.shuyshuys.pasbp;

import java.util.Scanner;

public class appToko {

    // next convert this to linkedlist >.<
    static cBarang tas = new cBarang("Tas", 100000);
    static cBarang sandal = new cBarang("Sandal", 50000);
    static cBarang sepatu = new cBarang("Sepatu", 150000);
    static cBarang baju = new cBarang("Baju", 250000);
    static cBarang celana = new cBarang("Celana", 350000);
    static cBarang kaos = new cBarang("Kaos", 450000);

    public static void main(String[] args) {
        // add.cls();
        Scanner sc = new Scanner(System.in);

        cMember budi = new cMember(101, "Budi", "budi");
        cMember siti = new cMember(102, "Siti", "siti");
        cMember sri = new cMember(103, "Sri", "sri");

        cDaftarMember llMember = new cDaftarMember();
        llMember.tambahMember(budi);
        llMember.tambahMember(siti);
        llMember.tambahMember(sri);

        String username, password;

        String userAdmin = "admin";
        String passAdmin = "admin";

        String userPemilik = "pemilik";
        String passPemilik = "pemilik";

        cDaftarTransaksi daftarTransaksi = new cDaftarTransaksi();
        int pilih = 0, pilih2 = 0;
        int kodeTr = 200;
        // add.sleep3s();
        do {
            // add.cls();
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
                    // add.cls();
                    kodeTr++;
                    add.border();
                    System.out.println("  Menu Pembeli");
                    add.border();
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.next();
                    do {
                        // add.cls();
                        add.border();
                        System.out.println("  Pembeli [" + namaPembeli + "]");
                        add.border();
                        System.out.println("  1. Tambah Transaksi");
                        System.out.println("  2. Hapus Transaksi");
                        System.out.println("  3. Lihat Transaksi");
                        System.out.println("  4. Bayar Transaksi");
                        System.out.println("  5. Kembali");
                        System.out.println("  6. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                add.border();
                                System.out.println("    Menu Tambah Barang [" + namaPembeli + "]");
                                add.border();
                                printBarang();
                                add.border();
                                System.out.print("    Pilih barang: ");
                                int pilihBarang = sc.nextInt();
                                System.out.print("    Jumlah barang: ");
                                int jumlahBarang = sc.nextInt();
                                add.border();
                                switch (pilihBarang) {
                                    case 1:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        tas,
                                                        jumlahBarang,
                                                        0,
                                                        tas.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    case 2:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        sandal,
                                                        jumlahBarang,
                                                        0,
                                                        sandal.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    case 3:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        sepatu,
                                                        jumlahBarang,
                                                        0,
                                                        sepatu.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    case 4:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        baju,
                                                        jumlahBarang,
                                                        0,
                                                        baju.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    case 5:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        celana,
                                                        jumlahBarang,
                                                        0,
                                                        celana.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    case 6:
                                        daftarTransaksi.enqueueTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        kaos,
                                                        jumlahBarang,
                                                        0,
                                                        kaos.getHarga() * jumlahBarang,
                                                        0,
                                                        0));
                                        // add.sleep3s();
                                        break;
                                    default:
                                        System.out.println("    Barang tidak ditemukan");
                                        break;
                                }
                                break;
                            case 2:
                                add.border();
                                System.out.println("    Menu Penghapusan Barang [" + namaPembeli + "]");
                                add.border();
                                daftarTransaksi.peekTransaksi(kodeTr);
                                System.out.print("    Barang yang dihapus (0 untuk batal): ");
                                String barang = sc.next();
                                if (barang.equals("0")) {
                                    break;
                                } else {
                                    daftarTransaksi.cariHapusTransaksi(namaPembeli, barang);
                                }
                                add.sleep5s();
                                break;
                            case 3:
                                add.border();
                                daftarTransaksi.peekTransaksi(namaPembeli);
                                add.border();
                                add.sleep3s();
                                break;
                            case 4:
                                add.border();
                                System.out.println("    Menu Pembayaran [" + namaPembeli + "]");
                                add.border();
                                System.out.println("    1. Tunai");
                                System.out.println("    2. Kembali");
                                System.out.println("    3. Keluar");
                                System.out.print("    Pilih menu = ");
                                pilih2 = sc.nextInt();
                                switch (pilih2) {
                                    case 1:
                                        add.border();
                                        System.out.println("      Pembayaran Tunai");
                                        add.border();
                                        daftarTransaksi.peekTransaksi(namaPembeli);
                                        add.border();
                                        System.out.println("      Total tagihan anda = " +
                                                daftarTransaksi.totalTagihan(namaPembeli));
                                        System.out.print("      Masukkan uang: ");
                                        int uang = sc.nextInt();
                                        add.border();
                                        System.out.println("      Transaksi berhasil");
                                        System.out.println("      Kembalian = " +
                                                (uang - daftarTransaksi.totalTagihan(namaPembeli)));

                                        add.sleep3s();
                                        break;
                                    case 2:
                                        System.out.println("      Kembali ke menu sebelumnya...");
                                        add.sleep3s();
                                        break;
                                    case 3:
                                        add.exit();
                                        break;
                                    default:
                                        System.out.println("      Menu tidak ditemukan");
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("    Kembali ke menu sebelumnya...");
                                add.sleep3s();
                                break;
                            case 6:
                                add.exit();
                                add.sleep3s();
                                break;
                            default:
                                add.salahInput();
                                add.sleep3s();
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
                    System.out.print("  Masukkan username: ");
                    username = sc.next();
                    System.out.print("  Masukkan password: ");
                    password = sc.next();
                    add.border();
                    if (llMember.cariMember(username, password) == true) {
                        do {
                            add.border();
                            System.out.println("  Selamat datang [" + username + "]");
                            add.border();
                            System.out.println("  Menu Anggota");
                            System.out.println("  1. Tambah Transaksi");
                            System.out.println("  2. Hapus Transaksi");
                            System.out.println("  3. Lihat Transaksi");
                            System.out.println("  4. Ubah Password");
                            System.out.println("  5. Kembali");
                            System.out.println("  6. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = sc.nextInt();
                            switch (pilih2) {
                                case 1:
                                    // tambah transaksi

                                    break;
                                case 2:
                                    // hapus transaksi

                                    break;
                                case 3:
                                    // lihat transaksi

                                    break;
                                case 4:
                                    // Ubah password

                                    break;
                                case 5:
                                    System.out.println("  Kembali ke menu sebelumnya...");
                                    add.sleep3s();
                                    break;
                                case 6:
                                    add.exit();
                                    add.sleep3s();
                                    break;
                                default:
                                    add.salahInput();
                                    add.sleep3s();
                                    break;
                            }
                        } while (pilih2 != 5);
                    } else {
                        add.salahLogin();
                        add.sleep3s();
                    }

                    break;
                case 3:
                    // Admin
                    // Admin : diikuti dengan pengisian password.
                    add.cls();
                    add.border();
                    System.out.println("  Menu Admin");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = sc.next();
                    System.out.print("  Masukkan password: ");
                    password = sc.next();
                    Boolean end = false;
                    do {
                        if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {
                            add.cls();
                            add.border();
                            System.out.println("  Menu Admin [" + username + "]");
                            add.border();
                            System.out.println("  1. List Barang");
                            System.out.println("  2. Mengganti status transaksi");
                            System.out.println("  3. Kembali");
                            System.out.println("  4. Keluar");
                            System.out.print("  Pilih menu = ");
                            pilih2 = sc.nextInt();
                            switch (pilih2) {
                                case 1:
                                    daftarTransaksi.peekTransaksi();
                                    break;
                                case 2:
                                    // proses transaksi
                                    Boolean found = false;
                                    do {
                                        // add.cls();
                                        add.border();
                                        System.out.println("    --- Ubah Proses transaksi ---");
                                        add.border();
                                        daftarTransaksi.peekTransaksi();
                                        add.border();
                                        System.out.print("    Kode Transaksi '0 untuk batal': ");
                                        kodeTr = sc.nextInt();
                                        if (kodeTr == 0) {
                                            found = true;
                                        } else {
                                            found = daftarTransaksi.ubahProsesTransaksi(kodeTr, found);
                                        }
                                        add.sleep5s();
                                    } while (found == false);
                                    break;
                                case 3:
                                    System.out.println("    Kembali ke menu sebelumnya...");
                                    add.sleep3s();
                                    break;
                                case 4:
                                    add.exit();
                                    add.sleep3s();
                                    break;
                                default:
                                    add.salahInput();
                                    break;
                            }
                        } else {
                            add.salahLogin();
                            add.sleep3s();
                        }
                    } while (end == false);
                    break;
                case 4:
                    // Pemilik
                    // Pemilik : diikuti dengan pengisian password.
                    // add.cls();
                    add.border();
                    System.out.println("  Menu Pemilik [" + userPemilik + "]");
                    add.border();
                    System.out.print("  Masukkan username: ");
                    username = sc.next();
                    System.out.print("  Masukkan password: ");
                    password = sc.next();
                    if (username.equalsIgnoreCase(userPemilik) && password.equalsIgnoreCase(passPemilik)) {

                    } else {
                        add.salahLogin();
                        add.sleep3s();
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
                    add.sleep3s();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (pilih != 6);
        sc.close();
    }

    static void printBarang() {
        System.out.println("  1. [" + tas.getNama() + "]\t[" + tas.getHarga() + "]");
        System.out.println("  2. [" + sandal.getNama() + "]\t[" + sandal.getHarga() + "]");
        System.out.println("  3. [" + sepatu.getNama() + "]\t[" + sepatu.getHarga() + "]");
        System.out.println("  4. [" + baju.getNama() + "]\t[" + baju.getHarga() + "]");
        System.out.println("  5. [" + celana.getNama() + "]\t[" + celana.getHarga() + "]");
        System.out.println("  6. [" + kaos.getNama() + "]\t[" + kaos.getHarga() + "]");
    }
}
