package haluk_hocanın__Java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {

 /*
        Girilen String'in son karakterini silen code create ediniz...
         */



        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println(str.substring(0, str.length() - 1));

       // str.replace(str.charAt(str.length()-1), "")
    }
}



