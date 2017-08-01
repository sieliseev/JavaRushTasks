package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        strings.remove(2);
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}


