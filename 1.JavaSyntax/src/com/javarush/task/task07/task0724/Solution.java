package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human дед = new Human("Дед", true, 87);
        System.out.println(дед);
        Human дед2 = new Human("Дед2", true, 87);
        System.out.println(дед2);
        Human ба = new Human("Ба", false, 87);
        System.out.println(ба);
        Human ба2 = new Human("Ба2", false, 87);
        System.out.println(ба2);
        Human отец = new Human("Отец", true, 48, дед, ба);
        System.out.println(отец);
        Human mother = new Human("mother", false, 48, дед2, ба2);
        System.out.println(mother);
        System.out.println(new Human("child1", true, 12, отец, mother));
        System.out.println(new Human("child2", true, 12, отец, mother));
        System.out.println(new Human("child3", true, 12, отец, mother));
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















