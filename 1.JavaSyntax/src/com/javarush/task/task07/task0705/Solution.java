package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < big.length; i++) {
            big[i] = scanner.nextInt();
        }

        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < big.length; i++) {
            if (i < big.length/2){
                small1[i] = big[i];
            } else {
                small2[i-10] = big[i];
            }
        }

        for (int i: small2){
            System.out.println(i);
        }
    }
}
