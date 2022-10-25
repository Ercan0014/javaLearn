package sonHalukhoca.j15_Arrays.task_Array_ödev;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

//Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc =new Scanner(System.in);

        int sayiArr[]= new int[7];

        for (int i=0; i<sayiArr.length; i++)
        {
            System.out.print(i + ". index elemanı girin");
            sayiArr[i]=sc.nextInt();

        }
        for (int i=0; i<sayiArr.length; i++)
            if (sayiArr[i]%2==1){
                System.out.println(sayiArr[i] + " ");
            }


        }


    }

