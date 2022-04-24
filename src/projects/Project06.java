package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
        /* TASK-1
        Write a program that asks user to enter a sentence as a String, and count how many words the sentence has, and print it with given message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 2 words at least. If not, then just print “This sentence does not have multiple words”.
        Test data 1:                    Test data 2:                    Test data 3:
        Java is fun                     Hello World                     Hi
        Expected output 1:              Expected output 2:              Expected output 3:
        This sentence has 3 words.      This sentence has 2 words.      This sentence does not have multiple words. */

        /* PSEUDO CODE - NOT IN ANY ORDER:
        create scanner then trim it
        create if else statements - use contains(" ");
        create for loop to count each spaces
        create container to hold spaces
        print out messages
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine().trim();

        int spaceCounter = 0; //spaceCounter = 1

        if (!(sentence.contains(" "))) {
            System.out.println("This sentence does not have multiple words.");
        } else { // if it goes here then the String does have multiple words
            if (sentence.contains(" ")) {// checking if sentence contains more than 1 word
                for (int i = 0; i < sentence.length(); i++) {
                    if (Character.isWhitespace(sentence.charAt(i))) { // checking if 'i' is a space
                        spaceCounter++;
                    }
                }
                System.out.println("This sentence has " + (spaceCounter + 1) + " words.");
            }
        }
        /* must plus one to the container since each word is surrounded by spaces minus the first and last words.
        (it's the total number of space plus one to get number of word) */

        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n-----TASK 2------\n");
        /*TASK-2
        Write a program that asks user to enter a word, and check if it is palindrome or not.
        Palindrome: It is a word that is read the same backward as forward. EX: kayak, civic, madam
        NOTE: Write a program that handles any String
        NOTE: First check if the given String has at least 1 character.
        If the String does not have at least one character, then print message “This word does not have 1 or more characters”
        Test data 1:               Test data 2:                Test data 3:                     Test data 4:
        T                          civic                       Madam
        Expected output 1:         Expected output 2:          Expected output 3:               Expected output 4:
        This word is palindrome    This word is palindrome     This word is not palindrome      This word does not have 1 or more characters */

        /* PSEUDO CODE - NOT IN ANY ORDER:
        create scanner
        create if else statements - use length(); to check length of word
        create for loops to check letter
        use charAt(); to check first and last letter then next middle two and so on...
        code must be case-sensitive
        print out messages
        */

        System.out.println("Please enter a word:");
        String word = scan.next();

        // THIS IF CONDITION IS UNREACHABLE BASED ON REQUIREMENT
        if (word.isEmpty()) { // checking if the length of the word is less than 1 -- can also be word.equals("");
            System.out.println("This word does not have 1 or more characters");
        }else { // if it goes here then the String does have at least 1 letter
            boolean isPalindrome = true;// THINK: boolean should be used bc task has 1 condition that can return 2 opposing statements
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    //length=going to the end - i=checking each letter each iteration -1=checking last letter
                    isPalindrome = false; //boolean reassigned here
                    break;
                /* GIVEN: "CIVIC"
                charAt(0) == [charAt(length of civic=5 -i(the number of iteration the loop is in)=0 -1(adjust cursor back one space)]
                charAt(0) == charAt(5 - 0 - 1)--> 4
                charAt(0) == charAt(4)
                in "CIVIC" this is true C == C
                NOTE: charAt(); is case-sensitive since each char has specific ascii values (ex: C != c) */
                }
            }
            System.out.println(isPalindrome ? "This word is palindrome" : "This word is not palindrome");// condition ? true : false
        }

        /* THIS IS ANOTHER WAY TO DO IT USING REVERSE STRING LOGIC:
        System.out.println("Please enter a word:");
        String word = scan.next();

        String reverseWord = "";
        if (!word.isEmpty()){
            for (int i = word.length() - 1; i >= 0; i--) reverseWord += word.charAt(i);
            if (word.equals(reverseWord)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }else System.out.println("This word does not have 1 or more characters");
        */

        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n-----TASK 3------\n");
        /* TASK-3
        Write a program that asks user to enter a sentence as a String.
        Then, count how many a or A letters that sentence has and print it with given below message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 1 character at least. If not, then just print “This sentence does not have any characters”.
        Test data 1:                                    Test data 2:                                    Test data 3:
                                                        Apple is one of the largest IT companies.       I like banana and pineapple.
        Expected output 1:                              Expected output 2:                              Expected output 3:
        This sentence does not have any characters.     This sentence has 3 a or A letters.             This sentence has 5 a or A letters. */

        /*PSEUDO CODE - NOT IN ANY ORDER:
        create scanner
        'count' means create container to count each (a/A)
        create if-else statements to check length(); of sentence
        print out messages
        */

        System.out.println("Please enter a sentence:");
        scan.nextLine();
        String sentenceAa = scan.nextLine();

        if (sentenceAa.length() < 1) {
            System.out.println("This sentence does not have any characters.");
        } else {
            int countAa = 0;
            for (int i = 0; i < sentenceAa.length(); i++) {
                if (sentenceAa.charAt(i) == 'A' || sentenceAa.charAt(i) == 'a') countAa++;
            }
            System.out.println("This sentence has " + countAa + " a or A letters.");
        }

        System.out.println("\nEND OF THE PROGRAM");


        System.out.println("\n-----TASK 4------\n");
        /*TASK-4
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the numbers divided by 2,
        “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.
        Test data:
        6
        Expected output:
        1
        Foo
        Bar
        Foo
        5
        FooBar */

        System.out.println("Please enter positive number:");
        int positiveNumber = scan.nextInt();

        for (int i = 0; i <= positiveNumber; i++) {
            if (i % 2 == 0 && i % 3 == 0) { // RAREST CONDITION FIRST; can also be: positiveNumber % 6 == 0 (3*2=6)
                System.out.println("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }


    }
}
