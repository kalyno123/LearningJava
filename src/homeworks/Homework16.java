package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {

    /* TASK 1: Write a method countWords() that takes a String as an argument, and returns how many words there are in the given String.
    Test data 1:                                                Test data 2:
    String str = “      Java is fun       ”;                    String str = “Selenium is the most common UI automation tool.   ”;
    Expected output 1:                                          Expected output 2:
    3                                                           8
    NOTE: Make your code dynamic that works for any given String.
    NOTE: Be careful about empty String.
    NOTE: Be careful about before and after white spaces.
    */
        public static int countWords(String str){
             return str.trim().split(" ").length;
        }

        /*ANOTHER WAY TO SOLVE W/O SPILT();
        public static int countWords(String str) {
            int countSpace = 1;
            String str1 = str.trim();
            if (!(str1.contains(" "))) {
                System.out.println("This sentence does not have multiple words.");
            } else {
                if (str1.contains(" ")) {
                    for (int i = 0; i < str1.length(); i++) {
                        if (Character.isWhitespace(str1.charAt(i))) { // checking if 'i' is a space
                            countSpace++;
                        }
                    }
                }
            } return countSpace;
        }
        */



    /* TASK 2: Write a method countA() that takes a String as an argument, and returns how many A or a there are in the given String.
    Test data 1:                                                   Test data 2:
    String str = “TechGlobal is a QA bootcamp”;                    String str = “QA stands for Quality Assurance”;
    Expected output 1:                                             Expected output 2:
    4                                                              5
    NOTE: Make your code dynamic that works for any given String.
    NOTE: Be careful about empty String.
    NOTE: Be careful about uppercase and lowercase.
    */
        public static int countA(String str){
            int countAa = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.toLowerCase().charAt(i) == 'a') countAa++;
            }
            return countAa;
        }


    /* TASK 3: Write a method countPos() that takes an ArrayList of Integer as an argument, and returns how many elements are positive.
    Test data 1:                                    Test data 2:
    [-45, 0, 0, 34, 5, 67]                          [-23, -4, 0, 2, 5, 90, 123]
    Expected output 1:                              Expected output 2:
    3                                               4
    NOTE: Make your code dynamic that works for any given ArrayList of Integer.
    */
        public static int countPos(ArrayList<Integer> n){
            int countPositive = 0;
            for (Integer element : n){
                if (element > 0) countPositive++;
            }
            return countPositive;
        }


    /* TASK 4: Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument, and returns it back with removed duplicates.
    Test data 1:                                            Test data 2:
    [10, 20, 35, 20, 35, 60, 70, 60]                        [1, 2, 5, 2, 3]
    Expected output 1:                                      Expected output 2:
    [10, 20, 35, 60, 70]                                    [1, 2, 5, 3]
    NOTE: Make your code dynamic that works for any given ArrayList of Integer.
    */
        public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> n){
            ArrayList<Integer> nums = new ArrayList<>();
            for (Integer element : n){
                    if (!(nums.contains(element))) nums.add(element);
            }
            return nums;
        }


    /* TASK 5: Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates.
    Test data 1:                                                        Test data 2:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]                 [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
    Expected output 1:                                                  Expected output 2:
    [“java”, “C#”, “ruby”, “JAVA”,  “C++”]                              [“abc”, “xyz”, “123”, “ab”, “ABC”]
    NOTE: Make your code dynamic that works for any given ArrayList of String.
    NOTE: Be careful about lowercase and uppercase, this method is case-sensitive.
    */
        public static ArrayList<String> removeDuplicateElements(ArrayList<String> s){
            ArrayList<String> words = new ArrayList<>();
            for (String element : s){
                if(!(words.contains(element))) words.add(element);
            }
            return words;
        }


    /* TASK 6: Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces.
    Test data 1:                                                        Test data 2:
    String str = “   I   am      learning     Java      ”;              String str = “Java  is fun    ”;
    Expected output 1:                                                  Expected output 2:
    I am learning Java                                                  Java is fun
    NOTE: Make your code dynamic that works for any given String.
    NOTE: Be careful about empty String.
    NOTE: Be careful about before and after white spaces.
    */
        public static String removeExtraSpaces(String str){
            String[] str1 = str.trim().split(" ");
            StringBuilder strContainer = new StringBuilder();

            if (!(str.contains(" "))) {
                System.out.println("This sentence does not have multiple words.");
            } else {
                for (String element : str1){
                  if(!(element.isEmpty())) strContainer.append(element + " ");
                }
            }
            return strContainer.toString();
        }

        /* JOHNATHAN'S SOLUTION:
        public static String removeExtraSpaces(String sentence) {
            sentence = sentence.trim();
            String answer = "";
            boolean spaceFound = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isLetter(sentence.charAt(i))) {
                    spaceFound = false;
                    answer += sentence.charAt(i);
                }
                if (Character.isSpaceChar(sentence.charAt(i)) && !spaceFound) {
                    answer += " ";
                    spaceFound = true;
                }
            }
            return answer;
        }
        */


    /* TASK 7: Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
    Test data 1:                                            Test data 2:
    int[] arr1 = {3, 0, 0, 7, 5, 10};                       int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
    int[] arr2 = {6, 3, 2};                                 int[] arr2 = {10, 3, 6, 3, 2};
    Expected output 1:                                      Expected output 1:
    [9, 3, 2, 7, 5, 10]                                     [16, 11, 9,  3, 2, 7, 5, 10, 34]
    NOTE: Make your code dynamic that works for any given arrays
    NOTE: You will assume that length of arrays are always more than zero
    NOTE: Be careful about arrays length, if they were equal, it would be an easy task, but they can be different as given in the example above.
    */
        public static int[] add(int[] a, int[] b) {
            //int maxLength = Math.max(a.length, b.length); --> i don't need to declare and assign since only using once
            int[] arraySum = new int[Math.max(a.length, b.length)];

            for (int i = 0; i < arraySum.length; i++) {
                if (a.length > i) {
                    arraySum[i] += a[i];
                }
                if (b.length > i) {
                    arraySum[i] += b[i];
                }
            }
            return arraySum;
        }


    /* TASK 8: Write a method findClosestTo10() that takes an int[] array as an argument, and returns the closest element to 10 from given array.
    Test data 1:                                            Test data 2:
    int[] numbers = {10, -13, 5, 70, 15, 57};               int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 1:                                      Expected output 2:
    5                                                       8
    NOTE: You will assume that length of array is always more than zero.
    NOTE: Make your code dynamic that works for any given int[] array.
    NOTE: Be careful about element to be 10 (ignore it).
    NOTE: Be careful about 2 numbers to be closest (8 and 12) in this case return smallest which is 8.
    */
        public static int findClosestTo10(int[] a) {
            int almost10Element = a[0];
            int elementDifference = Math.abs(a[0] - 10);

            for (int i = 1; i < a.length; i++) {
                if (a[i] != 10 && Math.abs(a[i] - 10) < elementDifference) {
                    elementDifference = Math.abs(a[i] - 10);
                    almost10Element = a[i];
                } else if ((Math.abs(a[i] - 10)) == elementDifference) {
                    if (almost10Element > a[i]) {
                        almost10Element = a[i];
                    }
                }
            }
            return almost10Element;
        }

        /* NATALLIA'S SOLUTION:
        public static int findClosestTo10(int[] arr) {
            int index = 0;
            int distance = Math.abs(arr[0] - index);

            for (int i = 0; i < arr.length; i++) {
                int dist = Math.abs(arr[i] - index);
                if (dist < distance) {
                    index = i;
                    distance = dist;
                }
            }
                return arr[index];
        }
        */




    public static void main(String[] args) {
        System.out.println("\n-----TASK 1------\n");
        String str1 = "      Java is fun       ";
        String str2 = "Selenium is the most common UI automation tool.   ";
        System.out.println(countWords(str1)); // 3
        System.out.println(countWords(str2)); // 8

        System.out.println("\n-----TASK 2------\n");
        String str3 = "TechGlobal is a QA bootcamp";
        String str4 = "QA stands for Quality Assurance";
        System.out.println(countA(str3)); // 4
        System.out.println(countA(str4)); // 5

        System.out.println("\n-----TASK 3------\n");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(-45);
        nums1.add(0);
        nums1.add(0);
        nums1.add(34);
        nums1.add(5);
        nums1.add(67);
        System.out.println(countPos(nums1)); // 3

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(-23);
        nums2.add(-4);
        nums2.add(0);
        nums2.add(2);
        nums2.add(5);
        nums2.add(90);
        nums2.add(123);
        System.out.println(countPos(nums2)); // 4

        System.out.println("\n-----TASK 4------\n");
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(10);
        nums3.add(20);
        nums3.add(35);
        nums3.add(20);
        nums3.add(35);
        nums3.add(60);
        nums3.add(70);
        nums3.add(60);
        System.out.println(removeDuplicateNumbers(nums3)); // [10, 20, 35, 60, 70]

        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.add(1);
        nums4.add(2);
        nums4.add(5);
        nums4.add(2);
        nums4.add(3);
        System.out.println(removeDuplicateNumbers(nums4)); // [1, 2, 5, 3]

        System.out.println("\n-----TASK 5------\n");
        ArrayList<String> t5 = new ArrayList<>();
        t5.add("java");
        t5.add("C#");
        t5.add("ruby");
        t5.add("JAVA");
        t5.add("ruby");
        t5.add("C#");
        t5.add("C++");
        System.out.println(removeDuplicateElements(t5)); // ["java", "C#", "ruby", "JAVA",  "C++"]

        ArrayList<String> task5 = new ArrayList<>();
        task5.add("abc");
        task5.add("xyz");
        task5.add("123");
        task5.add("ab");
        task5.add("abc");
        task5.add("ABC");
        System.out.println(removeDuplicateElements(task5)); // ["abc", "xyz", "123", "ab", "ABC"]

        System.out.println("\n-----TASK 6------\n");
        String str5 = "   I   am      learning     Java      ";
        String str6 = "Java  is fun    ";
        System.out.println(removeExtraSpaces(str5)); // I am learning Java
        System.out.println(removeExtraSpaces(str6)); // Java is fun

        System.out.println("\n-----TASK 7------\n");
        int[] a = {3, 0, 0, 7, 5, 10};
        int[] b = {6, 3, 2};
        System.out.println(Arrays.toString(add(a, b))); // [9, 3, 2, 7, 5, 10]

        int[] c = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] d = {10, 3, 6, 3, 2};
        System.out.println(Arrays.toString(add(c, d))); // [16, 11, 9, 3, 2, 7, 5, 10, 34]

        System.out.println("\n-----TASK 8------\n");
        int[] e = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(e)); // 5
        int[] f = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(f)); // 8



    }
}
