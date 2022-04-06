package loops.doWhileLoops;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {
    /* Write a Java program that asks user to enter a number if number is more than or equal to 10, then finish the
    program but if number is less than 10, keep asking user to enter a new number until user enters a number that is more than or equal to 10
    */
       Scanner input = new Scanner (System.in);

        System.out.println("\n-----While loop solution-------\n");
        System.out.println("Please enter a number:");
        int number1 = input.nextInt();

        while (number1 < 10) {
            System.out.println("This number is NOT more than or equal to 10");
            System.out.println("Please enter a new number:");
            number1 = input.nextInt();
        }
        System.out.println("This number is more than or equal to 10");


        System.out.println("\n-----DO-While loop solution-------\n");
        int number2;
        int attempt = 1;
        do {
            if (attempt == 1) System.out.println("Please enter a number:");
            else{
                System.out.println("This number is NOT more than or equal to 10");
                System.out.println("Please enter a new number:");
            }
            number2 = input.nextInt();
            attempt++;
        } while(number2 <= 10);
        System.out.println("This number is more than or equal to 10");












    }
}
