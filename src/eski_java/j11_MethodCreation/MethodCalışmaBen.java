package eski_java.j11_MethodCreation;



public class MethodCalışmaBen {

    public static void main(String[] args) {




topla();

//topla2(25,65);


        System.out.println(carp(25, 12));

    } // main sonu


    public static void topla(){

        int a = 14;
        int b= 15;

        System.out.println(a+b);



    }

    public static void topla2(int a, int b) {

        System.out.println(a+b);
        System.out.println("merhaba bolu");
    }

    public static int carp (int e,int f){
      return e*f;


    }

} // class sonu
