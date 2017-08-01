package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String fatherGName = reader.readLine();
        Cat catGFather = new Cat(fatherGName);

        String motherGName = reader.readLine();
        Cat catGMother = new Cat(motherGName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGFather);


        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGMother, null);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catGFather);
        System.out.println(catGMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent == null && parent2 == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parent2 == null)
                return "Cat name is " + name + ", mother is " + parent.name + ", no father";
            else if (parent == null)
                return "Cat name is " + name + ", no mother, father is " + parent2.name;
            else
                return "Cat name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
        }
    }

}
