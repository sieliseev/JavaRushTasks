package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {


    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.34, "GH");
        labels.put(2.344, "GH");
        labels.put(2.3364, "GH");
        labels.put(2.3274, "GH");
        labels.put(2.3844, "GH");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
