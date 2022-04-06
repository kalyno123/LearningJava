package loops.forLoops;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

    /* Write a Java program to print only even numbers from bt 0 to 10 (0 and 10 are included)
    NOTE - FOR LOOPS SYNTAX:
    for(initialization; termination (condition for loops to run); change (increment/decrement value)){
            // BLOCK OF CODE TO EXECUTE
    }
        start point : 0
        end point   : 10
        update      : increment
    */

        // ** BE CAREFUL WITH START POINT BC WHEN START POINT IS NOT 0 IT WILL NOT PRINT EVEN NUMBERS **
        for(int i = 0; i <= 10; i += 2){ // i = 1 -> start counting by 0; i <= 10 -> stop at 10th iteration; i += 2 -> count going up by 2 each time
            // i += 2 --> short-hand assignment in this case means take 2 and add it to i each update
            System.out.println(i);
        }

        System.out.println("\n-------1st-way--------\n");
        for(int i = 0; i <= 10; i++){ // THIS IS THE BEST AND MOST DYNAMIC WAY
            if(i % 2 == 0) System.out.println(i);
        }


        System.out.println("\n-------2nd-way--------\n");
        for(int i = 0; i <= 10; i++){ // THIS IS OKAY IF YOU HAVE IT ALREADY CREATED BUT WILL NOT TRANSFER WELL
            if(MathHelper.isEven(i)) System.out.println(i);
        }


        System.out.println("\n-------3rd-way--------\n");
        for(int i = 0; i <= 10; i += 2){ // be careful with start point - FRAGILE
            System.out.println(i);
        }


        System.out.println("\n-------4th-way--------\n");
        for(int i = 0; i <= 10; i++){ // be careful with start point - FRAGILE
            System.out.println(i++);
        }



    }
}
