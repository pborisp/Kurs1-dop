package kurs1;

public class k1_6 {
    public static void main(String[] args) {
        // 1.6 Массивы
        // Задание 1
        System.out.println("Задание 1:");
        int size = 12;
        int start = -16;
        int end = 16;
        int i, max, iMax;
        int[] nums = new int[size];
        for (i = 0; i < size; i++) {
            double x = Math.random() * (end - start) - end;
            nums[i] = (int) x;
            System.out.print(" " + nums[i] + " ");
        }
        max = nums[0];
        iMax = 0;
        for (i = 1; i < size; i++) {
            if (nums[i] > max) {
                max = nums[i];
                iMax = i;
            }
        }
        System.out.println();
        System.out.println("Элекмент масиива с индексом " + iMax + " является самым большим в массиве. Его размер: " + max);
        System.out.println();

        // Задание 2
        System.out.println("Задание 2:");
        size = 11;
        double[] numsDouble = new double[size];
        for (i = 0; i < size; i++) {
            double x = Math.random();
            numsDouble[i] = Math.ceil(x * 100) / 100;
            System.out.print(" " + numsDouble[i] + " ");
        }
        System.out.println();
        int countX = 1; // максимальное значение счетчика
        double number; // значение одинаковых чисел
        int numberCount = 0; // счетчик одинаковых чисел
        double numberX = 0; // значение числа, повторяющегося чаще всех
        double numberY = 0; // значение числа, с одинаковым кол-вом повторений
        int y, z; // индексы
        for (y = 0; y < size; y++) {
            numberCount = 0;
            for (z = 0; z < size; z++) {
                if (numsDouble[z] == numsDouble[y]) {
                    numberCount++;
                }
            }
            if (numberCount > countX) {
                countX = numberCount;
                numberX = numsDouble[y];
            } else if (numberCount == countX && numberX != numsDouble[y] && numberCount > 1) {
                numberY = numsDouble[y];
            }
        }
        if (numberY != 0 && numberY != numberX) {
            System.out.println("-1");
        } else if (numberX != 0) {
            System.out.println("Элемент: " + numberX + " встречается чаще всего: " + countX + " раз");
        } else {
            System.out.println("Повторяющихся элементов нет");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3:");
        int masX = 5;
        int masY = 8;
        start = 10;
        end = 99;
        int[][] masX2 = new int[masX][masY];
        for (i = 0; i < masY; i++) {
            for (int j = 0; j < masX; j++) {
                double x = Math.random() * (end - start) + start;
                masX2[j][i] = (int) x;
                System.out.print(" " + masX2[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4:");
        int maximum = -99;
        start = -99;
        end = 99;
        int[][] masXX = new int[masX][masY];
        for (i = 0; i < masY; i++) {
            for (int j = 0; j < masX; j++) {
                double x = Math.random() * (end - start) + start;
                masXX[j][i] = (int) x;
                System.out.print(" " + masXX[j][i] + " ");
                maximum = Math.max(maximum, masXX[j][i]);
            }
            System.out.println();
        }
        System.out.println("Максимальный элемент массива равен: " + maximum);
        System.out.println();

        // Задание 6
        System.out.println("Задание 6:");
        int max2 = 0;
        start = 0;
        end = 9;
        masX = 6;
        masY = 7;
        maximum = 0;
        int j;
        int timeX;
        int[][] mas3x = new int[masX][masY];
        for (i = 0; i < masY; i++) {
            for (j = 0; j < masX; j++) {
                double x = Math.random() * (end - start) + start;
                mas3x[j][i] = (int) x;
                System.out.print(" " + mas3x[j][i] + " ");
                maximum = Math.max(maximum, mas3x[j][i]);
            }
            if (mas3x[0][i] != maximum) {
                timeX = mas3x[0][i];
                mas3x[0][i] = maximum;
                maximum = timeX;
            }
            for (j = 1; j < masX; j++) {
                if (mas3x[j][i] == mas3x[0][i]) {
                    mas3x[j][i] = maximum;
                }
            }
            System.out.println();
            maximum = 0;
        }
        System.out.println();
        for (i = 0; i < masY; i++) {
            for (j = 0; j < masX; j++) {
                System.out.print(" " + mas3x[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
