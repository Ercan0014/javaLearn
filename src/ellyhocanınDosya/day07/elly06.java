package ellyhocanınDosya.day07;

import java.util.Scanner;

public class elly06 {
    public static void main(String[] args) {

/*
 Interview Question
 1'den 100'e kadar olan sayilari yazdiriniz..
 Ancak kodunuzda herhangi bir sayi kullanmayiniz!
 */

        char bas = 'd';
        for (int i = bas; i >= (bas - bas); i--) {
            bas--;
            System.out.println((int) bas);

        }
// Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum
        // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

            Scanner scanner = new Scanner(System.in);
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            int toplam = 0;
            if (sayi1 < sayi2) {
                for (int i = sayi1; i <= sayi2; i++) {
                    toplam += i;
                }
                System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
            } else if (sayi1 > sayi2) {
                for (int i = sayi2; i <= sayi1; i++) {
                    toplam += i;
                }
                System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
            } else {
                System.out.println("sayilar esittir");
            }
        }
    /* Cuneyt bey den
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */
    }
