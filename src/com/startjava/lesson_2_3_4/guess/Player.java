package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];
    private int indicator = 0;

    public Player(String name) {
        this.name = name;
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
        Arrays.fill(numbers,0,indicator-1,0);
    }
}