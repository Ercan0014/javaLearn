package bizim_Java.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner scan= new Scanner(System.in);
        System.out.println("bir tam sayı giriniz:");
        int  sayı=scan.nextInt();


        // int sonuc=%2==0 ? sayı/2:"girilen sayı tek olduğu için yarısı tam sayı değildir"


/* TRICK: ternary ik idurum(true false)iiçin farklı type cıktısı veriyorsa
vereable atama yapmadan sout yapılmalı yada ternary çıktısı aynı data type cast  edilmeli...


 */

        System.out.println(sayı % 2== 0 ? sayı/2:"girilen sayı tek olduğu için yarısı tam sayı değildir");








    }
}
