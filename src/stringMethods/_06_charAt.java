package stringMethods;

import utilities.ScannerHelper;

public class _06_charAt {
    public static void main(String[] args) {

        /* charAt(); METHOD TASK: IT RETURNS A CHAR AT A SPECIFIED INDEX
        NON-STATIC = WE CAN CALL IT WITH OBJECT VARIABLE (did you call the class name or not when invoking this method?)
        IT IS RETURN TYPE AND IT RETURNS A CHAR
        IT TAKES AN ARGUMENT WHICH IS AN INT-INDEX (if you put char letters it'll be converted to its ascii value)
        */

        String name = "Johj";

        System.out.println(name.charAt(0)); // J
        System.out.println(name.charAt(1)); // o
        System.out.println(name.charAt(2)); // h
        System.out.println(name.charAt(3)); // n
        //System.out.println(name.charAt(-1)); // StringIndexOutOfBoundException --> will not return bc it is out of bound
       // System.out.println(name.charAt(4)); // StringIndexOutOfBoundException -- error

        // PRACTICE TASK: CHECK IF THE NAME STARTS WITH A J
        char firstChar = name.charAt(0);

        if (firstChar == 'J' || firstChar == 'j') System.out.println("This name starts with J");
        else System.out.println("This name starts doesn't with J");

    // if (firstChar.equalsIgnoreCase("J")) ---> do not try to run string methods wih primitives
    // CANNOT USE equalsIgnoreCase HERE BECAUSE IT TAKES AND RETURN A STRING. WHEREAS, charAt TAKES INT-INDEX AND RETURN CHAR.

    /* charAt(); practice task:
    Write a program that asks user to enter their name. Then find and print first and last char of user's name.
    NOTE:   First character of String is always -> str.charAt(0)
            Last character of String is always -> str.charAt(str.length()-1) */

        System.out.println("Please enter your name:");
        String name1 = ScannerHelper.getAStringFromUser();

        System.out.println("First character in the name is = " + name1.charAt(0));
        System.out.println("Last character in the name is = " + name1.charAt(name1.length()-1));

        // testing if charAt(); is case-sensitive. IT IS!
        String str = "Civic";
        if (str.charAt(0) == str.charAt(str.length()-1)){
            System.out.println(true);
        }
        System.out.println(false);
    }
}
