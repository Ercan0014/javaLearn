package bizim_Java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cümle=sc.nextLine();

        System.out.println(cümle.contains(" "));







    }
}

