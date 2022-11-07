package eski_java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.


		Scanner scan=new Scanner(System.in);
		System.out.println("saat giriniz:");
		double saat=scan.nextInt();

		System.out.println("bir mil değeri giriniz");
		double mil=scan.nextDouble();

		System.out.println("kg giriniz:");
		double kg=scan.nextDouble();


hesapla(saat, mil, kg);



	} //main sonu
	
	public static void hesapla(double saat, double mil, double kg ){
		double saniye= saat*3600;
		double km = (mil*16)/10;
		double gram= kg*1000;

		System.out.println( " saniye: "+ saniye +  "\n km: " + km + "\n gram: " + gram);
	}

}
