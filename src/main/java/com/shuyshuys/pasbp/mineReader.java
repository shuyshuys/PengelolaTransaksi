package com.shuyshuys.pasbp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mineReader {
    void getTransaksiFromDB(cDaftarTransaksi daftarTransaksi) {
        koneksi con = new koneksi();
        try {
            String sql = "SELECT * FROM transaksi;";
            Statement statement = con.getCon().createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                boolean isMember = false;
                if (rs.getInt(10) == 1) {
                    isMember = true;
                }
                daftarTransaksi.enqueue(
                        new cSimpul(
                                new cTransaksi(rs.getInt(1),
                                        rs.getString(2),
                                        new cBarang(0, rs.getString(3), rs.getInt(4)),
                                        rs.getInt(5),
                                        rs.getInt(6),
                                        rs.getInt(7),
                                        rs.getInt(8),
                                        rs.getInt(9),
                                        isMember)));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void getBarangFromDB(cDaftarBarang daftarBarang) {
        koneksi con = new koneksi();
        try {
            String sql = "SELECT * FROM barang;";
            Statement statement = con.getCon().createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                daftarBarang.enqueue(
                        new cSimpul(
                                new cBarang(rs.getInt(1),
                                        rs.getString(2),
                                        rs.getInt(3),
                                        rs.getInt(4))));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void getMemberFromDB(cDaftarMember daftarMember) {
        koneksi con = new koneksi();
        try {
            String sql = "SELECT * FROM member;";
            Statement statement = con.getCon().createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                daftarMember.enqueue(
                        new cSimpul(
                                new cMember(rs.getInt(1),
                                        rs.getString(2),
                                        rs.getString(3),
                                        rs.getInt(4))));
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public int updateKodeTr() {
        koneksi con = new koneksi();
        int newKodeTr = 0;
        try {
            String sql = "SELECT id FROM transaksi ORDER BY id DESC LIMIT 1;";
            Statement statement = con.getCon().createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                newKodeTr = rs.getInt(1);
            }
            statement.close();
            rs.close();
            System.out.println("SUKSES update kode transaksi!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        return newKodeTr;
    }
}
