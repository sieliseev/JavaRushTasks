package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> integers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (; ; ) {
                integers.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (Integer i : integers){
                System.out.println(i);
            }
        } catch (IOException e) {

        }

    }
}
