package elly_Hoca.day02;

public class Q03_NestedTernary {
    public static void main(String[] args) {


       /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        char finalNotu='B';

        String result=finalNotu=='A'?"gayet başarılı":
                finalNotu=='B'? "başarılı":
                finalNotu=='C'?"ha gayret":"diğerleri";



    }
}
