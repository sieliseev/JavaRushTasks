package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "мама", "мыла", "раму");

        for (int i = 1; i < strings.size()+1; i += 2) {
            strings.add(i, "именно");
        }

        for (String s : strings){
            System.out.println(s);
        }
    }
}
