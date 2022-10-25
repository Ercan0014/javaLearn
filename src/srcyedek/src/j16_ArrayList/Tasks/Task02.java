package srcyedek.src.j16_ArrayList.Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    static int sinifMevcudu=0;
    static int toplam=0;

    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç adet not gireceksiniz: ");
        int notAdedi = sc.nextInt();

        ArrayList<Integer> notListe = new ArrayList<>(notAdedi);
        int not;
        double notlarınToplamı = 0;
        int ortGecenOgrenciSayı = 0;
        double ortalama = 0;

        for (int i = 1; i <= notAdedi; i++) {
            System.out.println(i + ".öğrencinin notunu giriniz: ");
            not = sc.nextInt();
            notListe.add(not);
            notlarınToplamı += not;
             ortalama = notlarınToplamı / notListe.size();
        }
        System.out.println("öğrencilerin not ortalaması: " + ortalama);


        for (int i = 1; i < notListe.size(); i++) {

         if(notListe.get(i)>=ortalama){
         ortGecenOgrenciSayı++;
}

        }
        System.out.println("ortalamayı geçen öğrenci sayısı: "+ortGecenOgrenciSayı);


        /*
        //Sınıf




            Scanner sc=new Scanner(System.in);
            System.out.println("Sınıf mevcudunu rakamla giriniz: ");
            sinifMevcudu= sc.nextInt();

            List<Integer> notlar= new ArrayList<>();

            for (int i = 1; i <=sinifMevcudu ; i++){
                System.out.println((i)+ ". öğrencinin notunu giriniz:");
                notlar.add(sc.nextInt());
            }
            for( int eleman : notlar) {
                toplam  = toplam+eleman;
            }
            int count=0;
            for ( int i=0; i<notlar.size(); i++ ) {
                if (notlar.get(i)>ortalamaBul()){
                    count++;
                }
            }

            System.out.println(sinifMevcudu+" öğrenci içinde ortalamayı geçen öğrenci sayınız: " +count);

        }

        public static int ortalamaBul() {
            int ortalama= toplam / sinifMevcudu;

            return ortalama;
*/

    }
}
