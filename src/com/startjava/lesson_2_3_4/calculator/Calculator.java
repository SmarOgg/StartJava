package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String expression) {
        String[] mathExpression = expression.split(" ");

        int a = Integer.parseInt(mathExpression[0]);
        char sign = mathExpression[1].charAt(0);
        int b = Integer.parseInt(mathExpression[2]);

        double result = Double.MIN_VALUE;

        switch (sign) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = (double) a / b;
            case '^' -> result = Math.pow(a, b);
            case '%' -> result = a % b;
            default -> System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }

        return result;
    }
}