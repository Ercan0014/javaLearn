package sonHalukhoca.j12_Lopps.WhileLoopÖdev;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner sc= new Scanner(System.in);
        int toplam=0;
        int adet=0;

        while (toplam <=333) {
            System.out.println("sayı gir: ");
            int sayi= sc.nextInt();
            toplam+=sayi;
            adet++;
            System.out.println( "tekrar dene bakalım ");
        }
        System.out.println("Sınırı geçtin :( " + "girdiğin sayı adeti: "+ adet+ " ve toplamı : " + toplam);



    }//main sonu
}
