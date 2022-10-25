package ellyhocanınDosya.day08;

import java.util.Scanner;

public class elly03 {
    public static void main(String[] args) {

/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        //Q03_WhileLoop

    Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=sc.nextInt();
        int count=0; // sayaç, adet döngü dışına yazılır
  while(sayı>0){
      if (sayı%2==1){
          System.out.print(sayı);
          count++;
      }
      sayı--;
   }
        System.out.println();
        System.out.println("count=" + count);
}
}
