package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s =  null;
            System.out.println(s.length());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[2];
            int a = ints[3];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = new Object();
            String s = (String)o;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("gh");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Thread t = new Thread();
            t.start();
            t.start();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileReader fr = new FileReader("W:1.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object[] o = new String[2];
            o[0] = Integer.parseInt("2");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            "jgk".charAt(20);
        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
