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

    public static void sleep5s() {
        try {
            Thread.sleep(5000);
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
        System.out.println("Username atau Password Salah!");
    }
}
