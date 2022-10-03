package bizim_Java.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */



        Scanner sc=new Scanner(System.in);
        System.out.println("bir şeyler yazınız");
        String cümle=sc.nextLine();

        String yarı= cümle.substring(0,cümle.length()/2);
        System.out.println(yarı);

    }
}
