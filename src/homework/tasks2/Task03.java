package homework.tasks2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("günde kaç saat uyumaktasınız: ");
        int uyku=sc.nextInt();

        int aylıkUyku=((uyku*30)/24);
        System.out.println("ayda: "+ aylıkUyku+ " gün uyumaktasınız");
        int yıllıkUyku=((uyku*365)/24);
        System.out.println("yılda: " + yıllıkUyku+ " gün uyumaktasınız");
        int kırkyıllıkUyku=((uyku*14600)/24);
        System.out.println("40 yılda: "+ kırkyıllıkUyku+ " gün uyumuş olacaksınız");



    }
}
