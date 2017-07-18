package com.javarush.task.task15.task1522;

/**
 * Created by Stas on 12.07.2017.
 */
public class Sun implements Planet {
    private static Sun instance;

    public static Sun getInstance(){
        if (instance == null) instance = new Sun();
        return instance;
    }

    private Sun() {
    }
}
