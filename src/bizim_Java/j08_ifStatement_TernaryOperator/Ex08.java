package bizim_Java.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
/*
        Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdiri
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=sc.nextInt();
        if(sayı>0){
            if(sayı>10){

                System.out.println("Büyüksün");
            }else System.out.println("Normalsin");

        }else if (sayı <0) {
            if(sayı >-10){
                System.out.println("Negatifsin");
            }else System.out.println("Cok Negatifsin");

        } else System.out.println("başka bir sayı giriniz.");




    }
}
