package loops.whileLoops;

import java.util.Random;

public class PrintNumbersDividedByThree {
    public static void main(String[] args) {

    /* PRACTICE TASK:
    Write a Java program to check numbers from 1 to 30 (30 is included) and print all the numbers that can be divided by 3
    NOTE: Use while loop
    Expected output:
    3
    6
    9
    .
    .
    .
    24
    27
    30

    START POINT = 1
    END POINT = 30
    UPDATE = i++ (incremental)
    */

        System.out.println("\n-----Fori loop solution-------\n");
        for (int i = 1; i <= 30; i++) {
            if(i % 3 == 0) System.out.println(i);
        }

        System.out.println("\n-----While loop solution-------\n");
        int i = 1; // initialization point
        while (i <= 30){
            if (i % 3 == 0) System.out.println(i);
            i++; // the update or change
        }





    }
}
