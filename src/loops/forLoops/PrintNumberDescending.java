package loops.forLoops;

public class PrintNumberDescending {
    public static void main(String[] args) {
    /* Write a Java program to print numbers descending from 100 to 0 (100 and 0 are included)
    NOTE - FOR LOOPS SYNTAX:
    for(initialization; termination (condition for loops to run); change (increment/decrement value)){
            // BLOCK OF CODE TO EXECUTE
    }

    start point: 100
    end point: 0
    update: decrement
    */
        for(int i = 100; i >= 0; i--){ // i = 1 -> start counting by 100; i >= 0 -> stop at zero iteration; i-- -> count going down by 1 each time
            System.out.println(i);
        }





    }
}
