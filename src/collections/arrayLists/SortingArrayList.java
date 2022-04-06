package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {

        //HOW TO SORT AN ARRAY:
        int[] numbersArray = {3,7,0,4};

        System.out.println("My Array before sorting = " + Arrays.toString(numbersArray)); // [3, 7, 0, 4]
        Arrays.sort(numbersArray);
        System.out.println("My Array before sorting = " + Arrays.toString(numbersArray)); // [0, 3, 4, 7]

        //HOW TO SORT AN ARRAYLIST:
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(7);
        numberList.add(0);
        numberList.add(4);
        System.out.println("My ArrayList before sorting = " + numberList); // [3, 7, 0, 4]

        Collections.sort(numberList);
        System.out.println("My ArrayList after sorting = " + numberList); // [0, 3, 4, 7]




    }
}
