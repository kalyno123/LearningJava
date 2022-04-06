package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    1. generates 4 random numbers between 0 and 10 (0 and 10 included).
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    2. store numbers in proper variables and print them first.
    3. find each number’s absolute difference with 5, max, and min.
    4. print them out.
    */
        int random1 = (int)(Math.random() * 11), random2 = (int)(Math.random() * 11), random3 = (int)(Math.random() * 11), random4 = (int)(Math.random() * 11);

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("Number 4 = " + random4);
        /* int = 1;
        System.out.println("Number " + i++ + " = " + random1);
        System.out.println("Number " + i++ + " = " + random2);
        System.out.println("Number " + i++ + " = " + random3);
        System.out.println("Number " + i + " = " + random4); --> i not i++ bc don't need 5
         */
        int five = 5;
        System.out.println("Absolute difference of " + random1 + " with " + five + " is = " + Math.abs(random1 - five));
        System.out.println("Absolute difference of " + random2 + " with " + five + " is = " + Math.abs(random2 - five));
        System.out.println("Absolute difference of " + random3 + " with " + five + " is = " + Math.abs(random3 - five));
        System.out.println("Absolute difference of " + random4 + " with " + five + " is = " + Math.abs(random4 - five));

        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(random1, random2), random3), random4));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(random1, random2), random3), random4));

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    1. generates 8 random int numbers between -50 and 50 (-50 and 50 included)
    NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT
    2. store numbers in proper variables and print
    3. print the max, min, average, and absolute difference between max and min
    4. print true if 3rd number is positive; else false
    5. print true if 5th number is negative; else false
    6. print true if any of the numbers is zero; else false
    */
        int num1 = (int) (Math.random() * 101) - 50, num2 = (int) (Math.random() * 101) - 50, num3 = (int) (Math.random() * 101) - 50, num4 = (int) (Math.random() * 101) - 50,
                num5 = (int) (Math.random() * 101) - 50, num6 = (int) (Math.random() * 101) - 50, num7 = (int) (Math.random() * 101) - 50, num8 = (int) (Math.random() * 101) - 50;
        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5), num6), num7), num8);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5), num6), num7), num8);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);
        System.out.println("Number 8 = " + num8);
        /* int j = 1;
        System.out.println("Number " + j++ + " = " + num1);
        System.out.println("Number " + j++ + " = " + num2);
        System.out.println("Number " + j++ + " = " + num3);
        System.out.println("Number " + j++ + " = " + num4);
        System.out.println("Number " + j++ + " = " + num5);
        System.out.println("Number " + j++ + " = " + num6);
        System.out.println("Number " + j++ + " = " + num7);
        System.out.println("Number " + j + " = " + num8); --> j not j++ bc don't need 9
         */

        System.out.println("Greatest number is = " + max);
        System.out.println("Smallest number is = " + min);
        System.out.println("Average of 8 numbers is = " + ((num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8));
        System.out.println("Absolute difference of between smallest and greatest is = " + Math.abs(max - min));


        if (num3 > 0) System.out.println("3rd number is positive = true");
        else System.out.println("3rd number is positive = false");

        if (num5 < 0) System.out.println("5th number is negative = true");
        else System.out.println("5th number is negative = false");

        /* THIS IS A MORE EFFICIENT WAY TO CODE THE 2 if-else ^^ (CAN SIMPLIFY SINGLE IF-ELSE STATEMENTS):
        System.out.println("3rd number is positive = " + (num3 > 0));
        System.out.println("5th number is negative = " + (num5 < 0));
        */

        if (num2 == 0) {
            System.out.println("There is at least one zero among those numbers is = " + true); // --> can be this way also
        } else if (num2 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num3 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num4 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num5 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num6 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num7 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else if (num8 == 0) {
            System.out.println("There is at least one zero among those numbers is = true");
        } else System.out.println("There is at least one zero among those numbers is = false");

        /* THIS IS A MORE EFFICIENT WAY TO CODE THIS^^ AND THEN SEE EXAMPLE FOR A ONE LINE OF CODE WAY:
        if (num1 == 0 || num2 ==0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 ==0 || num7 == 0 || num8 == 0){
        System.out.println("There is at least one zero among those numbers is = true");
        }else System.out.println("There is at least one zero among those numbers is = false");

        System.out.println("There is at least one zero among those numbers is = " + (num1 == 0 || num2 ==0 ||
                            num3 == 0 || num4 == 0 || num5 == 0 || num6 ==0 || num7 == 0 || num8 == 0));
        */

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. asks user to enter 7 numbers between 0 and 50 (0 and 50 included)
    2. store numbers in proper variables and print
    3. print the max, min, and average
    4. print true if first number is greater than or equal to 10; else false
    5. print true if last number is less than or equal to 40; else false
    6. print true if both first and last numbers are greater than 25; else false
    7. print true if any of the numbers is zero or 50; else false
    */
        Scanner usersInput = new Scanner(System.in);

        System.out.println("Please enter 7 numbers between 0 and 50 (both included):");
        int number1 = usersInput.nextInt(), number2 = usersInput.nextInt(), number3 = usersInput.nextInt(),
                number4 = usersInput.nextInt(), number5 = usersInput.nextInt(), number6 = usersInput.nextInt(), number7 = usersInput.nextInt();

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Number 4 = " + number4);
        System.out.println("Number 5 = " + number5);
        System.out.println("Number 6 = " + number6);
        System.out.println("Number 7 = " + number7);
        /* int x = 1;
        System.out.println("Number " + x++ + " = " + num1);
        System.out.println("Number " + x++ + " = " + num2);
        System.out.println("Number " + x++ + " = " + num3);
        System.out.println("Number " + x++ + " = " + num4);
        System.out.println("Number " + x++ + " = " + num5);
        System.out.println("Number " + x++ + " = " + num6);
        System.out.println("Number " + x+ " = " + num7); --> x not x++ bc don't need 8
         */

        System.out.println("Greatest number is = " + (Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(number1, number2), number3), number4), number5), number6), number7)));
        System.out.println("Smallest number is = " + (Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(number1, number2), number3), number4), number5), number6), number7)));
        System.out.println("Average of 7 numbers is = " + ((number1 + number2 + number3 + number4 + number5 + number6 + number7) / 7));


        if (number1 >= 10) System.out.println("First number is greater than or equal to 10 = true");
        else System.out.println("First number is greater than or equal to 10 = false");
        // System.out.println("First number is greater than or equal to 10 = " + (number1 >= 10)); --> MORE EFFICIENT WAY

        if (number7 <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");
        // System.out.println("Last number is less than or equal to 40 = " + (number7 <= 40)); --> MORE EFFICIENT WAY

        if (number1 > 25 && number7 > 25) System.out.println("Both first and last numbers are greater than 25 = true");
        else System.out.println("Both first and last numbers are greater than 25 = false");
        // System.out.println("Both first and last numbers are greater than 25 = false"); --> MORE EFFICIENT WAY

        if (number1 == 0 || number1 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number2 == 0 || number2 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number3 == 0 || number3 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number4 == 0 || number4 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number5 == 0 || number5 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number6 == 0 || number6 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else if (number7 == 0 || number7 == 50) {
            System.out.println("At least one of those numbers is 0 or 50  = true");
        } else System.out.println("At least one of those numbers is 0 or 50  = false");

        if (number1 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number2 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number3 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number4 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number5 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number6 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else if (number7 >= 40) {
            System.out.println("There is no number between 40 and 50 = false");
        } else System.out.println("There is no number between 40 and 50 = true");
        /* THIS IS A MORE EFFICIENT WAY TO CODE THIS^^
        if (number1 >= 40 || number2 >= 40 || number3 >= 40 || number4 >= 40 || number5 >= 40 || number6 >= 40 || number7 >= 40)
               System.out.println("There is no number between 40 and 50 = false);
        else System.out.println("There is no number between 40 and 50 = true");
        */

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    1. generate 3 random numbers between 0 and 100 (0 and 100 included)
    2. find if all numbers are more than 25
    3. print true if all numbers are greater than 25
    4. print false if any of the number is less than or equal to 25
     */
        int randomNum1 = (int) (Math.random() * 101), randomNum2 = (int) (Math.random() * 101), randomNum3 = (int) (Math.random() * 101);

        System.out.println("Number 1 = " + randomNum1);
        System.out.println("Number 2 = " + randomNum2);
        System.out.println("Number 3 = " + randomNum3);

        if (randomNum1 > 25 && randomNum2 > 25 && randomNum3 > 25) System.out.println("All 3 numbers are greater than 25 = true");
        else System.out.println("All 3 numbers are greater than 25 = false"); // CHECKING IF randomNum1 <= 25 && randomNum2 <= 25 && randomNum3 <= 25

        // BETTER WAY: System.out.println("All 3 numbers are greater than 25 = " + (randomNum1 > 25 && randomNum2 > 25 && randomNum3 > 25));

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 5------\n");
    /* PSEUDO CODE FOR TASK FIVE:
    1. ask user to enter a number between 1 and 7 (1 and 7 included)
    2. Print the day of the week according to given number
    ASSUME: first day is MONDAY and last day is SUNDAY
    */
        System.out.println("Please enter a number between 1 and 7 (both included)");
        int daysOfTheWeek = usersInput.nextInt();

        switch (daysOfTheWeek) {
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
        }

        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 6------\n");
    /* PSEUDO CODE FOR TASK SIX:
    1. asks user to enter a number between -10 and 10 (-10 and 10 included)
    2. if number is positive, then print a message: “Number entered is POSITIVE”
    3. if number is negative, then print a message: “Number entered is NEGATIVE”
    4. if number is zero, then print a message: “Number entered is ZERO”
    5. if number is even, then also print: “Number entered is EVEN”
    6. if number is odd, then also print: “Number entered is ODD”
    */
        System.out.println("Please enter a number between -10 and 10 (both included):");
        int n1 = usersInput.nextInt();

        if (n1 > 0) {
            System.out.println("Number entered is POSITIVE");
        } else if (n1 < 0) {
            System.out.println("Number entered is NEGATIVE");
        } else //if (n1 == 0) --> unneeded bc it is understood
            System.out.println("Number entered is ZERO");

        if (n1 % 2 == 0) {
            System.out.println("Number entered is EVEN");
        } else {
            System.out.println("Number entered is ODD");
        }
        System.out.println("END OF THE PROGRAM");

        System.out.println("\n-----TASK 7------\n");
    /* PSEUDO CODE FOR TASK SEVEN:
    1. use the following story to solve the task:
    Jennifer is taking a math course. This math course requires students to take 3 exams.
    At the end, if the average of those exams is more than or equal to 70, then Jennifer will pass the course.
    However, if the average of those 3 exams is less than 70, then Jennifer will fail.
    2. asks Jennifer to enter her exam results and print if she passed or failed for the exam
    */
        System.out.println("Tell me your exam results?");
        int exam1 = usersInput.nextInt(), exam2 = usersInput.nextInt(), exam3 = usersInput.nextInt();

        if ((exam1 + exam2 + exam3) / 3 >= 70) System.out.println("YOU PASSED!");
        else // if ((exam1 + exam2 + exam3) / 3 < 70) --> unneeded bc it is understood that if you didn't pass you failed
        System.out.println("YOU FAILED!");
        // System.out.println(((exam1 + exam2 + exam3) / 3 >= 70) + "YOU PASSED!"); --> MORE EFFICIENT WAY

        System.out.println("\n-----TASK 8------\n");
    /* PSEUDO CODE FOR TASK EIGHT:
    1. asks user to enter 3 numbers
    2. if all 3 numbers are equal, then print “TRIPLE MATCH”
    3. if any of those 2 numbers are equal, then print “DOUBLE MATCH”
    4. if all numbers are different, then print “NO MATCH”
    */
        System.out.println("Enter 3 numbers");
        int slots1 = usersInput.nextInt(), slots2 = usersInput.nextInt(), slots3 = usersInput.nextInt();

        if (slots1 == slots2 && slots1 == slots3){
            System.out.println("TRIPLE MATCH");
        }else if (slots1 == slots2 || slots1 == slots3){
            System.out.println("DOUBLE MATCH");
        }else //if (slots1 != slots2 && slots1 != slots3) --> unneeded bc it is understood that if not triple nor double than no match
            System.out.println("NO MATCH");

        System.out.println("END OF THE PROGRAM");


    }
}
