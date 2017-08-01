package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("gkjgdk");
        strings.add("gkjgdk7");
        strings.add("gkjgdk5");
        strings.add("gkjgdk4");
        strings.add("gkjgdk2");

        System.out.println(strings.size());
        for (String s : strings){
            System.out.println(s);
        }
    }
}
