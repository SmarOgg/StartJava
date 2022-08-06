public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.  �������� ���������� � ����� �� �������� �� �������\n");
        byte    num   = 5;
        short   mod   = 6600;
        int     cores = 4;
        float   fr    = 3.3f;
        long    numR  = 77240;
        double  numP  = 2124709;
        char    c     = 'i';
        boolean supp  = true;

        System.out.println("Core " + c + num + "-" + mod + " " + fr + "Hz / ���� " + cores);
        System.out.println("����� ������� - " + numP + " / ����� ������������ - " + numP);
        System.out.println("��������� : " + supp);

        System.out.println("\n2.  ������ ��������� ������ �� �������\n");
        int X = 100;
        int Y = 200;
        float discount = 11;

        float sumDiscount = (X + Y) * discount / 100;
        float totalCost = X + Y - sumDiscount;

        System.out.println("����� ������ : " + sumDiscount);
        System.out.println("����� ��������� ������� �� ������� : " + totalCost);

        System.out.println("\n3.  ����� �� ������� ����� JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.  ����������� min � max �������� �������� ����� ������\n");
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

        System.out.println("\n5.  ������������ �������� ����������\n");
        float a = 3.36f;
        float b = 5.71f;

        float tmp;

        System.out.println("� ������� ������� ����������");
        System.out.println("�������� �������� ���������� : \t" + a + " " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("����� �������� ���������� : \t" + a + " " + b);

        System.out.println("\n� ������� �������������� ��������");
        System.out.println("�������� �������� ���������� : \t" + a + " " + b);
        a = ((float) ((long) (a * 10_000) + (long) (b * 10_000))) / 10_000;
        b = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        a = ((float) ((long) (a * 10_000) - (long) (b * 10_000))) / 10_000;
        System.out.println("����� �������� ���������� : \t" + a + " " + b);

        System.out.println("\n� ������� ��������� ��������� ^");
        System.out.println("�������� �������� ���������� : \t" + a + " " + b);
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        b = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        a = Float.intBitsToFloat(Float.floatToIntBits(a) ^ Float.floatToIntBits(b));
        System.out.println("����� �������� ���������� : \t" + a + " " + b);

        System.out.println("\n6.  ����� �������� � �� �����\n");
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

        System.out.println("\n7.  ������������ � ����� ���� �����");
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

        System.out.println("\n����� ���� ����� " + N + " = " + sumRes);
        System.out.println("������������ ���� ����� " + N + " = " + compRes);

        System.out.println("\n8.  ����� �� ������� ASCII-��� ����");
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

        System.out.println("\n9.  ����������� ���������� �����, �������� � ������ �����");
        int srcN = 123;
        int digitX, digitY, digitZ;

        digitX = srcN / 100;
        digitY = (srcN % 100) / 10;
        digitZ = (srcN % 100) % 10;

        System.out.println("\n����� " + srcN + " ��������:");
        System.out.println(digitX + " �����");
        System.out.println(digitY + " ��������");
        System.out.println(digitZ + " ������");

        System.out.println("\n10. �������������� ������");
        int seconds = 86399;

        int HH, MM, SS;

        HH = seconds % 24;
        MM = (seconds / 24) / 60;
        SS = (seconds / 24) % 60;

        System.out.println("\n" + HH + ":" + MM + ":" + SS);
    }
}