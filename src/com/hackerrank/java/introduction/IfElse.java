package com.hackerrank.java.introduction;

import java.util.Scanner;

/**
 *  Given an integer,n , perform the following conditional actions:
 *  If n is odd, print Weird
 *  If n is even and in the inclusive range of 2 to 5, print Not Weird
 *  If n is even and in the inclusive range of 6 to 20, print Weird
 *  If n is even and greater than 20, print Not Weird
 */
public class IfElse {

    public static void main(String[] args) {

        System.out.printf("the %s jumped over the %s, %d times", "cop", "moon", 2);

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==0){
            if (n>=6 && n<=20) {
                ans="Weird";
            }
            if (n>=2 && n<=5 || n>20) {
                ans="Not Weird";
            }

        }
        else{
            ans = "Weird";
        }
        System.out.println(ans);

    }
}
