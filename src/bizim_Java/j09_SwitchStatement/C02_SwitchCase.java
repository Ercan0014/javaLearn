package bizim_Java.j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
//task kulanıcının girdgi yılın ay sırasına göre ismini yazan code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("bir ay gir");
        int ayNo=sc.nextInt();

    switch (ayNo) {
        case 1:
            System.out.println("girilen ay ocak");
            break;
        case 2:
            System.out.println("girilen ay şubat");
            break;
        case 3:
            System.out.println("girilen ay mart");
            break;
        case 4:
            System.out.println("girilen ay nisan");
            break;
        case 5:
            System.out.println("girilen ay mayıs");
            break;
        case 6:
            System.out.println("girilen ay haziran");
            break;
        case 7:
            System.out.println("girilen ay temmuz");
            break;
        case 8:
            System.out.println("girilen ay ağustos");
            break;
        case 9:
            System.out.println("girilen ay eylül");
            break;
        case 10:
            System.out.println("girilen ay ekim");
            break;
        case 11:
            System.out.println("girilen ay kasım");
            break;
        case 12:
            System.out.println("girilen ay aralık");
            break;
        default:
            System.out.println("hatalı giriş yaptınız");

    }


    }
}
