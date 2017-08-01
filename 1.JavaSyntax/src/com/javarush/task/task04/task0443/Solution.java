package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int y, m, d;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        y = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + "." + "\n" + "Я родился " + d + "." + m + "." + y);
    }
}
