package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random = Math.random(); // 0.0 -------- 0.999999999999999999 (close to 1.0 but not 1.0)
        System.out.println(random);

        double random0And100 = Math.random() * 100; // find random number between 0-100 (99 technically bc 100 is exclusive)
        /* int random0And100 = (int) (Math.random() * 100); double being cast or CONVERTED to int
        find random number between 0-100 (99 technically bc 100 is exclusive); int was cast in this case. */
        System.out.println(random0And100);

        // EX1: create a number between 0-20 both digits inclusive as an int.
        int random0And20 = (int) (Math.random() * 21); // MAKE SURE TO INCLUDE THE PARENTHESES
        System.out.println(random0And20);

        // EX2: create a number between 10-20 both digits inclusive as an int.
        int random10And20 = (int) (Math.random() * 11) + 10;
        // Math.random() * 11 --> at this point its 0-10 add 10 more to be 10-20
        System.out.println(random10And20);

        /*
        1. create random number between 103-346 both inclusive as an int.
        2. get the difference --> 346 - 103 = 243 and + 1.
        3. multiply it by 243 + 1  = 244
        4. add the starting point to the equation.
        5. RANDOM * (END POINT - START POINT + 1) + START POINT ; -- inclusive
         */

        int random103And346 = 103 + (int) (Math.random() * 244);
        System.out.println(random103And346);

        /* 1. create random number between -50 and 50 inclusive as int.
        2. (RANDOM * (END POINT - START POINT + 1) + START POINT). -- end point and start point how many digits between.
        (( IF THE OTHER NUMBER IS NOT INCLUSIVE THEN INSTEAD OF +1 YOU MUST -2 ))
         */

        // (random * (101) - 50)
        int random_50And50 = (int) (Math.random() * 101) - 50;
        System.out.println(random_50And50);

        /* Pseudo Code:
        1. find random number between 45-98 (both included)
        RANDOM * (END POINT - START POINT + 1) + START POINT ; use formula if both inclusive
         */

        int num45And98 = (int)(Math.random() * 54 + 45);
        System.out.println("random = " + num45And98);
       // System.out.println((int)(Math.random() * 54 + 45)); ANOTHER WAY TO DO IT W/O STORING

        /* Pseudo Code:
        1. find two random number between 67-85 (both included); as well as, the max and min.
        2. RANDOM * (END POINT - START POINT + 1) + START POINT ; use formula if both inclusive.
        3. print them out.
         */
        int a = (int)(Math.random() * 19 + 67);
        int b = (int)(Math.random() * 19 + 67);
        System.out.println("Random number 1 = " + a);
        System.out.println("Random number 2 = " + b);
        System.out.println("Max of random = " + Math.max(a, b));
        System.out.println("Min of random = " + Math.min (a, b));

    }
}