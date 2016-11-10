package com.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * The first line contains an integer, N (the initial number of elements in L).
 * The second line contains N space-separated integers describing L.
 * The third line contains an integer, Q (the number of queries).
 * The 2Q subsequent lines describe the queries, and each query is described over two lines:
 * If the first line of a query contains the String Insert, then the second line contains two space separated integers X Y,
 * and the value Y must be inserted into L at index X.
 * If the first line of a query contains the String Delete, then the second line contains index X,
 * whose element must be deleted from L.
 * Print the updated list L as a single line of space-separated integers.
 */
public class List {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
            numbers.add(i,scan.nextInt());
        }

        int q=scan.nextInt();
        for (int j=0;j<q;j++) {
            String operation=scan.next();
            if (operation.equals("Insert")){
                int position=scan.nextInt();
                int numberToInsert=scan.nextInt();
                numbers.add(position,numberToInsert);

            }
            if (operation.equals("Delete")) {
                int positionToDelete=scan.nextInt();
                numbers.remove(positionToDelete);
            }


        }

        for (int k=0;k<numbers.size();k++) {
            System.out.print(numbers.get(k)+" ");
        }

    }
}
