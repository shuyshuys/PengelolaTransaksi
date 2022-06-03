package com.shuyshuys.pasbp;

import java.util.Scanner;

public class appToko {
    static cBarang tas = new cBarang("Tas", 100000);
    static cBarang sandal = new cBarang("Sandal", 50000);
    static cBarang sepatu = new cBarang("Sepatu", 150000);
    static cBarang baju = new cBarang("Baju", 250000);
    static cBarang celana = new cBarang("Celana", 350000);
    static cBarang kaos = new cBarang("Kaos", 450000);

    public static void main(String[] args) {
        add.cls();
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
                    add.cls();
                    kodeTr++;
                    add.border();
                    System.out.println("  Menu Pembeli");
                    add.border();
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc.next();
                    do {
                        add.cls();
                        add.border();
                        System.out.println("  Pembeli [" + namaPembeli + "]");
                        add.border();
                        System.out.println("  1. Tambah Transaksi");
                        System.out.println("  2. Hapus Transaksi");
                        System.out.println("  3. Lihat Transaksi");
                        System.out.println("  4. Kembali");
                        System.out.println("  5. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                add.border();
                                printBarang();
                                add.border();
                                System.out.print("  Pilih barang: ");
                                int pilihBarang = sc.nextInt();
                                System.out.print("  Jumlah barang: ");
                                int jumlahBarang = sc.nextInt();
                                add.border();
                                switch (pilihBarang) {
                                    case 1:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        tas,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    case 2:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        sandal,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    case 3:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        sepatu,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    case 4:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        baju,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    case 5:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        celana,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    case 6:
                                        daftarTransaksi.tambahTransaksi(
                                                new cTransaksi(kodeTr,
                                                        namaPembeli,
                                                        kaos,
                                                        jumlahBarang,
                                                        0));
                                        add.sleep3s();
                                        break;
                                    default:
                                        System.out.println("Barang tidak ditemukan");
                                        break;
                                }
                                break;
                            case 2:
                                daftarTransaksi.lihatTransaksi();
                                System.out.print("Barang yang dihapus: ");
                                String barang = sc.next();
                                daftarTransaksi.hapusTransaksi(namaPembeli, barang);
                                add.sleep10s();
                                break;
                            case 3:
                                add.border();
                                daftarTransaksi.lihatTransaksi();
                                add.sleep3s();
                                break;
                            case 4:

                                break;
                            case 5:
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
                    System.out.print("Masukkan username: ");
                    username = sc.next();
                    System.out.print("Masukkan password: ");
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
                                    System.out.println("1. [" + tas.getNama() + "]  [" + tas.getHarga() + "]");
                                    System.out.println("2. [" + sandal.getNama() + "]  [" + sandal.getHarga() + "]");
                                    System.out.println("3. [" + sepatu.getNama() + "]  [" + sepatu.getHarga() + "]");
                                    System.out.print("pilih barang: ");
                                    int pilihBarang = sc.nextInt();
                                    System.out.print("jumlah barang: ");
                                    int jumlahBarang = sc.nextInt();
                                    switch (pilihBarang) {
                                        case 1:
                                            // daftarTransaksi.tambahTransaksi(new cTransaksi(kodeTr,
                                            // llMember.getNama(username),
                                            // tas,
                                            // jumlahBarang, 0));
                                            break;
                                        case 2:
                                            // daftarTransaksi.tambahTransaksi(
                                            // new cTransaksi(kodeTr, llMember.getNama(username), sandal,
                                            // jumlahBarang, 0));
                                            break;
                                        case 3:
                                            // daftarTransaksi.tambahTransaksi(
                                            // new cTransaksi(kodeTr, llMember.getNama(username), sepatu,
                                            // jumlahBarang, 0));
                                            break;
                                        case 4:
                                            // Ubah password
                                            break;
                                        default:
                                            System.out.println("Barang tidak ditemukan");
                                            break;
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    System.out.println("Kembali ke menu sebelumnya");
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
                    System.out.println("\n  Menu Admin");
                    add.border();
                    System.out.print("Masukkan username: ");
                    username = sc.next();
                    System.out.print("Masukkan password: ");
                    password = sc.next();
                    if (username.equalsIgnoreCase(userAdmin) && password.equalsIgnoreCase(passAdmin)) {
                        add.cls();
                        add.border();
                        System.out.println("\n  Menu Admin [" + username + "]");
                        add.border();
                        System.out.println("  1. Mengganti proses transaksi");
                        System.out.println("  2. Kembali");
                        System.out.println("  3. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                add.salahInput();
                                break;
                        }
                    } else {
                        add.salahLogin();
                        add.sleep3s();
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
