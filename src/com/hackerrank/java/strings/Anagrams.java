package com.hackerrank.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not.
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {

        char[] arrayA=a.toLowerCase().toCharArray();
        char[] arrayB=b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA,arrayB);


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
