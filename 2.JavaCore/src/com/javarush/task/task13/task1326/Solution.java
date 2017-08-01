package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<>();

        String number;
        while ((number = readerFile.readLine()) != null) {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        reader.close();
        readerFile.close();
    }
}
