package com.shuyshuys.pasbp;

import java.sql.SQLException;

public class mineWriter {
    void setMemberToDB(int id_member, String nama_member, String password) {
        koneksi con = new koneksi();
        try {
            String sql = "INSERT INTO member VALUES ('" + id_member + "', '" + nama_member + "', '" + password + "');";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES menambahkan member baru ke dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    void setTransaksiToDB(int kodeTr,
            String namaPembeli,
            cBarang barang,
            int jumlahBarang,
            int status,
            int bayar,
            int kembalian,
            boolean isMember) {
        koneksi con = new koneksi();
        try {
            cDaftarTransaksi daftarTransaksi = new cDaftarTransaksi();
            int subTotal = daftarTransaksi.countLaporanHarga(barang.getHarga(), jumlahBarang, isMember);
            int isM = 0;
            if (isMember) {
                isM = 1;
            }
            String sql = "INSERT INTO transaksi VALUES ('" + kodeTr + "', '" +
                    namaPembeli + "', '" +
                    barang.getNama() + "', '" +
                    barang.getHarga() + "', '" +
                    jumlahBarang + "', '" +
                    status + "', '"
                    + subTotal + "', '" +
                    bayar + "', '" +
                    kembalian + "', '" +
                    isM + "');";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES memasukkan data transaksi ke dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    void updateStatusTransaksiToDB(int kodeTr) {
        koneksi con = new koneksi();
        try {
            String sql = "UPDATE transaksi SET status='" + 1 + "' WHERE id='" + kodeTr + "';";
            // UPDATE transaksi SET status=1 WHERE transaksi.id=203;
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES mengubah status transaksi dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    void updateLaporan(int laporanHarga, String table, int id, String SET, String WHERE) {
        koneksi con = new koneksi();
        try {
            String sql = "UPDATE " + table + " SET " + SET + "=" + laporanHarga + " WHERE " + WHERE + "=" + id + ";";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES mengupdate laporan " + table + " dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    public void deleteTransaksi(int kodeTransaksi) {
        koneksi con = new koneksi();
        try {
            String sql = "DELETE FROM `transaksi` WHERE `transaksi`.`id`='" + kodeTransaksi + "';";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES menghapus transaksi dengan kode " + kodeTransaksi + " dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    public void deleteTransaksi(String namaPembeli, String barang) {
        koneksi con = new koneksi();
        try {
            String sql = "DELETE FROM `transaksi` WHERE nama_pembeli='" + namaPembeli + "', nama_barang='" + barang
                    + "';";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES menghapus transaksi dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }

    public void setBayarToDB(int uang, int kembalian, int kodeTr) {
        koneksi con = new koneksi();
        try {
            String sql = "UPDATE transaksi SET bayar=" + uang +
                    ", kembalian=" + kembalian +
                    " WHERE id=" + kodeTr + ";";
            con.getCon().createStatement().executeUpdate(sql);
            System.out.println("SUKSES mengupdate bayar dan kembalian dalam database!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        con.close();
    }
}
