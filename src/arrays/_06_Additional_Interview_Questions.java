package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
    /* TASK 1:
    int[] numbers = {5, 3, 0, -5};
    Find the greatest and print it
    RESULT:
    {5, 3, 0, -5} -> 5
    {4, 10, 15} -> 15
    */
        /* ONE WAY TO DO IT:
        int[] numbers1 = {5, 3, 0, -5};
        Arrays.sort(numbers1);
        System.out.println(numbers1[numbers1.length-1]);
        */

    // USING FOR-EACH LOOPS:
    //Initialize array
    int[] numbers1 = {5, 3, 0, -5};
    //Initialize max with first element of array
    int max = numbers1[0];
    //Loop through the array
    for (int element : numbers1) {
    //Compare each element of array with max
        max = Math.max(max, element);
    }
    System.out.println("Largest element present in given array = " + max);

    /* USING FOR-I LOOPS:
    int[] numbers1 = {5, 3, 0, -5};
    int max = numbers1[0];
    for (int i = 0; i < numbers1.length; i++) {
        if (numbers1[i] > max) max = numbers1[i];
    } System.out.println("Largest element present in given array = " + max);
    */

        System.out.println("\n-------TASK-2-------\n");
    /* TASK-2
    Create a double array and store below elements
    {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}
    Find the minimum value
    RESULT:
    0.5
    */
    // USING FOR-EACH LOOPS TO FIND MIN:
    double[] numbers2 = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
    double min = Double.MAX_VALUE; // Double.MAX_VALUE --> find the max double value; here is initializing min with MAX value
    for (double element : numbers2) { // looping through each element of the array
        min = Math.min(min, element); // min is reassigned to the min value when min is compared with each element
    }
    System.out.println("Smallest element present in given array = " + min);

    /* USING FOR-I LOOPS TO FIND MIN:
    double[] numbers2 = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
    double min = Double.MAX_VALUE;
    for (int i = 0; i < numbers2.length; i++) {
        if (numbers[i] < min) min = numbers2[i];
    } System.out.println("Smallest element present in given array = " + min);
    */

        System.out.println("\n-------TASK-3-------\n");
    // find second-smallest value of given int array: {2, 7, 1, 1, 7}

        System.out.println("\n---------TASK-3 for-i loop----------\n");
        int[] numbersArray = {2, 7, 1, 1, 7};
        // initialize the smallest and second-smallest values with INT MAX
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < numbersArray.length; i ++) {// loop through the array
            // If current element is smaller than first-min then update both first-min and second-min
            if (numbersArray[i] < firstMin) { // if the element of that iteration is less than the variable(firstMin)
                secondMin = firstMin; // second smallest reassigned to smallest
                firstMin = numbersArray[i]; // smallest reassigned to the element of current iteration its in
            }
            // If numbersArray[i] is in between first and second then update second
            else if (numbersArray[i] < secondMin && numbersArray[i] != firstMin)
                secondMin = numbersArray[i];
        }
        System.out.println("The smallest element is " + firstMin + " and second smallest element is " + secondMin);


        System.out.println("\n---------TASK-3 for-each loop----------\n");
        int smallest = Integer.MAX_VALUE; // 1
        int secondSmallest = Integer.MAX_VALUE; // 2

        //2, 7, 1, 1, 7
        for(int number : numbersArray) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) secondSmallest = number;
        }
        System.out.println("The smallest number in the array = " + smallest);
        System.out.println("The second smallest number in the array = " + secondSmallest);

            System.out.println("\n---------TASK 3 finding 2nd min. w/ 2 loops----------\n");
        int min1 = Integer.MAX_VALUE; // 1
        int min2 = Integer.MAX_VALUE; // 3

        for (int element : numbersArray) {
            if(element < min1) min1 = element;
        }

        for (int element : numbersArray) {
            if(element < min2 && element != min1) min2 = element;
        }

        System.out.println("The smallest number in the array = " + min1);
        System.out.println("The second smallest number in the array = " + secondMin);




    }
}
