package sonHalukhoca.j12_Lopps.WhileLoopÖdev;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        int sayi2 = scan.nextInt();

        if(sayi1<sayi2){
            while(sayi1<=sayi2){
                System.out.print(sayi1+" ");
                sayi1++;
            }
        }else {
           for(int i=sayi2; i<=sayi1;i++){
               System.out.print(i+" ");
           }
        }
    }
}