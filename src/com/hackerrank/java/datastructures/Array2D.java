package com.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Given a 6X6 2D Array, calculate the hourglass sum for every hourglass , then print the maximum hourglass sum.
 */
public class Array2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }


        ArrayList<Integer> list=new ArrayList<Integer>();
        int count=0;

        for (int i=0; i<4; i++) {
            for (int j=0;j<4; j++) {
                int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                list.add(sum);
                ++count;
            }
        }

        Collections.sort(list);
        System.out.println(list.get(count-1));
    }
}
