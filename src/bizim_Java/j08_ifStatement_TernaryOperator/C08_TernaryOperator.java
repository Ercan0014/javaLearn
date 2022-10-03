package bizim_Java.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {

/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("urun miktarı giriniz:");
        int urunmiktarı=scan.nextInt();

        System.out.println("urun fiyatı giriniz:");
        int urunfiyatı=scan.nextInt();

        double fatura= urunmiktarı>100 ? (urunmiktarı*urunfiyatı*0.67) : (urunfiyatı*urunmiktarı);

        System.out.println("fatura = " + fatura);



    }
}
