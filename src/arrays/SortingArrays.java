package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
    /*HOW TO SORT AN ARRAY OF NUMBERS:
    byte, short, int, long, float, double
    We will sort these in ascending order
    ASCENDING: lowest to greatest;
    */
        System.out.println("\n--------Sorting Numbers--------\n");
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        int[] numbersAscending = numbers; // reassigned original array to sorted array
        System.out.println("My array is = " + Arrays.toString(numbers));

        // SORT THIS ARRAY IN ASCENDING ORDER: {-5, 0, 0, 0, 3, 7, 9, 10}
        Arrays.sort(numbers); //it is sorted right away; IT ONLY SORT IN ASCENDING ORDER!
        // sort(); method is static (must be invoked by className and void (so it doesn't return anything so can't put in sout)

        System.out.println("\n--------Sorting Chars--------\n");
        char[] characters = {'A', 'b', 'z', 'H'};
        System.out.println("My characters array = " + Arrays.toString(characters)); // [A, b, z, H]

        Arrays.sort(characters); // this sort chars by its decimal from the ascii table
        System.out.println("My characters array = " + Arrays.toString(characters)); // [A, H, b, z]

        System.out.println("\n--------Sorting Strings--------\n");
        String[] names = {"Adam", "Alex", "Alexa", "tom", "ally", "Adele", "terry", "Josh"};
        System.out.println("My names array sorted = " + Arrays.toString(names));

        /* OPTIONAL: Do this step to covert all the name in the array toLowerCase/toUpperCase before sorting.
        So it sorts all the name as Lexicographical without differentiating between uppercase and lowercase letters.*/
        for (int i = 0; i < names.length; i++){
            names[i] = names[i].toLowerCase();
        }
        Arrays.sort(names); // Strings are sorted Lexicographically then by its decimal ascii values (Uppercase then Lowercase).
        System.out.println("My names array sorted = " + Arrays.toString(names));



    }
}
