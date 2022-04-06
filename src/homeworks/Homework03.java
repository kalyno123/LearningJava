package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

    /* PSEUDO CODE FOR TASK ONE AND TWO:
    1. Create a new object for scanner and import
    2. Ask and store 2 data variables given by user
    3. Print out given variable and its sum */

    Scanner numberInput = new Scanner(System.in);

    System.out.println("\n-----TASK 1------\n");

    System.out.println("Please enter two numbers:");
    int number1 = numberInput.nextInt();
    int number2 = numberInput.nextInt();
    System.out.println("The number 1 entered by user is = " + number1);
    System.out.println("\nThe number 2 entered by user is = " + number2);
    System.out.println("\nThe sum of number 1 and 2 entered by user is = " + (number1 + number2));

    System.out.println("\n-----TASK 2------\n");

    System.out.println("Please enter two decimal (floating) numbers:");
    double num1 = numberInput.nextDouble(), num2 = numberInput.nextDouble();
    System.out.println("The number 1 entered by user is = " + num1);
    System.out.println("\nThe number 2 entered by user is = " + num2);
    System.out.println("\nThe division of number 1 and 2 entered by user is = " + (num1 / num2));

    System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. Create the variables and assign them values.
    2. Then do the test equations. */

    int a = -10;
    int b = 7;
    int c = 5;
    int d = 72;
    int e = 24;
    int f = 10;
    int g = -3;
    int h = 9;
    int i = 18;
    int j = 3;
    int k = 6;

    System.out.println("1.\t" + (a + b * c));
    System.out.println("2.\t" + ((d + e) % e));
    System.out.println("3.\t" + (f + g * h / h));
    System.out.println("4.\t" + (c + i / j * j - (k % j)));

    /* THIS IS THE QUICKER WAY TO DO TASK THREE:
    System.out.println("1." + "\t" + (-10 + 7 * 5));
    System.out.println("2." + "\t" + ((72 + 24) % 24));
    System.out.println("3." + "\t" + (10 + -3 * 9 / 9));
    System.out.println("4." + "\t" + (5 + 18 / 3 * 3 - (6 % 3))); */

    System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR: (creating scanner object and import already done)
    1. Ask and store 2 data variables given by user.
    2. Print out given variables and its sum, subtraction, multiplication, division and remainder. */

    System.out.println("Please enter two decimal (floating) numbers:");
    double variable1 = numberInput.nextDouble();
    double variable2 = numberInput.nextDouble();
    System.out.println("The number 1 entered by user is = " + variable1);
    System.out.println("The number 2 entered by user is = " + variable2);

    System.out.println("\nThe sum of the given numbers is = " + (variable1 + variable2));
    System.out.println("The product of the given numbers is = " + (variable1 * variable2));
    System.out.println("The subtraction of the given numbers is = " + (variable1 - variable2));
    System.out.println("The division of the given numbers is = " + (variable1 / variable2));
    System.out.println("The remainder of the given numbers is = " + (variable1 % variable2));

    System.out.println("\n-----TASK 5------\n");
    /* PSEUDO CODE FOR TASK FIVE:
    1. Ask and store 2 data variables given by user.
    2. Find the area.
    3. Find the perimeter.
    4. Print them out. */

    double value1 = 7.5;
    double value2 = 10.5;

    double area = value1 * value2;
    double perimeter = 2 * (value1 + value2);

    System.out.println("The area of the rectangle = " + area);
    System.out.println("The perimeter of the rectangle = " + perimeter);

    System.out.println("\n-----TASK 6------\n");
    /* PSEUDO CODE FOR TASK FIVE:
    1. Assume avg annual SDET salary is $90k.
    2. Find the sum of SDET salary can earn in 3 years. */

    double sdetSalary = 90_000; // $90,000.00
    System.out.println("A Software Engineer in Test can earn " + (sdetSalary * 3) + " in 3 years.");


    }
}
