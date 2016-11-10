package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically larger than B or No if it is not.
 * For the third line, capitalize the first letter in both A and B and
 * print them on a single line, separated by a space.
 */
public class StringToUpperCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String s=A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(s);
    }
}
