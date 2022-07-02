package com.shuyshuys.pasbp;

public class cMember extends cObject {
    cMember next;
    String password;

    cMember(int idMember, String namaMember, String password) {
        super(idMember, namaMember);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
