package loops.controlStatements;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {

    /* TASK ONE:
    Write a program that prints all the number between 1 - 25.
    But skip the numbers that can be divided by 10.
    Now do not print any numbers that are more than 15.
    */

        for (int i = 1; i <= 25; i++){
            if (i % 10 == 0) continue; // continue; control statement is used here to skip any iteration where numbers % 10 and goes to next iteration (next number)
            else System.out.println(i); // skipped iteration 10 and iteration 20
            if (i >= 15) break; // break; control statement here will stop the loop when the number is >= 15 (doesn't run until previous termination point -- i <= 25)
        }
        // if (i % 10 == 0 || i % 3 == 0) continue; --> can use || to add another "skipped" iteration

        System.out.println("\nEND OF THE PROGRAM\n");

    /* TASK TWO:
    Write a Java program that ask user to enter 2 diff integers.
    Print all the numbers between given 2 integers starting from biggest to smallest (given numbers are included).
    HOWEVER, do not print any number less than 10.
    5 9 -> 9 8 7 6 5
    8 4 -> 8 7 6 5 4
    ** PSEUDO CODE: **
    1. ask user to enter 2 numbers
    2. store number in an int variable
    3. compare numbers biggest to smallest
    4. start a loop with below into:
        startPoint: max number
           endPont: min number
            update: decrement i--
    5. break loop when the number is less than 10.
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        int number1 = scan.nextInt(), number2 = scan.nextInt();

        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);

        for (int i = max; i >= min; i--){
            if (i < 10) break; // the loop is terminated when the number is less than 10; so it won't print numbers under 10
            System.out.println(i);
            //if (i < 10) break; --> CANNOT BE PLACED HERE BC JAVA READS TOP TO BOTTOM SO (i) WILL PRINT OUT AT 9 BEFORE CHECKING BREAK CONDITION
        }

        System.out.println("\nEND OF THE PROGRAM\n");

    /* TASK THREE:
    Write a Java program that asks user to enter 2 different integers between 0 and 10 ( 0 and 10 are included)
    Print all the numbers between given 2 integers starting from smallest to biggest (given numbers are included)
    HOWEVER, do not print the number of 5
    6 8   -> 6 7 8
    9 7   -> 7 8 9
    1 3   -> 1 2 3
    3 7   -> 3 4 6 7
    */
        System.out.println("Please enter two numbers:");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        //int max1 = Math.max(num1, num2); --> max/min used only once so don't have to store
        //int min1 = Math.min(num1, num2);

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if (i == 5) continue; // continue; skips and doesn't print when the iteration is == 5 but continue remaining iterations
            System.out.println(i);
        }




    }
}
