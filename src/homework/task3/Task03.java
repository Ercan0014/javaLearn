package homework.task3;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		


		Scanner sc = new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı girin");
		int sayi=sc.nextInt();
		System.out.println( (sayi/100) + (sayi%10));


	}

}
