package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumTest {
    public static void main(String[] args) {
        int totalPlayers = 3;

        GuessNum game = new GuessNum(inputNames(totalPlayers));

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

    private static String[] inputNames(int totalPlayers) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[totalPlayers];
        for (int i = 0; i < totalPlayers; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока :");
            names[i] = input.next();
        }

        return names;
    }
}