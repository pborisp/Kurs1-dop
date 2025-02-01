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
            num -= count3;
        }
        System.out.println();

        // Задача 4
        System.out.println();
        System.out.println("Задача №4:");
        int count4 = 10, f = 2, num4 = 2;
        for (int ii = 0; ii < count4; ii++) {
            System.out.print(num4 + "  ");
            num4 *= f;
        }
        System.out.println();

        // Задача 5!!!!!
        System.out.println();
        System.out.println("Задача №5:");
        int month135781012 = 31, month46911 = 30, month2 = 28;
        int year = 12, YYY = 1;
        int week = 7, day = 1;
        boolean ln = false, nw = false;
        while (YYY <= year) {
            if (YYY == 1 || YYY == 3 || YYY == 5 || YYY == 7 || YYY == 8 || YYY == 10 || YYY == 12) {
                System.out.println();
                if (YYY == 1) {
                    day = 1;
                } else if (YYY == 3) {
                    day = day - month2;
                } else {
                    if (day - month135781012 == 0) {
                        day = 1;
                    } else {
                        if (nw == true) {
                            day = 0;
                            nw = false;
                        } else {
                            if (YYY == 8) {
                                day = day - month135781012;
                            } else {
                                day = day - month46911;
                            }
                        }
                    }
                }
                while (day <= month135781012) {
                    if (ln == true) {
                        System.out.println("     " + (day + 1) + "." + YYY);
                        ln = false;

                    } else {
                        if (day == month135781012) {
                            System.out.println(day + "." + YYY);
                            ln = true;
                            nw = true;
                        } else {
                            System.out.println(day + "." + YYY + " " + (day + 1) + "." + YYY);
                            ln = false;
                        }
                    }
                    day += week;
                }

            }


            if (YYY == 4 || YYY == 6 || YYY == 9 || YYY == 11) {

                System.out.println();
                day = day - month135781012;
                while (day <= month46911) {
                    if (ln == true) {
                        System.out.println("     " + day + "." + YYY);

                    }
                    if (day == month46911) {
                        System.out.println(day + "." + YYY);
                        ln = true;
                        nw = true;
                    } else {
                        System.out.println(day + "." + YYY + " " + (day + 1) + "." + YYY);
                        ln = false;
                    }
                    day += week;
                }
            }

            if (YYY == 2) {

                System.out.println();
                day = day - month135781012;
                while (day <= month2) {
                    if (ln == true) {
                        System.out.println("     " + day + "." + YYY);

                    }
                    if (day == month2) {
                        System.out.println(day + "." + YYY);
                        ln = true;
                    } else {
                        System.out.println(day + "." + YYY + " " + (day + 1) + "." + YYY);
                        ln = false;
                    }
                    day += week;
                }
            }

            YYY += 1;
        }
        System.out.println();

        // Задача 5!!!!!
        System.out.println();
        System.out.println("Задача №6:");
        int ticket = 999999;
        int lack = 0;
        int left;
        int right;
        int x1, x2;
        int i;
        for (i = 0; i <= ticket; i++) {
            if (i>999) {
                left = i / 1000;
                right = i % 1000;
                x1 = left / 100 + left / 10 % 10 + left % 10;
                x2 = right /100 + right / 10 % 10 + right % 10;
                if (x1 == x2) {
                    lack++;
                }
            }
        }
        System.out.println("Количество счастливых билетов в рулоне: " + lack + " шт");
    }
}

