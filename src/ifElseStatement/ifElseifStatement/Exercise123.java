package ifElseStatement.ifElseifStatement;

import java.util.Scanner;

public class Exercise123 {
    public static void main(String[] args) {
    /* PSEUDO CODE:
    1. generate random number between -10 and 10 (inclusive)
    2. if number is POSITIVE then print out "number is POSITIVE!"
    3. if number is NEGATIVE then print out "number is NEGATIVE!"
    4. if the number is 0 then print out "number is ZERO!"
    */
        int random = (int) (Math.random() * 21) + (-10);
        System.out.println("num = " + random);
        /*
        if (random > 0){ // POSITIVE
            System.out.println("number is POSITIVE!");
        }
        if (random < 0){ // NEGATIVE
            System.out.println("number is NEGATIVE!");
        }
        if (random == 0){ // ZERO
            System.out.println("number is ZERO!");
        }
        */
        if (random > 0){ // POSITIVE
            System.out.println("number is POSITIVE!");
        } else if(random < 0){
            System.out.println("number is NEGATIVE!");
        } else if(random == 0){
            System.out.println("number is ZERO!");
        }

    /* PSEUDO CODE:
    1. create a new object for the scanner and import it
    2. ask user their age and weight
    3. if they are older than 18 then print out "You are old enough to drive" else "You are not old enough for driving"
    4. if they are heavier than 150 pounds print out "You are heavier than 150 pounds" else "You are lighter than 150 pounds"
     */

    Scanner scan = new Scanner(System.in);
    System.out.println("\nWhat is your age and weight?");
    // int age = scan.nextInt(); --> DID NOT HAVE TO STORE AGE AND WEIGHT SINCE ITS ONLY USED ONCE.
    double weight = scan.nextDouble();

    if (scan.nextInt() >= 18) {
        System.out.println("You are old enough to drive");
    } else {
        System.out.println("You are not old enough for driving");
    }
    if (weight > 150) {
        System.out.println("You are heavier than 150 pounds");
    } else if (weight == 150) {
        System.out.println("You are 150 pounds");
    } else {
        System.out.println("You are lighter than 150 pounds");
    }










    }

}
