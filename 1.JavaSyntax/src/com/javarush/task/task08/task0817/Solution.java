package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a1", "a");
        map.put("a3", "a1");
        map.put("a4", "a");
        map.put("a5", "a");
        map.put("a6", "a");
        map.put("a7", "a");
        map.put("a8", "a");
        map.put("a2", "a");
        map.put("a9", "a");
        map.put("a10", "a");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        List<String> list = new LinkedList<>(map.values());

        for (String s : list){
            if (Collections.frequency(map.values(), s) > 1){
                removeItemFromMapByValue(map, s);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
