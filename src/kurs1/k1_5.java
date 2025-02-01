package kurs1;

public class k1_5 {
    public static void main(String[] args) {
        // 1.5 Массивы
        // Задание 1
        System.out.println("Задание 1:");
        int size = 15;
        int[] nums = new int[size];
        int i;
        int allSize = 100;
        int chat = 0;
        for (i = 0; i < size; i++) {
            double Rand = Math.random() * allSize;
            nums[i] = (int) Rand;
            if (nums[i] > 1) {
                if ((nums[i] % 2) == 0) {
                    chat++;
                }
            }
            System.out.print(" " + nums[i] + " ");
        }
        System.out.println();
        System.out.println("Кол-во четных числе в массиве: " + chat + " шт");
        System.out.println();

        // Задание 2
        System.out.println("Задание 2:");
        size = 8;
        int sizeNumber = 10;
        int[] nums2 = new int[size];
        for (i = 0; i < size; i++) {
            double number = Math.random() * sizeNumber + 1;
            nums2[i] = (int) number;
            System.out.print(" " + nums2[i] + " ");
        }
        System.out.println();
        for (i = 0; i < size; i++) {
            if ((nums2[i] % 2) != 0) {
                nums2[i] = 0;
            }
            System.out.print(" " + nums2[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 3
        System.out.println("Задание 3:");
        size = 5;
        int max = 5;
        int summa1 = 0, summa2 = 0;
        int[] mass1 = new int[size];
        int[] mass2 = new int[size];
        for (i = 0; i < size; i++) {
            double random1 = Math.random() * max + 1;
            double random2 = Math.random() * max + 1;
            mass1[i] = (int) random1;
            mass2[i] = (int) random2;
            System.out.print(" " + mass1[i] + " ");
        }
        System.out.println();
        for (i = 0; i < size; i++) {
            System.out.print(" " + mass2[i] + " ");
            summa1 += mass1[i];
            summa2 += mass2[i];
        }
        System.out.println();
        double sA1 = (double) summa1 / size;
        double sA2 = (double) summa2 / size;
        System.out.println("Средние арифметические массивов: " + sA1 + " и " + sA2);
        if (sA1 > sA2) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (sA1 != sA2) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Средние арифметические первого и второго массивов равны");
        }
    }
}
