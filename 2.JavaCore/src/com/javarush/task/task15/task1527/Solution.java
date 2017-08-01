package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String value = "";
        ArrayList<String> params = new ArrayList<>();
        int a = url.indexOf("?");
        url = url.substring(a + 1);
        String[] m = url.split("&");
        for (String s : m) {
            if (s.contains("=")) {
                String obj = s.split("=")[0];
                params.add(obj);
                if (obj.equals("obj")) value = s.split("=")[1];
            } else {
                params.add(s);
            }
        }
        for (String s : params) {
            System.out.print(s + " ");
        }

        try {
            if (!value.equals("")) {
                System.out.println();
                alert(Double.parseDouble(value));
            }
        } catch (NumberFormatException e) {
            alert(value);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
