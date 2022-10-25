package homework;

import java.util.Scanner;

public class Calışma_Sayfasi {
    public static void main(String[] args) {
  /*
        ÇALIŞMA TASK
		Bir öğrenciden ders geçme notu 60 puan olan bir sistemde; vize, final ve proje notlarını
		isteyerek ders geçme notunu hesaplayan bir code print edeniz.

		 (Sınavların ortalamaya % etkileri)
		 vize: 30% ,final : 50%, proje : 20% )


		 */

        Scanner sc=new Scanner(System.in);

        System.out.println("Ara Sınav Notu Giriniz: ");
        double araSınav = sc.nextDouble();

        System.out.println("Final Sınav Notu Giriniz: ");
        double finalSınav=sc.nextDouble();

        System.out.println("Proje Notu Giriniz: ");
        double proje=sc.nextDouble();

        double a =(araSınav*30/100); //vize puanının yüzde %30 unu alıyoruz.
        double f= (finalSınav*50/100); // final puanının % %50 sini alıyoruz
        double p= (proje*20/100); // proje puanının %20 sini alıyoruz
        double gecmeNotu=(a+f+p);
        System.out.println("Ders ortalamanız :" + (gecmeNotu));

        //Ternary Çözümü 1. yol -(yaptığımız işlem sonucunda ternary aynı data type sonuc verirse sonuc; bir variableye atanabilir.)
        // işlemin neticesini  String "sonuc" variablesine atadık ve yazdırdık.

       // String sonuc=gecmeNotu>=60? "tebrikler bu dersten başarılı oldunuz." : "Malesef bu dersten kaldınız";
      //  System.out.println(sonuc);

        // Ternary Çözümü 2. yol (farlı data tipleri ternary da kullanılcak ise sout içine yazdırılmalıdır, atama yapılamaz.

        // ÖRNEK:  (System.out.println(agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir")
        //  System.out.println(gecmeNotu>=60? "tebrikler bu dersten başarılı oldunuz." : "Malesef bu dersten kaldınız");


       if (gecmeNotu>=60){

          System.out.println("tebrikler bu dersten başarılı oldunuz :-)");
      }else System.out.println("Malesef bu dersten kaldınız :-( Bütünleme sınavında görüşmek üzere Şimdiden Başarılar dileriz. ");

    }

}






