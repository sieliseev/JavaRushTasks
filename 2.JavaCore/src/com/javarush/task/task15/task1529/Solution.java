package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String param = reader.readLine();
            if (param.equals("helicopter")) result = new Helicopter();
            else if (param.equals("plane")) {
                int coumntPas = Integer.parseInt(reader.readLine());
                result = new Plane(coumntPas);
            }
            reader.close();
        } catch (IOException e) {
        }

    }
}
