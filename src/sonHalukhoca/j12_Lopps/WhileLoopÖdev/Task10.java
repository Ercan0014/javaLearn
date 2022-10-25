package sonHalukhoca.j12_Lopps.WhileLoopÖdev;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
            // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

            Scanner scan= new Scanner(System.in);
            System.out.print("Bir Sayı Giriniz : ");
            int num1 = scan.nextInt();
            int i = 1;
            while (i < num1) {
                System.out.print(i + " ");
                i += 2;


            }
    }
}