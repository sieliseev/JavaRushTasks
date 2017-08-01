package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s : result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list){
            result.add(s);
            result.add(s);
        }
        return result;
    }
}
