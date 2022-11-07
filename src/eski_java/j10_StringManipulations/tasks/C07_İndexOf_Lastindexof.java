package eski_java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class C07_İndexOf_Lastindexof {
    public static void main(String[] args) {

        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu:" + str.indexOf('o')); //1
        System.out.println("d nun yeri index nosu:" + str.indexOf('D')); // 3 D karakteri olmadığı için

        // trick - olmayan karakter indexi sorgulanırsa -1 return eder

        System.out.println("d nun yeri index nosu:" + str.indexOf("od")); // 2
        System.out.println("d nun yeri index nosu:" + str.indexOf("Od")); // -1

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim="mustafa nizamoğlu";
        System.out.println(isim.indexOf('a')); // 4
        isim.lastIndexOf('a'); // 11

        isim.lastIndexOf("fa"); // 5
        isim.indexOf("fa");

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("kafi miktarda bir cümle yazınız");
        String cumle=scan.nextLine().toLowerCase();


        if (cumle.indexOf("java")==-1){
            System.out.println("girilen cümle java içermiyor");
        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){

        } else System.out.println("girilen cümlede bir den fazla java var");









    }
}
