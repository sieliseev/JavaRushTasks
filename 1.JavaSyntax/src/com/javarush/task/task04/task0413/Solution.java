package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int numOfDay;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        numOfDay = Integer.parseInt(reader.readLine());

        if (numOfDay == 1) System.out.println("понедельник");
        else if (numOfDay == 2) System.out.println("вторник");
        else if (numOfDay == 3) System.out.println("среда");
        else if (numOfDay == 4) System.out.println("четверг");
        else if (numOfDay == 5) System.out.println("пятница");
        else if (numOfDay == 6) System.out.println("суббота");
        else if (numOfDay == 7) System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");

        /*switch (numOfDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }*/
    }
}