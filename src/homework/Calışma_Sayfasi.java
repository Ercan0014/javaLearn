package homework;

import java.util.Scanner;

public class Calışma_Sayfasi {
    public static void main(String[] args) {

        //    Scanner scan=new Scanner(System.in);
        //    System.out.print("1. notunuzu giriniz:");
        //    double not1=scan.nextDouble();
        //    System.out.print("2. notunuzu giriniz:");
        //    double not2=scan.nextDouble();
        //    System.out.print("3. notunuzu giriniz:");
        //    double not3=scan.nextDouble();

        //    System.out.println(ortalamaHesapla(45, 56, 78));
        //    System.out.println(ortalamaHesapla(not1, not2, not3));


        //} //main sonu

        //public static double ortalamaHesapla(double not1, double not2, double not3) {

        //    return (not1 + not2 + not3) / 3;

        int sayı = 60;
        String isim1 = "";
/*
        if (sayı < 50) {
            if(sayı>30 && sayı<40){
                System.out.println("ayşe");
            }else System.out.println("emine");
}else System.out.println("fatma");
*/

    String isim= sayı<50 ? (sayı>30 && sayı<40?"ayşe":"emine"):"fatma";
        System.out.println(isim);









        }




}

