package sonHalukhoca.j15_Arrays.task_Array_ödev;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
// array copy... copyOf(arr, newLength); -- girilen arry in newLengt kadar elamanını kopyalar
        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi,5); // [63,21,47,27,35]


        System.out.println("sayıdan 5 elaman kopyalanan yeni arr" + Arrays.toString(yeniArr));

    int baskaArr[]= Arrays.copyOfRange(sayi, 3,8); // 3 dahil 8 hariç elamanlar kopyalanır
        System.out.println("sayı arr den özel kopyalanan başka arr" + Arrays.toString(baskaArr));

   //Array'ı belirli bir elaman ile update (set) etme.. fill(arr, value);
    Arrays.fill(sayi, 99); // 
        System.out.println("sayı arr'den 99 ile full'lenmiş hali" + Arrays.toString(sayi));

    Arrays.fill(sayi,3,7,33); //3,4,5,6 index elamanları 33 fulle
        System.out.println("sayı arr'den 3 ile 7 index  full'lenmiş hali" + Arrays.toString(sayi));
    }
}
