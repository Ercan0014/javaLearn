package sonHalukhoca.j15_Arrays.Array_Ödev;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String meyve[] = {"Apple", "Orange", "Banana", "Pineapple" };
        String a = "Apple";
/*
        boolean flag = false;
        for (int i = 0; i < meyve.length; i++) {
            if (meyve[i] == a) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("aradığınız string var :) ");
        } else {
            System.out.println("aradığınız string yok  :( ");

         }
         */
boolean meyveVarmı=false;
        for (int i = 0; i < meyve.length ; i++) {
            if(meyve[i].contains("Apple")){
                meyveVarmı=true;
                break;
            }else {
                meyveVarmı=false;
            }

        }

        System.out.println(meyveVarmı);

    }

}
