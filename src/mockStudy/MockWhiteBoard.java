package mockStudy;

import java.util.Arrays;
import java.util.TreeSet;

public class MockWhiteBoard {
    public static void main(String[] args) {

    /* finding max and second max from an array
    PSEUDO CODE:
    1. 2 containers for max and second max
    2. find the max with the loop
    3. find the second max with loop (if it is  not the max and bigger than the rest it is second max)
     */
        int[] nums = {74, 5, 64, 345, 36, 32};

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE; // initialize max & 2nd max variables to the smallest number(Minimum)
        // it will be reassigned later when comparing each element to ultimately find max

        // use loop to check each number(element) of array
        /* FOR-I LOOPS WAY:
        for (int i =0; i < nums.length; i++){
            if (nums[i] >= max){ // if element is greater or equals to max variable(which starts as the smallest value)
                secondMax = max; // reassign 2nd max to max
                max = nums[i]; // reassign max to the max element
            }else {
                if (nums[i] > secondMax && nums[i] != max){ // COMPARE if element is greater than 2nd max AND element isn't equal to max
                    secondMax = nums[i]; // reassign 2nd max to the element
                }
            }
        }
        System.out.println("The max = " + max);
        System.out.println("The second max = " + secondMax);
        */

        for (int num : nums) {
            if (num >= max) { // COMPARE if element is greater or equals to max variable(which starts as the smallest value)
                secondMax = max; // reassign 2nd max to max
                max = num; // reassign max to the max element
            } else {
                if (num > secondMax && num != max) { // COMPARE if element is greater than 2nd max AND element isn't equal to max
                    secondMax = num; // reassign 2nd max to the element
                }
            }
        }
        System.out.println("The max = " + max);
        System.out.println("The second max = " + secondMax);


    /* isPalindrome?
    1. find if the word is the same forward as it is backwards
    */
        String word = "civic", rWord = "";
        for (int i = word.length()-1; i >= 0; i--){// INDEX: 4, 3, 2, 1, 0
            rWord += word.charAt(i) + "";
        }
        System.out.println(rWord.equals(word)); // OR word.equals(rWord)


    /* fizzbuzz TASK:
    1 - 16 both include (RANDOM NUMBER RANGE FOR TASK)
    4 conditions: fizz, buzz, fizzbuzz, none.
    both divisible by 3 and 5 "fizzbuzz"
    divisible by 3
    divisible by 5
    none then return the number(element) itself
    */


    /* FIBONACCI TASK:
    GENERATE 10 NUMBER OF FIBONACCI (EXPECTED: 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34)
    */
        int n1 = 0;
        int n2 = 0;
        int n3;
        String s = "";

        for (int i = 0; i < 10; i++){
            // store the number
            s += n1 + " - ";
            // get the third number
            n3 = n1 + n2;
            // change/update n1 and n2 for the next iteration
            n1 = n2;
            n2 = n3;
        }
        System.out.print(s.substring(0, s.length() - 3));


        System.out.println("\n\n===mock3===");
        int[] wb24 = {-3, 5, 4, 0, 11, 2};
        int count = 0;
        for (int e : wb24){
            if (!(e < 0) && e % 2 != 0 || e == 2) count++;
        }
        System.out.println(count);

        System.out.println("\n=====removedups wb27=====");
        int[] wb27 = {0, 5, 4, 0, 0}; // TEST DATA
        //HashSet<Integer> a = new HashSet<>(); // container to hold uniques (non-dups)
        TreeSet<Integer> a = new TreeSet<>(); // either or collection would work
        for (int element : wb27){
            a.add(element);
        }
        System.out.println(Arrays.toString(a.toArray()));
        // a.toArray() --> to convert set collection back to array
        // Arrays.toString() --> to print the array w/o location

        System.out.println("\n===wb27===");
        // using wb27 method
        System.out.println(Arrays.toString(MockMethods.uniques(wb27)));

        System.out.println("\n===wb28===");
        String[] wb28 = {"foo", "bar", "foo", "123", "bar"};
        System.out.println(MockMethods.removeDups(wb28));

        System.out.println("\n===wb29===");
        //mock3 wb#29
        String str1 = "civic", str2 = "hello";
        //SOLUTION 1:
        String reverse = "";
        for (int i = str1.length()-1; i >= 0; i--){
            reverse += str1.charAt(i);
        }
        System.out.println(reverse.equals(str1));

        //SOLUTION 2:
        System.out.println(new StringBuilder(str1).reverse().toString().equals(str1));

        //SOLUTION 3:
        if (str1.length() <= 1){// ex: str1 = 'a'
            System.out.println(str1);
        }else {
            System.out.println((str1.substring(1) + str1.charAt(0)).equals(str1)); // ASK ANDREI
        }

        System.out.println("\n===PRIME===");
        //PRIME NUMBER:
        //int[] n = {-3, 5, 4, 0, 11, 2, 1, 4, 13, 21, 15, 19, -1};
        int[] n = {-3, 5, 4, 0, 11, 12, 3, 7, 13}; // 5
        System.out.println(MockMethods.countPrime(n));

        System.out.println("\n===factorial===");
        int[] wb46 = {0, 5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(MockMethods.factorial(wb46)));







    }
}
