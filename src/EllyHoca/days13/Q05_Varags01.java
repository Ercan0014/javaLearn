package ellyhocanınDosya.days13;

public class Q05_Varags01 {

// istedigimiz kadar sayi girdigimizde
// toplamlari bize veren bir method yazalim...

    public static void main(String[] args) {


sumAll(2,10,58,26,2,-2,15,-35,45,-2);

    }

    private static void sumAll(int...sayi) {

        int toplam=0;
        for(int each:sayi){
            toplam+=each;
        }
        System.out.println("toplam = " + toplam);
    }


}
