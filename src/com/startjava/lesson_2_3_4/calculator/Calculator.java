package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String expression) throws CalculatorException {
        String[] mathExpression = expression.split(" ");
        
        if (mathExpression.length < 3) {
            throw new CalculatorException("В выражении должны быть два числа, знак операции и разделены пробелами");
        }

        try {
            int a = Integer.parseInt(mathExpression[0]);
            char sign = mathExpression[1].charAt(0);
            int b = Integer.parseInt(mathExpression[2]);

            if (a < 0 || b < 0) throw new CalculatorException("Числа должны быть положительными");

            return switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> (double) a / b;
                case '^' -> Math.pow(a, b);
                case '%' -> a % b;
                default -> {
                    System.out.println("Ошибка: знак " + sign + " не поддерживается");
                    yield Double.MIN_VALUE;
                }
            };
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return Double.MIN_VALUE;
    }

    static class CalculatorException extends Exception {
        public CalculatorException(String message) {
            super(message);
        }
    }
}