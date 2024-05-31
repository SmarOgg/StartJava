package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) {
        String[] mathExpression = expression.split(" ");

        if (mathExpression.length != 3) throw new CalculatorException("В выражении должны быть два числа, " +
                "знак операции и разделены пробелами");

        int a = Integer.parseInt(mathExpression[0]);
        char sign = mathExpression[1].charAt(0);
        int b = Integer.parseInt(mathExpression[2]);

        if (a < 0 || b < 0) {
            throw new CalculatorException("Числа должны быть положительными");
        }

        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (double) a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new CalculatorException("Ошибка: знак " + sign + " не поддерживается");
        };
    }

    static class CalculatorException extends RuntimeException {
        public CalculatorException(String message) {
            super(message);
        }
    }
}