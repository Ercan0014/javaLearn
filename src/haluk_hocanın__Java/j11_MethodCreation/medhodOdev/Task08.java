package haluk_hocanın__Java.j11_MethodCreation.medhodOdev;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */


        Scanner scan = new Scanner(System.in);
        System.out.print("bir yıl giriniz: ");
        int yıl = scan.nextInt();
        artıkYıl(yıl);


    } // main sonu


    private static int artıkYıl(int yıl) {

        if (yıl%4 ==0){
            System.out.println("artık yıl:" + "true");
        }else System.out.println("artık yıl:" + "false");
    return yıl;

}
}
