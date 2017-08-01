package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> bytes = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) {
            bytes.add(inputStream.read());
        }
        ArrayList<Integer> sortBytes = new ArrayList<>(bytes);
        Collections.sort(sortBytes);

        for (Integer i : sortBytes) {
            System.out.print(i + " ");
        }

        reader.close();
        inputStream.close();

    }
}
