package com.hackerrank.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Input Format
 * First line will consist a string containing english alphabets which has at most 1000 characters.
 * 2nd line will consist an integer k.
 * Output Format
 * In the first line print the lexicographically minimum substring.
 * In the second line print the lexicographically maximum substring.
 */
public class StringCompare {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int k=scan.nextInt();

        List<String> list=new ArrayList<String>();
        for (int i=0;i<=s.length()-k;i++) {
            list.add(s.substring(i,i+k));

        }

        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
