package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {7, 3, 2, 6, 4, 5, 1};
        int len = intArray.length;

        System.out.print("Массив первоначальный :");
        printArray(intArray, 0);
        System.out.print("\nМассив после реверса :");
        for (int i = 0; i <= len / 2; i++) {
            int buffer = intArray[i];
            len--;
            intArray[i] = intArray[len];
            intArray[len] = buffer;
        }
        printArray(intArray, 0);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        len = intArray.length;

        for (int i = 0; i < len; i++) {
            intArray[i] = (int) (Math.random() * 10);
        }

        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= intArray[i];
            System.out.print(intArray[i] + ((i < (len - 2)) ? " * " : " = " + result));
        }

        System.out.print("\nindex[" + 0 + "] = " + intArray[0]);
        System.out.print("\nindex[" + 9 + "] = " + intArray[len - 1]);

        System.out.println("\n\n3. Удаление элементов массива");
        float[] floatArray = new float[15];
        len = floatArray.length;

        for (int i = 0; i < len; i++) {
            floatArray[i] = (float) Math.random();
        }

        System.out.println("Исходный массив :");
        printArray(floatArray);

        float middleNum = floatArray[len / 2];

        int numZeroCells = 0;
        for (int i = 0; i < len; i++) {
            if (floatArray[i] > middleNum) {
                floatArray[i] = 0.0f;
                numZeroCells++;
            }
        }

        System.out.println("\nИзмененный массив :");
        printArray(floatArray);

        System.out.println("\nКоличество обнуленных ячеек : " + numZeroCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char['Z' - 'A' + 1];
        for (int i = 0; i <= 'Z' - 'A'; i++) {
            charArray[i] = (char) ('A' + i);
        }
        len = charArray.length;
        for (int i = 0; i <= len; i++) {
            for (int j = len - 1; j >= len - i; j--) {
                System.out.print(charArray[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];

        len = intArray.length;

        for (int i = 0; i < len; i++) {
            intArray[i] = getIntRnd();
        }

        for (int i = 0; i < len - 1; ) {
            sort(intArray);
            if (intArray[i] == intArray[i + 1]) {
                intArray[i + 1] = getIntRnd();
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println();
        printArray(intArray, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcStrArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] strArray;

        int lenStrArray = 0;

        for (int i = 0; i < srcStrArray.length; i++) {
            if (!isBlank(srcStrArray[i])) {
                lenStrArray += 1;
            }
        }

        strArray = new String[lenStrArray];

        int start = -1;
        int end = -1;
        int destPos = 0;
        for (int i = 0; i < srcStrArray.length; i++) {
            if (!isBlank(srcStrArray[i])) {
                if (start == -1) {
                    start = i;
                    end = -1;
                }
            }

            if (isBlank(srcStrArray[i])) {
                if (end == -1) {
                    end = i;
                }
                if (end > start && start != -1) {
                    System.arraycopy(srcStrArray, start, strArray, destPos, (end - start));
                    destPos += (end - start);
                    start = -1;
                    end = -1;
                }
            }
        }
        printArray(srcStrArray);
        printArray(strArray);
    }

    private static void printArray(int[] intArray, int numCols) {
        for (int i = 0, col = 0; i < intArray.length; i++) {
            System.out.printf("%4d", intArray[i]);
            if (col == numCols - 1) {
                col = 0;
                System.out.println();
            } else {
                col++;
            }
        }
    }

    private static void printArray(float[] floatArray) {
        for (int i = 0, numsCol = 0; i < floatArray.length; i++) {
            System.out.printf("%7.3f", floatArray[i]);
            if (numsCol == 7) {
                numsCol = 0;
                System.out.println();
            } else {
                numsCol++;
            }
        }
    }

    private static int getIntRnd() {
        return (int) (Math.random() * 40) + 60;
    }

    private static void sort(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    intArray[j] ^= intArray[j + 1];
                    intArray[j + 1] = intArray[j] ^ intArray[j + 1];
                    intArray[j] ^= intArray[j + 1];
                }
            }
        }
    }

    private static boolean isBlank(String str) {
        return str.replaceAll(" ", "").equals("");
    }

    private static void printArray(String[] strArray) {
        int len = strArray.length;

        System.out.print("[");

        for (int i = 0; i < len; i++) {
            System.out.print(strArray[i]);
            if (i == len - 1) {
                System.out.println("]");
            } else {
                System.out.print(",");
            }
        }
    }
}