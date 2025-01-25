package kurs1;

public class k1_4 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача №1:");
        int value = 1005, number = 4, count = 5;
        while (count > 0) {
            if (value % number == 0) {
                System.out.println(value);
                count--;
            }
            value++;
        }

        // Задача 2
        System.out.println();
        System.out.println("Задача №2:");
        int count2 = 10, firstNumber = 1;
        int n = 2;
        for (int N = 0; N < count2; N++) {
            System.out.print(firstNumber + "  ");
            firstNumber += n;
        }
        System.out.println();

        // Задача 3
        System.out.println();
        System.out.println("Задача №3:");
        int count3 = 5, num = 90;
        while (num >= 0) {
            System.out.print(num + "  ");
            num -=count3;
        }
        System.out.println();
    }
}
