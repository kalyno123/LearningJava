package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){

    int number1 = 5;
    int number2 = 10;

    // ADDITION
    int sum = number1 + number2; // 8

    // SUBTRACTION
    int sub = number1 - number2; // 2

    // MULTIPLICATION
    int times = number1 * number2; // 15

    // DIVISION
    int divide = number1 / number2; //

    // REMAINDER
    int remainder = number1 % number2; //

    System.out.println("addition is = " + sum);
    System.out.println("subtraction is = " + sub);
    System.out.println("multiplication is = " + times);
    System.out.println("division is = " + divide);
    System.out.println("remainder is = " + remainder);

    /* An annual average salary for an SDET in the Unites States is 90k. Write a Java program that
    calculates and prints the monthly and bi-weekly and weekly average amount that an SDETs makes in the United States.
     */

    /* PSEUDO CODE:
    1. CREATE THE VARIABLE
    2. DO THE EQUATION
    3. PRINT THEM OUT */

    double avgSalary = 90_000.00; // same as 900000.00 _ is just a space holder
    double monthlySal = avgSalary / 12;
    double biWeeklySal = avgSalary / 26;
    double weeklySal = avgSalary / 52;

    System.out.println("Monthly salary = " + monthlySal);
    System.out.println("Biweekly salary = " + monthlySal);
    System.out.println("Weekly salary = " + monthlySal);

    }
}
