package WhileLoopÖdev;

import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk karabiner print rden code create ediniz

		 */
Scanner scan=new Scanner(System.in);
		System.out.print("İsminizi giriniz : ");
		String isim = scan.nextLine().trim();
		System.out.print("Soy isminizi yazınız : ");
		String soyİsim = scan.nextLine().trim();
		int a = 0 , b=0;

		while (a<=isim.length()-1) {
			System.out.print(isim.charAt(a) + " ");
			a++;
		}
		while (b<=soyİsim.length()-1) {
			System.out.print(soyİsim.charAt(b) + " ");
			b++;
		}







	}//main sonu

}
