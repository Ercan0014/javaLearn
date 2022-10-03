package haluk_hocanın__Java.j10_StringManipulations.tasks;

public class task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz


        String str = "Alamanya";

        // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));



    }


}
