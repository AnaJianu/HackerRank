package com.hackerrank.java.introduction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * You are given a date. Your task is to find what the day is on that date.
 * Input Format
 * A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY  format.
 */
public class DateAndTime {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        Calendar cal=new GregorianCalendar(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        System.out.println(sdf.format(cal.getTime()).toUpperCase());
    }
}
