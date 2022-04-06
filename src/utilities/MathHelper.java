package utilities;

public class MathHelper {

    // create a method that takes 3 ints and return the max value

    public static int maxOfThree (int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
    // THIS IS CALL OVERLOADING ... USING DOUBLE INSTEAD OF INT FOR SAME NEW METHOD
    public static double maxOfThree (double num1, double num2, double num3){
        return Math.max(Math.max(num1, num2), num3);
    }
    // the name of the method can be the same but the argument CANNOT BE THE SAME

    // CREATE A METHOD THAT TAKE 3 BYTE NUMBERS AS ARGUMENTS AND RETURN THE SMALLEST
    public static byte minOfThree (byte num1, byte num2, byte num3){
        return (byte) Math.min(Math.min(num1, num2), num3);
    }
    /*
    PLEASE CREATE METHOD THAT TAKES AN INT AS AN ARGUMENT AND RETURN TRUE IF IT IS EVEN; RETURNS FALSE IF IT IS ODD.
    METHOD NAME: isEven
    RETURN TYPE
    STATIC
    PUBLIC
    */
    public static boolean isEven(int num){
        return num % 2 == 0; // this num % 2 == 0 is a boolean, so it'll return true/false.

        /* THIS IS THE LONGER WAY TO CODE THE ABOVE
        if (num % 2 == 0) return true;
        else return false;
        */
    }
    // PLEASE CREATE METHOD THAT TAKES AN INT AS AN ARGUMENT AND RETURN TRUE IF IT IS ODD; RETURNS FALSE IF IT IS EVEN.
    public static boolean isODD(int num){
        return num % 2 != 0;
    }

    // CREATE A METHOD THAT TAKE ONE INT AS ARGUMENT AND RETURN IF IT'S A POSITIVE NUMBER.
    public static boolean isPositive(int num){
        return num > 0;
    }
    // CREATE A METHOD THAT TAKE ONE INT AS ARGUMENT AND RETURN IF IT'S A POSITIVE NUMBER.
    public static boolean isNegative(int num){
        return num < 0;
    }
    // CREATE A METHOD THAT TAKE ONE INT AS ARGUMENT AND RETURN IF THE NUMBER IS ZERO.
    public static boolean isZero(int num){
        return num == 0;
    }











}
