package sonHalukhoca.j15_Arrays.task_Array_ödev;

public class C07_MdArrays {
    public static void main(String[] args) {
        // task ->arr tum elemanlarını toplayan code create ediniz->137
        int apt[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt

        int toplam=0;

        for (int i = 0; i <apt.length ; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                toplam+=apt[i][j];

            }

        }System.out.println("arrayların toplamı: "+toplam);
    }
}