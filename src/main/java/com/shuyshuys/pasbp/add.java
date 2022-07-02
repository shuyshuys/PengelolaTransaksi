package com.shuyshuys.pasbp;

import java.util.Scanner;

public class add {
    public static Scanner sc() {
        return new Scanner(System.in);
    }

    public static void border() {
        System.out.println("=================================================");
    }

    public static void sBorder() {
        System.out.println("------------------------------------------------");
    }

    public static void salahInput() {
        System.out.println("Pilihan salah, mohon ulangi!");
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int ms) {
        System.out.println("loading...");

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static String getIndent(int indent) {
        String i = "";
        if (indent == 2) {
            i = "  ";
        } else if (indent == 4) {
            i = "    ";
        } else if (indent == 6) {
            i = "      ";
        }
        return i;
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
