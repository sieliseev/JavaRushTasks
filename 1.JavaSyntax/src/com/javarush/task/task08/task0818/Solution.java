package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Егоров", 24000);
        map.put("Егорова", 34000);
        map.put("Елисов", 54000);
        map.put("Агонев", 14000);
        map.put("Федоров", 24000);
        map.put("Жих", 24000);
        map.put("Хармач", 22000);
        map.put("Кисель", 23000);
        map.put("Рогов", 28000);
        map.put("Клим", 300);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> p : copy.entrySet()) {
            if (p.getValue() < 500) map.remove(p.getKey());
        }
    }

    public static void main(String[] args) {

    }
}