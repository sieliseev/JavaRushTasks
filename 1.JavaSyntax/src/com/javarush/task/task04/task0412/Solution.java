package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(reader.readLine());
        if (num > 0) num = num * 2;
        else if (num < 0) num = num + 1;
        System.out.println(num);

    }

}