public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.  Подсчет суммы четных и нечетных чисел");
        int a = -10;
        int b = 21;
        int resEven = 0;
        int resOdd = 0;

        int i = a;
        do {
            if (i % 2 ==0) {
                resEven += i;
            } else {
                resOdd += i;
            }
            i++;
        } while (i <= b);

        System.out.println("\nВ промежутке [" + a + ", " + b + 
                    "] сумма четных чисел = " + resEven + 
                    ",а нечетных = " + resOdd);

        System.out.println("\n2.  Вывод чисел в интервале (min и max) в порядке убывания\n");
        a = 10;
        b = 5;
        int c = -1;

        int max = a;
        int min = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        for (i = max - 1; i > min; i--) {
            System.out.print("" + i + " ");
        }

        System.out.println("\n\n3.  Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sumDigits = 0;

        if (num == 0) {
            System.out.println("Исходное число в обратном порядке : 0");
            System.out.println("Сумма цифр числа выше : 0");
        } else {
            System.out.print("Исходное число в обратном порядке : ");
            while (num > 0) {
                System.out.print(num % 10);
                sumDigits += (num % 10);
                num /= 10;
            }
            System.out.println("\nСумма цифр числа выше : " + sumDigits);
        }

        System.out.println("\n4.  Вывод чисел на консоль в несколько строк\n");
        int numsInRow = 8;
        int j = 0;
        int step = 2;
        a = 1;
        b = 24;

        for (i = a; i < b; i += step, j++) {
            if (j == numsInRow) {
                System.out.println();
                j = 0;
            }
            System.out.printf("%5d", i);
        }

        if (j != numsInRow) {
            for (i = 0; i < (numsInRow - j) ; i++ ) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5.  Проверка количества единиц на четность\n");
        num = 3141591;
        i = 0;

        System.out.print("Число " + num + " содержит ");
        while (num > 0) {
            if (num % 10 == 1) {
                i++;
            }
            num /= 10;
        }

        if (i % 2 == 0) {
            System.out.print("" + i + " (четное) количество единиц");
        } else {
            System.out.print("" + i + " (нечетное) количество единиц");
        }

        System.out.println("\n\n6.  Отображение фигур в консоли\n");
        char star = '*';
        char grid = '#';
        char dollar = '$';
        int sideRectangleA = 10;
        int sideRectangleB = 5;

        for (i = 0; i < sideRectangleB; i++) {
            for (j = 0; j < sideRectangleA; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println();
        int sideTriangelA = 5;
        int sideTriangelB = 5;

        i = 0;
        j = 0;
        while (j < sideTriangelA) {
            while (i < sideTriangelB) {
                System.out.print(grid);
                ++i;
            }
            ++j;
            System.out.println();
            sideTriangelB--;
            i = 0;
        }

        System.out.println();
        int hypotenuse = 5;
        int height = 3;
        int space = height - 1;

        i = 1;
        do {
            j = 0;
            do {
                System.out.print(dollar);
                j++;
            } while (((space >= 0 ? space : -space) + j) != height);
            i++;
            space--;
            System.out.println();
        } while (i <= hypotenuse);

        System.out.println("\n7.  Отображение ASCII-символов\n");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (i = 0; i < (int) '0' ; i++) {
            if ((i % 2) != 0) {
                System.out.printf("%6s%6s\n", i, (char) i);
            }
        }

        for (i = (int) 'a'; i <= (int) 'z' ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6s%6s\n", i, (char) i);
            }
        }

        System.out.println("\n7.  Проверка, является ли число палиндромом\n");
        num = 1234321;
        int srcNum = num;
        int reverseNum = 0;

        for (; num > 0 ; ) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }

        if (srcNum == reverseNum) {
            System.out.printf("Число %d является палиндромом%n", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом%n", srcNum);
        }

        System.out.println("\n8.  Определение, является ли число счастливым");
        num = 123223;
        int firstTriple = 0;
        int secondTriple = 0;
        int sumFirstTriple = 0;
        int sumSecondTriple = 0;

        for (i =0 ; i < 3 ; i++) {
            firstTriple = firstTriple * 10 + num % 10;
            sumFirstTriple += num % 10;
            num /= 10;
        }

        for (i = 3 ; i < 6 ; i++) {
            secondTriple = secondTriple * 10 + num % 10;
            sumSecondTriple += num % 10;
            num /= 10;
        }

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

        for ( i = 2; i <= 9 ; i++ ) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for ( i = 1; i <= 26 ; i++ ) {
            System.out.print("-");
        }
        System.out.println();
        for ( i = 2; i <= 9 ; i++ ) {
            System.out.printf("%d%s",i,"|");
            for ( j = 2; j <= 9 ; j++ ) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}