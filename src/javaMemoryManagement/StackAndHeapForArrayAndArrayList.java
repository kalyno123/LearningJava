package javaMemoryManagement;

import java.util.ArrayList;
import java.util.Arrays;

public class StackAndHeapForArrayAndArrayList {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Kaly";

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(Arrays.toString(names));
        System.out.println(nameList);

        ArrayList<String> newList = nameList; // nameList is
        nameList = null; // relationship is broken
        //NULL KEYWORD MEANS "AN OBJECT POINTING TO NOTHING" (no reference in Heap)
        System.gc();



    }
}
