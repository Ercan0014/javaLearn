package sonHalukhoca.j16_ArrayList.ArrayList_Ödev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static <Arraylist> void main(String[] args) {

        ArrayList<Integer> listNums = new ArrayList<>(List.of(1,2,3,4,5));

        getSum(listNums);
        System.out.println("verilen Arraydaki sayıların toplamı: "+getSum(listNums));

    }

    private static int getSum(ArrayList<Integer> listNums) {
        int toplam=0;
        for(Integer i:listNums){
            toplam+=i;
        }
        return toplam;
    }
}