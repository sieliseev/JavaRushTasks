package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a > b && a < c) || (a > c && a < b)) System.out.println(a);
        else if ((a < b && b < c) || (b > c && a > b)) System.out.println(b);
        else if ((c < b && a < c) || (a > c && c > b)) System.out.println(c);
        else if (a == b ||  a== c) System.out.println(a);
        else if (a == b || b == c ) System.out.println(b);
        else if (a == b && b == c) System.out.println(a);
    }
}
