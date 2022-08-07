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
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        byte incMaxByte = (byte) (maxByte + 1);
        byte decMaxByte = (byte) (incMaxByte - 1);
        
        short incMaxShort = (short) (maxShort + 1);
        short decMaxShort = (short) (incMaxShort - 1);
        
        int incMaxInt = (int) (maxInt + 1);
        int decMaxInt = (int) (incMaxInt - 1);
        
        long incMaxLong = (long) (maxLong + 1);
        long decMaxLong = (long) (incMaxLong - 1);

        System.out.println("Byte    : " + maxByte + " " + incMaxByte + " " + decMaxByte);
        System.out.println("Short   : " + maxShort + " " + incMaxShort + " " + decMaxShort);
        System.out.println("Integer : " + maxInt + " " + incMaxInt + " " + decMaxInt);
        System.out.println("Long    : " + maxLong + " " + incMaxLong + " " + decMaxLong);

        System.out.println("\n5.  Перестановка значений переменных\n");
        float a = 3.36f;
        float b = 5.71f;

        float tmp;

        System.out.println("С помощью третьей переменной");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью арифметических операций");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        a = ((float) ((long) (a * 10_000) + (long) (b * 10_000))) / 10_000;
        b = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        a = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        System.out.println("Новые значения переменных : \t" + a + " " + b);

        System.out.println("\nС помощью побитовой операции ^");
        System.out.println("Исходные значения переменных : " + a + " " + b);
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        b = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
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
        int srcN = 123;
        int digitX = srcN / 100;
        int digitY = (srcN % 100) / 10;
        int digitZ = (srcN % 100) % 10;

        System.out.println("\nЧисло " + srcN + " содержит");
        System.out.println(digitX + " сотен");
        System.out.println(digitY + " десятков");
        System.out.println(digitZ + " единиц");

        System.out.println("\n8.  Вывод на консоль ASCII-арт Дюка");
        char cSpace = ' ';
        char cDiv = '/';
        char cBackSlash = '\\';
        char cUnderScore = '_';
        char cOpenBracket   = '(';
        char cCloseBracket   = ')';

        System.out.println("\n" + cSpace + cSpace + cSpace + cSpace + cDiv + cBackSlash);
        System.out.println("" + cSpace + cSpace + cSpace + cDiv + cSpace + cSpace + cBackSlash);
        System.out.println("" + cSpace + cSpace + cDiv + cUnderScore + cOpenBracket + cSpace + cCloseBracket + cBackSlash);
        System.out.println("" + cSpace + cDiv + cSpace + cSpace + cSpace + cSpace + cSpace + cSpace + cBackSlash);
        System.out.println("" + cDiv + cUnderScore + cUnderScore + cUnderScore + cUnderScore + cDiv + cBackSlash + cUnderScore + cUnderScore + cBackSlash);

        System.out.println("\n9.  Произведение и сумма цифр числа");
        int N = 345;

        int sumNumbers = 0;
        int productNumbers = 1;

        int tmpN = N;

        sumNumbers = sumNumbers + (tmpN % 10);
        productNumbers = productNumbers * (tmpN % 10);

        tmpN = N / 10;
        sumNumbers = sumNumbers + (tmpN % 10);
        productNumbers = productNumbers * (tmpN % 10);

        tmpN = N / 10;
        sumNumbers = sumNumbers + (tmpN % 10);
        productNumbers = productNumbers * (tmpN % 10);

        System.out.println("\nСумма цифр числа " + N + " = " + sumNumbers);
        System.out.println("Произведение цифр числа " + N + " = " + productNumbers);

        System.out.println("\n10. Преобразование секунд");
        int seconds = 86399;

        int HH = seconds % 24;
        int MM = (seconds / 24) / 60;
        int SS = (seconds / 24) % 60;;

        System.out.println("\n" + HH + ":" + MM + ":" + SS);
    }
}