package kurs1;

import java.util.concurrent.ThreadLocalRandom;

public class k1_2 {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача №1:");
        int p;
        p = 8;
        if (p % 2 == 0 && p != 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        //Задача 2
        System.out.println();
        System.out.println("Задача №2:");
        double pr = 11.1, dr = 4;
        double k = 10;
        if (Math.abs(dr - k) < Math.abs(pr - k)) {
            System.out.println("Число " + dr + " ближе к " + k + " чем число " + pr);
        } else {
            System.out.println("Число " + pr + " ближе к " + k + " чем число " + dr);
        }
        //Задача 3
        System.out.println();
        System.out.println("Задача №3:");
        int Ram = 3 + ThreadLocalRandom.current().nextInt(156);
        if (Ram >= 22 && Ram <= 99){
            System.out.println("Число "+Ram+" попало в интервал");
        } else {
            System.out.println("Число "+Ram+" не попало в интервал");
        }
        //Задача 4
        System.out.println();
        System.out.println("Задача №4:");
        int xxx = 100 + ThreadLocalRandom.current().nextInt(900);
        int x1 = xxx / 100;
        int x2 = xxx / 10 % 10;
        int x3 = xxx % 10;
        if (x1 >= x2 && x1 > x3){
            System.out.println(x1+" наибольшее из членов числа "+xxx);
        } else {
            if (x2 > x3){
                System.out.println(x2+" наибольшее из членов числа "+xxx);
            } else {
                System.out.println(x3+" наибольшее из членов числа "+xxx);
            }
        }
    }
}
