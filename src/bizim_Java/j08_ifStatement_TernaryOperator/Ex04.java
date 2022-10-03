package bizim_Java.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        /*
TASK-> girilen karakterin harf olup olmadığını test eden bir code yazınız.
*/


        Scanner sc =new Scanner(System.in);

        System.out.print("bir karakter giriniz : ");

        char karakter =sc.nextLine().charAt(0);
        if ((karakter>='A' && karakter<='Z')||(karakter>='a'&& karakter<='z')){
            System.out.println("girdiğiniz, z karakter harftir:");

        }else System.out.println("girdiğiniz karakter harf değildir:(");

    }
}


