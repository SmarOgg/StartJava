public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.  Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("\nВ промежутке [" + counter + ", " + 21 + "] сумма четных чисел = ");

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println(sumEven + ",а нечетных = " + sumOdd);

        System.out.println("\n2.  Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print("" + i + " ");
        }

        System.out.println("\n\n3.  Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int srcNum = num;
        int sumDigits = 0;

        if (num == 0) {
            System.out.println("Исходное число в обратном порядке : 0");
            System.out.println("Сумма цифр числа " + srcNum + " : 0");
        } else {
            System.out.print("Исходное число в обратном порядке : ");
            while (num > 0) {
                int digit = num % 10;
                System.out.print(digit);
                sumDigits += digit;
                num /= 10;
            }
            System.out.println("\nСумма цифр числа " + srcNum + " : " + sumDigits);
        }

        System.out.println("\n4.  Вывод чисел на консоль в несколько строк\n");
        int numsInRow = 0;

        for (int i = 1; i < 24; i += 2, numsInRow++) {
            if (numsInRow == 5) {
                System.out.println();
                numsInRow = 0;
            }
            System.out.printf("%5d", i);
        }

        if (numsInRow != 5) {
            for (int i = 0; i < (5 - numsInRow); i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5.  Проверка количества единиц на четность\n");
        num = 3141591;
        int countOnes = 0;

        System.out.print("Число " + num + " содержит ");
        while (num > 0) {
            if (num % 10 == 1) {
                countOnes++;
            }
            num /= 10;
        }

        if (countOnes % 2 == 0) {
            System.out.print("" + countOnes + " (четное) количество единиц");
        } else {
            System.out.print("" + countOnes + " (нечетное) количество единиц");
        }

        System.out.println("\n\n6.  Отображение фигур в консоли\n");
        int numCharsPerLine = 10;
        int numOfRows = 5;
        int j;

        for (int i = 0; i < numOfRows; i++) {
            for (j = 0; j < numCharsPerLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int startNumCharsPerLine = 5;
        numOfRows = 5;

        int i = 0;
        j = 0;
        while (j < startNumCharsPerLine) {
            while (i < numOfRows) {
                System.out.print("#");
                ++i;
            }
            ++j;
            System.out.println();
            numOfRows--;
            i = 0;
        }

        System.out.println();
        numOfRows = 5;
        int height = 3;
        int space = height - 1;

        i = 1;
        do {
            j = 0;
            do {
                System.out.print("$");
                j++;
            } while (((space >= 0 ? space : -space) + j) != height);
            i++;
            space--;
            System.out.println();
        } while (i <= numOfRows);

        System.out.println("\n7.  Отображение ASCII-символов\n");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (i = 0; i < '0' ; i++) {
            if ((i % 2) != 0) {
                System.out.printf("%6d%6s\n", i, (char) i);
            }
        }

        for (i = 'a'; i <= 'z' ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6d%6s\n", i, (char) i);
            }
        }

        System.out.println("\n8.  Проверка, является ли число палиндромом\n");
        srcNum = 123321;
        int srcCopyNum = srcNum;
        int reverseNum = 0;

        while (srcNum > 0) {
            reverseNum = reverseNum * 10 + srcNum % 10;
            srcNum /= 10;
        }

        if (srcCopyNum == reverseNum) {
            System.out.printf("Число %d является палиндромом%n", srcCopyNum);
        } else {
            System.out.printf("Число %d не является палиндромом%n", srcCopyNum);
        }

        System.out.println("\n9.  Определение, является ли число счастливым");
        num = 123321;
        int firstTriple = 0;
        int secondTriple = 0;
        int sumFirstTriple = 0;
        int sumSecondTriple = 0;

        firstTriple = num / 1000;
        secondTriple = num % 1000;

        for ( i = 0; i < 3; i++) {
            sumFirstTriple += firstTriple % 10;
            firstTriple /= 10;
            sumSecondTriple += secondTriple % 10;
            secondTriple /= 10;
        }

        firstTriple = num / 1000;
        secondTriple = num % 1000;

        System.out.printf("Сумма цифр %d = %d%n", firstTriple, sumFirstTriple);
        System.out.printf("Сумма цифр %d = %d%n", secondTriple, sumSecondTriple);
        if (sumFirstTriple == sumSecondTriple) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        
        System.out.printf("%20s%n","ТАБЛИЦА ПИФАГОРА");
        System.out.print(" |");

        for ( i = 2; i <= 9; i++ ) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for ( i = 1; i <= 26; i++ ) {
            System.out.print("-");
        }
        System.out.println();
        for ( i = 2; i <= 9; i++ ) {
            System.out.printf("%d%s",i,"|");
            for ( j = 2; j <= 9; j++ ) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}