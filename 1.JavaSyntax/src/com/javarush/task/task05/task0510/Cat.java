package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight, age;
    String color, address;

    public void initialize(String name){
        this.name = name;
        this.weight = 10;
        this.age = 10;
        this.color = "blue";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blue";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "blue";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address =  null;
        this.age = 10;
    }
    public void initialize(int weight, String color, String adress){
        this.weight = weight;
        this.color = color;
        this.address = adress;
        this.age = 10;
    }
    public static void main(String[] args) {

    }
}
