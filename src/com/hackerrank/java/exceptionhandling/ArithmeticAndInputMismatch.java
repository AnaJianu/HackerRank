package com.hackerrank.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * You will be given two integers a and b as input, you have to compute a/b.
 * If a and b are not 32 bit signed integers or if b is zero, exception will occur and you have to report it.
 * Read sample Input/Output to know what to report in case of exceptions.
 */
public class ArithmeticAndInputMismatch {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        try {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int result=a/b;
            System.out.println(result);
        }

        catch(ArithmeticException ae){
            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
        }
        catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }


    }
}
