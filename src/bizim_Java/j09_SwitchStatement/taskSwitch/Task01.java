package bizim_Java.j09_SwitchStatement.taskSwitch;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayı = sc.nextInt();
        sayı /= 10;
        int onlar = sayı % 10;


        switch (onlar) {

            case 0:
                System.out.println("değeri sıfır");
                break;
            case 1:
                System.out.println("değeri on");
                break;
            case 2:
                System.out.println("değeri yirmi");
                break;
            case 3:
                System.out.println("değeri otuz");
                break;
            case 4:
                System.out.println("değeri kırk");
                break;
            case 5:
                System.out.println("değeri elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
            default:
                System.out.println("hatalı karakter girdiniz");
        }

    }
}
