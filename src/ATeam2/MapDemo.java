package ATeam2;

import java.util.*;
public class mapOrnek {



    public class MapDemo {
        Map<String, String> map1, map2;
        public static void main(String[] args) {
            MapDemo md = new MapDemo();
            md.map1 = new HashMap<String, String>();
            md.map1.put("ALATLI", "20895548");
            md.map1.put("DAMLA", "20894828");
            md.map1.put("AYKUT", "20893085");
            md.map1.put("CAN", "20793172");
            System.out.println();
            System.out.println("Map Öğeleri:");
            System.out.println("\t" + md.map1);
            System.out.println("putAll() metodu ile ile aktarma :");
            md.map2 = new HashMap<String, String>();
            md.map2.putAll(md.map1);
            System.out.println("\t" + md.map2);
            System.out.println("TreeMap yapısına dönüştürme :");
            TreeMap treeMap = new TreeMap(md.map2);
            System.out.println("\t" + treeMap);
        }
    }
