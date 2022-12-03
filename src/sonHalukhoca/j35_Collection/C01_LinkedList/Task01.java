package sonHalukhoca.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


      /*
Task->
Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */

LinkedList<String> ll1=new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay"));
Scanner scan=new Scanner(System.in);
System.out.println("kime bakmıştınız :");
String aganınAdamı=scan.next();


if (ll1.remove(aganınAdamı)){ // true ise--- istenen eleman node var ve silindi
    System.out.println("ağam elaman halledildi.");
    System.out.println("elaman halledildikten sonra" +ll1);

} else {
    System.out.println("aradığınız elamana ulaşılamadı.");
}

    }
}
