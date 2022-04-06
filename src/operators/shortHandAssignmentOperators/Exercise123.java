package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise123 {
    public static void main(String[] args){

    /* Create 2 int variables; int a = 8, b = 3; Then, find their sum, subtraction, multiplication,
    division and remainder by using shorthand operators, and assign those values into a.
     */

       int a = 8;
       int b = 3;

       a += b; // 8 + 3 = 11
       a -= b; // 11 - 3 = 8
       a *= b; // 8 * 3 = 24
       a /= b; // 24 / 3 = 8
       a %= b; // 8 / 3 = 2

    System.out.println("a + b = " + (a += b));
    System.out.println("a - b = " + (a -= b));
    System.out.println("a * b = " + (a *= b));
    System.out.println("a / b = " + (a /= b));
    System.out.println("a % b = " + (a %= b));

    /*Write a Java program that asks user to enter their balance and one day transactions.
    Subtract each transaction from balance and return new balance using shorthand operator.
     */

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter your account balance:");
    double balance = userInput.nextDouble();

    System.out.println("Enter your first transaction:");
    double firstTrans = userInput.nextDouble();
    balance -= firstTrans;
    System.out.println("Balance after 1st transaction = $" + balance);

    System.out.println("Enter your second transaction:");
    double secondTrans = userInput.nextDouble();
    balance -= secondTrans;
    System.out.println("Balance after 2nd transaction = $" + balance);

    System.out.println("Enter your third transaction:");
    double thirdTrans = userInput.nextDouble();
    balance -= thirdTrans;
    System.out.println("Balance after 3rd transaction = $" + balance);

    //PLEASE FIND THE AGE OF JOHN FOR 5 YEARS LATER.
    int johnsAge = 5;
        System.out.println(johnsAge += 5);

    //ADD 'A-N-D-E-R' TO ALEX
        String name = "Alex";
        name += 'a';
        name += 'n';
        name += 'd';
        name += 'e';
        name += 'r';
        System.out.println("NEW NAME IS = " + name);


    }
}
