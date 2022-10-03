package bizim_Java.j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

     /*
     String içerisinde istenen stringin varlığını kontrol eder.
     boolean return eder.
      */
String s1="Enise Hanım başırılı bir Qa tester team lead";

        System.out.println(s1.contains("hanım"));// false
        s1.contains("E");System.out.println();// true
        s1.contains(" ");System.out.println();//true

        String S2="Qa";
       // System.out.println(s1.contains(s2));//true
        //System.out.println(s2.contains(s1));//false
// task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız


    }
}
