package com.shuyshuys.pasbp;

public class cMember {
    int id;
    String nama;
    String password;

    cMember(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public int getKodePembeli() {
        return id;
    }

    public String getNamaPembeli() {
        return nama;
    }

    public String getPasswordPembeli() {
        return password;
    }

    public void setKodePembeli(int id) {
        this.id = id;
    }

    public void setNamaPembeli(String nama) {
        this.nama = nama;
    }

    public void setPasswordPembeli(String password) {
        this.password = password;
    }
}
