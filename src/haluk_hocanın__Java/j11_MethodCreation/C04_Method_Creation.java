package haluk_hocanın__Java.j11_MethodCreation;

public class C04_Method_Creation { //motor
    public static void main(String[] args) {

        String name="ercan";
        System.out.println("car car" + name );
        C04_MethodDepo.geçmeNotu(24); // depo classtan class name ile method call edildi.
       // depo classtan class name ile method call edildi.
        topla(3,5); // 8
        /*
         farklı classtan method call etmek için
        1. method static > gökteki güneş gibi
        2. ClassName.methodName() şeklinde call edilir
        3. aynı classtaki methdo doğrudan methodName ile call edilir.
*/
    }

    public static void topla(int a, int b){
        System.out.println((a + b));

        selamVer();

    }//main dışı
public static void selamVer(){
    System.out.println("selam ver");
}



}

