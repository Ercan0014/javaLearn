package eski_java.j12_Lopps.Task1;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {

        //task girilen iki sayı arasındaki çift sayıları yanyana print eden bir code create ediniz


        Scanner sc = new Scanner(System.in);
        System.out.println(" iki sayı : ");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();

        if (sayı1 < sayı2) {
            for (int i = sayı1; i < sayı2; i++)
                if (i % 2 == 0) { //döngü içindeki sayıların çiftlik kontrolu yapıldı
                    System.out.print(i + " ");

                }


        } else System.out.println("hatalı giriş yaptınız");


    }// main dışı

}






