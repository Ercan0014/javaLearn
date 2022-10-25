package sonHalukhoca.j12_Lopps.L03_WhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

    // task- girilen sayı 17 den küçük ise kazandınız, büyük ise kaybettiniz print eden bir code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayı = scan.nextInt();
       do {


           System.out.println(sayı+ " kabyettiniz");

           sayı++;

       } while (sayı<=17);


        System.out.println(sayı + " kazandınız ");






    }//main sonu
}
