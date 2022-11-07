package eski_java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Hangi saatler arasında çalışmaktasınız");
        System.out.print("Başlangıç saatiniz: ");
        double saat1=scan.nextDouble();
        System.out.print("Bitiş saatiniz: ");
        double saat2=scan.nextDouble();

        System.out.print("saatlik çalışma ücreti giriniz: ");
        double ücret=scan.nextDouble();



        System.out.print("fazla mesai ücreti çarpanı: ");
        double fmüç=scan.nextDouble();

    ücretHesapla(saat1,saat2,ücret,fmüç);



    }// main sonu


public static void ücretHesapla ( double saat1, double saat2,double ücret,double fmüç){
        double calışmasüresi=saat2-saat1;
        double calısmaÜcreti=calışmasüresi*ücret;
        if (calışmasüresi<=8){
            System.out.println("ücretiniz: "+ calısmaÜcreti);


        } else System.out.println("toplam çalışma ücretiniz :" + (8*ücret)+((calışmasüresi-8)*fmüç*ücret));


}

}
