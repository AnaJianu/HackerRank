package com.hackerrank.java.datastructures;

/**
 * You’re given the pointer to the head node of a linked list, an integer to add to the list
 * and the position at which the integer must be inserted.
 * Create a new node with the given integer, insert this node at the desired position and return the head node.
 * A position of 0 indicates head, a position of 1 indicates one node away from the head and so on.
 * The head pointer given may be null meaning that the initial list is empty.
 */
public class NodeAtPosition {

    Node InsertNth(Node head, int data, int position) {
        Node previous = head;
        if (position == 0){
            previous = new Node();
            previous.data = data;
            previous.next = head;
            return previous;
        }
        else {
            while(--position > 0){
                previous = previous.next;
            }
            Node newNode=new Node();

            Node current = previous.next;
            newNode.data=data;
            newNode.next=current;
            previous.next=newNode;

            return head;
        }
    }

    public static void main(String[] args) {
        NodeAtPosition nodeInserter=new NodeAtPosition();
        Node newNode=new Node();
        nodeInserter.InsertNth(newNode,5,1);

    }
}
