package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение : ");
                String expression = input.next();

                double result = calc.calculate(expression);
                print(expression, result);
            }

            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            answer = input.next();
        } while (!answer.equals("no"));
    }

    private static void print(String expression, double result) {
        if (result != Double.MIN_VALUE) {
            System.out.printf("%s = " + (result % 1 == 0 ? "%.0f \n" : "%.3f \n"), expression, result);
        }
    }
}