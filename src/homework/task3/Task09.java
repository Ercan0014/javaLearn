package homework.task3;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("tavukların sayısı:");
        System.out.println("koyunların sayısı:");
        System.out.println("ineklerin sayısı:");

        int tavuk= scan.nextInt();
        int koyun= scan.nextInt();
        int inek= scan.nextInt();

            System.out.println("toplam ayak sayısı:"+(tavuk*2+(inek+koyun)*4));




    }

}
