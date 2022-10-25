package sonHalukhoca.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        ArrayList<Integer> listSayı= new ArrayList<>(Arrays.asList(1,24,23,14,19,1,60,55,27,1,38));
        System.out.println("listSayı:"+ listSayı); //replaceAll öncesi
        Collections.replaceAll(listSayı,1,20);
        System.out.println(("listSayı: "+ listSayı));// replaceAll sonrası

        // fill() lisstte tüm elemanları bilirli bir değere update eder.
        Collections.fill(listSayı, 33);
        System.out.println("listSayı: "+ listSayı);




    }
}
