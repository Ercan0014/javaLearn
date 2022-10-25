package ellyhocanınDosya.day09;

import java.util.ArrayList;
import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {

      //  Q03_Arrays
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        // adım str tanımladık
        String str="HeySiri";
        // 2 adım. heysiriyi yi bye siriye dönüştür
        str=str.replace("Hey","Bye");
        System.out.println(str);
        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));

// 2.yol
        String str1="HeySiri";
        String yeniStr[]=str1.split("y");
        yeniStr[0]="Bye";
        str1=yeniStr[0] + yeniStr[1];
        System.out.println("str1= " + str1);

        String arr2[]=new String[1];
        arr2[0]=str1;
        System.out.println(Arrays.toString(arr2));



    }
}
