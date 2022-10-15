package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

 // indexOf(); < list içinde istenen elamanın index değerin return eder.

        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya", "Amerika","İngiltere", "İsvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih", "losAngeleslosAngeles","Londra", "Stockholm"));

        System.out.println(listSehir.indexOf("Londra"));// 2
        System.out.println(listSehir.indexOf("Anğara"));// -1 list olmayan -1 return eder
        System.out.println(listSehir.indexOf("manisa"));// -1
        System.out.println(listSehir.indexOf("münih"));//
        listUlke.add("Amerika");
        System.out.println("list ülke: " + listUlke);
        System.out.println(listUlke.indexOf("Amerika")); // tekrarlı elamanlarda soldan ilk bulunan elaman index return eder.
        System.out.println(listUlke.lastIndexOf("Amerika"));








    }

}
