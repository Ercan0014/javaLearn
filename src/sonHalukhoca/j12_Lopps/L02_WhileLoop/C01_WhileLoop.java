package sonHalukhoca.j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

     /*
     başlangıç ve bitiş değerleri net(bilinen değreler) olan tekrarlarda foor loop
     ama; adım sayısı belli olmayıp bir şarta (duruma bağlı)
     olan tekrarlarda while  loop kullanılmalı
      */
/// task01-- 11 den 20 ye kadar olan tam sayıları print eden code create ediniz.
        System.out.println("  ***** for çözüm *****   ");
for (int i=11 ; i<21 ; i++){
    System.out.print(i+ " ");
}
        System.out.print( "   *****   while çözüm  *****  ");

int basla= 11;

while (basla<21){ // basla 21 den küçük olduğu sürece bady aksiyonun yap.
    System.out.print((basla + " "));
basla ++;
}
//task2- 7 kere javaCan print eden code create ediniz.

        int basla2=1;
while (basla2<8){
    System.out.println(basla2+". JavaCAN");
basla2++; // döngü değişimi
}

//Task3-- 2 basamamaklı tek sayıları yan yana print eden code yazınız.
        int a=11;
while (a<100){
    System.out.print(a+" ");
a+=2;
}
// if(a%2==1) sout (b + " ")

     //TASK4 - GİRİLEN METNİ WHİLE LOOP İLE TERSDEN PRİNT EDEN BİR CODE CREATE EDİNİZ.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String cümle=scan.nextLine();
        int metinUzunluk=cümle.length();

        while (metinUzunluk>=1){ // temnin son karakteri 0 eşit ve büyük iken
            System.out.print(cümle.charAt(metinUzunluk-1));
            metinUzunluk--;

        }

// task5-- GİRİLEN TAM SAYIYA KADAR TAMSAYILARIN TOPLAMINI İÇEREN BİR CODE CREATE EDİNİZ


        System.out.println("bir tamsayı giriniz: ");
        int sayı=scan.nextInt();
        int toplam=0;

          while(sayı>0){ //sayı 1 olana denk
           toplam+=sayı; //her döngüde sayısı topla
           sayı--;// her döngüye girdiğinde 1 azalt

       }

//TASK6 girilen tam sayının faktöriyelini print eden bir code create ediniz.


int faktoriyel=1;
        while (sayı > 0) { // sayı 1 olana dek body ne varsa çarp
            faktoriyel *= sayı;// her dönügüde sayıyı toplama ekle
            sayı--; //her döngüde sayıyı bir azalt
        }




    }//main sonu
}
