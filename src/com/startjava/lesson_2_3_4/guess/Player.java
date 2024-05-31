package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int indicator;

    public Player(String name) {
        this.name = name;
        indicator = 1;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return Arrays.copyOf(numbers, indicator);
    }

    public void setNumber(int num) {
        numbers[indicator] = num;
        indicator++;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, indicator - 1, 0);
        indicator = 1;
    }

    public int getAttempts() {
        return indicator;
    }
}