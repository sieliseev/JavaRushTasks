package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 1, j; i < arr.length; i++) {
            int k = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > k; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = k;
        }

        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}
