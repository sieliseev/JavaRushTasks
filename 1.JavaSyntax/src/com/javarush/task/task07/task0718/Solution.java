package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }
        for (int i = 0; i < strings.size()-1; i++) {
            if (strings.get(i).length() > strings.get(i + 1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}

