package eski_java.j12_Lopps.Task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


    /*
    Interview Question

      Girilen  100’den kucuk bir tamsayi için
      1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
     - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
     - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
     - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

*/

Scanner scan = new Scanner(System.in);
        System.out.println("100 den küçük bir tam sayı sayı giriniz: ");
        int sayı=scan.nextInt(); ///63>- 1,2,3,,,,,63

if (sayı>=100){ // girilen sayının 100 den küçük olma şartı
    System.out.println("100 den küçük bir sayı giriniz");
}else
    for (int i = 1; i < sayı; i++){
        if(i%3==00 && i%5==0){ // 3 ve 5 e bölünme kontrolü
            System.out.println("javaCAN");
        } else if (i%3==0){ // 3 e bölünme kontrolu
            System.out.println("java");
        }else if (i%5==0){ // 5 bölünme kontrolü
            System.out.println("CAN'dır");
        }else System.out.println(i+ " hiçbir şartı sağlamayan sayılar");
    }












    }
}
