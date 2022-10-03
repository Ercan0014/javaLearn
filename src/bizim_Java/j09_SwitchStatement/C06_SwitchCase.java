package bizim_Java.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

    //TASK: girilen haftanın gününü hafta içi veya hafta sonu oluğunuz prit eden bir code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("bir gün yazınız");
        String gün=sc.next().toLowerCase(); // hepsini küçük haraf algılaması için

        switch (gün){


            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("böyle bir gün yok kardeş");







        }




        }
    }