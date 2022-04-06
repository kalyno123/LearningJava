package stringMethods;

import utilities.ScannerHelper;

public class _08_length {
    public static void main(String[] args) {
       /* length(); METHOD TASK: COUNT TOTAL NUMBER OF CHARACTERS IN A STRING AND RETURN LENGTH VALUE  AS INT
       NON-STATIC = WE CAN CALL IT WITH OBJECT VARIABLE (did you call the class name or not when invoking this method?)
       IT IS RETURN TYPE AND IT RETURNS AN INT (total number of char)
       IT DOES NOT TAKE ANY ARGUMENTS
       NOTE: COUNTS HUMAN WAY STARTING AT 1 (not index way)
       NOTE: SPACE IS ALSO COUNTED AS CHAR
       */

        String city = "Chicago";

        System.out.println(city.length()); // 7
        System.out.println(city.length() + 3); // 10

        String company = "TechGlobal";

        int size = company.length(); // 10

        System.out.println(size); // 10

    /* LENGTH PRACTICE TASK:
    Write a Java program that asks user to enter their favorite book name and quote.
    Then store answers of user in different Strings
    Finally, print the length of those Strings with proper message
    */
        System.out.println("Please enter favorite book name:");
        String book = ScannerHelper.getAStringFromUser();

        System.out.println("Please enter favorite quote:");
        String quote = ScannerHelper.getAStringFromUser();

        System.out.println("Length of given book is = " + book.length());
        System.out.println("Length of given quote is = " + quote.length());


    /* PRACTICE TASK FOR LENGTH:
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "

    Kaly
    charAt(0)
    charAt(3) -> name.length()-1

    NOTE:
    First character of String is always -> str.charAt(0)
    Last character of String is always -> str.charAt(str.length()-1)
     */
        System.out.println("Please enter your name:");
        String name = ScannerHelper.getAStringFromUser();

        System.out.println("First character in the name is = " + name.charAt(0));
        System.out.println("Last character in the name is = " + name.charAt(name.length()-1));








    }
}
