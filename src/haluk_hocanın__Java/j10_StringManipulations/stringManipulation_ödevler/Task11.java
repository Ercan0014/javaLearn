package haluk_hocanın__Java.j10_StringManipulations.stringManipulation_ödevler;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 kelimeden oluşan ad ve soyad giriniz: ");
        String a = scan.nextLine();

      int a1 = a.indexOf(" ");
       int a2 = a.lastIndexOf(" ");

      System.out.println("Ad: " + a.substring(0, a1));
      System.out.println("Soyad: " + a.substring(a2));


    }

    }

