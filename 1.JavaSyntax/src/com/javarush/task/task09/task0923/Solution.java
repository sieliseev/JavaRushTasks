package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        StringBuffer vovels = new StringBuffer();
        StringBuffer consonants = new StringBuffer();
        for (Character c : chars) {
            if (isVowel(c)) vovels.append(c).append(" ");
            else if (c == ' ') continue;
            else consonants.append(c).append(" ");
        }
        System.out.println(vovels);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}