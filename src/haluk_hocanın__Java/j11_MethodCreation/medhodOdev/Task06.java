package haluk_hocanın__Java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("dikdörtgen için a:" + "\nparalelkenar için b:" + "\nüçgen için c" + "\nseçiniz:");
		String str = scan.next().toLowerCase();

		System.out.print("taban uzunluk giriniz : " );
		int a = scan.nextInt();
		System.out.print("yükseklik giriniz: ");
		int b = scan.nextInt();



		tercihteHesapla(str,a, b);


	}//main

	public static void tercihteHesapla(String str, int a, int b) {
		switch (str) {
			case "a":
				dikdörtgenHesapla(a, b);
				break;
			case "b":
				Scanner sc = new Scanner(System.in);
				System.out.print("paralelkenar için kısa kenar giriniz: ");
				int c=sc.nextInt();
				paralelkenarHesapla(a,b,c);
				break;
			case "c":
				ücgenHesapla(a,b);
				break;
				default:
					System.out.println("hatalı giriş yaptınız");
		}

	}


	public static void dikdörtgenHesapla(int a, int b) {
		System.out.println("çevre:" + (2 * (a + b)) + "\nalan : " + (a * b));


	}

	public static void paralelkenarHesapla(int a, int b, int c) {
		System.out.println("çevre:" + (2 * (a + c)) + "\nalan : " + (a * b));

	}

	public static void ücgenHesapla(int a, int b) {
		System.out.println("çevre:" + (3 * a) + "\nalan :" + ((a * b) / 2));

	}

}