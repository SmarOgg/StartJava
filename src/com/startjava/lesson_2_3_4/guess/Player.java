package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
        attempt = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return Arrays.copyOf(numbers, attempt+1);
    }

    public void setNumber(int num) {
        numbers[attempt++] = num;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getAttempts() {
        return attempt;
    }
}