package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            ints[i] = scanner.nextInt();
        }
        int odd = 0, even = 0;
        for (int i:ints){
            if (i%2==0) even += i;
            else odd +=i;
        }
        if (even>odd) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
