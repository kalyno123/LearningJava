package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

    /* TASK 1:
    Create a list to store below cities:
    Berlin
    Chicago
    Dallas
    Miami
    Brugge
    Kiev
    Print the list
    Then, remove Miami and Dallas
    Print the list again
    RESULT:
    [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
    [Berlin, Chicago, Brugge, Kiev]
     */
        String[] citiesArray = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        List<String> citiesList = new LinkedList<>(Arrays.asList(citiesArray)); // used LinkedList for this task bc when adding/removing elements its more efficient/preferred
        System.out.println(citiesList); // [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        citiesList.remove("Miami"); // OR FOR FUN: citiesList.removeIf(element -> element.equals("Dallas"));
        citiesList.remove("Dallas");
        System.out.println(citiesList); // [Berlin, Chicago, Brugge, Kiev]









    }
}
