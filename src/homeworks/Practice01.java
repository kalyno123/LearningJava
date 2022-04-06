package homeworks;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
    /* Assume that you are given a String as below;
    String str = ”SDLC is step by step procedure to create an application”;
    Write a program to find length of given String and the indexes of “SDLC” and “application” words */

        String str = "SDLC is step by step procedure to create an application";

        System.out.println(str.length()); // 55
        System.out.println(str.indexOf("SDLC")); // 0
        System.out.println(str.indexOf("application")); // 44

        System.out.println("\n-----TASK 2------\n");
    /* Assume that you are given a String as below;
    String str = “  I know how to code with Python  ”;
    Write a program to manipulate given String and convert it to be:
    “I KNOW HOW TO CODE WITH JAVA” */

        String str1 = "  I know how to code with Python  ";

        System.out.println(str1.trim().toUpperCase().replace("PYTHON","JAVA"));
        System.out.println(str1.replace("Python", "JaVa").toUpperCase().trim());
        System.out.println(str1.toUpperCase().trim().replace("PYTHON", "JAVA"));

        System.out.println("\n-----TASK 3------\n");
    /* Assume that you are given a String as below;
    String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
    1.Find the first character of given String which is not white space
    2.Find the last character of given String which is not white space */

        String str2 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   "; //.trim(); --> can trim right away

        System.out.println(str2.trim().charAt(0));
        System.out.println(str2.trim().charAt(str2.trim().length() - 1));

        // what they are is charAt(); where they are is indexOf();

        System.out.println("\n-----TASK 4------\n");
    /* String s1 = “  TECH ”;
    String s2 = “ glo  ”;
    String s3 = “ BAL       “;
    Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
    Note: The length of s4 will be 10 at the end!!! */

        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ";
        String s4 = s1.trim() + s2.trim() + s3.trim();

        System.out.println(s4.toLowerCase().replace('t','T').replace('g','G'));

    /*OTHER WAYS TO DO ABOVE TASK:
    String s1 = " TECH ".trim().toLowerCase().replace("t", "T");
    String s2 = " glo  ".trim().replace("g", "G");
    String s3 = " BAL       ".trim().toLowerCase();

    System.out.println(s1 + s2 + s3);

    String s4 = s1.trim().replace("ECH", "ech") + s2.trim().replace("g", "G") + s3.trim().toLowerCase();
    */

        System.out.println("\n-----TASK 5------\n");
    /*Write a program that asks user to enter their favorite color.
    Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
        NOTE: what they are is charAt(); where they are is indexOf();*/

        System.out.println("Give fave color:");
        String faveColor = ScannerHelper.getAStringFromUser();

        System.out.println(faveColor.charAt(0));
        System.out.println(faveColor.charAt(faveColor.length() - 1));
        System.out.println("First 3 characters in the color is = " + faveColor.substring(0, 3));
        System.out.println("Last 3 characters in the name is = " + faveColor.substring(faveColor.length() - 3));

        System.out.println("\n-----TASK 6------\n");

    /* Write a program that asks user to enter a full sentence
    Then, convert all sentence to lower case and print the first and last words in the given sentence
    Test data:
    JavA is an object-oriented programming LanguAGE
    Expected output:
    First word is = java
    Last word is = language */

        System.out.println("Please enter a sentence:");
        String sentence = ScannerHelper.getAStringFromUser().toLowerCase();

        System.out.println(sentence.substring(0, sentence.indexOf(' ')));
        System.out.println(sentence.substring(sentence.lastIndexOf(' ') + 1));

        System.out.println("\n-----TASK 7------\n");
    /* Write a program that asks user to enter a full sentence
    Then, check if given sentence contains $ character
    If it contains $ character, then find the index of the $ character and print a proper message for the found index
    Test data 1:
    I saved $100 to buy new airpods
    Expected output 1:
    This sentence contains $ character
    $ character’s index is = 8
    Test data 2:
    I’ll become a Software Engineer in Test
    Expected output 2:
    This sentence does not contain $ character */

        System.out.println("Please enter a sentence:");
        String sentence1 = ScannerHelper.getAStringFromUser();

              /* if (sentence1.contains("$"))
                System.out.println("This sentence contains $ char" + "\n$ character’s index is = " + sentence1.indexOf('$'));
               else System.out.println("This sentence does not contain $ character"); */

        System.out.println(sentence1.contains("$") ?
                "This sentence contains $ char" + "\n$ character’s index is = " + sentence1.indexOf('$') :
                "This sentence does not contain $ character");

















    }
}
