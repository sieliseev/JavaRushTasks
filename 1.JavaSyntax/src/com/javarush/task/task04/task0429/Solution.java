package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++){
            int a = scanner.nextInt();
            if (a > 0) positive++;
            if (a < 0) negative++;
        }
        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+positive);
    }
}
