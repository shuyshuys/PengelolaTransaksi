package com.shuyshuys.pasbp;

public class cMember {
    int id;
    String nama;
    String password;
    cMember next;

    cMember(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public int getID() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
