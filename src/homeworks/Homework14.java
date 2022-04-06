package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Write a program to find the first duplicated number in an int array
    It should print “There is no duplicates” if there are no duplicate elements.
    NOTE: Make your code dynamic that works for any given int array.
    Test data 1: int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
    Expected output 1:
    0
    Test data 2: int[] numbers = {-8, 56, 7, 8, 65};
    Expected output 2:
    There is no duplicates
    Test data 3: int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
    Expected output 2:
    3
    */
        //int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //int[] numbers = {-8, 56, 7, 8, 65};
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        ArrayList<Integer> firstNumDup = new ArrayList<>();

        //for (int i = 0, j = i + 1; i < numbers.length; i++){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !firstNumDup.contains(numbers[i])) {
                    firstNumDup.add(numbers[i]);
                }
            }
        }
        if (firstNumDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(firstNumDup.get(0));

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    Write a program to find the first duplicated String in a String array, ignore cases.
    It should print “There is no duplicates” if there are no duplicate elements.
    NOTE: Make your code dynamic that works for any given String array.
    Test data 1: String[] words = {“Z”, “abc”, “z”, “123”, “#” };
    Expected output 1:
    Z
    Test data 2: String[] words = {“xyz”, “java”, ”abc”};
    Expected output 2:
    There is no duplicates
    Test data 3: String[] words = {“a”, “b”, “B”, “XYZ”, “123”};
    Expected output 2:
    b
    */
        //String[] words = {"Z", "abc", "z", "123", "#" };
        //String[] words = {"xyz", "java", "abc"};
        String[] words = {"a", "b", "B", "XYZ", "123"};
        ArrayList<String> firstStrDup = new ArrayList<>();

        //for (int i = 0, j = i + 1; i < numbers.length; i++){
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !firstStrDup.contains(words[i])) {
                    firstStrDup.add(words[i]);
                }
            }
        }
        if (firstStrDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(firstStrDup.get(0));

        System.out.println("\n-----TASK 3------\n");
    /* TASK 3:
    Write a program to find the all duplicates in an int array.
    It should print “There is no duplicates” if there are no duplicate elements.
    NOTE: Make your code dynamic that works for any given int array.
    Test data 1: int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
    Expected output 1:
    0
    -7
    Test data 2: int[] numbers = {1, 2, 5, 0, 7};
    Expected output 2:
    There is no duplicates
    */
        int[] digits = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        //int[] digits = {1, 2, 5, 0, 7};
        ArrayList<Integer> allDupDigits = new ArrayList<>();

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j] && !allDupDigits.contains(digits[i])) {
                    allDupDigits.add(digits[i]);
                    break;
                }
            }
        }
        if (allDupDigits.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer element : allDupDigits) System.out.println(element);


        System.out.println("\n-----TASK 4------\n");
    /* TASK 4:
    Write a program to find the all duplicates in a String array, ignore cases.
    It should print “There is no duplicates” if there are no duplicate elements.
    NOTE: Make your code dynamic that works for any given String array.
    Test data 1: String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”, “java”};
    Expected output 1:
    A
    foo
    Test data 2: String[] words = {“python”, “foo”, “bar”, “java”, “123” };
    Expected output 2:
    There is no duplicates
    */
        String[] randomWords = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        //String[] randomWords = {"python", "foo", "bar", "java", "123"};
        ArrayList<String> allDupWords = new ArrayList<>();

        for (int i = 0; i < randomWords.length - 1; i++) {
            for (int j = i + 1; j < randomWords.length; j++) {
                if (randomWords[i].equalsIgnoreCase(randomWords[j]) && !allDupWords.contains(randomWords[i])) {
                    allDupWords.add(randomWords[i]);
                    break;
                }
            }
        }
        if (allDupWords.isEmpty()) System.out.println("There is no duplicates");
        else for (String element : allDupWords) System.out.println(element);


        System.out.println("\n-----TASK 5------\n");
    /* TASK 5:
    Write a program to reverse elements in an array, then print array.
    NOTE: Make your code dynamic that works for any given array.
    Test data 1: String[] words1 = {“abc”, “foo”, “bar”};
    Expected output 1:
    [bar, foo, abc]
    Test data 2: String[] words2 = {“java”, “python”, “ruby”};
    Expected output 2:
    [ruby, python, java]
    */
        String[] words1 = {"abc", "foo", "bar"};
        //String[] words1 = {"java", "python", "ruby"};
        ArrayList<String> reverseElements= new ArrayList<>();

        for (int i = words1.length-1; i >= 0; i--) {
                reverseElements.add(words1[i]);
        }
        System.out.println(reverseElements);


        System.out.println("\n-----TASK 6------\n");
    /* TASK 6:
    Write a program to reverse each word in a given String
    NOTE: Make your code dynamic that works for any given String.
    Test data 1: String str = “Java is fun”;
    Expected output 1:
    avaJ si nuf
    Test data 2: String str = “Today is a fun day”;
    Expected output 2:
    yadoT si a nuf yad
    */
        String str = "Java is fun";
        //String str = "Today is a fun day";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        //System.out.println(reverse); // nuf si avaJ

        String[] reserve2 = reverse.split(" "); //[nuf, si, avaJ]
        String reverseAgain = "";
        for (int i = reserve2.length - 1; i >= 0; i--) {
            reverseAgain += reserve2[i] + " ";
        }
        System.out.println(reverseAgain.trim());

        /* NAIM'S SOLUTION:
        String str = "Today is a fun day";
        String[] word = str.split(" ");
        String fullReverse = "";

        for (String s : word) {
            String reversedWord = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversedWord += s.charAt(i);
            }
            fullReverse += reversedWord + " ";
        }
        System.out.println(fullReverse.trim());
        */

        /* OZDEN'S SOLUTION:
        String str = "Java is fun";
        String[] strT6 = str.split(" ");
        String reservedWord = "";
        String word = "";

        for (int i = 0; i < strT6.length; i++) {
            for (int j = strT6[i].length() - 1; j >= 0 ; j--) {
                reservedWord += strT6[i].charAt(j) ;
            }
            reservedWord +=  " ";
        }
        System.out.println(reservedWord);
        */

        /* KEREM'S SOLUTION:
        String string = "Java is fun";
        String[] opposite = string.split(" ");
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }
        */







    }
}
