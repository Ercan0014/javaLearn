package sonHalukhoca.j12_Lopps.L01_ForLoop.Tasks;

public class C03_NestedForLoop {
    public static void main(String[] args) {
/* eğer bir döngünün bady'sinde başka bir döngü bulunuyors bu tür döngülere iç içe()nested*loop denir.
iç döngü dış döngünün  her adımında tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır.

 */

for (int apt = 1; apt <=10; apt++){
    System.out.println("apt döngü : "+apt);

    for (int daire = 1; daire <6 ;daire++){
        System.out.println("apt" +apt+" için daire döngü daire :" + daire);

    }
}



    }
}
