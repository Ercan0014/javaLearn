package bizim_Java.j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
        concat() methodu içine (parametre) aldığı string veriable'ı stringin sonuna ekler.

         */

        String name= "Nur";
        String meslek= "Qa tester";
        System.out.println(name.concat(meslek));// nur qa tester
        System.out.println(name);// Nur

        // trıck--- String methodları variable gecici değişiklik yapar.
        //ama değişken atama yapılırsa kalıcı değişir.

        name=meslek.concat(name);
        System.out.println("name="+name); //

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :) rture

        // trick--- concat methodu parametre olarak strign type harici tüm dataları  stringie çevirip concat eder


    }
}
