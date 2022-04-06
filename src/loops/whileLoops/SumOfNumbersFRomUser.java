package loops.whileLoops;

import java.util.Scanner;

public class SumOfNumbersFRomUser {
    public static void main(String[] args) {

    /* PRACTICE TASK:
    Write a Java program that asks user to enter some numbers and find the sum of numbers given by user
    */
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter how many number you want to enter");
        int totalNumbers = input.nextInt();

        System.out.println("\n-----For loop solution-------\n");
        int sum = 0;
        for (int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum += input.nextInt(); // int number = input.nextInt();
        }
        System.out.println(sum);


        System.out.println("\n-----While loop solution-------\n");
        int counter = 1;
        int sum2 = 0;
        while (counter <= totalNumbers){
            System.out.println("Please enter number " + counter);
            int userNumbers = input.nextInt();
            sum2 += userNumbers;
            counter++;
        }
        System.out.println(sum2);








    }
}
