package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.  Перевод псевдокода на язык Java\n");
        int age = 20;
        boolean male = true;
        double height = 1.8;
        char firstLetterName;

        if (age > 20) {
            System.out.println("Возраст: больше 20");
        } else {
            System.out.println("Возраст: меньше или равен 20");
        }

        if (!male) {
            System.out.println("Пол: женщина");
        } else {
            System.out.println("Пол: мужчина");
        }

        if (height < 1.80) {
            System.out.println("Рост: меньше или равен 1.8 метра");
        } else {
            System.out.println("Рост: больше 1.8 метра");
        }

        firstLetterName = "Maxim".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени: М");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Первая буква имени: " + firstLetterName);
        }

        System.out.println("\n2.  Поиск max и min значений\n");
        int numFirst = 13;
        int numSecond = 130;

        if ( numFirst > numSecond) {
            System.out.println("Сравнение чисел: " + numFirst + " и " + numSecond + 
                    ", где max - " + numFirst + ", min - " + numSecond);
        } else if (numFirst < numSecond) {
            System.out.println("Сравнение чисел: " + numFirst + " и " + numSecond + 
                    ", где max - " + numSecond + ", min - " + numFirst);
        } else if (numFirst == numSecond) {
            System.out.println("Сравнение чисел " + numFirst + " и " + numSecond + 
                    ", они равны");
        }

        System.out.println("\n3.  Работа с числом\n");
        int srcNum = -122;

        if (srcNum == 0) {
            System.out.println("Исходное число: " + srcNum + " является нулем");
        } else {
            if ((srcNum % 2) == 0) {
                System.out.println("Исходное число: " + srcNum + " четное");
            } else {
                System.out.println("Исходное число: " + srcNum + " нечетное");
            }
            if (srcNum > 0) {
                System.out.println("Исходное число: " + srcNum + " положительное");
            } else {
                System.out.println("Исходное число: " + srcNum + " отрицательное");
            }
        }

        System.out.println("\n4.  Поиск одинаковых цифр в числах\n");
        boolean numNothing = false;

        int num1 = 123;
        int num2 = 231;

        int num1Hundred = num1 / 100;
        int num2Hundred = num2 / 100;
        int num1Ten = (num1 / 10) % 10;
        int num2Ten = (num2 / 10) % 10;
        int num1One = num1 % 10;
        int num2One = num2 % 10;

        System.out.println("Исходные числа: " + num1 + " " + num2);
        
        if (num1Hundred != num2Hundred && 
                num1Ten != num2Ten &&
                num1One != num2One) {
            numNothing = true;
        }

        if (!numNothing) {
            System.out.print("Одинаковые в них числа:");
            if (num1Hundred == num2Hundred) {
                System.out.print(" " + num1Hundred);
            }
            if (num1Ten == num2Ten) {
                System.out.print(" " + num1Ten);
            }
            if (num1One == num2One) {
                System.out.print(" " + num1One);
            }

            System.out.print("\nНомера разрядов: ");
            if (num1Hundred == num2Hundred) {
                System.out.print(" сотни");
            }
            if (num1Ten == num2Ten) {
                System.out.print(" десятки");
            }
            if (num1One == num2One) {
                System.out.print(" единицы");
            }
        } else {
            System.out.print("Одинаковых чисел, стоящих в одном и том же разряде - нет");
        }

        System.out.println("\n\n5.  Определение буквы, числа или символа по их коду\n");
        char srcSymbol = '\u0057';

        if (srcSymbol >= 'a' && srcSymbol <= 'z') {
            System.out.println(srcSymbol + " - маленькая буква");
        } else if (srcSymbol >= 'A' && srcSymbol <= 'Z') {
            System.out.println(srcSymbol + " - большая буква");
        } else if (srcSymbol >= '0' && srcSymbol <= '9') {
            System.out.println(srcSymbol + " - число");
        } else {
            System.out.println(srcSymbol + " - не буква и не число");
        }

        System.out.println("\n6.  Определение суммы вклада и начисленных банком %\n");
        int deposit = 300_000;
        byte percentPerAnnum = 0;

        if (deposit < 100_000) {
            percentPerAnnum = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percentPerAnnum = 7;
        } else {
            percentPerAnnum = 10;
        }

        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + percentPerAnnum);
        System.out.println("Итоговая сумма с %: " + (deposit + deposit * percentPerAnnum / 100));

        System.out.println("\n7.  Определение оценки по предметам\n");
        byte subjHistory = 59;
        byte subjProgramming = 91;
        byte scrHistory = 0;
        byte scrProgramming = 0;

        if (subjHistory <= 60) {
            scrHistory = 2;
        } else if (subjHistory > 60 && subjHistory <= 73) {
            scrHistory = 3;
        } else if (subjHistory > 73 && subjHistory <= 91) {
            scrHistory = 4;
        } else {
            scrHistory = 5;
        }

        if (subjProgramming <= 60) {
            scrProgramming = 2;
        } else if (subjProgramming > 60 && subjProgramming <= 73) {
            scrProgramming = 3;
        } else if (subjProgramming > 73 && subjProgramming <= 91) {
            scrProgramming = 4;
        } else {
            scrProgramming = 5;
        }

        System.out.println(scrHistory + " история");
        System.out.println(scrProgramming + " программирование");
        System.out.println("Средний бал оценок по предметам: " + ((scrHistory + scrProgramming) / 2));
        System.out.println("Средний % по предметам: " + ((subjHistory + subjProgramming) / 2));

        System.out.println("\n8.  Расчет прибыли\n");
        int rentPerMonth = 5000;
        int salePerMonth = 13000;
        int costPrice = 9000;
        int profitPerYear = 12 * (salePerMonth - rentPerMonth - costPrice);

        if (profitPerYear > 0) {
            System.out.println("Прибыль за год: +" + profitPerYear);
        } else {
            System.out.println("Прибыль за год: " + profitPerYear);
        }
        
        System.out.println("\n9.  Подсчет количества банкнот\n");
        int withdrawAmount = 567;
        int moneyRemainTen = 5;
        int srcHundred = withdrawAmount / 100;
        int srcTen = (withdrawAmount / 10) % 10;
        int srcOne = withdrawAmount % 10;

        if (srcTen > moneyRemainTen) {
            srcOne += (srcTen - moneyRemainTen) * 10;
            srcTen = moneyRemainTen;
        }

        System.out.print("Номиналы банкнот(требуемое количество): " + 
                "100(" + srcHundred + ") " +
                "10(" + srcTen + ") " +
                "1(" + srcOne + ")");
        System.out.println("\nПосчитанная исходная сумма: " + 
                (100 * srcHundred + 10 * srcTen + srcOne));
    }
}