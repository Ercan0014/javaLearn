package sonHalukhoca.j12_Lopps.L01_ForLoop.For_loop_ödevler;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

	Scanner scan=new Scanner(System.in);
		System.out.println("bir string giriniz: ");
		String cümle=scan.nextLine();

		for (int i=1; i<cümle.length(); i++){
			System.out.println("girdiğiniz stringteki harf sayısı: " + cümle.length()+" ");
		}

		System.out.println();


	}
}
