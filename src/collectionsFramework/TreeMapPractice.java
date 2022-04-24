package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Torrie", 20);
        studentAges.put("Alona", 15);
        studentAges.put("andrei", null);
        // studentAges.put(null, 25); TREEMAP DOES NOT ALLOW ANY NULL KEYS AT ALL; JAVA WILL THROW AN java.lang.NullPointerException
        studentAges.put("Regina", null);
        // TREEMAP DOESN'T ALLOW FOR A NULL KEYS BUT IT DOES ALLOW DUPLICATED NULL VALUES


        System.out.println(studentAges); // {Alona=15, Kaly=17, Torrie=20, andrei=25}




    }
}
