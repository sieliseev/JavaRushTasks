package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
            if(strings.get(i).length() > max)max = strings.get(i).length();
        }
        for (String s : strings){
            if (s.length() == max) System.out.println(s);
        }
    }
}
