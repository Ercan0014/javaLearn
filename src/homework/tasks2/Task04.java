package homework.tasks2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Clarusway spor salanu için lütfen isim soyisim giriniz: ");
        String isim=sc.nextLine();

        System.out.println("kilo bilginizi giriniz: ");
        int kilo=sc.nextInt();

        System.out.println("boy uzunluğunuzu metre cinsinizden giriniz: ");
        int boy=sc.nextInt();

        System.out.println(" kac ay üyelik kaydı yaptırmak istiyorsunuz: ");
        int süre=sc.nextInt();


        System.out.println("toplam ödeyeceğiniz tutar :"+ (20*süre));





    }
}
