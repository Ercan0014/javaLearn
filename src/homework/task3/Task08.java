package homework.task3;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("saniye giriniz");

        int saniye=sc.nextInt();


        System.out.println(saniye/3600+" saat "+(saniye/60)%60+" dakika "+(saniye%60)+" saniye ");





    }
}
