package ifElseStatement.switchStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {
    /* PSEUDO CODE:
    1. create a new object for the scanner and import it
    2. ask user to enter which day it is w/ monday = 1 .. (1-5)
    3. based on the answer print what color will be selected
    Monday -> Blue
    Tuesday -> Red
    Wednesday -> Purple
    Thursday -> Yellow
    Friday -> Orange
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter what day it is as number 1-5 for M-F");
        int whatDayIsIt = scan.nextInt();
        //String monday = "Blue", tuesday = "Red", wednesday = "Purple", thursday = "Yellow", friday = "Orange"; --> if-else only takes boolean

        if (whatDayIsIt == 1) {
            System.out.println("You are wearing BLUE");
        } else if (whatDayIsIt == 2) {
            System.out.println("You are wearing RED");
        } else if (whatDayIsIt == 3) {
            System.out.println("You are wearing PURPLE");
        } else if (whatDayIsIt == 4) {
            System.out.println("You are wearing YELLOW");
        } else if (whatDayIsIt == 5) {
            System.out.println("You are wearing ORANGE");
        } else if (whatDayIsIt == 6 || whatDayIsIt == 7) {
            System.out.println("It is the WEEKEND");
        } else {
            System.out.println("Number you entered was not accepted");
        }

        // SWITCH STATEMENT: IT IS LIKE IF-ELSE STATEMENT BUT IT'S BASED ON CASES INSTEAD OF CONDITIONS.
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Blue");
                break;
            case 2:
                System.out.println("Red");
            case 3:
                System.out.println("Purple");
            case 4:
                System.out.println("Yellow");
            case 5:
                System.out.println("Orange");
            case 6:
            case 7:
                System.out.println("It's the weekend");
            default:
                System.out.println("You entered a number that is not accepted");
        }

     /* IF ELSE SWITCH PRACTICE:
     write a code takes ask a user's age and ...
     if the user is 16 or older print out "You can drive"
     if the user is 18 or older print out "You can work"
     if the user is 21 or older print out "You can drink"
     if the user us 25 or older print out "You can rent a car"
     */

        int age = scan.nextInt();

        if (age >= 16);









    }
}
