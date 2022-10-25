package ellyhocanınDosya.day12;

import java.util.Scanner;

public class V5_ConsoleMinMax {

    public static void main(String[] args) {

        // Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.

Scanner sc = new Scanner(System.in);
        System.out.println("sayı1 giriniz: ");int sayı1=sc.nextInt();
        System.out.println("sayı2  giriniz: ");int sayı2=sc.nextInt();

      System.out.println (Math.max(sayı1, sayı2));
      if(sayı1>sayı2){
       int random=   (int) (Math.random()*sayı1);
          System.out.println("random= " + random);

      }else{
          int random= (int) (Math.random()*sayı2);
          System.out.println("random= " + random);
      }

        //2.yol
        int randomNum =(int) (Math.random() * ((Math.max(sayı1,sayı2) - Math.min(sayı1,sayı2)) + 1)) + Math.min(sayı1,sayı2);
        System.out.println("randomNum = " + randomNum);


    }

    }

