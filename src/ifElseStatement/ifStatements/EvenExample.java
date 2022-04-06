package ifElseStatement.ifStatements;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    /*
    1. create an object for the scanner and import it.
    1. ask the user to enter a number.
    2. then print IF the number the user entered is even.
     */
    System.out.println("Please enter a random number");
    // int userNum = scan.nextInt(); --> userNum was only used ONCE so you don't have to store it

    if(scan.nextInt() % 2 == 0){
        System.out.println("The number you entered is even!");
    } else {
        System.out.println("The number you entered is odd!");
    }


    /* NOTE: checking if # is ODD or not <-- use != 0 if odd; use == 0 if even
        if (random % 2 != 0) -- ODD
        if (scan.nextInt() % 2 == 0) -- EVEN
    */



    }

}
