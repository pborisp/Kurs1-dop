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

    }
}
