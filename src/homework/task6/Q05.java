package homework.task6;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasınızı gırınız");
        int yas =scan.nextInt();
        if(yas>18){
            System.out.println("kılonuzu yazınız");
            int kılo =scan.nextInt();
            if(kılo>50){
                System.out.println("kan bagısı yapabılrısnz");

            }else System.out.println("kan bagısı yapamazsınz");
        }else System.out.println("kan bagısı yapamazsın ");




    }

}
