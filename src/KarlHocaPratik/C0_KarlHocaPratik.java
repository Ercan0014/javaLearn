package KarlHocaPratik;

import java.util.Scanner;

public class C0_KarlHocaPratik {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println( "kahve sever misiniz? Evet için E hayır için H :");
        char ch= scanner.next().toUpperCase().charAt(0);


        if (ch== 'E') {
            System.out.println("türk kahvesi için:1\n latte için:2\n ");
            if (ch == '1') {
                System.out.println("türk kahveniz hazırlanıyor");

                }else if(ch=='2'){System.out.println("latteniz hazırlanıyor efendim");



            }else System.out.println("hatalı rakam girdiniz");




        }else System.out.println("kahveden başka ürünümüz yok efendim");










    }
}
