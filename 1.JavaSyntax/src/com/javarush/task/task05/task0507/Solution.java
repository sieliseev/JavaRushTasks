package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double res = 0;
        int i = 0;
        while (true) {

            int anInt = Integer.parseInt(reader.readLine());
            if (anInt == -1) break;
            res = res + anInt;
            i++;
        }
        System.out.println(res/i);
    }
}

