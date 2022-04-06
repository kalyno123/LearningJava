package ifElseStatement.nestedIfElseStatement;

import java.util.Scanner;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args){

    /* PSEUDO CODE:
    1. generate a random number between 0 and 10 (both inclusive)
    2. find the max and min w/o math methods
     */

    int num1 = (int)(Math.random() * 11), num2 = (int)(Math.random() * 11);
        System.out.println(num1);
        System.out.println(num2);
    if(num1 > num2){ // this IF finds if num1 is bigger than num2
        System.out.println("The max number between " + num1 + " and " + num2 + " is = " + num1);
    } // the ELSE statement is not needed here bc its understood that if num1 !> num2 then num2 >= num1 (less code best code)

    /* SHORT-CUT IF ELSE STATEMENT --> when if-else has only one line of code to run then the curly braces can be erased.
        if(num1 > num2) System.out.println("The max number between " + num1 + " and " + num2 + " is = " + num1);
        else System.out.println("The max number between " + num1 + " and " + num2 + " is = " + num2);
    */

    /* PSEUDO CODE:
    1. create a new object for scanner and import it
    2. ask user to enter 2 numbers
    3. find the smallest number w/o using math.min()
    */
    Scanner scan = new Scanner(System.in);
    System.out.println("\nPlease enter two numbers:");
    int number1 = scan.nextInt(), number2 = scan.nextInt();

    if(number1 < number2){
        System.out.println("The min number between " + number1 + " and " + number2 + " is = " + number1);
    }else { // since it is ELSE it covers all others left over conditions don't need to say number1 > number2.
        System.out.println("The min number between " + number1 + " and " + number2 + " is = " + number2);
    }

        System.out.println("END OF THE PROGRAM");

    /* TERNARY OPERATOR:
    Java ternary operator it is used a lot in Java and can be used instead of if-else statement.
    Also, only can be used for simple if-else NOT if-elseif-else nor nested if-else.
    SYNTAX(HOW TO WRITE IT) ----->  dataType objectName = condition1 ? option1 : option2;
    */
    // int smallestNumber = number1 < number2 ? number1 : number2; --> was only used once so don't have to store data
            // -WHAT YOU'RE TRYING TO FIND- ? -1ST TRUE : 2ND FALSE- 1st option is for true; 2nd option is for false
        System.out.println(number1 < number2 ? number1 : number2);
        System.out.println("END OF THE PROGRAM");






    }
}
