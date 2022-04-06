package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        /* USING CONTAINS IS CHECKING IS EACH ELEMENT ITSELF CONTAIN THE VARIABLE YOU'RE LOOKING FOR.
        RATHER THAN CHECKING IF IN THE ENTIRE ARRAY CONTAINS A SPECIFIC VARIABLE */

        System.out.println("\n-------TASK-1-------\n");
    /* TASK-1
    Check the collection you have above and print true if it contains Mouse. Print false otherwise.
    RESULT:
    true
    */
    String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

    boolean hasMouse = false;
    for (String element : objects){
        if (element.equals("Mouse")) {
            hasMouse = true;
            break;
        }
    }
        System.out.println(hasMouse);


        System.out.println("\n-------TASK-2-------\n");
    /* TASK-2
    Check the collection you have above and print true if one of the element is board. Print false otherwise.
    RESULT:
    false
    */
    boolean hasBoard = false;
    for (String element : objects){
        if (element.equals("board")) {
            hasBoard = true;
            break;
        }
    }
        System.out.println(hasBoard);


        System.out.println("\n-------TASK-3-------\n");
        /* TASK-3
        Check if you have an element equals to "iPad"
        If so, print true. Else, print false

        Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the second is the element you are looking for

        1.One element is found -> it returns the index of the element - more than or equal to zero
        2.Multiple elements are found -> it returns the index of last occurrence
        3.No element found -> always returns negative index (-possible index -1)
        */

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
                                          // index:     0          1       2        3        4
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // index: 4; true -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // index: 2; true -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // index: -1; false -- ELEMENT DOESN'T EXIST
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // index: 0; true -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // index: -1; false -- ELEMENT DOESN'T EXIST

        System.out.println("\n-------TASK-4-------\n");
    /* TASK-4
    Create an int array to store data: {5, -2, 0, -7, 0, 5, 8, 45, 53}
    Check if collection has 5
    Check if collection has 0
    Check if collection has 45
    Check if collection has 3
    RESULT:
    true
    true
    true
    false
    */
    int[] numbers = {5, -2, 0, -7, 0, 5, 8, 45, 53};
    Arrays.sort(numbers); // after sorting order will be: [-7, -2, 0, 0, 5, 5, 8, 45, 53]

    // USE BINARY SEARCH WHEN LOOKING IF AN ARRAY HAS/CONTAINS A CERTAIN ELEMENT (positive # = exist; negative # = don't exist):
        System.out.println(Arrays.binarySearch(numbers, 5) >= 0); // index: 4/5 -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(numbers, 0) >= 0); // index: 2/3 -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(numbers, 45) >= 0); // index: 7 -- ELEMENT EXIST
        System.out.println(Arrays.binarySearch(numbers, 3) >= 0); // index: -5 -- ELEMENT DOESN'T EXIST
        System.out.println(Arrays.binarySearch(numbers, -7) >= 0); // index: 0 -- ELEMENT EXIST




    }
}
