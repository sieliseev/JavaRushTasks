package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        HashMap<String, Integer> map = new HashMap<>();

        for (;;) {
            String s = reader.readLine();
            if (s.equals("")) break;
            id = Integer.parseInt(s);
            name = reader.readLine();
            if (name.equals("")) break;
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
