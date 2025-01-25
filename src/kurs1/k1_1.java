package kurs1;

public class k1_1 {
    public static void main(String[] args) {
        // 1.2 Переменные
        // Задание 1
        System.out.println("Задание 1:");
        int a = 47, b = 13;
        int c = a / b, d = a % b;
        System.out.println("Выходит " + c + " и " + d + " в остатке");

        // Задание 2
        System.out.println();
        System.out.println("Задание 2:");
        byte x = 99;
        int A;
        int X = x / 10, Y = x % 10;
        A = X + Y;
        System.out.println("Сумма чисел двузначного числа " + x + " равна " + A);

        // Задание 3
        System.out.println();
        System.out.println("Задание 3:");
        int three = 888;
        int first, second, third;
        first = three / 100;
        second = three % 100 / 10;
        third = three % 100 % 10;
        System.out.println("Сумма чисел трехзначного числа " + three +
                " равна " + (first + second + third));

        // Задание 4
        System.out.println();
        System.out.println("Задание 4:");
        int romashka = 4899, map = 157;
        int sale = (romashka + map) / 100 * 90;
        int discont = romashka + map - sale;
        System.out.println("Сумма двух покупок с учетом скидки " + sale +
                " рублей.\n Сумма скидки двух покупок " + discont + " рублей.");

        // Задание 5
        System.out.println();
        System.out.println("Задание 5:");
        int orange = 73, banan = 95;
        int discount = 15;
        double sales = orange * (discount / 100f) * 10 + banan * 2;
        int champ = 2870, bread = 27;
        int discount2 = 50;
        double sales2 = champ * (discount2 / 100f) * 7 + bread;
        int grib = 436, wightGrib = 578;
        int discount3 = 5;
        double sales3 = wightGrib * (discount3 / 100f) * 3.75 + grib * 2.5;
        System.out.println("Сумма покупки апельсинов и бананов " + sales + " рублей");
        System.out.println("Сумма покупки шампанского и хлеба " + sales2 + " рублей");
        System.out.println("Сумма покупки шампиньонов и белых грибов " + sales3 + " рублей");

        // Задание 6
        System.out.println();
        System.out.println("Задание 6:");
        double xxx = 0.40, yyy = 0.87;
        System.out.println("вычисление 1: " + (11 * xxx + Y));
        System.out.println("вычисление 2: " + ((xxx + 10 * yyy) - 15 * (xxx / yyy)));
    }
}