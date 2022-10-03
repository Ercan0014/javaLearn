package haluk_hocanın__Java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        int sayı1 = scan.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        int sayı2 = scan.nextInt();

        System.out.print("3.sayıyı giriniz: ");
        int sayı3 = scan.nextInt();


        küçükSayıBul(sayı1, sayı2, sayı3);

        System.out.println("küçük sayı: " + küçükSayıBul(sayı1, sayı2, sayı3));


    }//main sonu


    public static int küçükSayıBul(int sayı1, int sayı2, int sayı3) {

        if (sayı1 < sayı2 && sayı1 < sayı3) {
            return (sayı1);
        } else if (sayı2 < sayı1 && sayı2 < sayı3) {
            return (sayı2);
        } else if (sayı3 < sayı1 && sayı3 < sayı2) {
            return (sayı3);
        } else System.out.println(" lütfen üç farklı sayı giriniz");
    return (0);


    }

}