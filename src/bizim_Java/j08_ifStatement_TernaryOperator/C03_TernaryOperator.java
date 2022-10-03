package bizim_Java.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {


/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.


        Scanner scan= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz:");
        int  sayı=scan.nextInt();
       // System.out.println("*** if-else ******");

     // if (sayı%2==0) {
     //     System.out.println("çift sayı");

     // } else System.out.println("tek sayı");


     // System.out.println("****  ternary ******");

     // String sonuc = sayı % 2 == 0 ? "çift sayı" : "tek sayı";
     // System.out.println("sonuc = " + sonuc);

        // ternary operator işlem sonucunda ture ve false göre
        //bir çıktı verir. eğer bu çıktı type göre bir veriableye atanmazsa
        //sout ile doğrudan print edilmeli.

        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.= sayı>0 ? "sayı negatif":"sayı pazitif";


        String sonuc= sayı>0 ? "sayı pozitif":"sayı negatif";
        System.out.println("sonuc = " + sonuc);

    }
}
