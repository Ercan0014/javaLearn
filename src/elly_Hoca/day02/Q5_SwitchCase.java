package elly_Hoca.day02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q5_SwitchCase {
    public static void main(String[] args) {

   /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
    switch() de int, byte, short, char, String kullanilir.
     */
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

            String day = "Wednesday";
            switch (day) {
                case "Monday":
                case "Tuesday":
                    System.out.println("Java class");
                    break;
                case "Thursday":
                case "Friday":
                    System.out.println("Selenium class");
                    break;
                case "Wednesday":
                case "Saturday":
                    System.out.println("SQL class");
                    break;
                default:
                    System.out.println("day off");
            }
        }
    }
