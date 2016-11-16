package com.hackerrank.java.datastructures;

/**
 * Created by ana on 15/11/16.
 */
public class Node {

    int data;
    Node next;

    static Node Insert(Node head,int data) {
        Node temp=new Node();
        temp.data=data;
        temp.next=null;

        if (head==null) {
            return temp;
        }

        Node temp1;
        for (temp1=head; temp1.next!=null; temp1=temp1.next);
        temp1.next=temp;
        return head;


    }

    public static void main(String[] args) {
        Node node = new Node();
        Insert(node,3);
        Insert(node,4);
        Insert(node,5);
        Insert(node,6);
    }

}
