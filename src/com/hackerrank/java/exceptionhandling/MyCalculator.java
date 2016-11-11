package com.hackerrank.java.exceptionhandling;

import java.util.Scanner;

/**
 * Create a class MyCalculator which consists of a single method power(int,int).
 * This method takes two integers, n and p, as parameters. If either n or p is negative,
 * then the method must throw an exception which says "n and p should be non-negative".
 */
public class MyCalculator {

    public int power(int a, int b) throws Exception{
        if (a<0 || b<0) {
            throw new Exception("n and p should be non-negative");
        }
        else {
            return (int) Math.pow(a,b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
