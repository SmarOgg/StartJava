package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя первого игрока :");
        String namePlayer1 = input.next();
        System.out.print("Введите имя второго игрока :");
        String namePlayer2 = input.next();

        GuessNumber game = new GuessNumber(namePlayer1, namePlayer2);
        String answer;

        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}