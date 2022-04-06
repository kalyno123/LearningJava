package casting;

import java.util.Scanner;

public class Exercise123 {
    public static void main(String[] args) {

    /* PSEUDO CODE:
    1. convert two strings into int.
    2. find the average and print it.
    */
        String num1 = "23";
        String num2 = "25";

        // below is two methods of casting string to primitive:
        int num1Int = Integer.parseInt(num1); // String --> Integer --> int
        int num2Int = Integer.parseInt(num2); // String --> int

        Integer num1Integer = Integer.valueOf(num1); // String --> Integer
        Integer num2Integer = Integer.valueOf(num1); // String --> int --> Integer

        System.out.println(num1Int + num2Int/2);
        System.out.println(num1Integer + num2Integer/2);

    /* PSEUDO CODE: convert string to double. Solve the following problem:
    1. John can only save $15.60 per day. How many days it takes to save for a $390 bike.
    */

    String save = "390"; // assume 390.00
    String day = "15.60";

    double saveDouble = Double.parseDouble(save);
    double dayDouble = Double.parseDouble(day);
    // int daysTookToSave = (int) (saveDouble/dayDouble); can use this stored info as well in print statement

    System.out.println("\nHow many days did it take to save = " + (int) (saveDouble/dayDouble));

    /* PSEUDO CODE:
    1. create an object for the scanner and import it.
    1. ask user for 5 grades as a String and calculate the average.
    2. print it out.
    */
        Scanner scan = new Scanner(System.in);

    System.out.println("Please enter five previous grade you received:");
    String grade1 = scan.next(), grade2 = scan.next(), grade3 = scan.next(), grade4 = scan.next(), grade5 = scan.next();

    double gradeD1 = Double.parseDouble(grade1), gradeD2 = Double.parseDouble(grade2), gradeD3 = Double.parseDouble(grade3),
            gradeD4 = Double.parseDouble(grade4), gradeD5 = Double.parseDouble(grade5);

    System.out.println("The average of the five given grades is = " + (int)(gradeD1 + gradeD2 + gradeD3 + gradeD4+ gradeD5)/5);

    /* System.out.println((int)((Double.parseDouble(scan.next()))) + Double.parseDouble(scan.next()) +
           Double.parseDouble(scan.next()) + Double.parseDouble(scan.next()) + Double.parseDouble(scan.next()));

      THIS IS ANOTHER WAY TO DO THE ABOVE EXERCISE IN ONE PRINT STATEMENT W/O STORING THE DATA

    PSEUDO CODE:
    1. ASK USER THEIR BALANCE AS A STRING.
    2. ASK USER FOR 3 TRANSACTION AMOUNT AS A STRING.
    3 PRINT RESULTS AS A DOUBLE.
    */
    System.out.println("What is your balance?");
    String balance = scan.next();
    System.out.println("What is your last 3 transactions?");
    String trans1 = scan.next(), trans2 = scan.next(), trans3 = scan.next();

    Double balanceD = Double.valueOf(balance);
    Double trans1D = Double.valueOf(trans1);
    Double trans2D = Double.valueOf(trans2);
    Double trans3D = Double.valueOf(trans3);

    System.out.println("Your balance is now = " + (balanceD - trans1D - trans2D - trans3D));
    /* System.out.println("Your balance is now = " +
            (Double.valueOf(balance) - Double.valueOf(trans1) - Double.valueOf(trans1)- Double.valueOf(trans1)));
       ---> ANOTHER WAY TO DO THE EXERCISE W/O STORING THE DOUBLES SINCE WE ONLY USE THE DATA ONCE

    PSEUDO CODE:
    1. ask user for full name, age, phone number, and their 3 kids ages as a String.
    2. find the eldest, youngest, the age difference between oldest and youngest kids.

    Program:
    Your name is John Doe, your phone number is (123) 123 1234,
    You are 45 years old, Your oldest kid is 22 years old, your
    youngest is 12, difference between oldest and youngest is 10
    years.
    */
        scan.nextLine();
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Please enter your age:");
        String userAge = scan.next();
        scan.nextLine();
        System.out.println("Please enter your phone number:");
        String phNumber = scan.nextLine();
        System.out.println("Enter the ages of your kids:");
        String age1 = scan.next(), age2 = scan.next(), age3 = scan.next();

        int age1Int = Integer.parseInt(age1), age2Int = Integer.parseInt(age2), age3Int = Integer.parseInt(age3);
        int oldest = Math.max(Math.max(age1Int, age2Int), age3Int);
        int youngest = Math.min(Math.min(age1Int, age2Int), age3Int);
        int oldMinusYoung = oldest - youngest;

        System.out.println("Your name is " + name + ", your phone number is " + phNumber +
                ", \nYou are " + userAge + " years old, Your oldest kid is " + oldest +
                " your \nyoungest is " + youngest + " difference between oldest and youngest is " + oldMinusYoung + " \nyears.");

        /* int age1Int = Integer.parseInt(scan.next()), age2Int = Integer.parseInt(scan.next()), age3Int = Integer.parseInt(scan.next());
        int oldMinusYoung = Math.max(Math.max(age1Int, age2Int), age3Int) - Math.min(Math.min(age1Int, age2Int), age3Int);
        ---> THIS IS A MORE SIMPLIFIED WAY TO CODING THIS EXERCISED SINCE SOME VARIABLES ARE ONLY USED ONCE DON'T NEED TO STORE IT.
        */





    }
}
