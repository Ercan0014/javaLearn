package bizim_Java.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("üç basamaklı sayı giriniz");
		int sayı=sc.nextInt();
				int birler=sayı%10;
				int sayı1=sayı /10;
				int onlar=sayı1%10;
				int yüzler=sayı/100;


		System.out.println(("birler: ")+birler+"\nonlar: "+onlar+"\nyüzler: "+yüzler);



	}

}
