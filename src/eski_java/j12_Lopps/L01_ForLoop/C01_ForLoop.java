package eski_java.j12_Lopps.L01_ForLoop;

public class C01_ForLoop {


    public static void main(String[] args) {

        // 41 kere maşaallah print idiniz

        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");
        System.out.println("maşaallah");


       /*
       loop -- döngü tekrarlana aksiyonlar için kullanılan code blok'lrıdır.

        */
        //  baş.      bitiş   değişim

        for(int i =  1;  i<=41;     i++){ //döngü boyunca tekrarlancak aksiyon
            System.out.println(i+" . maaşallah"); //. i. maşaallah

        }
        System.out.println("selam javacanlar bolcana  offer"); // döngü dışı olduğu için 1 defa yazar
    // task -- 2 basamaklı tek sayıları yan yana print eden code create ediniz.

        for (int i = 11; i <=99 ; i+=2){
            System.out.print(i+ " ");

        }
        System.out.println(" ****   ");
        for (int i=10; i<100; i++){
            if(i%2==1){
                System.out.println(i+ " ");
            }
        }


        for (int i=0; i>10; i++){ // şartı sağlamayan (False) olan for bady run olmaz code kırılarak alt satırdan devam eder
            System.out.println("selam javacan");
        }
        System.out.println("bu metni okumuşsanız yukarıda for çalışmadı");

   // for (int i = 0; i >=0 ; i++){ // bu for sigarayı jupiterden yakana kadar çalşıır.
       // System.out.println(i);

    }


    }




