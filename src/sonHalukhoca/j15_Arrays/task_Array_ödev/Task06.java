package sonHalukhoca.j15_Arrays.task_Array_ödev;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(i+" ");





        }
    }
}
