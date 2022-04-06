package utilities;

public class Calculator {

    /* HOW TO CREATE A METHOD:
    1. GIVE PROPER NAME
    2. DECIDE ITS ACCESSIBILITY LEVEL
        (public, private, default, protect)
    3. DECIDE ITS ACCESSIBILITY WAY (you want to invoke it with class name or with object name)
        static ---> invoke with CLASS NAME
        non-static ---> invoke with OBJECT NAME
    4. DECIDE IF IT RETURNS SOMETHING OR NOT
        if it returns --> then decide what it returns
        if it doesn't return --> then put VOID
    5. DOES IT TAKE ANY ARGUMENTS?
        if it does, then decide what arguments it takes and how many arguments
    NOTE: IF YOUR METHOD IS RETURNING SOMETHING THEN YOU MUST USE 'return' KEYWORD IN THE BODY OF THE METHOD
    NOTE: EVERY METHOD MUST HAVE A BODY {   } THAT RUNS THE TASK
    NOTE: IF YOUR METHOD RETURNS (INT), THEN THE VARIABLE USED NEXT TO RETURN KEYWORD IN THE BODY MUST BE (INT)
    NOTE: WE CAN HAVE MULTIPLE METHODS SHARING SAME NAME IN SAME CLASS IF IT HAS DIFFERENT ARGUMENT
    different arguments could be either the number of arguments OR type of arguments
    - NESTED METHODS DO NOT EXIST !! FOLLOW THE CURLY BRACES.
    */

    // DIVISION METHOD:
    public static int divide(int num1 , int num2){
        return (num1 / num2);
    }
    public static double divide(double num1 , double num2){
        return (num1 / num2);
    }

    /* PRACTICE HOMEWORK FOR JAVA METHOD:
    1. Create a method that finds the sum of 2 int numbers and returns it
    2. Create a method that finds the sum of 2 double numbers and returns it
    3. Create a method that finds the absolute difference of 2 int numbers and returns it
    4. Create a method that finds the absolute difference of 2 double numbers and returns it
    5. Create a method that finds the product of 2 int numbers and returns it
    6. Create a method that finds the product of 2 double numbers and returns it
    */
    // ADDITION METHOD:
    public static int additionInt(int num1, int num2){
        return (num1 + num2);
    }
    public static double additionDouble(double num1, double num2){
        return (num1 + num2);
    }

    /* ABSOLUTE DIFFERENCE METHOD:
    public static int absdifferenceInt(int num1, int num2){
        return Math.abs((Math.max(num1, num2)) - (Math.min(num1, num2)));
    }
    public static double absdifferenceDouble(double num1, double num2){
        return Math.abs((Math.max(num1, num2)) - (Math.min(num1, num2)));
    }*/

    public static int absdifferenceInt(int num1, int num2){
        return Math.abs(num1 - num2);
    }
    public static double absdifferenceDouble(double num1, double num2){
        return Math.abs(num1 - num2);
    }

    // MULTIPLICATION METHOD:
    public static int multiplicationInt(int num1, int num2){
        return (num1 * num2);
    }
    public static double multiplicationDouble(double num1, double num2){
        return (num1 * num2);
    }



}
