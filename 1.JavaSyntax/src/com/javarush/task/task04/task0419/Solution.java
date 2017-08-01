package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max1 = max(a, b);
        int max2 = max(c, d);
        if (max1 > max2) System.out.println(max1);
        else System.out.println(max2);
    }

    private static int max(int a, int b){
        return a>b?a:b;
    }
}
