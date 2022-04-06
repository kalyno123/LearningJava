package stringMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import utilities.ScannerHelper;

public class _10_substrings {
    public static void main(String[] args) {
        /* substring(); USE TOT EXTRACT A SUBSTRING FROM A LARGER STRING
        IT IS NON-STATIC = WE CAN CALL THEM WITH OBJECT VARIABLES
        IT IS A RETURN TYPE, THEY RETURN ANOTHER STRING
        - THERE ARE 2 OVERLOADED METHOD:
            substring(beginIndex) --> THIS METHOD TAKES BEGIN INDEX AS AN ARGUMENT, AND IT EXTRACTS A SUBSTRING FROM GIVEN BEGIN INDEX
            substring(beginIndex, endIndex) --> THIS METHOD WILL TAKE 2 ARGUMENTS DEFINE BY THE START INDEX AND END INDEX YOU WANT TO EXTRACT, AND IT EXTRACTS A SUBSTRING FROM GIVEN INDEXES
                NOTE: beginIndex is inclusive but endIndex is exclusive
                NOTE: if your beginIndex is equal to endIndex, then it will return empty string
                NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
         */

        String result = "About 3,520,000,000 results (0.82 second)";
        // extract 3,520,000,000 from above String.
       // String num = result.substring(6, 18); --> 3,520,000,00; even tho index 18 in the end index BUT substring endIndex is not inclusive
        String num = result.substring(6, 19); // 3,520,000,000; bc it's not inclusive you have to increase endIndex by 1 to make the remaining 0 included in ur substring
        System.out.println(num);

        // extract (0.82 second)
        String second = result.substring(28); // substring(beginIndex) is used bc you want to extract from ( to the end so no need to use endIndex; UNNECESSARY ARGUMENT
        System.out.println(second);

        System.out.println(result.substring(result.indexOf('('))); // this is a good way to extract what you want without counting index
        System.out.println(result.substring(result.lastIndexOf('0') - 1)); // this is a good way to extract what you want without counting index
        System.out.println(result.substring(result.length() - 14)); // this is a good way to extract what you want without counting index --> LENGTH: LENGTH IS 42 - 14 = 28

        /* SUBSTRING PRACTICE TASK:
        ask user to enter a sentence then find and print the first and last words from given sentence with below message
        test data 1: I like Java
        expected outcome: first work = I ... last word = Java
        test data 2: Today is Sunday
        expected outcome: first word = Today ... last word = Sunday
        */
        System.out.println("Please enter a sentence:");
        String sentence = ScannerHelper.getAStringFromUser();

        System.out.println("First word = " + sentence.substring(0, sentence.indexOf(' ')));
        // give index 0 , everything before the first space is my first word
        System.out.println("Last word = " + sentence.substring(sentence.lastIndexOf(' ') + 1));
        // everything after the last space is my last word ; plus 1 bc you don't want to include the space







    }
}
