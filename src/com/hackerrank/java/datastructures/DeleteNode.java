package com.hackerrank.java.datastructures;

/**
 * You’re given the pointer to the head node of a linked list and the position of a node to delete.
 * Delete the node at the given position and return the head node. A position of 0 indicates head,
 * a position of 1 indicates one node away from the head and so on.
 * The list may become empty after you delete the node.
 */




public class DeleteNode {

    static Node Delete(Node head, int position) {
        Node previous=head;
        if (position==0) {
            head=head.next;
            previous.next=null;
            return head;
        } else {
            while (--position>0) {
                previous=previous.next;
            }

            Node current=previous.next;
            previous.next=previous.next.next;
            current.next=null;
            return head;
        }

    }

    public static void main(String[] args) {
        Node newNode=new Node();
        Node.Insert(newNode, 3);
        Node.Insert(newNode, 4);
        Node.Insert(newNode, 5);
        Node.Insert(newNode, 6);
        Delete(newNode,3);
    }
}
