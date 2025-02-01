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
    }
}
