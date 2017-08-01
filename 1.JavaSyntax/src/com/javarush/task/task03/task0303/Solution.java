package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(13,0.235));
        System.out.println(convertEurToUsd(3,0.335));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur*course;
    }
}
