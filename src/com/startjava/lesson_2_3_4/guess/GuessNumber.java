package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        player1 = new Player(namePlayer1);
        player2 = new Player(namePlayer2);
    }

    public void start() {
        init();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Ход игрока " + currentPlayer.getName() + " : ");
            currentPlayer.setNumber(input.nextInt());
            if (currentPlayer.getNumber() > hiddenNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < hiddenNum) {
                System.out.println("Число " + currentPlayer.getNumber() +
                        " меньше того, что загадал компьютер");
            } else {
                break;
            }
            changePlayer();
        } while (true);
    }

    private void init() {
        int endRange = 100;
        hiddenNum = (int) (Math.random() * endRange) + 1;
        changePlayer();
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}