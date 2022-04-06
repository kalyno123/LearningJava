package mock2Study;

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







    }
}
