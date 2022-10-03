package homework.tasks2;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

        /*    kullanıcının ismini print eden code create ediniz */

        Scanner scn= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scn.nextByte();
        System.out.println(a*4);
    }
}