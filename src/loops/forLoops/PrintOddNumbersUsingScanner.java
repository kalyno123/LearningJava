package loops.forLoops;

import java.util.Scanner;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
      /*  Write a Java program to ask user to enter a number and print all the odd numbers
      starting from 0 to given number by user (0 and given number is included)
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++){
            if (i % 2 != 0) System.out.println(i);
        }






    }
}
