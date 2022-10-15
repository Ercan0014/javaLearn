package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {

        int yas=33;
        System.out.println("yas: " + yas); // 33
         for (int i=0; i<7 ;i++){
             System.out.println(yas+" :) " );

         }//for loop sonu
        //i=34; // loop variabale local dışı call edilemez
        yas=35; /// local variable localinde call edildi.

    }// main sonu
    //yas=48; // local dışı call edilemez
}
