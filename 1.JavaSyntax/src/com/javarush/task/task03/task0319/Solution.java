package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int num1, num2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();
        num1 = Integer.parseInt(reader.readLine());
        num2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
