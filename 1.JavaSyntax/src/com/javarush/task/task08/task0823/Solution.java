package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();

        String[] strings = s.split(" ");
        for (String ss : strings) {
            if (ss.length() > 1) System.out.print(ss.substring(0, 1).toUpperCase() + ss.substring(1) + " ");
            //else if (ss.equals(" ")) break;
            else System.out.print(ss.toUpperCase() + " ");
        }
    }
}
