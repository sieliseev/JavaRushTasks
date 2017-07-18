package com.javarush.task.task14.task1413;

/**
 * Created by Stas on 11.07.2017.
 */
public class Monitor implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
