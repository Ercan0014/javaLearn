package ATeam2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Method extends Kisi {

    static Scanner sc=new Scanner(System.in);
    static String tercih;
    public Method(String adSoyad, String kimlikNo, int yas) {
        super(adSoyad, kimlikNo, yas);
    }
    String [] brans={"Kimya","Matematik","Yabancı Dil","Edebiyat","Fizik"};
    String [] siniflar={"1A","1B","2A","2B","3A","3B"};
    ArrayList<Kisi>ogretmen=new ArrayList<>();
    ArrayList<Kisi>ogrenci=new ArrayList<>();


    public static void panelMenu(){

        System.out.println("**********************************    "+" \nOGRENCI VE OGRETMEN YONETIM PANELI\n"+"**********************************");
        System.out.println("1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
        System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");

        String secim = sc.next().toUpperCase();

        switch (secim){

            case "1":
                tercih="ogrenci";
                islemMenusu();
                break;
            case "2": tercih="ogretmen";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("yanlış tuşlama yaptınız");
                panelMenu();
                break;


        }



    }

    private static void cikis() {
        System.out.println("Sistemden çıkış yaptınız.");
    }

    private static void islemMenusu() {
        System.out.println("Seciminiz:  "+tercih+" Lutfen asagidaki islemlerden tercih yapiniz.\n"
                +"*********** "+" ISLEMLER ************\n"+" 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");


        System.out.print("islem tercihinizi giriniz : ");
        String islem = sc.next();

        switch (islem){
            case "1":ekle();
                islemMenusu();
                break;
            case "2":
                arama();
                islemMenusu();
                break;
            case "3":
                listele();
                islemMenusu();
                break;
            case "4":
                sil();
                islemMenusu();
                break;
            case "q":
                System.out.println("Sistemden çıkış yaptınız.");
                break;
            default:
                System.out.println("yanlış tuşlama yaptınız");
                islemMenusu();
                break;

        }

    }

    private static void sil() {
    }

    private static void listele() {
    }

    private static void arama() {
    }

    private static void ekle() {
    }

}