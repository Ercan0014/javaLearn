package sonHalukhoca.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya", "Amerika","İngiltere", "İsvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih", "losAngeles","Londra", "Stockholm"));

        // nCopies(int, obj) int elamanlı bir
        ArrayList <String> yenilist=new ArrayList <>(Collections.nCopies(7,"javaCAN"));
        System.out.println(yenilist);

//addAll(); // bir liste diğer liste olduğu gibi ekler

        listUlke.addAll(listSehir); // ülke list sonuna şehir list tamamen ekledi
        System.out.println("listÜlke: "+listUlke);
        listSehir.addAll(3, listUlke); // 3. indexten itibaren ülke listi  şehir listine tamamen eklendi.
        System.out.println("list şehir: "+listSehir);

        //TASK 1 den 10  kadar sayıları print eden bir code create ediniz

        ArrayList<Integer> listsayı= new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            listsayı.add(i);
        }

        System.out.println("listSayı" + listsayı);
    }
}
