package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Print the substring in the inclusive range from start to end-1 .
 */
public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
