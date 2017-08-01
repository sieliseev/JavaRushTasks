package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        OutputStream os = new FileOutputStream(fileName);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        ArrayList<String> strings = new ArrayList<>();
        while (true){
            String string = reader.readLine();
            strings.add(string);
            if (string.equals("exit")) break;
        }
        for (int i = 0; i < strings.size(); i++) {
            writer.write(strings.get(i));
            writer.newLine();
        }

        reader.close();
        writer.close();
        os.close();
    }
}
