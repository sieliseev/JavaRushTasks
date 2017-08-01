package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        return Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if (s.equals("true")) return true;
        else if (s.equals("false")) return false;
        return false;
    }

    public static void main(String[] args) {

    }
}
