package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Лось", "Игорь2");
        map.put("Лось1", "Игорь");
        map.put("Лось2", "Игорь");
        map.put("Лось3", "Игорь");
        map.put("Лось4", "Игорь");
        map.put("Лось22", "Игорь1");
        map.put("Лось6", "Игорь");
        map.put("Лось222", "Игорь2");
        map.put("Лось8", "Игорь");
        map.put("Лось9", "Игорь");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (String s : map.values()) {
            if (s.equals(name)) i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) i++;
        }
        return i;
    }

    public static void main(String[] args) {
    }
}
