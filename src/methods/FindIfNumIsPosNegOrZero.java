package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumIsPosNegOrZero {
    public static void main(String[] args) {
    /*JAVA METHOD PRACTICE EXAMPLE:
    1. Ask user to enter an any number
    2. Print "The number is positive" if the user enters a positive number
    3. Print "The number is negative" if the user enters a negative number
    4. Print "The number is zero" if the user enters zero
    */
        Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int number = scan.nextInt();

       // int num = ScannerHelper.getNumberFromUser(); // returns int --> THIS IS A A CREATED SCANNER METHOD TO DO SAME AS ABOVE

    if (MathHelper.isPositive(number)){
        System.out.println("The number is positive");
    }else if (MathHelper.isNegative(number)){
        System.out.println("The number is negative");
    }System.out.println("The number is zero"); // <--- ELSE IS NOT NEEDED ITS UNDERSTOOD

    // ---------------------------------------------------------

    /* CODING BAT:
    1. return type? if so what is it returning?
    2. is it static?
    3. are there any arguments? what is it?






     */



    }
}
