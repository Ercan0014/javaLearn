package elly_Hoca.day02;

import java.util.Scanner;

public class Q6_SwithCase {
    public static void main(String[] args) {

       // Q06_SwitchCase
/*
      * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
      * ornek
      *  Kullanici  : A , B , C harflerinden birini secsin
          A'yi secmis ise, ==> Java is easy
          B'yi secmis ise, ==> Java is fun
          C'yi secmis ise, ==> I need to study :)
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf seçiniz:\nA \nB \nC");

        char choice=scan.next().toUpperCase().charAt(0);
        switch(choice){
            case 'A':
                System.out.println("java is easy"); break;
            case 'B':
                System.out.println("java is fun");break;
            case 'C':
                System.out.println("ı need to study");break;
            default:
        }






    }
}
