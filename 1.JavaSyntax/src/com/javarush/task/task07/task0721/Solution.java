package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] ints = new int[20];
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;
        for (Integer i : ints){
            i = Integer.parseInt(reader.readLine());
            if (maximum < i) maximum = i;
            if (minimum > i) minimum = i;
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
