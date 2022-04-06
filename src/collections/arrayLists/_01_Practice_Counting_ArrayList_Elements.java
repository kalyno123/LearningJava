package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        // COUNTING: USE 1 LOOP, CONDITION, AND COUNTER.

        System.out.println("\n-----TASK 1------\n");
    /* TASK-1:
    Create an ArrayList called numbers that stores below numbers and print the list.
    10
    12
    13
    8
    9
    15
    RESULT: [10, 12, 13, 8, 9, 15]
    */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println("\n-----TASK 2------\n");
    /* TASK-2
    Count how many odd numbers you have in the list and print the results.
    RESULT: Odds = 3
    */
        System.out.println("\n-----T2 FOR-EACH LOOP------\n");
        int oddCounter = 0;
        for (Integer element : numbers){
            if (element % 2 != 0) oddCounter++;
        }
        System.out.println("Odds = " + oddCounter);

        System.out.println("\n-----T2 FOR-I LOOP------\n");
        oddCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) oddCounter++;
        }
        System.out.println("Odds = " + oddCounter);


        /* Extra Practices:
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
        */

        System.out.println("\n-----TASK 3------\n");
    /* TASK-3:
    Create a List called colors that store below elements and then print the list.
    Purple
    Yellow
    blue
    red
    Brown
    Black
    White
    RESULT:
    [Purple, Yellow, blue, red, Brown, Black, White]
    */
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);
        System.out.println(colors);

        System.out.println("\n-----TASK 4------\n");/*
    /* TASK-4:
    Count how many colors in the colors list are starting with uppercase
    RESULT:
    5
    */
        System.out.println("\n-----T3 FOR-EACH LOOP------\n");
        int upperCounter = 0;
        for (String element : colors){
            if(Character.isUpperCase(element.charAt(0))) upperCounter++;
        }
        System.out.println(upperCounter);

        System.out.println("\n-----T3 FOR-I LOOP------\n");
        upperCounter = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (Character.isUpperCase(colors.get(i).charAt(0))) upperCounter++;
        }
        System.out.println(upperCounter);


        /* Extra Practices:
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
         */




    }
}
