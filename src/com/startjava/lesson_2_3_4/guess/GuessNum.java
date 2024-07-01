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

        shuffle(players);
    }

    public void start() {
        Scanner input = new Scanner(System.in);

        init();
        System.out.println("Игра началась! У каждого игрока по 10 попыток");

        do {
            if (makeMove(input)) {
                break;
            }

            if (!hasAttempt()) {
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

    private boolean makeMove(Scanner input) {
        System.out.print("Ход игрока " + currentPlayer.getName() + " : ");

        int num = inputNum(input);

        return isGuess(num);
    }

    private int inputNum(Scanner input) {
        int inputNum;

        do {
            inputNum = input.nextInt();
            if (currentPlayer.addNum(inputNum)) {
                break;
            }

            System.out.println("Число должно входить в интервал [1, 100].");
            System.out.print("Попробуйте еще раз : ");
        } while (true);

        return inputNum;
    }

    private boolean isGuess(int num) {
        String text = num > hiddenNum ? num + " больше" : num + " меньше";

        if (num == hiddenNum) {
            System.out.println(currentPlayer.getName() + " угадал число " +
                    num + " c " + currentPlayer.getAttempt() + "-й попытки");
        } else {
            System.out.println("Число " + text + " того, что загадал компьютер");
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
        int position = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == currentPlayer) {
                position = i + 1;
            }
        }

        if (position == 3) {
            position = 0;
        }
        currentPlayer = players[position];
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

    private void shuffle(Player[] players) {
        int totalPlayers = players.length;

        for (int i = totalPlayers - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);

            Player tempPlayer = players[i];
            players[i] = players[j];
            players[j] = tempPlayer;
        }

        for (Player player : players) {
            System.out.print(player.getName() + " ");
        }
        System.out.println();
    }
}