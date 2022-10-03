package bizim_Java.j09_SwitchStatement.taskSwitch;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println(" Bir ay giriniz:");
        String birAy =sc.next().toLowerCase();

        switch (birAy) {

            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("girilen ayda 31 gün vardır");
                break;

            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("girilen ayda 30 gün vardır");
                break;

            case "şubat":
                System.out.println("yılınızı giriniz");
                int yıl=sc.nextInt();
                if(yıl%4==0){
                    System.out.println("Şubat ayı 29 çeker");
                }else System.out.println("şubat ayı 28 çeker");

                break;
            default:
                System.out.println("hatalı seçim yaptınız");



        }


    }

}
