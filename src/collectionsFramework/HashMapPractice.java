package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class HashMapPractice {
    public static void main(String[] args) {

        System.out.println("\n---------Understanding Map---------\n");
    /* TASK:
    String - String
    Key - value
    Ukraine -> Kiev
    Spain -> Madrid
    Portugal -> Lisbon
    Italy -> Roma
    US -> DC
    Canada -> Ottawa
    */
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Rome");
        capitals.put("USA", "Washington D.C.");

        System.out.println(capitals); // {USA=Washington D.C., Ukraine=Kiev, Italy=Rome, Portugal=Lisbon, Spain=Madrid}
        // HASHMAP DOES NOT KEEP INSERTION ORDER -- RANDOM ORDER^^
        // LINKEDHASHMAP KEEPS INSERTION ORDER ---> {Ukraine=Kiev, Spain=Madrid, Portugal=Lisbon, Italy=Rome, USA=Washington D.C.}
        // TREEMAP WILL SORT THE INSERTION ORDER ---> {Canada=Ottawa, Italy=Roma, Portugal=Lisbon, Spain=Madrid, US=DC, Ukraine=Kiev}

        System.out.println(capitals.get("Spain")); // madrid --> get(); method takes 'key' as args
        System.out.println(capitals.get("Germany")); // null --> when a key doesn't exist it'll return null
        System.out.println(capitals.get("US")); // null

        System.out.println("\n---------Understanding HashMap---------\n");

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John");
        students.put(null, "Alex"); // since KEYS cannot be duplicated --- any duplicated key will reassign its previous

        System.out.println(students.size()); // 5 --> will only counting 5 since duplicated value (same key only updates value not add)
        System.out.println(students); // {null=Alex, 1=Alona, 2=Abdullah, 3=Abdullah, 4=Data} --> John is reassigned to Alex





    }
}
