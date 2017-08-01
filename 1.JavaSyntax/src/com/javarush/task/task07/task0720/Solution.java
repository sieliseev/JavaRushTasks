package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            strings.add(strings.size(), strings.get(0));
            strings.remove(0);
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
