package homework.tasks2;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);
        System.out.println("dik kenar uzunluklarını giriniz: ");
        double birinciKenar= scan.nextDouble();
        double ikinciKenar= scan.nextDouble();
        double kareToplam= (birinciKenar*birinciKenar)+ (ikinciKenar*ikinciKenar);


        System.out.println(Math.sqrt(kareToplam));


    }
}
