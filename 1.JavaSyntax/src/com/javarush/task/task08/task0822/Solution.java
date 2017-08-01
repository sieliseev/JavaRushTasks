package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (Integer i : array) {
            if (min > i) min = i;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }
}
