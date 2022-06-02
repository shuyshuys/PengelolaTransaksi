package com.shuyshuys.pasbp.r;

public class cNode {
    private String nama;
    cNode next;

    cNode(String nama) {
        this.nama = nama;
        // next = null;
        System.out.println("Node " + nama + " dibuat");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public cNode getNext() {
        return next;
    }

    public void setNext(cNode next) {
        this.next = next;
    }

    public void addNode(cNode node) {
        if (next == null) {
            next = node;
        } else {
            next.addNode(node);
        }
    }

    public void delNode(cNode node) {
        if (next == node) {
            next = next.next;
        } else {
            next.delNode(node);
        }
    }

    public void printNode() {
        System.out.println("Node " + nama + " ditampilkan");
        if (next != null) {
            next.printNode();
        }
    }
}
