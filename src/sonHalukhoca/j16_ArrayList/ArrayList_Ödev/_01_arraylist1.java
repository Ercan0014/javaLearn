package sonHalukhoca.j16_ArrayList.ArrayList_Ödev;


import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {
    public static void main(String[] args) {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */


        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        String str="orange";

        System.out.println(str.toUpperCase()+"kelimesi Arrayin içinde: "+ getCount(arr,str)+"adet var");


    }public static int getCount(ArrayList<String> arr,String str){
        int count = 0;
        for(String a : arr){
            if(str.equalsIgnoreCase(a)) {
                count++;
            }
        }
        return count ;

    }


}