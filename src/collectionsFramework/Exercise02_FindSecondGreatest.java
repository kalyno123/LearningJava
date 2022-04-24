package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_FindSecondGreatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        TreeSet<Integer> uniques = new TreeSet<>(numbers);
        System.out.println(uniques); // [1, 3, 5, 7, 10]

        // ArrayList uniquesList = new ArrayList<>(new TreeSet<>(numbers));
        ArrayList uniquesList = new ArrayList<>(uniques);
        System.out.println(uniquesList.get(uniquesList.size()-2)); // 7
        System.out.println(uniquesList.get(1)); // 5




    }
}
