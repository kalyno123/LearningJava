package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading data.
         */

    Scanner userName = new Scanner(System.in); // creating a scanner object for using next() method

    System.out.println("Please put your first name"); // this is what I want user to input
    String firstName = userName.next(); // storing the first name from user

    System.out.println("Please put your last name"); // this is what I want user to input
    String lastName = userName.next(); // storing last name from user

    System.out.println("The name user put = " + firstName); // printing my object/variable
    System.out.println("The name user put = " + lastName);

    }
}
