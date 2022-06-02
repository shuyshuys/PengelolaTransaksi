package com.shuyshuys.pasbp;

import java.util.Scanner;

public class appToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cBarang brg1 = new cBarang("Tas", 100000);
        cBarang brg2 = new cBarang("Sandal", 50000);
        cBarang brg3 = new cBarang("Sepatu", 150000);

        cDaftarTransaksi jual = new cDaftarTransaksi();
        int pilih = 0, pilih2 = 0;
        int kode = 100;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota");
            System.out.println("3. Admin");
            System.out.println("4. Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu = ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    // Pembeli
                    kode++;
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.println("\n  Menu Pembeli");
                    String nama = sc.next();

                    do {
                        System.out.println("  Pembeli [" + nama + "]");
                        System.out.println("  1. Tambah Transaksi");
                        System.out.println("  2. Hapus Transaksi");
                        System.out.println("  3. Lihat Transaksi");
                        System.out.println("  4. Keluar");
                        System.out.print("  Pilih menu = ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    } while (pilih2 != 4);
                    break;
                case 2:
                    // Anggota

                    break;
                case 3:
                    // Admin

                    break;
                case 4:
                    // Pemilik

                    break;
                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan aplikasi kami");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        } while (pilih != 5);
        sc.close();
    }
}
