package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {


        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Create a List and store below data - countries. Print your list.
    USA
    Brasil
    Argentina
    France
    Belgium
    Germany
    Portugal
    RESULT:
    [USA, Brasil, Argentina, France, Belgium, Germany, Portugal]
    */
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");
        System.out.println(countries);
        // OR JUST DECLARE ALL COUNTRIES INTO AN ARRAY
        String[] country = {"USA", "Brazil", "Argentina", "France", "Belgium", "Germany", "Portugal"};


        System.out.println("\n-----HOW TO CONVERT ARRAY TO LIST(ARRAYLIST/LINKEDLIST):------\n");
        // ONE WAY TO CONVERT:
        List<String> countries1 = new ArrayList<>(Arrays.asList(country));
        System.out.println(countries1);

        // ANOTHER WAY TO CONVERT:
        List<String> countries2 = new ArrayList<>();
        //Collections.addAll(countries2, countries); // (first parameter = is the collection you want list to be added to, second parameter = is the collection of element you want to add)
        System.out.println(countries2);

        // ANOTHER WAY TO CONVERT (MANUAL WAY):
        int[] number = {1,2,3,4,5};
        List<Integer> numberList = new ArrayList<>(); // OR CAN BE LinkedList<>():
        for (int element : number){
            numberList.add(element); // here its autoboxing(widening) -- casting primitive to object
        }
        System.out.println(numberList);









    }
}
