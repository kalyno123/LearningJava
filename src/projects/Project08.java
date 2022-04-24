package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project08 {

    /* TASK-1 - countMultipleWords() method
    Write a method that takes a String[] array as an argument and counts how many strings in the array has multiple words
    This method will return an int which is the count of multiple words
    NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “
    Test data:
    [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]
    Expected output:
    2
    */
    /*
    public static int countMultipleWords(String[] a) {
        int countMultiWordsElements = 0;
        for (String element : a) {
            if (element.trim().contains(" ")) countMultiWordsElements++;
        }
        return countMultiWordsElements;
    }
    */

    // JOHNATHAN'S SOLUTION:
    public static int countMultipleWords(String[] a) {
        ArrayList<String> newWords = new ArrayList<>(Arrays.asList(a));
        return (int) newWords.stream().filter(word -> word.trim().contains(" ")).count();
    }


    /* TASK-2 - removeNegatives() method
    Write a method that takes an ArrayList<Integer> numbers as an argument and removes all negative numbers from the given list if there are any.
    This method will return an ArrayList with removed negatives.
    Test data 1:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 1:
    [2, 6, 7, 0, 15]
    */
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        ArrayList<Integer> posList = new ArrayList<>();
        for (Integer element : numbers) {
            if (element >= 0) posList.add(element);
        }
        return posList;
    }

    /* DENIZ'S SOLUTION:
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number < 0);
        System.out.println(numbers);
    }
    */

    /* DATA'S SOLUTION:
    public static ArrayList<Integer> removeNegative(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator(); // put all elements in a queue
            while (iterator.hasNext()) { // checking if there is an element in the queue
                Integer element = iterator.next(); // this gets an element from the queue
                if (element < 0) { // if element came from the queue is less than 0
                    iterator.remove(); // remove all element that meets the condition
                }
            }
        return numbers;
    }
    */


    /* TASK 3: validatePassword() method
    Write a method that takes a String password as an argument and checks if the given password is valid or not.
    This method will return true if given password is valid, or false if given password is not valid.
    A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
	-should NOT have any space
    Test data 1:

    Expected output 1:
    false
    Test data 2:
    abcd
    Expected output 2:
    false
    Test data 3:
    abcd1234
    Expected output 3:
    false
    Test data 4:
    Abcd1234
    Expected output 4:
    false
    Test data 5:
    Abcd123!
    Expected output 5:
    true
    */

    public static boolean validatePassword(String password) {
        // PATTERN FORMAT: at least 1 digit, 1 uppercase, 1 lowercase, 1 special char, NO spaces
        return password.matches("(?=.*[@!#$%]+)(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+).{8,22}");
    }

    /* MY SOLUTION W/O USING REGEX:
    public static boolean validatePassword(String password) {
       if(!password.contains(" ") && (password.length() >= 8 && password.length() <= 16)){
           boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false, hasSpecial = false;
           for (int i = 0; i < password.length(); i++){
               char c = password.charAt(i);
               if (Character.isLetter(c)){
                   if (Character.isLowerCase(c)) hasLowerCase = true;
                   else if (Character.isUpperCase(c)) hasUpperCase = true;
               }else if (Character.isDigit(c)) {
                   hasDigit = true;
               }else hasSpecial = true;
           }
           return (hasDigit && hasLowerCase && hasUpperCase && hasSpecial);
       }else return false;
    }
    */

    /* SALIH'S SOLUTION:
    public static boolean validatePassword(String password) {
        int digit = 0, upper = 0, lower = 0, special = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) digit++;
            else if (Character.isUpperCase(password.charAt(i))) upper++;
            else if (Character.isLowerCase(password.charAt(i))) lower++;
            else special++;
        }
        return (password.length() >= 0 && password.length() <= 16)
                && (digit > 0 && upper > 0 && lower > 0 && special > 0)
                && !(password.contains(" "));
    }
    */

    /* AKIN'S SOLUTION:
    public static boolean validatePassword(String str) {
        if (str.contains(" ") || str.length() < 8 || str.length() > 16) return false;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) uppercase = true;
            else if (Character.isLowerCase(c)) lowercase = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }
        return uppercase && lowercase && digit && special;
    }*/


    /* TASK-4 - validateEmailAddress() method
    Write a method that takes a “String email” as an argument and checks if the given email is valid or not.
    This method will return true if given email is true, or false if given email is not valid.
    A VALID EMAIL:
    -should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>
    Test data 1:
    a@gmail.com
    Expected output 1:
    false
    Test data 2:
    abc@g.com
    Expected output 2:
    false
    Test data 3:
    abc@gmail.c
    Expected output 3:
    false
    Test data 4:
    abc@@gmail.com
    Expected output 4:
    false
    Test data 5:
    abcd@gmail.com
    Expected output 5:
    true
    */

    public static boolean validateEmailAddress(String email) {
        // PATTERN FORMAT: <2+chars>@<2+chars>.<2+chars>
        return email.matches("([a-zA-z]{2,})@([a-zA-z]{2,}).([a-zA-z]{2,})");
    }

    /* MELDA'S SOLUTION:
    public static boolean validateEmailAddress(String email) {
        if (email.contains(" ")) return false;
        if (email.contains("@") && email.contains(".")) {
            String[] split1 = email.split("@");
            String[] split2 = split1[1].split("\\."); // in java . needs to be escaped --> \\.
            return split1[0].length() > 2 && split2[0].length() > 2 && split2[1].length() > 2;
        }
        return false;
    }
    */

    /* AKIN'S SOLUTION:
    public static boolean validateEmail(String str){
        if (str.contains(" ") || !str.contains("@") || !str.contains(".") ||
                (str.indexOf("@") != str.lastIndexOf("@")) || str.length() < 8) return false;

        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@") + 1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf("@")).length() >= 2;
    }
    // str.length()-1 != str.removeAll("@").length(); -- if the expression is equal this means there's only 1 @ but if it's not
    // equal then this means there was more than one @ ex: str.length-1 != str.length-2 --> true = there were 2 @.
    */

    /* SALIH'S SOLUTION:
    public static boolean validateEmailAddress(String email) {
        // +validation of . --> after the @ sign there shouldn't be more than 1 .
        // +validation of @ --> only 1 @ AND and email contains
        // +validation of first part --> (0, index of @ ) >= 2
        // validation of second part --> (index of @ + 1, last index of . ) >= 2
        // validation of first part --> (last index of . + 1) >= 2
        int digit = 0, iAt = email.indexOf("@"), lAt = email.lastIndexOf("@"), lDot = email.lastIndexOf(".");
        for (int i = lAt + 1; i < email.length(); i++) if (email.charAt(i) == '.') digit++;
        return digit == 1 && (iAt == lAt && email.contains("@")) && lAt >= 2 && lDot - lAt >= 3 && email.length() - lDot >= 3;
    }
    */


    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");
        String[] t1 = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(t1));

        System.out.println("\n-----TASK 2------\n");
        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(2);
        t2.add(-5);
        t2.add(6);
        t2.add(7);
        t2.add(-10);
        t2.add(-78);
        t2.add(0);
        t2.add(15);
        System.out.println(removeNegatives(t2));

        System.out.println("\n-----TASK 3------\n");
        String str1 = "";
        String str2 = "abcd";
        String str3 = "abcd1234";
        String str4 = "Abcd123";
        String str5 = "Abcd123!";
        System.out.println(validatePassword(str1));
        System.out.println(validatePassword(str2));
        System.out.println(validatePassword(str3));
        System.out.println(validatePassword(str4));
        System.out.println(validatePassword(str5));

        System.out.println("\n-----TASK 4------\n");
        String str6 = "a@gmail.com";
        String str7 = "abc@g.com";
        String str8 = "abc@gmail.c";
        String str9 = "abc@@gmail.com";
        String str10 = "abcd@gmail.com";
        System.out.println(validateEmailAddress(str6));
        System.out.println(validateEmailAddress(str7));
        System.out.println(validateEmailAddress(str8));
        System.out.println(validateEmailAddress(str9));
        System.out.println(validateEmailAddress(str10));


    }
}
