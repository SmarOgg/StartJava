public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.  Создание переменных и вывод их значений на консоль\n");
        byte    num   = 5;
        short   mod   = 6600;
        int     cores = 4;
        float   fr    = 3.3f;
        long    numR  = 77240;
        double  numP  = 2124709;
        char    c     = 'i';
        boolean supp  = true;

        System.out.println("Core " + c + num + "-" + mod + " " + fr + "Hz / ядер " + cores);
        System.out.println("Номер региона - " + numP + " / Номер производства - " + numP);
        System.out.println("Поддержка : " + supp);

        System.out.println("\n2.  Расчет стоимости товара со скидкой\n");
        int X = 100;
        int Y = 200;
        float discount = 11;

        float sumDiscount = (X + Y) * discount / 100;
        float totalCost = X + Y - sumDiscount;

        System.out.println("Сумма скидки : " + sumDiscount);
        System.out.println("Общая стоимость товаров со скидкой : " + totalCost);

        System.out.println("\n3.  Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.  Отображение min и max значений числовых типов данных\n");
        byte        maxByte =  Byte.MAX_VALUE;
        short       maxShort = Short.MAX_VALUE;
        int         maxInt =   Integer.MAX_VALUE;
        long        maxLong =  Long.MAX_VALUE;

        byte  incMaxByte,  decMaxByte;
        short incMaxShort, decMaxShort;
        int   incMaxInt,   decMaxInt;
        long  incMaxLong,  decMaxLong;

        incMaxByte = (byte) (maxByte + 1);
        decMaxByte = (byte) (incMaxByte - 1);

        incMaxShort = (short) (maxShort + 1);
        decMaxShort = (short) (incMaxShort - 1);

        incMaxInt = (int) (maxInt + 1);
        decMaxInt = (int) (incMaxInt - 1);

        incMaxLong = (long) (maxLong + 1);
        decMaxLong = (long) (incMaxLong - 1);

        System.out.println("Byte    : " + maxByte + " " + incMaxByte + " " + decMaxByte);
        System.out.println("Short   : " + maxShort + " " + incMaxShort + " " + decMaxShort);
        System.out.println("Integer : " + maxInt + " " + incMaxInt + " " + decMaxInt);
        System.out.println("Long    : " + maxLong + " " + incMaxLong + " " + decMaxLong);

        System.out.println("\n5.  Перестановка значений переменных\n");
        float a = 3.36f;
        float b = 5.71f;

        float tmp;

        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения переменных : \t" + a + " " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Исходные значения переменных : \t" + a + " " + b);
        a = ((float) ((long) (a * 10_000) + (long) (b * 10_000))) / 10_000;
        b = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        a = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью побитовой операцией ^");
        System.out.println("Исходные значения переменных : \t" + a + " " + b);
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        b = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\n6.  Вывод символов и их кодов\n");
        int c1 = 35;
        int c2 = 38;
        int c3 = 64;
        int c4 = 94;
        int c5 = 95;

        System.out.println(c1 + " " + (char) c1);
        System.out.println(c2 + " " + (char) c2);
        System.out.println(c3 + " " + (char) c3);
        System.out.println(c4 + " " + (char) c4);
        System.out.println(c5 + " " + (char) c5);

        System.out.println("\n7.  Произведение и сумма цифр числа");
        int N = 345;

        int sumRes  = 0;
        int compRes = 1;

        int tmpN = N;

        sumRes = sumRes + (tmpN % 10);
        compRes = compRes * (tmpN % 10);

        tmpN = N / 10;
        sumRes = sumRes + (tmpN % 10);
        compRes = compRes * (tmpN % 10);

        tmpN = N / 10;
        sumRes = sumRes + (tmpN % 10);
        compRes = compRes * (tmpN % 10);

        System.out.println("\nСумма цифр числа " + N + " = " + sumRes);
        System.out.println("Произведение цифр числа " + N + " = " + compRes);

        System.out.println("\n8.  Вывод на консоль ASCII-арт Дюка");
        char cSpace      = ' ';
        char cDiv        = '/';
        char cEDiv       = '\\';
        char cULine      = '_';
        char cOBracket   = '(';
        char cCBracket   = ')';

        System.out.println("\n" + cSpace + cSpace + cSpace + cSpace + cDiv + cEDiv);
        System.out.println("" + cSpace + cSpace + cSpace + cDiv + cSpace + cSpace + cEDiv);
        System.out.println("" + cSpace + cSpace + cDiv + cULine + cOBracket + cSpace + cCBracket + cEDiv);
        System.out.println("" + cSpace + cDiv + cSpace + cSpace + cSpace + cSpace + cSpace + cSpace + cEDiv);
        System.out.println("" + cDiv + cULine + cULine + cULine + cULine + cDiv + cEDiv + cULine + cULine + cEDiv);

        System.out.println("\n9.  Отображение количества сотен, десятков и единиц числа");
        int srcN = 123;
        int digitX, digitY, digitZ;

        digitX = srcN / 100;
        digitY = (srcN % 100) / 10;
        digitZ = (srcN % 100) % 10;

        System.out.println("\nЧисло " + srcN + " содержит:");
        System.out.println(digitX + " сотен");
        System.out.println(digitY + " десятков");
        System.out.println(digitZ + " единиц");

        System.out.println("\n10. Преобразование секунд");
        int seconds = 86399;

        int HH, MM, SS;

        HH = seconds % 24;
        MM = (seconds / 24) / 60;
        SS = (seconds / 24) % 60;

        System.out.println("\n" + HH + ":" + MM + ":" + SS);
    }
}