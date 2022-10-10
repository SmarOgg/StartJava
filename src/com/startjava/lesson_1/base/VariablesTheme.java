package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.  Создание переменных и вывод их значений на консоль\n");
        byte generation = 10;
        short efficiency = 300;
        int cores = 4;
        float frequency = 3.3f;
        long ram = 16_777_216;
        double serialNumber = 2124709.235435;
        char processorСharacteristic = 'H';
        boolean virtualization = true;

        System.out.println("Поколение процессора : " + generation + " поколения ");
        System.out.println("Производительность : " + efficiency);
        System.out.println("Ядер : " + cores);
        System.out.println("Частота : " + frequency + " Hz");
        System.out.println("Характеристика процессора : " + processorСharacteristic);
        System.out.println("Оперативная память : " + ram + " байт");
        System.out.println("Серийный номер : " + serialNumber);
        System.out.println("Виртуализация : " + virtualization);

        System.out.println("\n2.  Расчет стоимости товара со скидкой\n");
        int bookPrice = 100;
        int penPrice = 200;
        float discount = 11;

        float sumDiscount = (bookPrice + penPrice) * discount / 100;
        float discountPrice = bookPrice + penPrice - sumDiscount;

        System.out.println("Сумма скидки : " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой : " + discountPrice);

        System.out.println("\n3.  Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.  Отображение min и max значений числовых типов данных\n");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.print("Byte    : " + maxByte + " ");
        System.out.println((byte) (++maxByte) + " " + (byte) (--maxByte));
        System.out.print("Short   : " + maxShort + " ");
        System.out.println((short) (++maxShort) + " " + (short) (--maxShort));
        System.out.print("Integer : " + maxInt + " ");
        System.out.println((int) (++maxInt) + " " + (int) (--maxInt));
        System.out.print("Long    : " + maxLong + " ");
        System.out.println((long) (++maxLong) + " " + (long) (--maxLong));

        System.out.println("\n5.  Перестановка значений переменных\n");
        int a = 2;
        int b = 5;

        int tmp;

        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью побитовой операции ^");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\n6.  Вывод символов и их кодов\n");
        int charCode1 = 35;
        int charCode2 = 38;
        int charCode3 = 64;
        int charCode4 = 94;
        int charCode5 = 95;

        System.out.println(charCode1 + " " + (char) charCode1);
        System.out.println(charCode2 + " " + (char) charCode2);
        System.out.println(charCode3 + " " + (char) charCode3);
        System.out.println(charCode4 + " " + (char) charCode4);
        System.out.println(charCode5 + " " + (char) charCode5);

        System.out.println("\n7.  Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int digitX = srcNum / 100;
        int digitY = (srcNum % 100) / 10;
        int digitZ = srcNum % 10;

        System.out.println("\nЧисло " + srcNum + " содержит");
        System.out.println(digitX + " сотен");
        System.out.println(digitY + " десятков");
        System.out.println(digitZ + " единиц");

        System.out.println("\n8.  Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';

        System.out.println("\n" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underscore + openBracket + space
                + closeBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space
                + space + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n9.  Произведение и сумма цифр числа");
        int sumDigits = 0;
        int prodDigits = 0;

        srcNum = 345;
        digitX = srcNum / 100;
        digitY = (srcNum % 100) / 10;
        digitZ = srcNum % 10;
        
        sumDigits = digitX + digitY + digitZ;
        prodDigits = digitX * digitY * digitZ;

        System.out.println("\nСумма цифр числа " + srcNum + " = " + sumDigits);
        System.out.println("Произведение цифр числа " + srcNum + " = " + prodDigits);

        System.out.println("\n10. Преобразование секунд");
        int seconds = 86399;

        int hh = seconds % 24;
        int mm = (seconds / 24) / 60;
        int ss = (seconds / 24) % 60;;

        System.out.println("\n" + hh + ":" + mm + ":" + ss);
    }
}