package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Player[] players;
    private Player currentPlayer;

    public GuessNumber() {
    }

    public GuessNumber(String[] namePlayers) {
        players = new Player[namePlayers.length];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(namePlayers[i]);
        }
    }

    public void start() {
        init();
        Scanner input = new Scanner(System.in);

        System.out.println("Игра началась! У каждого игрока по 10 попыток");

        int inputNum;
        do {
            System.out.print("Ход игрока " + currentPlayer.getName() + " : ");
            inputNum = input.nextInt();
            currentPlayer.setNumber(inputNum);
            if (inputNum > hiddenNum) {
                System.out.println("Число " + inputNum +
                        " больше того, что загадал компьютер");
            } else if (inputNum < hiddenNum) {
                System.out.println("Число " + inputNum +
                        " меньше того, что загадал компьютер");
            } else {
                System.out.println(currentPlayer.getName() + " угадал число " +
                        inputNum + " c " + currentPlayer.getAttempts() + "-й попытки");
                break;
            }

            if (currentPlayer.getAttempts() == 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки!");
            }

            int attempts = 0;
            for (Player player : players) {
                attempts = player.getAttempts() + attempts;
            }
            if (attempts == players.length * 10) {
                break;
            }

            changePlayer();
        } while (true);

        printNumbers(players);
    }

    private void init() {
        int endRange = 100;
        hiddenNum = (int) (Math.random() * endRange) + 1;
        changePlayer();

        for (Player p : players) {
            p.clear();
        }
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }

    private void printNumbers(Player[] players) {
        for (Player p : players) {
            System.out.print("Числа игрока " + p.getName() + " : ");

            for (int n : p.getNumber()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}