package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
        /* PSEUDO CODE FOR TASK ONE:
        1. convert given strings to int.
        2. find the values sum,product,division,subtraction,and remainder.
        3. print them out.
        */
        String s1 ="5", s2 ="10";
        int s1Int = Integer.parseInt(s1), s2Int = Integer.parseInt(s2);

        System.out.println("-Sum of " + s1 + " and " + s2 + " is = " + (s1Int + s2Int));
        System.out.println("-Product of " + s1 + " and " + s2 + " is = " + (s1Int * s2Int));
        System.out.println("-Division of " + s1 + " and " + s2 + " is = " + (s1Int / s2Int));
        System.out.println("-Subtraction of " + s1 + " and " + s2 + " is = " + (s1Int - s2Int));
        System.out.println("-Remainder of " + s1 + " and " + s2 + " is = " + (s1Int % s2Int));

        System.out.println("\n-----TASK 2------\n");
        /* PSEUDO CODE FOR TASK TWO:
        1. convert given strings to int.
        2. find the max, min, average, and absolute difference of the given values.
        3. print them out.
        */
        String s3 = "200", s4= "-50";

        int s3Int =Integer.parseInt(s3), s4Int = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(s3Int, s4Int));
        System.out.println("The smallest value is = " + Math.min(s3Int, s4Int));
        System.out.println("The average is = " + ((s3Int + s4Int)/2));
        System.out.println("The absolute difference is = " + Math.abs(s3Int - s4Int));

        System.out.println("\n-----TASK 3------\n");
        /* PSEUDO CODE FOR TASK THREE:
        1. find how many days it takes to save $24 then $168.
        2. then find how much you will save after 5 months (assume a month is 30 days).
        3. assume you save 3 quarters, 1 dime, 2 nickles, 1 penny each day.
        */
        // 3 quarters + 1 dime + 2 nickles + 1 penny = 0.75 + 0.10 + 0.10 + 0.01
        double totalDailySaving = (0.75 + 0.10 + 0.10 + 0.01);
        int daysToSave$24 = (int)(24/totalDailySaving);
        int daysToSave$168 = (int)(168/totalDailySaving);
        double $After5Months = (totalDailySaving * 150); // 1 month = 30 days --> 5 month = 150 days

        System.out.println(daysToSave$24 + " days");
        System.out.println(daysToSave$168 + " days");
        System.out.println("$" + $After5Months);

        /* ANOTHER WAY TO WRITE THE PRINTS ABOVE:
        System.out.println((int)(24/totalDailySaving) + " days");
        System.out.println((int)(168/totalDailySaving) + " days");
        System.out.println("$" + (5 * 30/totalDailySaving));
        -----> IF NOT USED MORE THAN ONCE THAN PRINT IT RIGHT AWAY W/O STORING IT. IF USE 2X STORE IT. <-------
         */

        System.out.println("\n-----TASK 4------\n");
        /* PSEUDO CODE FOR TASK FOUR:
        1. Jessie saves $62.5 per day and the computer cost $1,250.
        2. find how many days it will take for Jessie to buy the computer.
        */
        double dailySaving = 62.5;
        int daysToSave = (int)(1250/dailySaving);

        System.out.println(daysToSave);
        // System.out.println(int)(1250/dailySaving) ---> BETTER WAY TO CODE THE ABOVE PRINT OUT W/O STORING.

        System.out.println("\n-----TASK 5------\n");
        /* PSEUDO CODE FOR TASK FIVE:
        1. solve the following problem with the given info:
        2. Dan needs $14,265 to buy a car. He has 2 payment options.
        3. OPTION 1: payment of $475.50/mo and OPTION 2: payment of $951/mo.
        4. calculate how many months it'll take Dan to complete all the payments for both options.
        */
        double option1 = 475.50, option2 = 951;
        int car1 = (int)(14_265/option1);
        int car2 = (int)(14_265/option2);

        System.out.println("Option 1 will take " + car1 + " months");
        System.out.println("Option 2 will take " + car2 + " months");

        System.out.println("\n-----TASK 6------\n");
        /* PSEUDO CODE FOR TASK SIX:
        1. create an object for the Scanner and import it.
        2. ask user to enter 2 numbers and store it as int.
        3. find the quotient of the 2 values and store it as double.
        4. print them out.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int number1 = scan.nextInt(), number2 = scan.nextInt();
        double num1 = number1, num2 = number2;
        // double division = (double) num1 / (double) num2; --> ANOTHER WAY TO CODE THE CASTING

        System.out.println(num1/num2);


    }

}
