package com.shuyshuys.pasbp;

public class cSimpul {
    cBarang barang;
    cMember member;
    cTransaksi transaksi;
    cSimpul next;

    cSimpul(cBarang barang) {
        this.barang = barang;
    }

    cSimpul(cMember member) {
        this.member = member;
    }

    cSimpul(cTransaksi transaksi) {
        this.transaksi = transaksi;
    }

    public cTransaksi getTransaksi() {
        return transaksi;
    }

    public int getIDTransaksi() {
        return transaksi.getID();
    }

    public String getNamaTransaksi() {
        return transaksi.getNama();
    }

    public cBarang getBarangTransaksi() {
        return transaksi.getBarang();
    }

    public int getJumlahBarangTransaksi() {
        return transaksi.getJumlahBarang();
    }

    public int getStatusTransaksi() {
        return transaksi.getStatus();
    }

    public int getSubTotalTransaksi() {
        return transaksi.getSubTotal();
    }

    public int getBayarTransaksi() {
        return transaksi.getBayar();
    }

    public int getKembalianTransaksi() {
        return transaksi.getKembalian();
    }

    public boolean getIsMember() {
        return transaksi.getIsMember();
    }

    public void setStatusTransaksi(int newStatus) {
        transaksi.setStatus(newStatus);
    }

    public cBarang getBarang() {
        return barang;
    }

    public String getNamaBarang() {
        return barang.getNama();
    }

    public int getHargaBarang() {
        return barang.getHarga();
    }

    public int getIdBarang() {
        return barang.getID();
    }

    public void setIdBarang(int id) {
        barang.setID(id);
    }

    void setHargaBarang(int harga) {
        barang.setHarga(harga);
    }

    void setLaporanBarang(int laporanHarga) {
        barang.setLaporanHarga(laporanHarga);
    }

    int getLaporanBarang() {
        return barang.getLaporanHarga();
    }

    void setLaporanMember(int laporanHarga) {
        member.setLaporanHarga(laporanHarga);
    }

    int getLaporanMember() {
        return member.getLaporanHarga();
    }

    // void setIDMember(int id) {
    // member.setID(id);
    // }

    void setNamaMember(String nama) {
        member.setNama(nama);
    }

    void setPasswordMember(String password) {
        member.setPassword(password);
    }

    int getIDMember() {
        return member.getID();
    }

    String getNamaMember() {
        return member.getNama();
    }

    String getPasswordMember() {
        return member.getPassword();
    }

    public void getDataTransaksi() {
        int i = 1;
        System.out.println("DAFTAR TRANSAKSI");
        for (cTransaksi t = transaksi; t != null; t = t.next) {
            System.out.println(i + ". " + t.getID() + " " + t.getNama() + " " + t.getBarang().getNama() + " "
                    + t.getJumlahBarang() + " " + t.getStatus());
            i++;
        }
    }

    public void getDataBarang(cSimpul sBarang, int indent) {
        // int i = 1;
        String in = add.getIndent(indent);
        System.out.println(in + "DAFTAR BARANG");
        for (cSimpul b = sBarang; b != null; b = b.next) {
            if (b.getNamaBarang().length() < 6) {
                System.out.println(
                        in + "[" +
                                b.getIdBarang() + "]\t[" +
                                b.getNamaBarang() + "]\t\t[" +
                                b.getHargaBarang() + "]");
            } else {
                System.out.println(
                        in + "[" +
                                b.getIdBarang() + "]\t[" +
                                b.getNamaBarang() + "]\t[" +
                                b.getHargaBarang() + "]");
            }
            // i++;
        }
    }

    public void getDataMember() {
        int i = 1;
        System.out.println("DAFTAR MEMBER");
        for (cMember m = member; m != null; m = m.next) {
            System.out.println(i + ". " + m.getID() + " " + m.getNama() + " " + m.getPassword());
            i++;
        }
    }
}
