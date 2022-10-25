package sonHalukhoca.j15_Arrays.Array_Ödev;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

int sayı[]={25,30,30,35,100};
int toplam=0;

        for (int i = 0; i < sayı.length; i++) {
            toplam+=sayı[i];

        }

        System.out.println("sayıların toplamı: " + toplam);

    }
}