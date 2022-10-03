package haluk_hocanın__Java.j10_StringManipulations.stringManipulation_ödevler;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Adınızı giriniz: ");
        String a1=scan.nextLine();

        System.out.println("2. Adınızı giriniz: ");
        String a2=scan.nextLine();

        System.out.println("Soyadınızı giriniz: ");
        String a3=scan.nextLine();




  String yenia1= a1.substring(0,1).toUpperCase();
  String yenia2= a2.substring(0,1).toUpperCase();
  String yenia3= a3.substring(0,1).toUpperCase();


        System.out.println(yenia1+"."+ yenia2 +"."+yenia3 + ".");




    }
}
