package homework.task6;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç ürün aldınız");
        int ürün=sc.nextInt();
        System.out.println("ürünün liste fiyatı nedir");
        double liste=sc.nextDouble();
        double fyt=(ürün*liste);
        System.out.println("müşteri kartınız varsa E yoksa H yazınız");
        char krt=sc.next().toUpperCase().charAt(0);

        if(krt=='E'){
            if(ürün>10){
                System.out.println("toplam:"+((fyt*80)/100));

            }else System.out.println("toplam:"+((fyt*85)/100));

        }else if(krt=='H'){
            if(ürün>10) {
                System.out.println("toplam:"+((fyt*85)/100));

            }else System.out.println("toplam:"+((fyt*90)/100));

        } else System.out.println("hatalı karakter girdiniz");











    }

}
