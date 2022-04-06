package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        System.out.println("\n-----TASK 1------\n");
    /* TASK-1:
    Find unique elements in this and print them
    RESULT:
    [Cup, Book, Pen, Pencil]
    */
        ArrayList<String> uniqueElements = new ArrayList<>(); // this is a container to hold all the elements that is unique(notDup)
        for (String element : objects) {
            if (!uniqueElements.contains(element)){ // here is checking if the container doesn't(!) contain the element of current iteration then add it
                uniqueElements.add(element); // when and if the condition is true then add the element to the container
            }
        }
        System.out.println(uniqueElements);
        










    }
}
