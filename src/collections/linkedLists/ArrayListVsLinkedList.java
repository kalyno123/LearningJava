package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);
        System.out.println(numbers); // [10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-----Looping LinkedList------\n");
        for (Double element : numbers){
            System.out.println(element);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\n-----Some methods of LinkedList------\n");
        System.out.println(numbers.get(0)); // 10.5
        System.out.println(numbers.getFirst()); // 10.5 -- gets the first element of the LinkedList
        System.out.println(numbers.getLast()); // 17.7 -- gets the last element of the LinkedList

        System.out.println(numbers.peek()); // 10.5 -- this is like getFirst();
        System.out.println(numbers.poll()); // retrieves the first element and removes it; it returns the number it removes
        System.out.println(numbers.pollFirst()); // same as poll(); & pop();
        System.out.println(numbers.pollLast()); // retrieves the last element and removes it; it returns the number it removes

        System.out.println("\n-----Some more methods of LinkedList------\n");
        numbers.push(5.7); // adds the object(element) to the head(beginning)
        numbers.push(8.9);
        System.out.println(numbers.pop()); // return element removes = 8.9; pop(); removes the head(first) element
        System.out.println(numbers); // [5.7, 13.3]


    }
}
