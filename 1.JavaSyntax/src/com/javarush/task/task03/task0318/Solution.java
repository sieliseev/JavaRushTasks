package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int number;
        String name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());
        name = reader.readLine();
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
