package com.javarush.task.task15.task1522;

/**
 * Created by Stas on 12.07.2017.
 */
public class Earth implements Planet {
    private static Earth instance;

    public static Earth getInstance() {

        if (instance == null) instance = new Earth();
        return instance;
    }

    private Earth() {
    }
}
