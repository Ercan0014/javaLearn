package sonHalukhoca.j15_Arrays.task_Array_ödev;

public class Tasl15 {

    public static void main(String[] args) {
        //task= arr tüm elemanların çarpımını print eden code create ediniz

        //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int sayi[][]={{1,2,3},{9,8}};
        int crpm=1;//ilk 1 verielerk carpmada etki etmeyecek değer kullanıldı

        for (int kat = 0; kat < sayi.length; kat++) {//kat kontrolu

            for (int daire = 0; daire < sayi[kat].length; daire++) {//daire kpntrolu
                crpm*=sayi[kat][daire];
            }
        }
        System.out.println(crpm);//432
    }
}



