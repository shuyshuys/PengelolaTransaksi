package com.shuyshuys.pasbp;

public class add {
    public static void border() {
        System.out.println("=================================================");
    }

    public static void salahInput() {
        System.out.println("Pilihan salah, mohon ulangi!");
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep3s() {
        System.out.println("3s loading...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep5s() {
        System.out.println("5s loading...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep10s() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void exit() {
        border();
        System.out.println("Terima Kasih Telah Menggunakan Program ini!");
        border();
        System.exit(0);
    }

    public static void salahLogin() {
        System.out.println("  Username atau Password Salah!");
    }

    static void namaKelompok() {
        border();
        System.out.println("[Anggota Kelompok]");
        border();
        System.out.println("1.Vina Ishalatussilmi \t\t[21082010127]");
        System.out.println("2.Ahmad Yazid Isnandar \t\t[21082010129]");
        System.out.println("3.An-Nisaa Respati Nurcahyengsi\t[21082010139]");
        border();
    }
}
