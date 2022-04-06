package operators.arithmeticOperators;

public class Exercise123 {
    public static void main(String[] args){
    /* Create 2 int variables and assign them values. Then find the sum,
    subtraction, multiplication, division and remainder of these 2 values */

        int bigNumber = 21;
        int smallNumber = 4;

        int sum = bigNumber + smallNumber;
        int subtract =  bigNumber - smallNumber;
        int multiply = bigNumber * smallNumber;
        int divide = bigNumber / smallNumber;
        int remainder = bigNumber % smallNumber;

        System.out.println("Addition is = " + (bigNumber + smallNumber));
        System.out.println("Subtraction is = " + (bigNumber + smallNumber));
        System.out.println("Multiplication is = " + (bigNumber + smallNumber));
        System.out.println("Division is = " + (bigNumber + smallNumber));
        System.out.println("Remainder is = " + (bigNumber + smallNumber));
        // if using the white portion and not grey then the part 2 isn't necessary to code

    // Write a java program that calculates and prints the area and perimeter of a rectangle.

    /* PSEUDO CODE:
    CREATE THE VARIABLES
    FIND THE AREA BY MULTIPLYING LENGTH TIMES WIDTH
    FIND THE PERIMETER USING FORMULA (2 * (A + B))
    PRINT THEM OUT
    */

    int a = 4;
    int b = 6;

    int area = a * b; // a = 4, b = 6
    int perimeter = 2 * (a + b);

    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + perimeter);






    }
}
