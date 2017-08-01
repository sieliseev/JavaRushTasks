package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        for (int i = 0; i < num.length(); i++) {
            if(Character.getNumericValue(num.toCharArray()[i]) % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: "+even+ " Odd: "+odd);

    }
}
