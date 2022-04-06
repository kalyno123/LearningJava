package stringMethods;

import utilities.ScannerHelper;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {

        /* startWith(); and endsWith(); METHOD TASK: FIND IF STRING STARTS WITH OR ENDS WITH ANOTHER LETTER OR STRING
        IT ARE NON-STATIC = CAN BE CALL WITH OBJECT VARIABLE
        IT IS A RETURN TYPE AND RETURNS A BOOLEAN (true or false)
        NOTE: startsWith(); is an overloaded method
            - startsWith(); is case sensitive
            - startsWith(prefix); enter "perfix" you want to look for in given string, and it looks for a match from index 0
            - startsWith(prefix, int-index offset); "perfix" you want to look for in given string, then looks for match from specified offset index
        */

        String str = "Today is Sunday";

        System.out.println(str.startsWith("Today")); // true
        System.out.println(str.startsWith("today")); // false
        System.out.println(str.endsWith("day")); // true

        System.out.println(str.toUpperCase().endsWith("SUNDAY")); // true

        System.out.println(str.startsWith("is", 6)); // true --> (prefix , index off set value)

    /* STARTSWITH AND ENDSWITH PRACTICE TASK:
    Ask user to enter a name
    If the name starts with A or a, then print "You are in the club A"
    If the name does not start with A or a, print "You are not in the club A"
    */
        System.out.println("Please enter a name:");
        String name = ScannerHelper.getAStringFromUser();

        /* if (name.startsWith("A") || name.startsWith("a")) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A"); */

        System.out.println((name.startsWith("A") || name.startsWith("a")) ? "You are in the club A" : "You are not in the club A" );

        if(name.toUpperCase().startsWith("A")) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.toLowerCase().startsWith("a")) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.charAt(0) == 'A' || name.charAt(0) == 'a') System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.toUpperCase().charAt(0) == 'A') System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.toLowerCase().charAt(0) == 'a') System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.charAt(0) == 65 || name.charAt(0) == 97) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.toUpperCase().charAt(0) == 65) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.toLowerCase().charAt(0) == 97) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A"); // BEST WAY
        System.out.println(name.toUpperCase().startsWith("A") ? "You are in the club A" : "You are not in the club A"); // BEST WAY

    }
}
