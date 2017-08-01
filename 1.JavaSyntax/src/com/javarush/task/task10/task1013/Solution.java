package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private float weight;
        private float height;
        private Human parent;

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(int age, boolean sex, float height, Human parent) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.parent = parent;
        }

        public Human(String name, boolean sex, float weight, float height, Human parent) {

            this.name = name;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.parent = parent;
        }

        public Human(String name, float weight, float height, Human parent) {

            this.name = name;
            this.weight = weight;
            this.height = height;
            this.parent = parent;
        }

        public Human(String name, int age, boolean sex, float weight, float height, Human parent) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.parent = parent;
        }

        public Human(String name, int age, boolean sex, float weight, float height) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, boolean sex, float weight) {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex) {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public Human(String name) {

            this.name = name;
        }
    }
}
