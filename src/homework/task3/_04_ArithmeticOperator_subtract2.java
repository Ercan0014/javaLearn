package homework.task3;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("dört adet sayı giriniz");
        int num1= scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int num4=scanner.nextInt();

        System.out.println("sonuç:"+(num1-num2-num3-num4));





    }
}
