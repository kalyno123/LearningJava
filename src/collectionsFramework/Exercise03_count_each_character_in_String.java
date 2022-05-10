package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_count_each_character_in_String {
    public static void main(String[] args) {

    /* TASK 1:
    Count each character
    C=1
    h=1
    i=4
    c=3
    a=2
    g=1
    o=1
     =4
    s=1
    n=1
    e=1
    t=1
    y=1
    */
        String word = "Chicago is a nice city";
        LinkedHashMap<Character, Integer> countChars = new LinkedHashMap<>();

        for (Character element : word.toCharArray()){// string converted to char array -- each letter are now separate elements
            if (!countChars.containsKey(element)) countChars.put(element, 1);
            else countChars.put(element, countChars.get(element+1));
        }

        for(Map.Entry entry : countChars.entrySet()){
            System.out.println(entry);
        }





    }
}
