package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner numberInput = new Scanner(System.in);

        System.out.println("\n-----TASK 1------\n");
        /* Pseudo code for task one:
        1. create a new object for scanner and import it.
        2. ask user for 2 data values and store it.
        3. find the average of given data values.
        4. print them out.
         */

        System.out.println("Please enter two numbers to find their average: ");
        int numAvg1 = numberInput.nextInt(), numAvg2 = numberInput.nextInt();

        System.out.println("The average of the given 2 numbers is: " + ((numAvg1 + numAvg2)/2));
        /* System.out.println("The average of the given 2 numbers is: " + ((numberInput.nextInt() + numberInput.nextInt())/2));
            THIS IS A MORE EFFICIENT WAY OF CODING THIS ^^ SIMPLIFY ANY VARIABLE USED ONCE VS MORE THAN ONCE
         */

        System.out.println("\n-----TASK 2------\n");
        /* Pseudo code for task two: (reuse object for scanner; it's already imported)
        1. ask user for 2 data values and store it.
        2. find the product of given data values.
        3. print them out.
         */

        System.out.println("Please enter two numbers to find their product: ");
        int numProduct1 = numberInput.nextInt(), numProduct2 = numberInput.nextInt();

        System.out.println("The product of the given 2 numbers is: " + (numProduct1 * numProduct2));
        // System.out.println("The product of the given 2 numbers is: " + (numberInput.nextInt() * numberInput.nextInt()));

        System.out.println("\n-----TASK 3------\n");
        /* Pseudo code for task three: (reuse object for scanner; it's already imported)
        1. ask user for 3 data values and store it.
        2. find the square root of given data values.
        3. print them out.
         */

        System.out.println("Please enter three numbers to find each of their square values: ");
        int numSq1 = numberInput.nextInt(), numSq2 = numberInput.nextInt(), numSq3 = numberInput.nextInt();

        System.out.println("The " + numSq1 + " multiplied with " + numSq1 + " is = " + (numSq1 * numSq1));
        System.out.println("The " + numSq2 + " multiplied with " + numSq2 + " is = " + (numSq2 * numSq2));
        System.out.println("The " + numSq3 + " multiplied with " + numSq3 + " is = " + (numSq3 * numSq3));

        System.out.println("\n-----TASK 4------\n");
        /* Pseudo code for task four: (reuse object for scanner; it's already imported)
        1. ask user for 2 data values and store it.
        2. find the remainder of given data values.
        3. print them out.
         */

        System.out.println("Please enter two numbers to find the remainder of the first number by the second number: ");
        int numRemainder1 = numberInput.nextInt(), numRemainder2 = numberInput.nextInt();

        System.out.println("The remainder of " + numRemainder1 + " % " + numRemainder2 + " is = " + (numRemainder1 % numRemainder2));

        System.out.println("\n-----TASK 5------\n");
        /* Pseudo code for task five: (reuse object for scanner; it's already imported)
        1. ask user for 5 data values and store it.
        2. find the average of given data values.
        3. print them out.
         */

        System.out.println("Please enter five numbers to find their total average: ");
        int valueAvg1 = numberInput.nextInt(), valueAvg2 = numberInput.nextInt(), valueAvg3 = numberInput.nextInt(),
                valueAvg4 = numberInput.nextInt(), valueAvg5 = numberInput.nextInt();

        System.out.println("The average of the given 5 numbers is: " + ((valueAvg1 + valueAvg2 + valueAvg3 + valueAvg4 + valueAvg5)/5));
        // System.out.println("The average of the given 5 numbers is: " + ((numberInput.nextInt() + numberInput.nextInt() + numberInput.nextInt() + numberInput.nextInt() + numberInput.nextInt())/5));

        System.out.println("\n-----TASK 6------\n");
        /* Pseudo code for task six: (reuse object for scanner; it's already imported)
        1. ask user for a data value and store it.
        2. find the product from 1-10 of given data values.
        3. print them out.
         */

        System.out.println("Please enter a number to find the product  of it from 1-10: ");
        int a = numberInput.nextInt();
        // int b = 1;

        System.out.println("a * 1 = " + (a * 1));
        System.out.println("a * 2 = " + (a * 2));
        System.out.println("a * 3 = " + (a * 3));
        System.out.println("a * 4 = " + (a * 4));
        System.out.println("a * 5 = " + (a * 5));
        System.out.println("a * 6 = " + (a * 6));
        System.out.println("a * 7 = " + (a * 7));
        System.out.println("a * 8 = " + (a * 8));
        System.out.println("a * 9 = " + (a * 9));
        System.out.println("a * 10 = " + (a * 10));
        /* A MORE DYNAMIC AND EFFICIENT WAY TO CODE THIS^^
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        System.out.println("a * b = " + (a * b = b++));
        */

        System.out.println("\n-----TASK 7------\n");
        /* Pseudo code for task seven: (reuse object for scanner; it's already imported)
        1. ask user for a data value and store it.
        2. find the perimeter and area of the square using the given data value.
        3. print them out.
         */

        System.out.println("Please enter a number to find the perimeter and area of a square: ");
        int squarePA = numberInput.nextInt();

        System.out.println("Perimeter of the square = " + (squarePA * 4));
        System.out.println("Area of the square = " + (squarePA * squarePA));



    }

}
