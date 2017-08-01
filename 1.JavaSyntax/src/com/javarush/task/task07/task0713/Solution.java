package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integers.add(scanner.nextInt());
        }

        for (Integer i : integers) {
            if (i % 3 == 0 && i % 2 == 0) {
                odd.add(i);
                even.add(i);
            } else if (i % 2 == 0) even.add(i);
            else if (i % 3 == 0) odd.add(i);
            else other.add(i);
        }

        printList(odd);
        printList(even);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
