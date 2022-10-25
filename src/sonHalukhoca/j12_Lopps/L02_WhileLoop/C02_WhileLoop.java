package sonHalukhoca.j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //taks-- girilen tam sayının rakamlarını toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz: ");
        int sayı = scan.nextInt();

        rakamTopla(sayı); //method call


    }// main sonu

    private static int rakamTopla(int sayı) {
        int rakamToplamı = 0;
        while (sayı > 0) {
            // sayı 1 olana dek bady çalış

            rakamToplamı += sayı % 10; // sayının birler basamağınıverir
            sayı /= 10; // sayı 1 basamak eksiltildi.
        }
return rakamToplamı;
    }

}

