package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;

        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        do {
            System.out.print("Введите математическое выражение : ");
            answer = input.next();

            calc.setMathExpression(answer);

            double result = calc.calculate();

            if (result == Double.MIN_VALUE) {
                System.out.println("Ошибка: знак " + calc.getSign() + " не поддерживается");
            } else if (result % 1 == 0) {
                System.out.print(calc + " = " + (int) result);
            } else {
                System.out.format("%s = %.3f \n", calc, result);
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = input.next();
        } while (!answer.equals("no"));
    }
}