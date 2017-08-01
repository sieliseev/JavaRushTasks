package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            arrayOfStringList[i] = new ArrayList<>();
            arrayOfStringList[i].add("1");
            arrayOfStringList[i].add("2");
            arrayOfStringList[i].add("3");
        }

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}