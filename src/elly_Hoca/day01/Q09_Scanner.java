
package elly_Hoca.day01;
        import java.util.Scanner;
public class Q09_Scanner {
    public static void main (String[]args){
    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
    //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
    //  Isim – soyisim : Elly Dainty
    //  Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        //   System.out.println("cemberin yaricapini girinz : ");
        //   double yaricap = scan.nextDouble();
//
        //   System.out.println("yaricap = " + yaricap);
        //   System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
        //   System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);
        // System.out.println("lutfen isminizi giriniz : ");
        // String isim = scan.nextLine();
        // System.out.println("lutfen soyisminizi giriniz :");
        // String soyIsim = scan.nextLine();
        // System.out.println("isim -soyisim  :" + isim + " " +soyIsim );
        System.out.println("lutfen isminizi giriniz :");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf);

         // *Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz

         // *Ex:
         // *input:
      //  12345 * output :12
        //        */



            System.out.println("5 basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int ilkIki =sayi/1000; //12
        int sonIki = sayi%100; //45
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));
    }
}