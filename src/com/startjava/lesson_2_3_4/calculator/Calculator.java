package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] mathExpression = expression.split(" ");

        int a = Integer.parseInt(mathExpression[0]);
        char sign = mathExpression[1].charAt(0);
        int b = Integer.parseInt(mathExpression[2]);

        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (double) a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> {
                System.out.println("Ошибка: знак " + sign + " гн поддерживается");
                yield Double.MIN_VALUE;
            }
        };
    }
}