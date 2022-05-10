package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5); // TreeSet is a child of Set so like Set it also can't have duplicates
        //numbers.add(null); TREESET DOES NOT ALLOW ANY NULL VALUE AT ALL; JAVA WILL THROW AN java.lang.NullPointerException

        System.out.println(numbers); // [1, 2, 3, 5] --> prints sorted
        // TREESET SORTS IT'S ELEMENT BY DEFAULT(AUTOMATICALLY); NUMBERS => SMALL-BIG & STRING => ALPHABETICALLY (based on ASCII - upper to lower)

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");

        System.out.println(names); // [Alex, Joe, John, ali]




    }
}
