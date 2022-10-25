package homework.tasks2;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafe giriniz (km) : ");
        double mesafaKm=scan.nextDouble();
        System.out.println("Ortalama Hızınızı Giriniz (km/sa): ");
        double ortalamaHız=scan.nextDouble();
        double süre=(mesafaKm/ortalamaHız);
        System.out.println(süre);


    }
}
