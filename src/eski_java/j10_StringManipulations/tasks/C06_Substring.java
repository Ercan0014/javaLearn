package eski_java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
/*
        String str="java bilen sırtı yere gelmez :-)";

        System.out.println(str.substring(10)); // sırtı yere gelmez

        System.out.println(str.substring(str.length() - 10)); // son 10 karakter.

        System.out.println(str.substring(0, 10));// ilk 10 karakter

        System.out.println(str.substring(0, 1)); //ilk karakter

        //task girilen 4 harfli kelimeyi sondan tersten print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length() != 4) {
            System.out.println("4 harfli bir kelime giriniz");
        } else {

            System.out.print(kelime.substring(kelime.length() - 1));//e
            System.out.print(kelime.substring(2,3));//l
            System.out.print(kelime.substring(1,2));//a
            System.out.print(kelime.substring(0,1));//k


        }
    }
}