package stringMethods;

import utilities.ScannerHelper;

public class _03_equals{
    public static void main(String[] args) {

    /* STRING METHOD FORMAT CONSIDERATIONS:
    - what is the task? what it does?
    - is it static or non-static?
    - is it return type or void?
    - if it is return type, then what it returns?
    - does it take any arguments?
    */

        /* equals(); METHOD TASK: IT COMPARES 2 STRINGS WITH EACH OTHER AND TELLS IF THEY ARE EQUAL TO OR NOT
        NOTE: THIS COMPARISON IS CASE-SENSITIVE
        - IT IS NON-STATIC = WE CAN CALL IT WITH ANOTHER STRING OBJECT VARIABLE
        - IT IS A RETURN TYPE AND IT RETURNS A BOOLEAN
        - IT TAKES A STRING AS AN ARGUMENT
        */

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true

        System.out.println("abc".concat("xyz").equals("abcx" + "yz")); // true --> abcxyz == abcxyz

    /* EQUALS METHOD PRACTICE TASK:
    Write a Java program that asks user to enter 2 strings
    And store answers of user in different String variables
    Finally, check if given 2 Strings are equal or not and print messages given below
    Test data 1:
        Java
        java
    Expected output 1:
        These strings are not equal
    Test data 2:
        Hello
        Hello
    Expected output 2:
        These strings are equal
    */
        String s1 = ScannerHelper.getAStringFromUser();
        String s2 = ScannerHelper.getAStringFromUser();

        if (s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        String result = (s1.equals(s2)) ? "These string are equal" : "These string are not equal";
        System.out.println(result);

        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ?
                "These string are equal" : "These string are not equal"); // MOST EFFICIENT WAY TO CODE IT

    }
}
