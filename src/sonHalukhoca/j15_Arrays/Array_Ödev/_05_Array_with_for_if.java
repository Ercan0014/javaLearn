package sonHalukhoca.j15_Arrays.Array_Ödev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */


        int sayı[]={5,6,8,12,14,19};
        int çiftTopla=0;
        int tekTopla=0;
        for (int i = 0; i < sayı.length; i++) {
            if(sayı[i]%2==0){
               çiftTopla+=sayı[i];

            } else {
                tekTopla+=sayı[i];

            }


        }
        System.out.println("çift sayıların toplamı: " + çiftTopla);
        System.out.println("Tek sayıların toplamı: "+ tekTopla);
        System.out.println("Sonuç: " +(çiftTopla-tekTopla));
    }
}
