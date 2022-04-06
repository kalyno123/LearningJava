package projects;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n-----TASK 1------\n");
    /*  Write a program that asks user to enter a String, and swaps first and last 4 characters of this String and print the modified String
        Test data:
        TechGlobal --> Tech + Gl + obal --> obalGlTech
        Expected output:
        obalGlTech
        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is less than 8, then print message
        “This String does not have 8 characters” */

        System.out.println("Please enter a word:");
        String word = scan.next();

        /*if (word.length() >= 8){ // PRE-CONDITIONS
            System.out.println(word.substring(word.length() - 4) // LAST FOUR CHAR
                    + word.substring(4, word.length() - 4) // MIDDLE; just what's left over from start - end
                    + word.substring(0, 4)); // FIRST FOUR CHAR
        }else {
            System.out.println("This String does not have 8 characters");
        }*/

        System.out.println(word.length() >= 8 ?
                word.substring(word.length() - 4) + word.substring(4, word.length() - 4) + word.substring(0, 4) +
                                word.substring(0, 4) : "This String does not have 8 characters");

        System.out.println("\n-----TASK 2-----\n");
    /*  Write a program that asks user to enter a sentence, and swaps first and last words of this sentence and print the modified sentence
        Test data:
        Selenium is an automation tool
        Expected output:
        tool is an automation Selenium
        NOTE: Write a program that handles any sentence
        NOTE: First check if the sentence has at least 2 words, if the sentence has only one or no word, then print message
        “This sentence does not have 2 or more words to swap” */

        System.out.println("Please enter a sentence:");
        scan.nextLine();
        String sentence = scan.nextLine().trim();  // ADDING TRIM() ENSURES THAT ITS IS TWO WORDS BC USER CAN ENTER ONE WORD WITH SPACES "Hello   "

        /*if (sentence.contains(" ")){ //ANOTHER WAY TO WRITE THIS CONDITION --> sentence.trim().indexOf(' ') > 0 -- if index doesn't exist (result:-1) or is less than 0 it'll move to else
            System.out.println(sentence.substring(sentence.lastIndexOf(' ') + 1) +
                    sentence.substring(sentence.indexOf(' '), sentence.lastIndexOf(' ') + 1) +
                    sentence.substring(0, sentence.indexOf(' ')));
        }else {
            System.out.println("This sentence does not have 2 or more words to swap");
        }*/

        System.out.println(sentence.contains(" ") ? sentence.substring(sentence.lastIndexOf(' ') + 1) +
                sentence.substring(sentence.indexOf(' '), sentence.lastIndexOf(' ') + 1) +
                sentence.substring(0, sentence.indexOf(' ')) : "This sentence does not have 2 or more words to swap");

        System.out.println("\n-----TASK 3-----\n");
    /*  Assume that you are given some Strings as below, and you want to replace bad words with good words.
        String str1 = “These books are so stupid”;
        String str2 = “I like idiot behaviors”;
        String str3 = “I had some stupid t-shirts in the past and also some idiot look shoes”;
        Write a Java program that checks any given String and replace bad words like “stupid” and “idiot” with “nice” keyword
        Expected output:
        These books are so nice
        I like nice behaviors
        I had some nice t-shirts in the past and also some nice look shoes
        NOTE: Write a program that handles any String */

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        if (str3.contains("idiot") && str3.contains("idiot")) {
            System.out.println(str3.replaceAll("stupid", "nice").replaceAll("idiot", "nice"));
        }else if (str3.contains("stupid") || str3.contains("idiot")){
            System.out.println(str3.replaceAll("stupid", "nice").replaceAll("idiot", "nice"));
        }

        System.out.println("\n-----TASK 4-----\n");
    /*  Write a program that asks user to enter their name.
        First check if length of name is more than 2 and is even or odd
        If length of name is less than 2, then print “Invalid input!!!”
        If length of name is odd, then print middle character from the name
        If length of name is even, then print middle 2 characters from the name
        Test data:              Test data:              Test data:
        J                       Lionel                  James
        Expected output:        Expected output:        Expected output:
        Invalid input!!!        on                      m
    */
        System.out.println("Please enter your first name:");
        String name = scan.next();

        if (name.length() >= 2)
            if (name.length() % 2 == 0) // EVEN length
                System.out.println("" + name.charAt(name.length() / 2 - 1) + name.charAt(name.length() / 2));
            else System.out.println(name.charAt(name.length() / 2)); // ODD length --> name.length() % 2 != 0
        else System.out.println("Invalid input!!!");

        System.out.println("\n-----TASK 5-----\n");
    /*  Write a program that asks user to enter a country.
        First check if length of country is more than 5. If not, then print “Invalid input!!!”
        If length of country is more than 5, then print country name without first 2 and last 2 characters
        Test data:              Test data:
        Peru                    Brazil
        Expected output:        Expected output:
        Invalid input!!!        az
    */
        System.out.println("Please enter a country:");
        String country = scan.next();

        /* if (country.length() >= 5){
            System.out.println("" + country.charAt(country.length() / 2 - 1) + country.charAt(country.length() / 2));
        }else{
            System.out.println("Invalid input!!!");
        }*/

        System.out.println(country.length() >= 5 ?
                "" + country.charAt(country.length() / 2 - 1) + country.charAt(country.length() / 2) : "Invalid input!!!");

        System.out.println("\n-----TASK 6-----\n");
    /*  Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
        Test data:
        2860 S River Rd Suite 350, Des Plaines IL 60018
        Expected output:
        2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018

    */
        System.out.println("Please enter a address:");
        scan.nextLine();
        String address = scan.nextLine();

        if (address.contains("a") || address.contains("A") || address.contains("e") || address.contains("E") ||
                address.contains("i") || address.contains("I") || address.contains("o") || address.contains("O") ||
                address.contains("u") || address.contains("U"))
            System.out.println(address.replaceAll("a", "*").replaceAll("A", "*")
                            .replaceAll("e", "#").replaceAll("E", "#")
                            .replaceAll("i", "+").replaceAll("I", "+")
                            .replaceAll("o", "$").replaceAll("O", "$")
                            .replaceAll("u", "@").replaceAll("U", "@"));

        System.out.println("\n-----TASK 7-----\n");
    /*  Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included),
        Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.
        Test data:
        int randomNumber1 = 12;
        int randomNumber2 = 4;
        Expected output:
        12 – 11 – 9 – 8 – 7 – 6 - 4
        NOTE: RANDOM * (END POINT - START POINT + 1) + START POINT */

        int randomNum1 = (int) (Math.random() * 26);
        int randomNum2 = (int) (Math.random() * 26);
        System.out.println("Random number 1 = " + randomNum1);
        System.out.println("Random number 2 = " + randomNum2);

        if (randomNum1>randomNum2){
            for (int i = randomNum2; i <= randomNum1; i++){
                if (i % 5 != 0)System.out.println(i);
            }
        }else{
            for (int i = randomNum1; i <= randomNum2; i++){
                if (i % 5 != 0) System.out.println(i);
            }
        }



    }
}
