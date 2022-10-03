package haluk_hocanın__Java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {


        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner sc= new Scanner(System.in);
        System.out.print("adınızı giriniz");
        System.out.println(" soyadınızı giriniz");
        String ad= sc.nextLine();
        String soyad=sc.nextLine();

        System.out.println(ad.substring(0,1).toUpperCase() + ad.substring(1) + " " + soyad.substring(0,1).toUpperCase()+ soyad.substring(1));
    }


}
