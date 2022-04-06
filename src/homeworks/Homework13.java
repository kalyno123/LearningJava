package homeworks;

import java.util.*;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------\n");
        /* TASK 1:
        Write a program that prints all the numbers from 1 to 10 (1 and 10 are included)
        If the number is dividable by 2, then print “Foo” instead of number itself
        If the number is dividable by 5, then print “Bar” instead of number itself
        If the number is dividable by both 2 and 5, then print “FooBar” instead of number itself
        Else print number itself
        Expected output:
        1
        Foo
        3
        Foo
        Bar
        Foo
        7
        Foo
        9
        FooBar
        */
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 5 == 0) { // i % 10 == 0 --> 5 * 2 = 10
                System.out.println("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("END OF THE PROGRAM");


        System.out.println("\n-----TASK 2------\n");
        /* TASK 2:
        Write a program to find the first positive and negative numbers in an int array
        Test data:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        Expected output:
        First positive number is: 5
        First negative number is: -4
        NOTE: Make your code dynamic that works for any given int array.
        */

        /*
        ANOTHER WAY:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean isFirstPositive = false;
        boolean isFirstNegative = false;

        for (int i = 0; i < numbers.length; i++){
            if (isFirstPositive && isFirstNegative) break;
            if (i > 0 && !isFirstPositive){ //if and when the element of that iteration is NOT a positive number and is
            //"true" then it will pass this condition and go to else if. otherwise, if the element is positive and false then it's the 1st positive
                isFirstPositive = true;
                System.out.println("First positive number is: " + i);
            }else if (i < 0 && !isFirstNegative){ //if and when this condition becomes false then that element is a negative number (the 1st negative number)
            //this condition is essentially a double negative here since its false but now its saying not false; so it true. when the true
            //becomes false then the element(number) of that iteration is a negative number and when 1st negative is found break
                isFirstNegative = true;
                System.out.println("First negative number is: " + i);
            }
        }
        */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int positive = -1, negative = 1;
        for (int number : numbers) {
            if (positive != -1 && negative != 1) break; // if 'true' & 'true' break -- stop loop
            if (positive == -1 && number > 0)
                positive = number; // if 'true' & the element is greater than or = 0 then it's a positive # (1st)
            else if (negative == 1 && number < 0)
                negative = number; // if 'true' & the element is less than zero then it's a negative # (1st)
        }
        System.out.println((positive != -1) ? "First positive number is: " + positive : "Positive number was not found ");
        System.out.println((negative != 1) ? "First negative number is: " + negative : "Positive number was not found ");

        System.out.println("END OF THE PROGRAM");


        System.out.println("\n-----TASK 3------\n");
        /* TASK 3:
        Write a program to generate 5 random numbers between 1 and 10 (1 and 10 are included) and store those numbers in an int array.
        Check if int array contains 2 or 3 as elements
        If it contains 2 or 3, then return true
        If it does not contain either 2 or 3, then return false
        NOTE: (MATH.RANDOM * (END POINT - START POINT + 1) + START POINT);
        */

        /* Random random = new Random();
        int randomNum = random.nextInt(10)+1; OR BOUND = 11; args always starts at 0 and end point is exclusive. so bound has to compensate parameter.

        int random1 = (int) (Math.random() * 11) + 1;
        int random2 = (int) (Math.random() * 11) + 1;
        int random3 = (int) (Math.random() * 11) + 1;
        int random4 = (int) (Math.random() * 11) + 1;
        int random5 = (int) (Math.random() * 11) + 1;  */

        int[] randomNumbers = new int[5]; // requirement declare size = 5 --> "generate 5 random numbers"
        /* randomNumbers[0] = random1;
        randomNumbers[1] = random2;
        randomNumbers[2] = random3;
        randomNumbers[3] = random4;
        randomNumbers[4] = random5; */
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 11) + 1;
        }
        //System.out.println(Arrays.toString(randomNumbers));

        boolean has2Or3 = false; // raise flag to check is array contains 2 or 3
        for (int element : randomNumbers) {
            if (element == 2 || element == 3) {
                has2Or3 = true; // if and when condition is met to reassign to true
                break; // stop loop as soon as it is found that the array contains 2 or 3
            }
        }
        System.out.println(has2Or3);

        System.out.println("END OF THE PROGRAM");


        System.out.println("\n-----TASK 4------\n");
        /* Write a program to find if String array contains “apple” as an element, ignore cases.
        Test data 1:                                                  Test data 2:
        String[] list = {"banana", "orange", "Apple"};                String[] list = {"pineapple", "banana", "orange", "grapes"};
        Expected output:                                              Expected output:
        true                                                          false

        NOTE: Make your code dynamic that works for any given String array.
        */
        String[] task4Array = {"pineapple", "banana", "orange", "grapes"};
        //List<String> task4List = new ArrayList<>(Arrays.asList(task4Array));
        //ArrayList can dynamically resize. ArrayList will adjust any given String[] size. The String[] here is being converted into an ArrayList.

        boolean hasApple = false;
        for (String element : task4Array) {
            if (element.equalsIgnoreCase("apple")){
                hasApple = true;
                System.out.println(true);
                break;
            }//else System.out.println(false); --> cant w/o boolean and this way bc false will print each time an element != apple.
        }
        System.out.println(hasApple);

        System.out.println("END OF THE PROGRAM");


        System.out.println("\n-----TASK 5------\n");
        /* TASK 5:
        Write a program to find the all-matching elements between 2 int arrays
        Test data 1:
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        Expected output 1:
        20
        50
        70
        Test data 2:
        int[] numbers1 = {30, 50, 70};
        int[] numbers2 = {20, 100, 300};
        Expected output 2:
        There is no matching elements
        NOTE: Make your code dynamic that works for any given int arrays.
        */

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean isDuplicateFound = false;
        for (int element1 : numbers1) {
            for (int element2 : numbers2) {
                if (element1 == element2) {// if and when an element of the 1st loop matches an element of 2nd loop print it
                    isDuplicateFound = true; // reassign to true when condition is met
                    System.out.println(element2); // everytime there's a match it'll print the match element value
                    // OR CAN BE: System.out.println(element1) -- either or bc if they are equal it doesn't matter which is printed
                }
            }
        }
        if (!isDuplicateFound) System.out.println("There is no matching elements");

        System.out.println("END OF THE PROGRAM");


        System.out.println("\n-----TASK 6------\n");
        /* TASK 6:
        Write a program that prints duplicated characters in a String, ignore cases.
        Test data 1:
        String str = ”baNana”;
        Expected output 1:
        a
        N
        Test data 2:
        String str = ”aPple”;
        Expected output 1:
        P
        NOTE: Make your code dynamic that works for any given String.
        */

        String str = "baNana";
        //char[] chars = str.toCharArray();
        //System.out.println(Arrays.toString(chars)); // [b, a, N, a, n, a]
        String duplicates = ""; // inside container is a & n (not a, n, a -- this is bc !duplicates.contains("" + str.toLowerCase().charAt(i))
        // says if this container already has that value in it don't add it.)

        for (int i = 0; i < str.length()-1; i++){// i = 0; i < str.length()-1; --> outer loop must start at 0 to start checking from first element
            for (int j = i + 1; j < str.length(); j++){// j = i + 1; j < str.length(); --> inner loop must start at the iteration(index) the outer is in plus 1
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) // checking if there's matching letters
                        && !duplicates.contains("" + str.toLowerCase().charAt(i))){//see below note
                    duplicates += str.toLowerCase().charAt(i);// add to/update container when condition is met
                    System.out.println(str.charAt(i));// here not printing container but the original str
                    break;
                }
            }
        }
        //String[] project = duplicates.split(" ");
        //System.out.println(Arrays.toString(project));
        /* NOTE: a sign that a container is needed aside from keywords "sum" and "count" is when a condition has already been meet and there
        are other elements that also meets that same condition; you can use the container to tell it not to check that like-element anymore.
        FOR THE ABOVE EXAMPLE: !duplicates.contains("" + str.toLowerCase().charAt(i)) --> HERE IS SAYING IF CONTAINER ALREADY HAS
        THIS ELEMENT IN IT THEN DON'T ADD ANOTHER SIMILAR ELEMENT. */

        /*
        for (char element1 : chars){
            for (char element2 : chars){
                if (element1 == element2 && !duplicates.contains()){
                    duplicates += element1;
                    System.out.println(duplicates);
                }
            }
        }
        */
        




    }
}
