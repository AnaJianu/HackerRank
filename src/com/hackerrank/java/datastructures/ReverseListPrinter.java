package com.hackerrank.java.datastructures;

import java.util.ArrayList;

/**
 * You are given the pointer to the head node of a linked list and you need to print all its elements
 * in reverse order from tail to head, one element per line.
 * The head pointer may be null meaning that the list is empty - in that case, do not print anything!
 */
public class ReverseListPrinter {

    void ReversePrint(Node head) {

        Node currentNode;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (currentNode = head; currentNode != null; currentNode = currentNode.next) {
            list.add(currentNode.data);

        }

        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.println(list.get(i));
        }


    }

    public static void main(String[] args) {
        ReverseListPrinter reverseListPrinter=new ReverseListPrinter();
        Node newNode=new Node();
        Node.Insert(newNode,1);
        Node.Insert(newNode,2);
        Node.Insert(newNode,3);
        Node headNode=Node.Insert(newNode,4);
        reverseListPrinter.ReversePrint(headNode);
    }

}
