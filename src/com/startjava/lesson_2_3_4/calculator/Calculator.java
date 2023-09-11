package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public char getSign() {
        return sign;
    }
    public void setMathExpression(String expression) {
        String[] mathExpression = expression.split(" ");

        a = Integer.parseInt(mathExpression[0]);
        sign = mathExpression[1].charAt(0);
        b = Integer.parseInt(mathExpression[2]);
    }

    public double calculate() {
        return switch (sign) {
            case '+' -> (double) a + b;
            case '-' -> (double) a - b;
            case '*' -> (double) a * b;
            case '/' -> (double) a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> (double) a % b;
            default -> Double.MIN_VALUE;
        };
    }

    @Override
    public String toString() {
        return a + " " + sign + " " + b;
    }
}