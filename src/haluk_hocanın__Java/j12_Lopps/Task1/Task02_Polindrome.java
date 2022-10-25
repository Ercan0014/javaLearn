package haluk_hocanın__Java.j12_Lopps.Task1;

import java.util.Scanner;

public class Task02_Polindrome {

    public static void main(String[] args) {

        //polindrome: her iki yönde okunduğunda işet olan ifaler
        //ey edip adanada pide ye

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String str=scan.nextLine();

    polindrome (str);// strnig parametreli method call


    }

    private static void polindrome(String str) {
String tersStr=""; // boş bir string kutu kulah

        for(int i=str.length()-1; i>=0; i--){
            tersStr+=str.charAt(i);// strnin i.ci karekterini tersstrye ekler(concat9

        }
        System.out.println("girilen ifadenin tersi: "+ tersStr);
        if(str.equalsIgnoreCase(tersStr)){ // STR İLE TERSSTR EŞİTLİK KONTROLÜ
            System.out.println("girilen ifade POLİNDROME");
        }else System.out.println("girilen ifade polindrome değil");


    }
}
