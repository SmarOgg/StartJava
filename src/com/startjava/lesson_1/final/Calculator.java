package com.startjava.lesson_1.final;

public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int result = 1;
        char sign = '^';

        if (b != 0) {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b; 
            } else if (sign == '/') {
                result = a / b; 
            } else if (sign == '^') {
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if (sign == '%') {
                result = a % b;
            }
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}