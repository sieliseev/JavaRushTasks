package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int sum = 0;
            for (int k = 1; k <= i; k++) {
                sum = sum + k;
            }
            System.out.println(sum);
        }
    }
}
