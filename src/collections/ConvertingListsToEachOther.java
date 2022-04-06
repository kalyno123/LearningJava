package collections;

import java.util.*;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {

        /* CONVERTING:
        ArrayList - LinkedList
        LinkedList - ArrayList
        Vector - ArrayList
        ArrayList - Vector
        .
        .
        */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("The ArrayList is = " + numbers);

        //CONVERTING ARRAYLIST TO LINKEDLIST:
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers); // list you want to convert goes into the (parameter aka CONSTRUCTOR)
        System.out.println("The LinkedList is = " + numbers2);

        //CONVERTING ARRAYLIST TO LINKEDLIST:
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);

        String[] namesArray = {"Kaly", "Taylor", "Torrie"};
        //Vector<String> names = new Vector<>(Arrays.asList(namesArray));
        List<String> names = new Vector<>();
        Collections.addAll(names, namesArray);
        System.out.println(names);
        /*
        VECTOR: is synchronized ArrayList .. synchronized = thread-safe
        thread .. single thread -- multiple thread .. executing multiple codes at the same time but VECTOR(thread safe)
        waits for certain codes to complete first implicitly before running so there's fewer issues.
        */








    }
}
