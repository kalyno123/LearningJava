package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    1. Ask user to enter name and print it
    2. Find the length of the name user entered and print it
    2. Find the first character in the name and print it
    3. Find the last character in the name and print it
    4. Find the first 3 characters in the name and print it
    5. Find the last 3 characters in the name and print it
    6. Check if name starts with character A (or a) or not and print messages below
	If name starts with A or a, print “You are in the club!”
	If name does not start with A or a, print “Sorry, you are not in the club”
    */
        System.out.println("Please enter a name:");
        String name = ScannerHelper.getAStringFromUser();
        System.out.println(name);

        System.out.println("Length of name is = " + name.length());
        System.out.println("First letter of name is = " + name.charAt(0));
        System.out.println("Last letter of name is = " + name.charAt(name.length() - 1));
        System.out.println("First 3 characters in the name is = " + name.substring(0, 3));
        System.out.println("Last 3 characters in the name is = " + name.substring(name.length() - 3));
        System.out.println(name.startsWith("A") || name.startsWith("a") ? "You are in the club!" : "You are not in the club!");

    /* System.out.println("The length of the name is = " + name.length());
    if(!name.isEmpty()){ //name.length() > 0
    System.out.println("The first character in the name is = " + name.charAt(0));
    System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
    }

    if(name.length() >= 3){ // name.length() > 2
    System.out.println("The first 3 characters in the name are = " + name.substring(0,3));
    System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));
    }

    /*
    HOW TO FIND IF NAME STARTS WITH LOWERCASE OR UPPERCASE A
    1. name.startsWith("A") || name.startsWith("a")
    2. name.toLowerCase().startsWith("a")
    3. name.toUpperCase().startsWith("A")
    4. name.charAt(0) == 'A' || name.charAt(0) == 'a'
    5. name.charAt(0) == 65 || name.charAt(0) == 97
    6. name.toLowerCase().charAt(0) == 'a'
    7. name.toLowerCase().charAt(0) == 97
    8. name.toUpperCase().charAt(0) == 'A'
    9. name.toUpperCase().charAt(0) == 65

    *** THIS IS MORE DYNAMIC BC IS COVER WHEN USER DOESN'T ENTER ANYTHING:
    if (!name.isEmpty()){
         if (name.startsWith("A") || name.startsWith("a")) {
             System.out.println("You are in the club!");
         }else System.out.println("You are not in the club!");
    } */


        System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    1. Asks user to enter their full address
    2. Check if city is Chicago (or chicago) in the address
    3. If city is Chicago, then print “You are in the club”
    4. If city is Des Plaines, then print “You are welcome to join to the club”
    5. If city is any other city, then print “Sorry, you will never be in the club”
    */
        System.out.println("Please enter your full address:");
        String address = ScannerHelper.getAStringFromUser();
        System.out.println(address);

        if (address.isEmpty()) { //covers the case when user doesn't entre an address
            System.out.println("The address is required!");
        }else {
            if (address.toLowerCase().contains("chicago"))
            System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");
        }

        System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    1. Asks user to enter their colors, at least 4 colors
    2. Check If those colors contains “red” and “green”
    3. If “green” is listed in favorite colors, then print “Green is in the list”
    4. If “red” is listed in favorite colors, then print “Red is in the list”
    5. If both “green” and “red” are listed in favorite colors, then print “Green and red are in the list”
    6. If both “green” and “red” are not listed in favorite colors, then print “Green and red are not in the list”
    */
        System.out.println("Please enter at least four of your favorite colors:");
        String faveColors = ScannerHelper.getAStringFromUser().toLowerCase(); // colors are converted to lowercase right away
        System.out.println(faveColors);

        if (faveColors.isEmpty()) { //covers the case when user doesn't entre any colors
            System.out.println("The favorite colors is required!");
        }else {
            if (faveColors.contains("green") && faveColors.contains("red"))
                System.out.println("Green and red are in the list");
            else if (faveColors.contains("green"))
                System.out.println("Green is in the list");
            else if (faveColors.contains("red"))
                System.out.println("Red is in the list");
            else
                System.out.println("Green and red are not in the list ");
        }

        System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    1. GIVEN: String str = “   Java is FUN   ”;
    2. Create 3 new Strings and assign each word from str to those new Strings
    3. Print the results as below
    */
        String str = "   Java is FUN   ";
        String newStr = str.trim().toLowerCase();

        // THIS IS THE MOST DYNAMIC WAY OF EXTRACTING ANY STRINGS
        System.out.println("The first word in the str is = " + newStr.substring(0, newStr.indexOf(' ')));
        System.out.println("The second word in then str is = " + newStr.substring(newStr.indexOf(' ') + 1, newStr.lastIndexOf(' ')));
        System.out.println("The third word in the str is = " + newStr.substring(newStr.lastIndexOf(' ' + 1)));

        /*
        String java = str.trim().substring(0, 4);
        String is = str.trim().substring(5, 7);
        String fun = str.trim().substring(8);
        System.out.println(java + " " + is + " " + fun);

        ** THIS IS THE LOGIC TO EXTRACT EACH WORD DYNAMICALLY ; CUTTING EACH WORD AND STORING IT THEN CUTTING AGAIN FROM THERE**

        String str = "  Make your code dynamic   ";

        str = str.toLowerCase().trim(); // "Make your code dynamic"

        String s1 = str.substring(0, str.indexOf(' ')); // Make -- to get first word
        String s4 = str.substring(str.lastIndexOf(' ')+1); // dynamic -- to get last word

        str = str.substring(str.indexOf(' ')+1); // "your code dynamic" -- here the str is reassigned to three words
        String s2 = str.substring(0, str.indexOf(' ')); // this is getting first of middle
        String s3 = str.substring(str.indexOf(' ')+1, str.lastIndexOf(' ')); // this is getting last of middle

        System.out.println("The first word in the str is = " + s1);
        System.out.println("The second word in the str is = " + s2);
        System.out.println("The third word in the str is = " + s3);
        System.out.println("The fourth word in the str is = " + s4); */

    }
}
