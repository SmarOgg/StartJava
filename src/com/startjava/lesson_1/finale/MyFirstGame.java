package com.startjava.lesson_1.finale;

public class MyFirstGame {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;

        int hiddenNum = 23;
        int playerNum = endRange;

        while (playerNum != hiddenNum) {
            playerNum = startRange + (endRange - startRange) / 2;

            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                endRange = playerNum;
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                startRange = playerNum;
            }
        }

        System.out.println("Вы победили!");
    }
}