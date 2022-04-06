package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    1. generate a random number between 0 and 50 (both included)
    2. print true if number is in between 10 and 25 (both included); else print false
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    */
        int random = (int) (Math.random() * 51);
        System.out.println("Random number = " + random);
        System.out.println("Random number is between 10 and 25 = " + (random >= 10 && random <= 25));

    /* if (random <= 10 && random >= 25) System.out.println("Random number is between 10 and 25 = " + true);
    else System.out.println("Random number is between 10 and 25 = " + false);
        ** IF-ELSE STATEMENT CAN BE SIMPLIFIED TO A SINGLE LINE OF CODE IF THE OUTPUT IS TRUE-FALSE **
    */
        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    1. generate a random number between 1 and 100 (both included)
    2. find which quarter and half the random number is within
    3. print them out.
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    */
        int randomNumber = (int) (Math.random() * 101) + 1;
        System.out.println("Random number = " + randomNumber);

        if (randomNumber <= 50){
            System.out.println(randomNumber + " is in the 1st half");
            if (randomNumber <= 25){
                System.out.println(randomNumber + " is in the 1st quarter");
            }else if (randomNumber <= 50){
                System.out.println(randomNumber + " is in the 2nd quarter");
            }
        }else { System.out.println(randomNumber + " is in the 2nd half");
            }if (randomNumber <= 75) {
                System.out.println(randomNumber + " is in the 3rd quarter");
            }else // (randomNumber <= 100)
                {System.out.println(randomNumber + " is in the 4th quarter");}

        System.out.println("\nEND OF THE PROGRAM");

    System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. ask a user to enter 5 numbers between 1 and 10 (both included)
    2. multiply user's 5 numbers and add each results as points
    3. if user enters any number that is not in the range then no points will be given
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    */
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter 5 numbers between 1 and 10 (both included):");
    int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4= scan.nextInt(), num5 = scan.nextInt();

    int points = 0;
    /* NESTED IF STATEMENT IS USED FOR WHEN YOU'RE CHECKING THE CONDITION ONE THAN ONCE. FOR EXAMPLE, IF YOU'RE CHECKING
    FOR A LETTER AND THEN CHECKING AGAIN IF THE LETTER IS UPPERCASE THEN CHECK AGAIN IN LOWER CASE.
     */
    if (num1 >= 1 && num1 <= 10){
        points += (num1 * 5);
    }
    if (num2 >= 1 && num2 <= 10){
        points += (num2 * 4);
    }
    if (num3 >= 1 && num3 <= 10){
        points += (num3 * 3);
    }
    if (num4 >= 1 && num4 <= 10){
        points += (num4 * 2);
    }
    if (num5 >= 1 && num5 <= 10){
        points += (num5); // (num5 * 1) any number time 1 is itself so its understood
    }
    System.out.println("Points = " + points);

        System.out.println("\nEND OF THE PROGRAM");



    }
}
