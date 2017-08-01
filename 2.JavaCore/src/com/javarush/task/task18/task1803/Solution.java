package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        while(inputStream.available() > 0){
            int x = inputStream.read();
            Integer frequency = map.get(x);
            map.put(x, frequency == null ? 1 : frequency + 1);
        }

        int max = 0;

        for (int i : map.values()) {
            if (i > max) max = i;
        }

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(max)){
                System.out.print(entry.getKey() + " ");
            }
        }

        reader.close();
        inputStream.close();
    }
}
