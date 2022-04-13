package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-z]+", "a"));// true --> contains 1 or more occurrences of lowercase letters a-z
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello world"));// false --> bc given String contains space
        // "[a-zA-Z ]" --> don't have to exclusively indicate space (\\s) to make it true.


        /* TASK 1:
        Write a regex pattern with the conditions below:
        Must be more than 8 characters.
                Must be no more than 15 characters.
                Could include letters(Upper and Lower), numbers, _, and -
        */
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "TechGlobal_4"));


        // TASK 2: Write a regex pattern for a phone number with the format of: (XXX)-XXX-XXXX
        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(123)-456-7890"));






    }
}
