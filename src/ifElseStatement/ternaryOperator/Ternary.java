package ifElseStatement.ternaryOperator;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

    /* TERNARY OPERATOR:
    Java ternary operator it is used a lot in Java and can be used instead of if-else statement.
    Also, only can be used for simple if-else NOT if-elseif-else nor nested if-else.
    SYNTAX(HOW TO WRITE IT) ----->  dataType objectName = condition1 ? option1 : option2;
    ----> (expression) ? action for true(IF):action for false(ELSE)
    */
    // int smallestNumber = number1 < number2 ? number1 : number2; --> was only used once so don't have to store data
              // -WHAT YOU'RE TRYING TO FIND- ? -1ST TRUE : 2ND FALSE- 1st option is for true; 2nd option is for false

        Scanner scan = new Scanner(System.in);
        System.out.println("How tall are you?");
        int height = scan.nextInt();

        String printOut = ((height > 5) ? "You are tall" : "You can't go on the roller coaster");
        /* BETTER WAY TO WRITE IT IN ONE LINE OF CODE:
        System.out.println((scan.nextInt() > 5) ? "You are tall" : "You can't go on the roller coaster");
         */

        System.out.println("Enter your balance:");
        double balance = scan.nextDouble();





    }
}
