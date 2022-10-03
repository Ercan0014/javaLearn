package bizim_Java.j09_SwitchStatement.taskSwitch;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

Scanner sc = new Scanner(System.in);
		System.out.println("VIP kelimesinden bir harf seç açılımı söyleyeyim:");
		char karakter= sc.next().toLowerCase().charAt(0);

		switch (karakter){
			case 'v':
				System.out.println("v harfinin açılımı very");
				break;
			case 'ı':
				System.out.println("ı harfinin açılımı important");
				break;
			case 'p':
				System.out.println("p harfinin açılımı person");
				break;
			default:
				System.out.println("hatalı karakter girdiniz");

		}

	}
}
