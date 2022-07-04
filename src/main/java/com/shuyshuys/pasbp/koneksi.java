package com.shuyshuys.pasbp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author shuyshuys
 * @author Naishaltss
 * @author arnica13
 */

public class koneksi {
    static String db = "50Jim2mebv";
    static String user = "50Jim2mebv";
    static String password = "ifcwjkWw0M";

    public static Connection con;
    public static Statement stm;

    public Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com/" + db, user, password);
            stm = con.createStatement();
            System.out.println("   - Koneksi ke database " + db + " Berhasil!");
        } catch (Exception e) {
            System.err.println("   - Koneksi ke database Gagal! " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String args[]) {
        koneksi con = new koneksi();
        con.getCon();
    }

    // System.out.println(System.lineSeparator().repeat(100));
    // public static Connection getConnection() {
    // try {
    // Class.forName("com.mysql.cj.jdbc.Driver");
    // String db = "bp2"; // NOTE: nama database
    // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db,
    // "root", "");
    // stm = con.createStatement();
    // System.out.println(" Koneksi ke database " + db + " Berhasil!");
    // } catch (Exception e) {
    // System.err.println(" Koneksi ke database Gagal! " + e.getMessage());
    // e.printStackTrace();
    // }
    // return con;
    // }
}
