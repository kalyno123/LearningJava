package homeworks;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* PSEUDO CODE FOR TASK ONE:
    Assume that you are given a String of any length. First check if it has at least length of 1. If the length is zero, then print “Length is zero”
    If it has length more than zero, then find:
    -The length of the String
    -First char in the String
    -Last char in the String
    -Check if the String contains any vowel letters
	-if it has any vowel, then print “This String has a vowel”
	-Else, print “This String does not have a vowel”
	Vowels = a, e, i, u, o
    */
        String s1 = "JavaScript";
    if (s1.length() >= 1){
        System.out.println("Length is = " + s1.length());
        System.out.println("First char = " + s1.charAt(0));
        System.out.println("Last char = " + s1.charAt(s1.length()-1));
        /*if (s1.contains("a") || s1.contains("A") || s1.contains("e") || s1.contains("E") ||
                s1.contains("i") || s1.contains("I") || s1.contains("o") || s1.contains("O") ||
                s1.contains("u") || s1.contains("U")){
            System.out.println("This String has a vowel");
        }else {
            System.out.println("This String does not have a vowel");
        }*/
        System.out.println(s1.contains("a") || s1.contains("A") || s1.contains("e") || s1.contains("E") ||
                s1.contains("i") || s1.contains("I") || s1.contains("o") || s1.contains("O") ||
                s1.contains("u") || s1.contains("U") ? "This String has a vowel" : "This String does not have a vowel");

        /*
        if (s1.toLowerCase.contains("a") || s1.toLowerCase.contains("e") || s1.toLowerCase.contains("i") ||
        s1.toLowerCase.contains("o") || s1.toLowerCase.contains("u"))
        System.out.println("This String has a vowel");
        else System.out.println("This String does not have a vowel");
        */

    }else{ //s1.length() == 0 OR s1.isEmpty()
        System.out.println("Length is zero");
    }
        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 2------\n");
    /* PSEUDO CODE FOR TASK TWO:
    Assume that you are given a String of any length. First check if it has at least length of 3.
    If the length is less than 3, then print “Length is less than 3”
    If it has length more than or equal to 3, then find the middle character for the odd length, middle 2 characters for the even length.
    */
        String s2 = "toyota";
    if (s2.length() >= 3){
        /*if (s2.length() % 2 == 0){ //even length
            System.out.println("" + s2.charAt(s2.length()/2 - 1) + s2.charAt(s2.length()/2));
        }else { //odd length
            System.out.println(s2.charAt(s2.length()/2));
        }*/
        System.out.println((s2.length() % 2 == 0) ? ("" + s2.charAt(s2.length()/2 - 1) + s2.charAt(s2.length()/2)) :
                (s2.charAt(s2.length()/2)));
    }else { //s2.length() < 3
        System.out.println("Length is less than 3");
    }

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 3------\n");
    /* PSEUDO CODE FOR TASK THREE:
    Write a program that divides the given String. Length of given will be at least 4.
    if length of the String is not at least 4, then print “INVALID INPUT”
    If the length is 4 or more, then
    -print the first two characters
    -print the last two characters
    -print all the middle characters other than first and last 2 characters
    */
        String s3 = "Arizona";
    if (s3.length() >= 4){
        System.out.println("First 2 characters are = " + s3.substring(0,2));
        System.out.println("Last 2 characters are = " + s3.substring(s3.length()-2));
        System.out.println("The other characters are = " + s3.substring(2, s3.length()-2));
    }else {//s3.length() < 4
        System.out.println("INVALID INPUT");
    }
        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 4------\n");
    /* PSEUDO CODE FOR TASK FOUR:
    Assume that you are given a String of any length. First check if it has at least length of 2.
    If the length is less than 2, then print “Length is less than 2”
    If it has length more than or equal to 2 and first 2 and last characters are same, then print true. Otherwise, print false
    */
        String s4 = "xyzay";
    if (s4.length() >= 2){
        /*if (s4.substring(0,2).equals(s4.substring(s4.length()-2))){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/
        System.out.println(s4.substring(0,2).equals(s4.substring(s4.length()-2)) ? "true" : "false");
    }else {
        System.out.println("Length is less than 2");
    }

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 5------\n");
    /* PSEUDO CODE FOR TASK FIVE:
    Write a program that gets rid of first and last characters of given two String values.
    After getting rid of first and last characters, add these two String values to each other and print the result.
    If one of the String values has length that is less than 2, then print “INVALID INPUT”
    */
        String s5 = "Yellow";
        String s6 = "Red";
    /*if (s5.length() < 2 || s6.length() < 2) {
        System.out.println("INVALID INPUT");
    }else {
        System.out.println(s5.substring(1, s5.length()-1) + s6.substring(1, s6.length()-1));
    }*/
        System.out.println((s5.length() < 2 || s6.length() < 2) ?
                "INVALID INPUT" : s5.substring(1, s5.length()-1) + s6.substring(1, s6.length()-1));

        System.out.println("\nEND OF THE PROGRAM");

        System.out.println("\n-----TASK 6------\n");
    /* PSEUDO CODE FOR TASK SIX:
    Write a program that checks if a given String that has length of 4 at least and starts and ends with xx.
    -If the length of String is less than 4, then print “INVALID INPUT”
    -If given String starts and ends with xx, then print true.
    -Otherwise, print false.
    */
        String s7 = "xxbluexx";
    if (s7.length() >= 4){
        /*if (s7.startsWith("xx") && s7.endsWith("xx")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
        System.out.println(s7.startsWith("xx") && s7.endsWith("xx") ? "true" : "false");
    }else {
        System.out.println("INVALID INPUT");
    }
        System.out.println("\nEND OF THE PROGRAM");






    }
}
