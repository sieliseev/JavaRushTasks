package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> bites = new HashMap<>();
        int min = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) {
            int bite = inputStream.read();
            Integer frequency = bites.get(bite);
            bites.put(bite, frequency == null ? 1 : frequency + 1);
        }

        for (Integer i : bites.values()){
            if (i<min)min = i;
        }

        for (Map.Entry<Integer, Integer> p : bites.entrySet()){
            if (p.getValue().equals(min)) System.out.print(p.getKey()+" ");
        }

        reader.close();
        inputStream.close();
    }
}
