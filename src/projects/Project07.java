package projects;

import java.util.Arrays;

public class Project07 {

    /* TASK-1 - findGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find the greatest and smallest elements from the array and print them. Complete task using sort() method.

    Test data:
            [10, 7, 7, 10, -3, 10, -3]

    Expected output:
    Smallest = -3
    Greatest = 10 */
    public static void findGreatestAndSmallestWithSort(int[] a){
        if (a.length > 1){
            Arrays.sort(a);
            System.out.println("Smallest = " + a[0]);
            System.out.println("Greatest = " + a[a.length-1]);
        }
    }


    /* TASK-2 findGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find the greatest and smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.

    Test data:
            [10, 7, 7, 10, -3, 10, -3]

    Expected output:
    Smallest = -3
    Greatest = 10 */
    /* I COULDN'T FIGURE OUT HOW TO DO IT USING FOR-I LOOPS.
    public static void findGreatestAndSmallest(int[] a){
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        if (a.length > 1){
            for (int i = 0; i < a.length; i++) {
                if (i > greatest) greatest++;
                else if (i < smallest) smallest++;
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }
   */

    public static void findGreatestAndSmallest(int[] a){
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        if (a.length > 1){
            for (int element : a){
                greatest = Math.max(greatest, element);
                smallest = Math.min(smallest, element);
            }
            System.out.println("Smallest = " + smallest);
            System.out.println("Greatest = " + greatest);
        }
    }


    /* TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. Complete task using sort() method.

    Test data:
            [10, 5, 6, 7, 8, 5, 15, 15]

    Expected output:
    Second Smallest = 6
    Second Greatest = 10 */
    public static void findSecondGreatestAndSmallestWithSort(int[] a){
        Arrays.sort(a);
        int smallest = a[0], secondSmallest = a[1];
        int greatest = a[a.length - 1], secondGreatest = a[a.length - 2];
            for (int element : a){
                if (smallest != element){
                    secondSmallest = element;
                    break;
                }
            }
            for (int element : a){
                if (greatest != element){
                    secondGreatest = element;
                }
            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
    }


    /* TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.

    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]

    Expected output:
    Second Smallest = 6
    Second Greatest = 10 */
    public static void findSecondGreatestAndSmallest(int[] a){
        int greatest = Integer.MIN_VALUE, secondGreatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int duplicates = 0;
        if (a.length > 1){
            for (int i = 0; i < a.length-1; i++){
                for (int j = i + 1; j < a.length; j++){
                    if (a[i] == a[j]) duplicates += a[i];
                }
            }
            for (int i = 0; i < a.length; i++){
                if (a[i] > greatest && a[i] != duplicates){
                    secondGreatest = greatest;
                    greatest = a[i];
                }else if (a[i] > secondGreatest && a[i] != greatest && a[i] != duplicates){
                    secondGreatest = a[i];
                }
                if (a[i] < smallest && a[i] != duplicates){
                    secondSmallest = smallest;
                    smallest = a[i];
                }else if (a[i] < secondSmallest && a[i] != smallest && a[i] != duplicates){
                    secondSmallest = a[i];
                }
            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
        }
    }

    /*DENIZ'S SOLUTION:
    public static void findSecondGreatestAndSmallest(int[] numbers){
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int number : numbers){
        if (number < smallest) smallest = number;
    }
    for (int number : numbers){
        if (number == smallest) continue;
        else if (number < secondSmallest) secondSmallest = number;
    }
        System.out.println("Second Smallest = " + secondSmallest);

    int greatest = Integer.MIN_VALUE;
    int secondGreatest = Integer.MIN_VALUE;
    for (int number : numbers) {
        if (number > greatest) greatest = number;
    }
    for (int number : numbers){
        if (number == greatest) continue;
        else if (number > secondGreatest) secondGreatest = number;
    }
        System.out.println("Second Greatest = " + secondGreatest);
    }
    */

    /* NAIM'S SOLUTION:
    public static void findSecondGreatestAndSmallest(int[] num){
        int min = Math.min(num[0], num[1]), secondMin = Math.max(num[0], num[1]);
        int max = Math.max(num[num.length-1], num[num.length - 2]), secondMax = Math.min(num[num.length-1], num[num.length - 2]);

        for (int number : num) {
            if(min != number){
                secondMin = number;
                break;
            }
        }
        for (int number : num) {
            if(max != number){
                secondMax = number;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }
    */


    /* TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and print them.
    NOTE: It is case-sensitive!

    Test data:
    [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]

    Expected output:
    bar
    6 */
    public static void findDuplicatedElementsInAnArray(String[] a) {
        String duplicates = "";
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].equals(a[j])) {
                        duplicates += a[i] + "\n";
                    }
                }
            }
            System.out.println(duplicates);
        }
    }

    /*DENIZ'S SOLUTION:
    public static void findDuplicatedElementsInAnArrays(String[] strings) {
        boolean isDuplicatesFound = false;
        for (int i = 0; i < strings.length - 1; i++){
            for (int j = i + 1; j < strings.length; j++){
                if (strings[i] == strings[j]){
                    isDuplicatesFound = true;
                    System.out.println(strings[i]);
                }
            }
        }
        if (!isDuplicatesFound) System.out.println("The is no duplicate element");
    }
    */


    /* TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element and print it.

    Test data:
            [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]

    Expected output:
    pen */
        public static void findMostRepeatedElementInAnArray (String[]a){
            String overallMostDup = ""; // container to hold the most duplicated element overall.
            int overallDupCounter = 0; // container to count how many times the most duplicated element occurs overall.

            for (int i = 0; i < a.length-1; i++) { // this 1st loop is checking each element against all the other elements iterated in the 2nd loop.
                String tempMostDup = a[i]; // (temp) container for duplicated elements; "temp" bc it's not the main one overall - elements in here will be checked again to see which is the most duplicated element.
                int tempDupCounter = 0; // (temp) container to count how many times the duplicated element occurs.
                for (int j = i + 1; j < a.length; j++) { // this 2nd loop is iterating through all the element each time the 1st loop runs.
                    if (a[i].equals(a[j]) && !overallMostDup.contains(a[i])){ // checking if element from 1st loop matches any elements from 2nd loop.
                        tempDupCounter++; // if and when the condition is true(match found) then add +1 to the counter (counting how many times there's a match for the 1st loop's element).
                    }
                }
                if (tempDupCounter > overallDupCounter){ // checking if the temp counter is greater than the main overall counter; if true then update the variables
                    overallMostDup = tempMostDup; // if and when the condition is true update to reassign the overall most duplicated with the temp counter
                    overallDupCounter = tempDupCounter;// if and when the condition is true update to reassign the overall counter with the temp counter
                }
            }
            System.out.println(overallMostDup); // printing out the most duplicated element overall
        }
        /* CAN BE: for(int i = 0; i < a.length; i++) && for (int j = 0; j < a.length; j++) BUT FOR MOST OPTIMIZE PERFORMANCE SHOULD DO BELOW:
        for (int i = 0; i < a.length-1; i++)
          --> int i = 0; HERE YOU MUST START AT THE FIRST ELEMENT TO CHECK IT AGAINST ALL THE OTHER ELEMENTS
          -- a.length-1; BC DON'T NEED TO CHECK LAST ELEMENT AGAIN BC IT'S BEEN CHECK ALREADY WHEN TRANSVERSED IN 2ND LOOP
        for (int j = i + 1; j < a.length; j++)
          --> int j = i + 1; 2ND LOOP MUST START AT ITERATED INDEX OF OUTER LOOP PLUS 1(NEXT ELEMENT FROM THAT)
              IF NOT THEN YOU'LL BE CHECKING THE ELEMENT OF 1ST LOOP AGAIN WHEN IT IS CHECKING AGAINST ELEMENTS IN 2ND LOOP
          --> j < a.length BC YOU NEED TO RUN 2ND LOOP ALL THE WAY TILL THE END OF THE ARRAY

        ArrayList<String> countedElements = new ArrayList<>(); --> USING AN ARRAYLIST AS THE CONTAINER TO HOLD ALL THE DUPLICATED ELEMENTS WILL HELP TO NOT CHECK ANY ITEMS THAT IS DUPLICATED AGAIN. (refer to akin's solution)
        if (a[i].equals(a[j]) && !overallMostDup.contains(a[i])) --> THIS DOES THE SAME AS THE ARRAYLIST; HERE IS SAYING IF CONTAINER ALREADY CONTAINS THIS ELEMENT IN IT THEN DON'T ADD ANOTHER SIMILAR ELEMENT.
        */


    /* AKIN'S SOLUTION:
    public static void findMostRepeatedElementInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;
        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }
                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }
        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }
    */

    /* JOHNATHAN'S SOLUTION:
    public static void findMostRepeatedElementInAnArray(String[] list) {
        int index = 0, repeats = 0, counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].equalsIgnoreCase(list[j])) {
                    counter++;
                    if (repeats < counter) {
                        index = i;
                        repeats = counter;
                    }
                }
            }
            counter = 0;
        }
        System.out.println(list[index]);
    }
    */




}
