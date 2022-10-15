package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {

    public static void main(String[] args) {
       // get(); listte istenen indexteki elamanı return eder arr[3] arr 3. indexteki elamanın verir

        ArrayList<String> listUlke=new ArrayList<>(List.of("almanya", "Amerika","İngiltere", "İsvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("münih", "losAngeleslosAngeles","Londra", "Stockholm"));

        System.out.println(listSehir.get(1)); //




    }
}
