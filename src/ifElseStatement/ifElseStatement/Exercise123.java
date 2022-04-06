package ifElseStatement.ifElseStatement;

import java.util.Scanner;

public class Exercise123 {
    public static void main(String[] args) {

        //if it is weekend print out "it is weekend!"
        // else "it is weekday."

        boolean isWeekend = false;

        if (!isWeekend){ // ! means NOT --> NOT weekend and assigned FALSE value so statement is TRUE
            System.out.println("\"it is weekend!\"");
        } else {
            System.out.println("\"it is weekday.\"");
        }

        /* FOR IF-ELSE STATEMENT --> YOU CANNOT USE RELATIONAL / LOGICAL OPERATORS WITH OBJECTS. YOU HAVE TO USE METHODS.
                HOWEVER, YOU CAN USE RELATIONAL / LOGICAL OPERATORS WITH PRIMITIVES. */

        // -------------------------------------------------------------
        /* PSEUDO CODE FOR EXERCISE:
        1. create a new object for the scanner and import it.
        2. ask user to enter full name and balance.
        3. if user balance is great of equal to $600.00 then print the statement.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Hey " + fullName + ", please enter your balance:");
        double balance = Double.parseDouble(scan.next());

        if (balance >= 600){
            System.out.println("Congrats!" + fullName + ", you're rich!");
        } else {
            System.out.println("Sorry, " + fullName + ", you're poor.");
        }

        // ---------------------------------------------------------------------

        System.out.println("Please enter a number:");
        int userNum = scan.nextInt();

        if (userNum % 7 == 0){ // if the number has any remainder then it'll move to the ELSE statement
            System.out.println("The number you entered is dividable by 7!");
        } else {
            System.out.println("The number you entered is NOT dividable by 7!");
        }

        // ---------------------------------------------------------------------

        /*
        1. asks user to enter a number
        2. checks if the number is between 0 and 100
        3. if it is true print out "It is in between 0 and 100"
        4. else "It is not in between 0 and 100"
        */
        // HINT : AND both conditions has to be true; OR one condition has to be true

        System.out.println("Please enter a number:");
        int number1 = scan.nextInt();

        boolean isNumBiggerThan0 = number1 >= 0;
        boolean isNumSmallerThan0 = number1 <= 100;
        boolean inBetween0And100 = number1 >= 0 && number1 <= 100;


        if(number1 >= 0 && number1 <= 100){
            System.out.println("It is in between 0 and 100.");
        } else {
            System.out.println("It is not in between 0 and 100.");
        }

        //------------------------------------------------------
        /* PSEUDO CODE for if else if statement:
        1. generate 3 random numbers between 45 - 90
        2. find the max, min, and middle
        3. print them out
        */
        int random1 = (int) (Math.random() * 46) + 45, random2 = (int) (Math.random() * 46) + 45, random3 = (int) (Math.random() * 46) + 45;
        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);
        int middle;
        /*
        if (random1 != max && random1 != min) {
            // this means random1 is middle; IF it is NOT max AND NOT min
        }
        if (random2 != max && random2 != min) {
            // this means random2 is middle; IF it is NOT max AND NOT min
        }
        if (random3 != max && random3 != min) {
            // this means random3 is middle; IF it is NOT max AND NOT min
        }
        */
        if (random1 != max && random1 != min) { // this means random1 is middle; IF it is NOT max AND NOT min
            middle = random1;
        }else if (random2 != max && random2 != min){ // random2 middle possibility goes here
            middle = random2;
        }else{ // random3 middle possibility goes here
            middle = random3;
        }
        System.out.println("num 1 = " + random1);
        System.out.println("num 2 = " + random2);
        System.out.println("num 3 = " + random3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("middle = " + middle);

    //------------------------------------------------------







    }
}
