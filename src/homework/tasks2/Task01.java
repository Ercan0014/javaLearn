package homework.tasks2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

   Scanner sc=new Scanner(System.in);
        System.out.println("Ara Sınav Notu Giriniz: ");
        double araSınav = sc.nextDouble();
        System.out.println("Final Sınav Notu Giriniz: ");
        double finalSınav=sc.nextDouble();
        System.out.println("Proje Notu Giriniz: ");
        double proje=sc.nextDouble();

        double a =(araSınav*30/100); // 15 puan
        double b= (finalSınav*50/100); // 30 puan
        double c= (proje*20/100); // 16 puan
        double gecmeNotu=(a+b+c);
        System.out.println("geçme notunuz: " + (gecmeNotu));

if (gecmeNotu>=60){
    System.out.println("tebrikler bu dersten başarılı oldunuz :-)");

}else System.out.println("kaldınız, biraz daha çalışınız: ");



    }
}
