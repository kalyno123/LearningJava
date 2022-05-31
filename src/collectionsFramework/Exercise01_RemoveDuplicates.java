package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Exercise01_RemoveDuplicates {
    public static void main(String[] args) {

    /* TASK 1:
    Create an ArrayList and store below elements. From above list, remove all duplicates and print the unique elements.
    Computer
    Phone
    Mouse
    Mouse
    Phone
    Pen

    EXPECTED RESULT:
    [Computer, Phone, Mouse, Pen]
    */
        System.out.println("\n-------First way - not preferred--------\n");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("My list before removing = " + objects);

        // CREATE AN EMPTY LIST TO STORE UNIQUE VALUES
        ArrayList<String> uniques = new ArrayList<>();

        for (String element : objects){
            if (!uniques.contains(element)) uniques.add(element);
        }
        System.out.println("My list after removing duplicates = " + uniques); // [Computer, Phone, Mouse, Pen]

        LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
        System.out.println(myUniques); // CAN ALSO BE: System.out.println(new LinkedHashSet<>(objects));

        System.out.println("\n-------Second way - using collections--------\n"); // Any Set since Set doest allow duplicates
        //TreeSet -> will sort element; so output wont match --> Computer, Mouse, Pen, Phone
        //HashSet -> no prediction; since it does keep insertion order
        //LinkedHashSet -> is the one I need for this task since it keeps insertion order
        System.out.println(new LinkedHashSet<>(objects)); // [Computer, Phone, Mouse, Pen]

        


    }
}
