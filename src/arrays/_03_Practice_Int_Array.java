package arrays;

import java.util.Arrays;

public class _03_Practice_Int_Array {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
        /* TASK-1
        Create an int array and store below data
        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15
        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
        */
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers)); //[-3, -7, 0, 2, 0, 7, 7, 10, 2, 15]

        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers)); //[-7, -3, 0, 0, 2, 2, 7, 7, 10, 15]


        System.out.println("\n-------TASK-2-------\n");
        /* TASK-2
        Count how many positive-negative and zero numbers you have
        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
        */
        System.out.println("\n---------TASK-2 one way----------\n");
        int countPositive = 0, countNegative = 0, countZero = 0;
        for (int element : numbers){
            if (element == 0) countZero++;
            else if (element > 0) countPositive++;
            else //(element < 0)
            countNegative++;
        }
        System.out.println("Positives = " + countPositive);
        System.out.println("Negatives = " + countNegative);
        System.out.println("Zeros = " + countZero);

        System.out.println("\n---------TASK-2 second way----------\n");
        int pos = 0, neg = 0;
        for (int number : numbers) {
            if(number > 0) pos++;
            else if(number < 0) neg++;
        }
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + (numbers.length - pos - neg));


        System.out.println("\n-------TASK-3-------\n");
        /* TASK-3
        Count how many even and odds
        EXPECTED:
        Evens = 5
        Odds = 5
        */
        System.out.println("\n---------TASK-3 one way----------\n");
        int countEven = 0, countOdd = 0;
        for (int element : numbers){
            if (element % 2 == 0) countEven++;
            else // (element % 2 != 0)
            countOdd++;
        }
        System.out.println("Evens = " + countEven);
        System.out.println("Odds = " + countOdd);

        System.out.println("\n---------TASK-3 second way----------\n");
        int countEvenNumbers = 0;
        for (int element : numbers){
            if (element % 2 == 0) countEvenNumbers++;
        }
        System.out.println("Evens = " + countEvenNumbers);
        System.out.println("Odds = " + (numbers.length - countEvenNumbers));





        /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits (hint: x <= 10 && x >= 99)
        */




    }
}
