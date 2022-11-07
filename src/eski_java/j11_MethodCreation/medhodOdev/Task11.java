package eski_java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */



        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz: ");
        String metin = scan.nextLine();
       hackerDili(metin);

    }//main sonu

    private static void hackerDili(String metin){

        String hackerDili=metin.replace('s', '5');
        String hackerDili1 =hackerDili.replace('a', '4');
        String hackerDili2=hackerDili1.replace('e', '3');
        String hackerDili3 =hackerDili2.replace('i', '1');
        String hackerDili4 =hackerDili3.replace('o', '0');
        System.out.println(hackerDili4);
    }


}