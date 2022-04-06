package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {

        /* TASK REQUIREMENT:
        generate a number between 17 and 33 (both included)
        print out random number generated
        if even, print "the number is even"
        if odd, print "the number is odd"
         */
        int random = RandomNumberGenerator.getRandomNumber(17, 33);
        System.out.println("Random number = " + random);

        /* THIS IS HOW IT WOULD BE DONE NOT USING THE CREATED METHOD:
        if (random % 2 == 0) System.out.println("The number generated is EVEN");
        else System.out.println("The number generated is ODD");
        */

        if (MathHelper.isEven(random)) System.out.println("The number generated is EVEN");
        else System.out.println("The number generated is ODD");

        System.out.println("\nEND OF THE PROGRAM");


    }
}
