package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int[] m = {a, b, c};

        for (int i = 1; i < m.length; i++){
            int x = m[i];
            int j = i;
            while (j > 0 && m[j-1]<x) {
                m[j] = m[j-1];
                j = j - 1;
            }
            m[j] = x;

        }

        for (Integer i : m){
            System.out.print(i+" ");
        }
    }
}
