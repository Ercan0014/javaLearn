package sonHalukhoca.j15_Arrays.Array_Ödev;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int sayi[]={14,19,5,21};
        Arrays.sort(sayi);
        System.out.println("min değer: " + sayi[0]);



    }
}

