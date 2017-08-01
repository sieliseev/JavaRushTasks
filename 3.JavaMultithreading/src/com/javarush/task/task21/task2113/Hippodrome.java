package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stas on 26.07.2017.
 */
public class Hippodrome {

    static Hippodrome game;

    private static List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        Horse h1 = new Horse("Кляча", 3, 0);
        game.horses.add(h1);
        Horse h2 = new Horse("Мурка", 3, 0);
        game.horses.add(h2);
        Horse h3 = new Horse("Молния", 3, 0);
        game.horses.add(h3);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > winner.getDistance()) winner = horse;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
