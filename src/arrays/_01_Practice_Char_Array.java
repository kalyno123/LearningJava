package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

    System.out.println("\n-----TASK 1------\n");
    /* TASK-1
    Create a char array and store values below and print the array.
    #
    $
    5
    A
    b
    H
    Expected Outcome:
    [#, $, 5, A, b, H]    */

    char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};
    System.out.println(Arrays.toString(randomChars)); // [#, $, 5, A, b, H]

    System.out.println("\n-----TASK 2------\n");
    /* TASK-2
    Print the size of the array with below message.
    EXPECTED:
    The size of the array is = 6    */

    // char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};
    System.out.println("The size of the array is = " + randomChars.length); //v6
        // Array.getLength(objectName) --> this is an array static method to get the length
        // randomChars.length --> is an instance variable; non-static

    System.out.println("\n-----TASK 3------\n");
    /* TASK-3
    Print each element using for-i loop
    EXPECTED:
    #
    $
    5
    A
    b
    H   */

    // char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};
    for (char i = 0; i < randomChars.length; i++){
        System.out.println(randomChars[i]);
    }

    System.out.println("\n-----TASK 4------\n");
    /* TASK-4
    Print each element using for-each loop
    EXPECTED:
    #
    $
    5
    A
    b
    H   */

    // char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};
    for (char element : randomChars){
        System.out.println(element);
        }

    System.out.println("\n-----TASK 5------\n");
    /* TASK-5
    Print each element that are letters
    EXPECTED:
    A
    b
    H   */
    // char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};

    System.out.println("\n----------TASK-5 - for-i loop-----------\n");
    for (int i = 0; i <= randomChars.length-1; i++) {
        if(Character.isLetter(randomChars[i])) System.out.println(randomChars[i]);
    }

    System.out.println("\n----------TASK-5 - for-each loop-----------\n");
    for (char element : randomChars){
        if (Character.isLetter(element)) System.out.println(element);
    }

    System.out.println("\n-----TASK 6------\n");
    /* TASK-6
    Count how many uppercase characters you have in the array
    EXPECTED:
    2   */
    // char[] randomChars = {'#', '$', '5', 'A', 'b', 'H'};

    System.out.println("\n----------TASK-6 - for-i loop-----------\n");
    int countUpper1 = 0;
    for (int i = 0; i < randomChars.length; i++) {
        if(Character.isUpperCase(randomChars[i])) countUpper1++;
    }
    System.out.println(countUpper1);

    System.out.println("\n----------TASK-6 - for-each loop-----------\n");
    int countUpper2 = 0;
    for (char element : randomChars){
        if (Character.isUpperCase(element))
        countUpper2++;
    } System.out.println(countUpper2);

    // NOTE: FOR-EACH LOOP IS ALSO KNOWN AS ENHANCED FOR-I LOOP (ONLY IN COLLECTIONS)

        /*
        EXTRA PRACTICES
        Count lowercase letters
        Count digits
        Count spaces
        Count specials
        */




    }
}
