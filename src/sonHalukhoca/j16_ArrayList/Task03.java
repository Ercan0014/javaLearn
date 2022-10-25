package sonHalukhoca.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

//task-- bir listte istenen sayının  varlığını kontrol eden code print ediniz
        ArrayList<Integer> ListSayı=new ArrayList<>(Arrays.asList(1,23,24,14,19,60,1,55,27,1,38));
        Scanner sc=new Scanner(System.in);
        System.out.println("ağam hangi sayı arrasın: ");
        int ara=sc.nextInt();
        boolean varMi=false;

        for (int i = 0; i < ListSayı.size() ; i++) {
            if(ListSayı.get(i)==ara){
                varMi=true;
                System.out.println("ağam aradığın sayı bizde mevcut ");
                break;
            }

        }
if (!varMi){
    System.out.println("ağam aradığın sayı bibzde mevcut değil.(");
}



    }
}
