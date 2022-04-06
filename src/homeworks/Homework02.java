package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){

    System.out.println("\n-----TASK 1------\n");

    Scanner userInput = new Scanner(System.in);
    System.out.println("What is your first name?");
    String userFirstName = userInput.next();

    System.out.println("What is your last name?");
    String userLastName = userInput.next();

    System.out.println("How old are you?");
    int userAge = userInput.nextInt();

    System.out.println("What is your e-mail address?");
    userInput.nextLine();
    String useremail = userInput.next();

    System.out.println("What is your phone number?");
    String userPhoneNumber = userInput.nextLine();

    System.out.println("What is your address?");
    String userAddress = userInput.nextLine();

    System.out.println("\tUser who joined this program is " + userFirstName + " " + userLastName + "." +
            " John's age is \n" + userAge + "." + " John's email address is " + useremail + "," +
            " phone number \n" + userPhoneNumber + "," + " and address is " + userAddress + ".");

    System.out.println("\n-----TASK 2------\n");

    System.out.println("What is your favorite book?");
    String userFaveBook = "\"" + userInput.nextLine() + "\"";

    System.out.println("What is your favorite color?");
    String userFaveColor = userInput.next();

    System.out.println("What is your favorite number?");
    int userFaveNumber = userInput.nextInt();

    System.out.println("User's favorite book is: " + userFaveBook + "\n" +
            "User's favorite color is: " + userFaveColor + "\n" + "User's favorite number is: " + userFaveNumber);


    }
}
