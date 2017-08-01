package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;//цикл с буквами
            for (int j = 0; j < list.size(); j++) {
                String text = list.get(j);
                char[] ctext = text.toCharArray();
                for (int k = 0; k < ctext.length; k++) {
                    if (ctext[k] == alphabet.get(i)) count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
        /*HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (String s : list){
            char[] chars = s.toCharArray();
            for (Character character : chars){
                if (map.containsKey(character)){
                    map.put(character, map.get(character) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> p : map.entrySet()){
            System.out.println(p.getKey() + " " + p.getValue());
        }*/
    }

}
