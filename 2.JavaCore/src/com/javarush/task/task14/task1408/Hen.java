package com.javarush.task.task14.task1408;

/**
 * Created by Stas on 10.07.2017.
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription(){
        return "Я - курица.";
    }
}
