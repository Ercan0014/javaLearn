package bizim_Java.j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt() methodu paramter int olarak girilen index değerini return eder
        index değeri 0 dan başlar
         */
      //  String sehir = " Istanbul"; // bir boşluk olursa o da karakter sayılır n hargini yazdırı.
       // char besinciİndexKrkt = sehir.charAt(5);
       // System.out.println(besinciİndexKrkt); //b
        // son index karakteri --- length()-1

      //  System.out.println();
        //sehir.charAt(sehir.length() - 1);
        //ilk index karakter ---charAt(0);
       // System.out.println(sehir.charAt(0)); // 0 index ilk harfini verir.
        // karakter '' tek tırnak, string "" çift tırnakla gösterilir.

     //   System.out.println()
        //   sehir.charAt(18); // rte verir. index boyutunu gecmiştir.
        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...
        /*Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");*/
/*
        Scanner sc= new Scanner(System.in);
        System.out.println("bir şehir ismi yazınız");
        String okul= sc.nextLine();

        if(okul.length()%2 !=0){
            System.out.println(okul.charAt((okul.length()-1)/2
            ));
        } else System.out.println("girilen  orta karakteri yoktur.");

*/
/*


        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim= scan.nextLine();
/*
        if (isim.length()%2 !=0){
            System.out.println(isim.charAt((isim.length() - 1) / 2));
        } else System.out.println("girilen ismin orta harfi yoktur");

        */

String isim= "istanbul";
        System.out.println(isim.endsWith("n"));
        System.out.println(isim.endsWith("bul"));
        System.out.println(isim.endsWith("l"));
        System.out.println(isim.endsWith("anbul"));

        System.out.println(isim.startsWith("is"));
        System.out.println(isim.startsWith("zo"));
        System.out.println(isim.startsWith("ist"));
    }
}

