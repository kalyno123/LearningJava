package arrays;

import java.util.Arrays;

public class _02_Practice_String_Arrays {
    public static void main(String[] args) {

    System.out.println("\n-----TASK 1------\n");
    /* TASK-1:
    Create a String array and store below data. Name of the array will be 'students'.
    Alex
    Tom
    John
    James
    Jordan
    Lionel
    Adam
    1. Print the array
    2. Sort the array and print it again
    EXPECTED:
    Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
    Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
    */
        String[] students = {"Alex", "Tom", "John", "Jordan", "James", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));


    System.out.println("\n-----TASK 2------\n");
    /* TASK-2:
    Print the first and the last names after it is sorted
    EXPECTED:
    First name is = Adam
    Last name is = Tom
    */
        System.out.println("First name = " + students[0] + "\nLast name = " + students[students.length-1]);


    System.out.println("\n-----TASK 3------\n");
    /* TASK-3:
    [Adam, Alex, James, John, Jordan, Lionel, Tom]
    Count how many names starts with A
    EXPECTED:
    2
    */
        /* LOOPS IN ARRAYS:
        use for-each loop when you are starting from the initialization point (NOTE: for-each ALWAYS start from initialization point; look for keyword 'each' in requirements).
        use for-i loop when you are not starting from the initialization point or stopping before the termination point or looking for specific indexes. */

        System.out.println("\n---------TASK-3 for-each loop----------\n");
        int countA1 = 0;
        for (String element : students){
        if (element.startsWith("A")) countA1++; // OR student.charAt(0) == 'A'
        }
        System.out.println(countA1);

        System.out.println("\n---------TASK-3 for-i loop----------\n");
        int countA2= 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].charAt(0) == 'A') countA2++; // OR students[i].startsWith("A")
        }
        System.out.println(countA2);


        System.out.println("\n-----TASK 4------\n");
    /* TASK-4
    [Adam, Alex, James, John, Jordan, Lionel, Tom]
    Count how many names contains a-A or e-E
    EXPECTED:
    5
    */
        System.out.println("\n---------TASK-4 for-each loop----------\n");
        int countAorE1 = 0;
        for (String element : students){
            // CAN ALSO DO THIS FIRST: element = element.toLowerCase();
            if (element.contains("A") || element.contains("a") || element.contains("E") || element.contains("e"))
                countAorE1++;
            // OR CAN BE CODED AS: if (element.toLowerCase().contains("a") || element.toLowerCase().contains("e")) countAorE++;
        }
        System.out.println(countAorE1);

        System.out.println("\n---------TASK-4 for-i loop----------\n");
        int countAorE2 = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E"))
                countAorE2++;
        }
        System.out.println(countAorE2);

        System.out.println("\n-----TASK 5------\n");
    /* TASK-5
    [Adam, Alex, James, John, Jordan, Lionel, Tom]
    Count how many names has at least 5 characters 5,6,7,8,9,.....
    EXPECTED:
    3
    */
        int countLength5 = 0;
        for (String element : students){
            if (element.length() >= 5) countLength5++;
        }
        System.out.println(countLength5);


        System.out.println("\n-----TASK 6------\n");
    /* TASK-6
    [Adam, Alex, James, John, Jordan, Lionel, Tom]
    Check if this array has an element that is equal to "Jennifer"
    If it has it, print true. Otherwise, print false
    EXPECTED:
    false
    */
        boolean hasJennifer = false; // why does it start as false?

        for (String element : students){
            if (students.equals("Jennifer")){
                hasJennifer = true; // if there is a match then condition will be true
                break; // as soon as there is a match(true) the loop will break
            }
        }
        System.out.println(hasJennifer); // false




        /* MORE PRACTICE:
        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */





    }
}
