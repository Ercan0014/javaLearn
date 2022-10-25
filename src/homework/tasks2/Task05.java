package homework.tasks2;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner sc = new Scanner(System.in);
		System.out.println("1. tam sayıyı giriniz");
		int sayı1=sc.nextInt();
		System.out.println("2. tam sayıyı giriniz");
		int sayı2=sc.nextInt();
		System.out.println("sectiğiniz sayıların çarpımı: "+(sayı1*sayı2));
		System.out.println("sectiğiniz sayıların bölümü: "+(sayı1/sayı2));
		System.out.println("seçtiğiniz sayıların farkı: "+(sayı1-sayı2));
		System.out.println("sectiğiniz sayıların toplamı: "+(sayı1+sayı2));


	}

}
