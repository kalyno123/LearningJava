package loops;

import java.util.Scanner;

public class GoodMorningPractice {
    public static void main(String[] args) {

    /* TASK-1:
    Write a program that prints all the numbers between 1-100
    But do not print any number that can be divided by 2 or 3
    Expected output:
    1
    5
    7
    11
    13
    17
    19
    23
    .
    .
    .
    97
    */
        System.out.println("\n-----For-i loop solution-------\n");
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
            }
        }

        System.out.println("\n-----While loop solution-------\n");
        int start = 1;
        while (start <= 100){
            if (start % 2 != 0 && start % 3 != 0) System.out.println(start);
            start++;
        }
        // while checks if the condition is true then runs the block of code until the condition is false

        System.out.println("\n-----DO-While loop solution-------\n");
        int count = 1;
        do {
            if (count % 2 != 0 && count % 3 != 0) System.out.println(count);
            count++;
        }while (count <= 100);
        // do will run the code at least once and then checks if the while condition is true if it is then it'll run again until its false


    /* TASK-2:
    Write a Java program that asks user to enter a number
    if number is dividable by 5 then finish the program but if number is not dividable by 5,
    keep asking user to enter a new number until user enters a number that is dividable by 5
    Example program:
    Program: Please enter a number
    User: 3
    Program: This number is not dividable by 5

    Program: Please enter a new number
    User: 10
    Program: This number is dividable by 5
    */
        Scanner scan = new Scanner(System.in);

        int number; // variable should be declared above the block of code to reuse it throughout
        int attempt = 1;
        do{ if (attempt == 1) System.out.println("Please enter a number:"); // after 1st attempt this won't run anymore -- goes to else
            else System.out.println("Please enter a new number:"); // after 1st iteration it will come here while condition remains true
            number = scan.nextInt(); // variable assigned to scanner here
            if (number % 5 != 0) System.out.println("This number is NOT dividable by 5");
        }while (number % 5 != 0); // while number is NOT divisible by 5 then run the do-while loop again
        System.out.println("This number is dividable by 5"); // this will print when number is divisible by 5


    }
}
