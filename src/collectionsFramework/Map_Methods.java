package collectionsFramework;

import java.util.*;

public class Map_Methods {
    public static void main(String[] args) {

        HashMap<String, String> favorites = new HashMap<>();

        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        System.out.println(favorites.get("Pet").length()); // this is how to find length of the key's value

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle
        // Since keys are always unique it'll return a unique collection aka SET so store keys in SET collection
        // Since values can be duplicated(not unique) then store it in Collection

        //keySet(); & values(); are methods to get only the keys or only the values
        Set<String> keys = favorites.keySet(); // <-- this method comes from Map
        System.out.println(keys); // [Car, Color, City, Day, Pet]

        Collection<String> values = favorites.values(); // <-- this method comes from Map
        System.out.println(values); // [Lexus, Black, Chicago, Friday, Turtle]

        System.out.println(values.stream().filter(element -> element.length() > 5).count()); // 3
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); // 3

        Set<Map.Entry<String, String>> entries = favorites.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println("My favorite " + entry.getKey() + " is = " +  entry.getValue());
        }

        favorites.remove("Day");
        favorites.remove("Pet", "Turtle");
        System.out.println(favorites);

        favorites.replace("Car", "Tesla");
        System.out.println(favorites);

        System.out.println(favorites.containsKey("Color")); // true
        System.out.println(favorites.containsKey("Sport")); // false
        System.out.println(favorites.containsValue("Tesla")); // true
        System.out.println(favorites.containsValue("Ice-Cream")); // false






    }
}
