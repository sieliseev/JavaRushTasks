package com.javarush.task.task14.task1408;

/**
 * Created by Stas on 10.07.2017.
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 150;
    }

    @Override
    String getDescription() {
        String s = String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
        return super.getDescription() + s;
    }
}
