package homeworks;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework11<factorial> {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    Write a program that prints all the numbers that are divisible by 7 starting from 1 to 100 (1 and 100 are included)
    NOTE: Result must be in one line with space and dash separators
    Expected Output: 7 – 14 – 21 - 28 . . . 77 - 84 - 91 - 98
    */
        String numDivisibleBy7 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) numDivisibleBy7 += i + " - ";
            //if (i != 98) System.out.print(i + " - "); // print all numbers % 7 up to but not including 98 with the -
            //else System.out.println(i); // when it comes here then the number is 98 so print 98
        }
        System.out.println(numDivisibleBy7.substring(0, numDivisibleBy7.length() - 3));

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    Write a program that prints all the numbers that are divisible by both 2 and 3 starting from 1 to 50 (1 and 50 are included)
    NOTE: Result must be in one line with space and dash separators
    Expected Output: 6 – 12 – 18 . . . 36 – 42 - 48
    */
        String numDivisibleBy2And3 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 2 == 0) numDivisibleBy2And3 += i + " - ";
        }
        System.out.println(numDivisibleBy2And3.substring(0, numDivisibleBy2And3.length() - 3));

        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0 && i % 3 == 0){
                if (i != 48) System.out.print(i + " - "); // must be sout print not println
            else System.out.println(i);
            }
        }

        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    Write a program that prints all the numbers that are dividable by 5 starting from 100 to 50 (100 and 50 are included)
    NOTE: Result must be in one line with space and dash separators
    Expected Output: 100 – 95 – 90 . . . - 60 - 55 - 50
    */
        int start = 100;
        String numDivisibleBy5 = "";
        while (start >= 50) {
            if (start % 5 == 0) numDivisibleBy5 += start + " - ";
            start--;
        }
        System.out.println(numDivisibleBy5.substring(0, numDivisibleBy5.length() - 3));


        for (int i = 100; i >= 50; i--){
            if (i % 5 == 0){
                if (i != 50) System.out.print(i + " - ");
                else System.out.println(i);
            }
        }


        String str = "";
        for (int i = 100; i >= 50; i--){
            if (i % 5 == 0){
                str += i + " - ";
            }
        }
        System.out.println(str.substring(0, str.length()-3));

        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    Write a program that prints the squares of all numbers starting from 0 to 7 (0 and 7 are included) NOTE: Use loop!!!
    Expected Output:
    The square of 0 is =  0
    The square of 1 is =  1
    The square of 2 is =  4
    The square of 3 is =  9
    The square of 4 is =  16
    The square of 5 is =  25
    The square of 6 is =  36
    The square of 7 is =  49
    */
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i * i);
        }
        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 5------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    Write a program that finds sum of the numbers starting from 1 to 10. NOTE: Use loop!!!
    Calculation => 1+2+3+4+5+6+7+8+9+10
    Expected Output:
    55
    */
        int sum = 0; //anytime you 'find a sum' to something you need to create a "container"
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 6------\n");
    /* PSEUDO CODE FOR TASK SIX:
    Write a program that asks user to enter a positive number
    And find the factorial of the number
    0! = 1
    1! = 1
    2! = 1*2 = 2
    3! = 1*2*3 = 6
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int number = scan.nextInt();

        int factorial = 1; // container must start at 1 not 0 : i == 0
        for (int i = 1; i <= number; i++) {
            factorial *= i; // 'i' represent the value of each iteration
        }
        System.out.println(factorial);

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 7------\n");
    /* PSEUDO CODE FOR TASK SEVEN:
    Write a program that asks user to enter their first and last name
    And count how many vowel letters they have in their first and last name
    Vowel letters = a, e, i, o, u
    
    Example program1:
    Program: Please enter your full name
    User: Chris Thompson
    Program: There are 3 vowel letters in this full name
    
    Example program2:
    Program: Please enter your full name
    User: Alexander George
    Program: There are 7 vowel letters in this full name
    */
        System.out.println("Please enter your name:");
        scan.nextLine(); // empty space collector
        String name = scan.nextLine();

        int counter = 0; // anytime you count or sum you MUST create a "container"
        for (int i = 0; i <= (name.length() - 1); i++) {
            if (CharacterHelper.isVowel(name.charAt(i)))
                counter++; // updating(adding to) container
        }
        System.out.println(counter);

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 8------\n");
    /* PSEUDO CODE FOR TASK EIGHT:
    Write a program that asks user to enter a number.
    If number is less than 100, then ask user to enter another number and find sum of entered 2 numbers.
    Keep asking user to enter numbers until the sum of all entered numbers is at least 100.
    If first number entered by user more than or equal to 100,
    print message “This number is already more than 100” and do not ask user to enter any other numbers.
    NOTE: Use do while loop!!!
    Example program1:                                       Example program2:
    Program: Please enter a number                          Program: Please enter a number
    User : 120                                              User : 50
    Program: This number is already more than 100

    Program: Please enter a number
    User : 75
    Program: Sum of the entered numbers is at least 100
    */
        int userNumber; //declared for scanner -- doesn't matter what value is assigned bc it'll be reassigned
        int sumOfUserNumbers = 0; //container for user's number sum
        int attempt = 1; // container to count how many times loop runs
        do {
            if (attempt == 1) { // this 'if' block will only run in the first iteration(attempt)
                System.out.println("Please enter a number:");
                userNumber = scan.nextInt(); //reassigned to the scanner
                if (userNumber >= 100){
                    System.out.println("This number is already more than or equals to 100");
                    break;
                }
            }else{ // this 'else' block will run for every iteration after 1st
                System.out.println("Please enter another number:");
                userNumber = scan.nextInt();
            }
            sumOfUserNumbers += userNumber; // ordering: the updated container has to be 1st
            if (sumOfUserNumbers >= 100){
                System.out.println("Sum of the entered numbers is at least 100");
            }
            attempt++;
        } while (sumOfUserNumbers < 100); // while sum is less than 100 keep executing loop until it is true then break

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 9------\n");
    /* PSEUDO CODE FOR TASK NINE:
    Assume that you are given a number, and you are asked to find series of Fibonacci numbers.
    What is Fibonacci numbers? a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
    It always starts with 0 and 1
    EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
    NOTE: Write a program that handles any n series of numbers
    Test data 1:                    Test data 2:
    5                               7
    Expected output 1:              Expected output 2:
    0 – 1 – 1 – 2 – 3               0 – 1 – 1 – 2 – 3 – 5 - 8
    */
    int fibonacci = 7, n1 = 0, n2 = 1, n3;
    String container = "";

    for (int i = 0; i < fibonacci; i++){
        container += n1 + " - ";
        n3 = n1 + n2;
        n1 = n2; // the variables are reassigned each iteration w/ the previous values. ex: zero becomes 1 and one becomes the value of the sum
        n2 = n3;
    }
        System.out.println(container.substring(0, container.length() - 3));

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 10------\n");
    /* PSEUDO CODE FOR TASK TEN:
    Write a program that asks user to enter a name. If name starts with j or J, then finish the program.
    But, if the name does not start with j or J, then keep asking until user gives a name that starts with j or J.
    Example program1:                               Example program2:
    Program: Please enter a name                    Program: Please enter a name
    User: Jessie                                   User: Alexander
    Program: End of the program.                    Program: Please enter a name
                                                    User: Chris
                                                    Program: Please enter a name
                                                    User: Jordan
                                                    Program: End of the program.
    */
        scan.nextLine(); // empty space collector
        String name1; // must declare outside block of code to reuse; it'll be assigned later
        do {
            System.out.println("Please enter a name:");
            name1 = scan.nextLine();
            if (name1.startsWith("j") || name1.startsWith("J")) System.out.println("End of the program");
        } while (!(name1.startsWith("j") || name1.startsWith("J")));



        do {
            System.out.println("Please enter a name:");
            name1 = scan.nextLine();
        } while (!(name1.startsWith("j") || name1.startsWith("J")));{
            System.out.println("End of the program");
        }



    }
}
