package sonHalukhoca.j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // task-- girilen tamsayısın pozitif tam bölen sayısını print eden code create ediniz.
        // Örn:20--1,2,4,5,1,20 : 20 nin 6 tane tam böleni vardır.
        //Örn 30-- 1,2,3,5,6,10,15,30: 30 un 8 tane tam böleni vardır.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int sayı=scan.nextInt();
        int bölensayı=1;
        int tamBölenAdedi=0;

        while (sayı>=bölensayı){
            if(sayı%bölensayı==0){// sayı bölen sayıya tam bölünüyor

            tamBölenAdedi++;
            }

        bölensayı++; // sonsuza düşmemesi için ve diğer sayıların böldüğü
            //diğer sayıların böldüğü  kontrol edilmesi için.
        }
        System.out.println("girdiğiniz sayı: " + sayı+"nın " + tamBölenAdedi + "kadar tam böleni var");


    }// main sonu

}
