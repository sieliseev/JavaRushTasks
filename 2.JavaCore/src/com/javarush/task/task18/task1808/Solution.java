package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream file1Stream = new FileInputStream(file1);
        FileOutputStream file2Stream = new FileOutputStream(file2);
        FileOutputStream file3Stream = new FileOutputStream(file3);

        byte[] buffer = new byte[file1Stream.available()];
        int count = file1Stream.read(buffer);
        file2Stream.write(buffer, 0, count / 2 + count % 2);
        file3Stream.write(buffer, count / 2 + count % 2, count / 2);

        reader.close();
        file1Stream.close();
        file2Stream.close();
        file3Stream.close();
    }
}
