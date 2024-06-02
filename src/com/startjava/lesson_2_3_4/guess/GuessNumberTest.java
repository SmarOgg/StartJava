package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        int totalPlayers = 2;

        GuessNumber game = new GuessNumber(inputNamePlayers(totalPlayers));

        String answer = "yes";
        Scanner input = new Scanner(System.in);

        do {
            if (!answer.equals("yes")) {
                System.out.print("Введите корректный ответ [yes / no]: ");
            } else {
                game.start();
                System.out.print("Хотите продолжить игру? [yes / no]: ");
            }

            answer = input.next().toLowerCase();

        } while (!answer.equals("no"));
    }

    private static String[] inputNamePlayers(int totalPlayers) {
        Scanner input = new Scanner(System.in);

        String[] namePlayers = new String[totalPlayers];
        for (int i = 0; i < totalPlayers; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока :");
            namePlayers[i] = input.next();
        }

        return namePlayers;
    }
}