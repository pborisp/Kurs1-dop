package kurs1;

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
        double pr = 11.1, dr = 9.99;
        double k = 10;
        double pp, dd;
        pp = pr - k;
        dd = dr - k;
        if (pp < 0) {
            pp *= -1;
        }
        if (dd < 0) {
            dd *= -1;
        }
        if (pp > dd) {
            System.out.println("Число " + dr + " ближе к " + k + " чем число " + pr);
        } else {
            System.out.println("Число " + pr + " ближе к " + k + " чем число " + dr);
        }
    }
}
