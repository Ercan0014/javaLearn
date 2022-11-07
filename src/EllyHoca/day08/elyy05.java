package ellyhocanınDosya.day08;

import java.util.Scanner;

public class elyy05 {
    //Q05_ForLoop
    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



       int toplam=0;
       int sayac=0;

       for (int i = 0; i <100; i++){
           System.out.print("sayı giriniz; ");
           sayac++;
           int sayı=scanner.nextInt();
           toplam+=sayı;
           if(toplam>100){
               System.out.println(sayac+"kere sayı girdin, artık yeter");
           break;
           }
           System.out.println("toplam " + toplam);
       }








    }
}

