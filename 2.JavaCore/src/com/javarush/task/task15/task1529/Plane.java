package com.javarush.task.task15.task1529;

/**
 * Created by Stas on 13.07.2017.
 */
public class Plane implements Flyable {
    private int countPassangers;

    @Override
    public void fly() {

    }

    public Plane(int countPassangers) {
        this.countPassangers = countPassangers;
    }
}
