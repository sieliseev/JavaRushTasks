package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream os = new FileInputStream(reader.readLine());
        while (os.available() > 0){
            System.out.write(os.read());
        }
        System.out.println();
        reader.close();
        os.close();
    }
}