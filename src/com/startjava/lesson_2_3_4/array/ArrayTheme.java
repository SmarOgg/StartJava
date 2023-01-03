package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int len = intArray.length;

        System.out.print("Массив первоначальный :");
        printArray(intArray, 0);
        System.out.print("\nМассив после реверса :");
        for (int i = 0; i < len / 2; i++) {
            int index = len - 1 - i;
            intArray[i] ^= intArray[index];
            intArray[index] = intArray[i] ^ intArray[index];
            intArray[i] ^= intArray[index];
        }
        printArray(intArray, 0);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        len = intArray.length;

        int result = 1;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
            result *= (i == 0 || i == 9) ? 1 : intArray[i];
            System.out.print((i == 0 || i == 9) ?
                    "index[" + i + "] = " + intArray[i] + " " : "");
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print((i == 0 || i == 9) ?
                    "" : intArray[i] + ((i >= 1 && i < 8) ? " * " : " = " + result));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        float[] srcFloatArray = new float[15];
        len = srcFloatArray.length;

        for (int i = 0; i < len; srcFloatArray[i++] = (float) Math.random() * 100) ;

        int midIndex = len / 2;
        float[] newFloatArray = new float[len];

        for (int i = 0; i < len; i++) {
            newFloatArray[i] = (srcFloatArray[i] > srcFloatArray[midIndex]) ?
                    0.0f : srcFloatArray[i];
        }
        System.out.println("Исходный массив :");
        printArray(srcFloatArray);

        System.out.println("\nИзмененный массив :");
        printArray(newFloatArray);

        int numZeroCeils = 0;
        for (int i = 0; i < len; i++) {
            if (newFloatArray[i] == 0.0f) {
                numZeroCeils++;
            }
        }
        System.out.println("\nКоличество обнуленных ячеек : " + numZeroCeils);

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
            if (numsCol == 8) {
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