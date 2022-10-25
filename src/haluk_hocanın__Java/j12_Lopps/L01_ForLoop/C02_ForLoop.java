package haluk_hocanın__Java.j12_Lopps.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

   // girilen sayıdan 100 e kadar 4 un katı tamsayıları print eden bbir code create ediniz

  Scanner scan = new Scanner(System.in);
  System.out.println("bir pozitif tam sayı giriniz. ");
   int sayı=scan.nextInt();

   if(sayı>100){
       System.out.println("sayı 100 den küçük giriniz!!!");

   }else{
       for(int i= sayı;  i < 100 ; i++){ // 100 değeri foru çalıştırmaz 98 foru çalıştırır ama for içindeki if çalışmaz
           if (i%4==0){
               System.out.println(i+" ");
           }
       }
   }






    }
}
