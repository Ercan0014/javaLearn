package sonHalukhoca.j15_Arrays.task_Array_ödev;

import java.util.ArrayList;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int arr[]={1,2,-3,4,-5,-6};
        sayınınTersi(arr);

    }

    private static void sayınınTersi(int[] arr) {
        for(int a:arr){
            a*=-1;
            System.out.println(a+ " ");
        }
    }


}
