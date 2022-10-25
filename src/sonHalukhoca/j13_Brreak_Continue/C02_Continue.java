package sonHalukhoca.j13_Brreak_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {

/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm meyıl hesabını giresen :");

        String meyıl = sc.nextLine();// egik Gabık @ cimey ıl. k om

        for (int i = 0; i < meyıl.length(); i++) {

            char ch = meyıl.charAt(i);

            if (ch==' '){
                continue;
            }

            System.out.print(ch);
        }


    }
}