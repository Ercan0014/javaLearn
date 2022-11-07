package ellyhocanınDosya.days13;

public class Q06_Varags02 {


// Create a multiply method with double varargs (return double)
// Çift varargs ile bir çarpma yöntemi oluşturun (çift dönüş)

    public static double multiplyAll(double ... sayi) {
        double carpim = 1;
        for (double each : sayi) {
            carpim *= each;
        }
        System.out.println("carpim = " + carpim);

        return carpim;


    }

}
