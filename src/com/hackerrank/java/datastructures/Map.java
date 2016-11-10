package com.hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ana on 09/11/16.
 */
public class Map {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> phoneBook=new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));}
            else {
                System.out.println("Not found");
            }
        }


    }
}
