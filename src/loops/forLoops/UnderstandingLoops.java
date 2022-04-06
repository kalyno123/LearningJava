package loops.forLoops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /* print "Hello" 5 times
        SYNTAX:
        for(initialization; termination (condition for loops to run); change (increment/decrement value)){
                // BLOCK OF CODE TO EXECUTE
          }
            NOTE: TERMINATION TAKES BOOLEAN AS AN ARGUMENT; INITIALIZATION CAN TAKE 7 PRIMITIVE TYPES MINUS BOOLEAN
            NOTE: INITIALIZATION IS THE START POINT WHILE, TERMINATION IS THE STOP POINT (ONCE THE CONDITION IS MEET)
            NOTE: CHANGE IS HOW THE CODE IS UPDATED EACH TIME (ex: by one going up or down or by 2x 3x .. etc.)
         */

        for(int count = 1; count <= 100; count++) { // post-increment ; count-- means
            System.out.println("Hello World!");
        }
        System.out.println("END OF THE PROGRAM");

        int year = 2022;
        for(int age = 1; age <= 100; age++) { // post-increment ; count-- means
            System.out.println("The age is = " + age + " in " + year);
            year++;
        }
        System.out.println("END OF THE PROGRAM");





    }
}
