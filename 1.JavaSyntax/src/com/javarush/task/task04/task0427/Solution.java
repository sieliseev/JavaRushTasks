package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String description;

        if (num >= 1 && num <= 999) {
            if (num % 2 == 0) description = "четное ";
            else description = "нечетное ";

            if (num >= 100) description += "трехзначное ";
            else if (num >= 10 && num < 100) description += "двузначное ";
            else description += "однозначное ";

            description += "число";
            System.out.println(description);
        }

    }
}
