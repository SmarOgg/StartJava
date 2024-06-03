package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNum {
    private int hiddenNum;
    private final Player[] players;
    private Player currentPlayer;

    public GuessNum(String[] names) {
        players = new Player[names.length];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        init();
        System.out.println("Игра началась! У каждого игрока по 10 попыток");

        do {
            boolean isGuess = makeMove();
            if (isGuess) {
                break;
            }

            boolean isAttempt = hasAttempt();
            if (!isAttempt) {
                break;
            }

            changePlayer();
        } while (true);

        printNums(players);
    }

    private void init() {
        int endRange = 100;
        hiddenNum = (int) (Math.random() * endRange) + 1;
        currentPlayer = players[0];

        for (Player p : players) {
            p.clear();
        }
    }

    private boolean makeMove() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ход игрока " + currentPlayer.getName() + " : ");
        int inputNum = input.nextInt();
        currentPlayer.addNum(inputNum);

        return isGuess(inputNum);
    }

    private boolean isGuess(int num) {
        if (num > hiddenNum) {
            System.out.println("Число " + num +
                    " больше того, что загадал компьютер");
        } else if (num < hiddenNum) {
            System.out.println("Число " + num +
                    " меньше того, что загадал компьютер");
        } else {
            System.out.println(currentPlayer.getName() + " угадал число " +
                    num + " c " + currentPlayer.getAttempt() + "-й попытки");
        }

        return (num == hiddenNum);
    }

    private boolean hasAttempt() {
        if (currentPlayer.getAttempt() == 10) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки!");
        }

        int attempt = 0;
        for (Player player : players) {
            attempt += player.getAttempt();
        }

        return attempt != players.length * 10;
    }

    void changePlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }

    private void printNums(Player[] players) {
        for (Player p : players) {
            System.out.print("Числа игрока " + p.getName() + " : ");

            for (int n : p.getNums()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}