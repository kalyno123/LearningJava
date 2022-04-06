package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        /* toCharArray(); Method: This is a String method. It is used to turn a String into a char array.
        1. it is non-static which means it must be invoked by its objectVariable.
        2. it is a return type and returns a char array (char[]).
        3. It doesn't take any arguments.
        */

        String s = "Java"; // say you want to take each letter of this string and store it in an array (specifically char[])

        char[] chars = s.toCharArray();
        // here the char array is initialized and assigned the String converted into an array using toCharArray(); String Method.

        int countA = 0;
        for (char element : chars){
            if (element == 'a') countA++;
        } System.out.println(countA);

        System.out.println(Arrays.toString(chars)); // one way to print out the new char[] back to a String

        System.out.println(Arrays.toString(s.toCharArray())); // another way to print w/o storing

        System.out.println(Arrays.toString("Java".toCharArray())); // BEST way to print using only ONE line of code






    }
}
