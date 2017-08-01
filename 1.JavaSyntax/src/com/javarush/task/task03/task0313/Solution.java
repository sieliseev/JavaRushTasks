package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String a = "Мама", b = "Мыла", c = "Раму";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a + b + c);
                String d = a;
                a = b;
                b = c;
                c = d;
            }
            String g = b;
            b = c;
            c = g;
        }
    }
}
