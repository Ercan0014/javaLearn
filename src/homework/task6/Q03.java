package homework.task6;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

Scanner scan=new Scanner(System.in);
        System.out.print("kilo giriniz:");
        int kilo= scan.nextInt();
        System.out.print("boyunuzu giriniz:");
        double boy=scan.nextDouble();

        double vki=(kilo/(boy*boy));
        System.out.println("vki = " + vki);

        if (vki<=20){
            System.out.println("oldukça zayıfsınız");
        }
        else if (vki>20 && vki<=25){
            System.out.println("normal sınırlardasınız");
        } else if (vki>25 && vki<=30){
            System.out.println("şişman katagoridesiniz");
        } else if (vki>30){
            System.out.println("obez gruptasınız");
        }else System.out.println("doğru değer giriniz");

    }

}
