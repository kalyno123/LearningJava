package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    1. create a new object for the scanner and import it.
    2. ask use to enter three numbers and store it.
    3. multiply the given data and print them.
    */
    System.out.println("Please enter 3 numbers");
    int times1 = userInput.nextInt(), times2 = userInput.nextInt(), times3 = userInput.nextInt();

    System.out.println("The product of the numbers entered is = " + (times1 * times2 * times3));

    System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    1. ask user to enter their first name, last name, current year, and year of birth.
    2. calculate the user's current age.
    3. print them out.
    */
    System.out.println("What is your first name?");
    String firstName = userInput.next();
    System.out.println("What is your last name?");
    String lastName = userInput.next();
    System.out.println("What is your year of birth?");
    int yearOfBirth = userInput.nextInt();
    System.out.println(firstName + " " + lastName + "'s" + " age is = " + (2022 - yearOfBirth) + ".");

    System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. ask user to enter their full name and weight as kg.
    2. calculate the weight as lb. NOTE: Assume 1 kg = 2.205 lbs.
    3. print them out.
    */
    System.out.println("What is your full name?");
    userInput.nextLine();
    String fullName = userInput.nextLine();
    System.out.println("What is your weight?");
    int usersWeight = userInput.nextInt();
    System.out.println(fullName + "'s" + " weight is = " + (usersWeight * 2.205) + " lbs" + ".");

    System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    1. ask 3 users to enter their full name and age.
    2. calculate the average age, the eldest age, and the youngest age.
    3. print them out.
    */
    userInput.nextLine();
    System.out.println("What is your full name?");
    String name1 = userInput.nextLine();
    System.out.println("What is your age?");
    int age1 = userInput.nextInt();

    userInput.nextLine();
    System.out.println("What is your full name?");
    String name2 = userInput.nextLine();
    System.out.println("What is your age?");
    int age2 = userInput.nextInt();

    userInput.nextLine();
    System.out.println("What is your full name?");
    String name3 = userInput.nextLine();
    System.out.println("What is your age?");
    int age3 = userInput.nextInt();

    System.out.println(name1 + "'s" + " age is " + age1 + ".");
    System.out.println(name2 + "'s" + " age is " + age2 + ".");
    System.out.println(name3 + "'s" + " age is " + age3 + ".");
    System.out.println("The average" + " age is " + (age1 + age2 + age3)/3 + ".");
    System.out.println("The eldest" + " age is " + Math.max(Math.max(age1, age2), age3) + ".");
    System.out.println("The youngest" + " age is " + Math.min(Math.min(age1, age2), age3) + ".");


    }
}
