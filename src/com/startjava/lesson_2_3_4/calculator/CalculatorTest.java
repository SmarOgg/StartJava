package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String answer;

        do {
            System.out.print("Введите математическое выражение : ");
            String expression = input.next();

            double result = calc.calculate(expression);

            printResultMessage(expression, result);
            
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                answer = input.next();
            } while (!(answer.equals("yes") || answer.equals("no")));

        } while (!answer.equals("no"));
    }

    private static void printResultMessage(String expression, double result) {
        if (result % 1 == 0) {
            System.out.print(expression + " = " + (int) result);
        } else {
            System.out.format("%s = %.3f \n", expression, result);
        }
    }
}