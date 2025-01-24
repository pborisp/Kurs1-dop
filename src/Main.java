public class Main {
    public static void main(String[] args) {
        // 1.2 Переменные
        // Задание 1
        System.out.println("Задание 1:");
        int a=47, b=13;
        int c=a/b, d=a%b;
        System.out.println("Выходит "+c+" и "+d+" в остатке");

        // Задание 2
        System.out.println();
        System.out.println("Задание 2:");
        byte x=99;
        int A;
        int X=x/10, Y=x%10;
        A=X+Y;
        System.out.println("Сумма чисел двузначного числа "+x+" равна "+A);

        // Задание 3
        System.out.println();
        System.out.println("Задание 3:");
        int three=888;
        int Res;
        int first, second, third;
        first=three/100;
        second=three%100/10;
        third=three%100%10;
        System.out.println("Сумма чисел трехзначного числа "+three+
                " равна "+(first+second+third));

    }
}