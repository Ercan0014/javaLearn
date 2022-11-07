package ellyhocanınDosya.day05;

import java.util.Scanner;

public class c03 {
    public static void main(String[] args) {

      //  Q12_StringManipulation
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("bir string giriniz");
        String metin=scan.nextLine();
        int bosluk=metin.indexOf(" ");


        if(bosluk==-1 && !metin.isEmpty())
            System.out.println("şartlara uygun");
        else System.out.println("şartlara uygun değildir");



    }
}
