package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        String result;

        if (num == 0) result = "ноль";

        else {
            if (num > 0) result = "положительное ";
            else result = "отрицательное ";

            if (num % 2 == 0) result = result + "четное ";
            else result = result + "нечетное ";

            result += "число";
        }
        System.out.println(result);
    }
}
