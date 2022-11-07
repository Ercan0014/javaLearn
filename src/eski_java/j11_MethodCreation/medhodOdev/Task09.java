package eski_java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir saat giriniz: ");
        int saat = scan.nextInt();

        saniyeyeCevir(saat);

    }// main sonu

    public static void saniyeyeCevir(int saat){
        System.out.println(saat*3600);
    }


}
