package sonHalukhoca.j16_ArrayList.ArrayList_Ödev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static <Arraylist> void main(String[] args) {

        ArrayList<String> listEyalet = new ArrayList<>(List.of("New jersey", "New york", "Atlanta", "Florida", "Ohio"));

        ArrayList<String> yenilistEyalet = new ArrayList<>();


        for (int i = listEyalet.size() - 1; i >= 0; i--) {
            yenilistEyalet.add(listEyalet.get(i));

        }

        System.out.println(yenilistEyalet);
        ArrayList<String> listSehir = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("Elemanlarin uzunlugu sirasiyla: " + getLength(listSehir));
    }

    public static ArrayList<Integer> getLength(ArrayList<String> listSehir) {
        ArrayList<Integer> lengthSehir = new ArrayList<>();
        for (String x : listSehir) {
            lengthSehir.add(x.length());
        }
        return lengthSehir;
    }
}



