package bizim_Java.j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

    //TASK: girilen ayın hangi mevsimde olduğunu print eden code create ediniz.

        Scanner sc =new Scanner(System.in);
        System.out.println("bir ay giriniz");
        int ayNo=sc.nextInt();
        //String ay= sc.nextLine();

        switch (ayNo){

            case 12:
            case 1:
            case 2:
                System.out.println("kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar mevsimi");
                break;
            default:
                System.out.println("lütfen 1 ile 12 arasında bir sayı giriniz");



        }









        }
    }
