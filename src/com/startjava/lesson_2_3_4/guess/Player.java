package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] nums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
        attempt = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return Arrays.copyOf(nums, attempt);
    }

    public void setNumber(int num) {
        nums[attempt++] = num;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public int getAttempts() {
        return attempt;
    }
}