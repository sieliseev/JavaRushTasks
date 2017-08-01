package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int y = min(a, b);
        int x = min(c, d);
        return y < x ? y : x;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        return a < b ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}