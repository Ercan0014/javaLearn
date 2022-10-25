package sonHalukhoca.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {

        //size(); listin eleman sayısını return eder (arr.length gibi)


        ArrayList<String> listSehir=new ArrayList<>(List.of("münih", "losAngeleslosAngeles","Londra", "Stockholm"));

        System.out.println(listSehir.size());//

    }
}
