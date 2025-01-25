package kurs1;

public class k1_4 {
    public static void main(String[] args) {
        int value = 1005 , number = 4 , count = 5 ;
        while (count > 0) {
            if (value % number == 0) {
                System.out.println(value) ;
                count -- ;
            }
            value ++ ;
        }
    }
}
