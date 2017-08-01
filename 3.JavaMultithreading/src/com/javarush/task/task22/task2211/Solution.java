package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        Charset utf = Charset.forName("UTF-8");
        Charset win = Charset.forName("Windows-1251");

        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        String tempString = new String(buffer, utf);
        buffer = tempString.getBytes(win);
        fos.write(buffer);

        fis.close();
        fos.close();
    }
}
