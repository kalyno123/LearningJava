package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){

    /* HOW TO CREATE A SCANNER:
    1. CREATE AN OBJECT OF SCANNER & IMPORT CLASS
    ClassName variableName = new DataType(); <-- (System.in) is specific to SCANNER
    2.
    variableName.methodName() (XXXX) <-- if parameter is needed;
     */

    /* TASK ONE:
    1. ASK USER TO ENTER THEIR AGE
    2. PRINT THE QUESTION
    3. USE PROPER NEXT METHOD (nextInt)
    4. print out user's age
     */

    Scanner collect = new Scanner(System.in);

    System.out.println("How old are you?");
    int usersAge = collect.nextInt();
    System.out.println("User's age is = " + usersAge + " years old.");

    /* TASK TWO:
    ASK FOR THE ACCOUNT BALANCE OF THE USER.
    GET THE ACCOUNT BALANCE AND STORE IT.
    PRINT IT OUT.
     */

     System.out.println("\nWhat is your account balance?");
     double userBalance = collect.nextDouble(); // <-- cant add double quotation bc its a double not string
     System.out.println("\n\t\'User account balance is\' = \"$" + userBalance + "\"");

    // ASK USER:  "ARE YOU UNDERSTANDING THIS JAVA CLASS TODAY?"
        System.out.println("\nAre you understanding Java class today? (true/false)");
        boolean userAnswer = collect.nextBoolean(); // boolean is a TRUE OR FALSE statement only
        System.out.println("\'User understands Java class today\' = " + userAnswer);


    }
}
