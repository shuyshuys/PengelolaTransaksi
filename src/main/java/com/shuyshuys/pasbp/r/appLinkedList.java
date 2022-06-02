package com.shuyshuys.pasbp.r;

public class appLinkedList {
    public static void main(String[] args) {
        cNode node1 = new cNode("Budi");
        cNode node2 = new cNode("Ima");
        cNode node3 = new cNode("Wati");

        node1.next = node2;
        node2.next = node3;
        // cNode.next = "tes";

        // System.out.println(x + cNode.next);
        System.out.println("Node " + node1.next.getNama() + " ditampilkan");

        for (cNode n = node1; n != null; n = n.next) {
            System.out.println("Node " + n.getNama() + " ditampilkan");
        }

    }
}
