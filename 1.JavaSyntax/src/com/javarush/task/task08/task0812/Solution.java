package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0, j = 0, k = 0; i < 10; i++) {
            int e = Integer.parseInt(reader.readLine());
            integers.add(e);
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i) == integers.get(i + 1)) {
                count++;
                if (max < count)
                    max = count;
            } else
                count = 1;
        }
        System.out.println(max);
    }
}