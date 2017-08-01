package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max  = 0;

        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
            if (strings.get(i).length() < min) min = strings.get(i).length();
            else if (strings.get(i).length() > max) max = strings.get(i).length();
        }

        for (String s : strings){
            if (s.length() == min || s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
