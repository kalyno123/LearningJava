package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add(null); // LinkedHashSet is a child of Set so like Set it also can only have one null
        words.add("John");
        words.add("John"); // LinkedHashSet is a child of Set so like Set it also can't have duplicates

        System.out.println(words); // [Foo, Bar, foo, BAR, null, John] --> insertion order kept
        // LinkedHashSet KEEPS INSERTION ORDER BUT STILL DOESN'T ALLOW DUPLICATE, ALLOW ONLY ONE NULL, AND CAN'T ACCESS USING INDEX METHODS.


    }
}
