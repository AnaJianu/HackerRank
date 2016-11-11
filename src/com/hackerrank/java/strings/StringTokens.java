package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Given a string,s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        StringTokenizer st=new StringTokenizer(s,("[_\\@!?.', ]"));

        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }
        scan.close();
    }
}
