package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private final Player[] players;
    private Player currentPlayer;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        players = new Player[2];
        players[0] = new Player(namePlayer1);
        players[1] = new Player(namePlayer2);
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

        for (Player player : players) {
            System.out.print("Числа игрока " + player.getName() + " : ");
            printNumbers(player.getNumber());
        }
    }

    private void init() {
        int endRange = 100;
        hiddenNum = (int) (Math.random() * endRange) + 1;
        changePlayer();

        for (Player player : players) {
            player.clearNumbers();
        }
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }

    private void printNumbers(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}