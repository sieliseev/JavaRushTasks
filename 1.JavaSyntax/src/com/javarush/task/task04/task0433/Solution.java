package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 10, j = 10;
        while (j>0){
            while (i>0){
                System.out.print("S");
                i--;
            }
            System.out.println("");
            i = 10;
            j--;
        }
    }
}
