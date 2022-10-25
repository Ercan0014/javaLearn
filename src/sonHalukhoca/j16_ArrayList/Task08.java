package sonHalukhoca.j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

//Task-> Girilen sayıların içinde ortlamadan buyuk olanları print eden METHOD creta ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç adet sayı girmek istersiniz: ");
        int sayıAdedi=sc.nextInt();
        int toplam = 0;
        int sayac = 0;

        ArrayList<Integer> sayıList = new ArrayList<Integer>(sayıAdedi);
        for (int i = 0; i <sayıAdedi ; i++) {
            System.out.println(i+ ". sayıyı giriniz;");
            int sayı=sc.nextInt();
            toplam+=sayı;

        }

double ortalama=toplam/sayıAdedi;
        System.out.println("ortalama: " + ortalama);

        System.out.println("ortalamadan büyük olan sayılar: ");
        for (int i = 0; i <sayıAdedi ; i++) {
            if(sayıList.get(i)>ortalama){
                sayac++;


            }

        }            System.out.println(sayac);




    }
}
