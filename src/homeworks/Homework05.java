package homeworks;

import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args) {

        Scanner userMathInput = new Scanner(System.in);

        System.out.println("\n-----TASK 1------\n");
        /* pseudo code for task one:
        1. create a new object for the scanner and import it.
        2. ask user for 3 numbers and store it.
        3. find the maximum and minimum values of the given data.
         */
        System.out.println("Please enter three numbers to find their maximum and minimum values: ");
        int num1 = userMathInput.nextInt(), num2 = userMathInput.nextInt(), num3 = userMathInput.nextInt();
        int max12And3 = Math.max(Math.max(num1, num2), num3);
        int min12And3 = Math.min(Math.min(num1, num2), num3);;

        System.out.println("Max value = " + max12And3);
        System.out.println("Min value = " + min12And3);

        System.out.println("\n-----TASK 2------\n");
        /* pseudo code for task two: (reuse object for scanner; it's already imported)
        1. ask user for 5 numbers and store it.
        2. find the maximum and minimum values of the given data.
         */
        System.out.println("Please enter five numbers to find their maximum and minimum values: ");
        int n1 = userMathInput.nextInt(), n2 = userMathInput.nextInt(), n3 = userMathInput.nextInt(),
                n4 = userMathInput.nextInt(), n5 = userMathInput.nextInt();

        //int maxOfEveryNValue = Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);
        int minOfEveryNValue = Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5);

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5));
        System.out.println("Min value = " + minOfEveryNValue);

        System.out.println("\n-----TASK 3------\n");
        /* pseudo code for task three: (reuse object for scanner; it's already imported)
        1. ask user for 2 numbers and store it.
        2. find the absolute difference between the given data.
         */
        System.out.println("Please enter two numbers to find the absolute difference: ");
        int absValue1 = userMathInput.nextInt(), absValue2 = userMathInput.nextInt();
        //int absDifference = Math.abs(absValue1 - absValue2);

        System.out.println("The difference between numbers is = " + (Math.abs(absValue1 - absValue2)));

        System.out.println("\n-----TASK 4------\n");
        /* pseudo code for task four:
        1. store 3 random numbers between 50 and 100 both inclusive and print it.
        2. find the sum of the given data.
         */

        int random1 = (int) (Math.random() * 51) + 50;
        int random2 = (int) (Math.random() * 51) + 50;
        int random3 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 1 = " + random2);
        System.out.println("Number 1 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));

        System.out.println("\n-----TASK 5------\n");
        /* pseudo code for task five:
        1. solve the following problem with the given information.
        Assume Alex has $125 and Mike has $220. Alex is going to give $25.5 to Mike.
        How much money will Alex and Mike have after that?
         */
        double alexGivesMike$ = 125 - 25.5;
        double mike$NewTotal = 200 + 25.5;

        System.out.println("Alex's money: $" + alexGivesMike$);
        System.out.println("Mike's money: " + mike$NewTotal);

        System.out.println("\n-----TASK 6------\n");
        /* pseudo code for task six:
        1. solve the following problem with the given information.
        Assume David is going to save $390 to buy a bicycle but, David can only save $15.60 per day.
        Find how many days later, David can save $390 to buy the bicycle.
        */
        double davidDailySavings = 15.60; // didnt have to store data
        double costOfBike = 390;
        int daysTookToSave$ = (int)(costOfBike / davidDailySavings);

        System.out.println((int)(390 / 15.60));




    }
}
