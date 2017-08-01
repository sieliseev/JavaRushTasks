package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("gjkgj", true, 18);
        Human child2 = new Human("gjk3gj", true, 16);
        Human child3 = new Human("gjk2gj", true, 12);

        ArrayList<Human> children = new ArrayList<>(Arrays.asList(child1, child2, child3));
        Human father = new Human("Papa", true, 36, children);
        Human mother = new Human("Mama", false, 32, children);

        Human gfather1 = new Human("GPa", true, 80, new ArrayList<>(Collections.singletonList(father)));
        Human gfather2 = new Human("GPa2", true, 80, new ArrayList<>(Collections.singletonList(mother)));
        Human gmother1 = new Human("GMa1", false, 80, new ArrayList<>(Collections.singletonList(father)));
        Human gmother2 = new Human("GMa2", false, 80, new ArrayList<>(Collections.singletonList(mother)));

        System.out.println(gfather1);
        System.out.println(gfather2);
        System.out.println(gmother1);
        System.out.println(gmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
