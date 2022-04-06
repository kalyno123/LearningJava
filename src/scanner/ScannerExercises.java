package scanner;

import java.util.Scanner;

public class ScannerExercises {

    public static void main(String [] args){
    /*
    1. create object of scanner and import
    2. print out instructions for users
    3. use next() method for input importing
    4. print out the first and last name in one statement
    */
    Scanner userInput = new Scanner(System.in);

    /* EXERCISE ONE:
    Write a Java program that reads firstName and lastName from user and print those as full name in 1 statement.
     */
    System.out.println("What is your first name?");
    String firstName = userInput.next();
    System.out.println("What is your last name?");
    String lastName = userInput.next();
    System.out.println("User's full name is = " + firstName + " " + lastName);

    /* EXERCISE TWO:
    Write a Java program that reads the full address from user and print the address.
    */
    System.out.println("\nWhat is your address?");
    userInput.nextLine(); // <-- used extra objectValue.method() HERE as a placeholder for the "extra spaces"
    String usersAddress = userInput.nextLine();
    System.out.println("User's address is = " + usersAddress);

    /*Write a Java program that asks user to enter 3 numbers and print the sum of those 3 numbers
     */
    // ONE METHOD:
    System.out.println("Give 3 numbers to find the sum of it.");
    int userValue1 = userInput.nextInt();
    int userValue2 = userInput.nextInt();
    int userValue3 = userInput.nextInt();

    System.out.println("The sum of the numbers given is = " + (userValue1 + userValue2 + userValue3));
    
    // ANOTHER METHOD:
    // int userValues = userInput.nextInt() + userInput.nextInt() + userInput.nextInt();
    // or System.out.println("The sum of the numbers given is = " + userValues);

        /* WHENEVER YOU USE next(), nextInt() or nextDouble() etc. AND THEN YOU USE nextLine() AFTER
        then you will need an EXTRA nextLine(); to collect and hold all the spaces (space-holder) */








    }
}
