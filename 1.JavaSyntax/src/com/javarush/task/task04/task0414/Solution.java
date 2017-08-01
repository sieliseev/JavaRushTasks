package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int year;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        year = Integer.parseInt(reader.readLine());
        if (year % 100 == 0 && year % 400 == 0) year366();
        else if (year % 100 == 0 && year % 400 != 0) year365();
        else if (year % 4 == 0) year366();
        else year365();
    }

    private static void year365() {
        System.out.println("количество дней в году: 365");
    }

    private static void year366() {
        System.out.println("количество дней в году: 366");
    }
}