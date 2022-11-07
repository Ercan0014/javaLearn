package ellyhocanınDosya.day07;

import java.util.Scanner;

public class elly03 {
    public static void main(String[] args) {

        //Q04_ForLoop
/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=

 */

      Scanner scanner = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayı giriniz: ");

        int sayı=scanner.nextInt();
        int toplam=0;
        for (int i = 1; i <sayı; i++){
            toplam += i*i;


        }
        System.out.println(+ toplam + " ");


    }//main sonu
}
