package sonHalukhoca.j16_ArrayList.ArrayList_Ödev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */


    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(11, 8, 5, 7, 6, 5, 3, 2, 8));
        System.out.println(hillNum(sayilar));

    }

    public static List<Integer> hillNum(List<Integer> sayilar) { // şartı sağlayan birden fazla sayı olabileceği için return type list seçildi
        List<Integer> istenenSayi = new ArrayList<>();
        for (int i = 0; i < sayilar.size() - 2; i++) {
            if (sayilar.get(i + 1) < sayilar.get(i) && sayilar.get(i + 1) > sayilar.get(i + 2)) {
                istenenSayi.add(sayilar.get(i + 1));

            }

        }
        return istenenSayi;
    }
}