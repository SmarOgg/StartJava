package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPlayers = 2;
        String[] namePlayers = new String[totalPlayers];

        for (int i = 0; i < totalPlayers; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока :");
            namePlayers[i] = input.next();
        }

        GuessNumber game = new GuessNumber(namePlayers);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                game.start();
                System.out.print("Хотите продолжить игру? [yes / no]: ");
                answer = input.next().toLowerCase();
            }

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                answer = input.next().toLowerCase();
            }
        } while (!answer.equals("no"));
    }
}