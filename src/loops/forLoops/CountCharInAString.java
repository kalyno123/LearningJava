package loops.forLoops;

public class CountCharInAString {
    public static void main(String[] args) {
    /* Write a Java program to count total number of “o” letter in the given String below:
    String str = “TechGlobal School”;
    Expected Output: 3 */

        String str = "TechGlobal School";
        int letterO = 0; // create container for each 'o' to be counted / added into
    // ** ANYTIME YOU ARE COUNTING SOMETHING YOU SHOULD CREATE AN EMPTY CONTAINER. **

        for(int i = 0; i <= (str.length() - 1); i++){ // printing every char one by one each iteration
            if (str.charAt(i) == 'o') // if condition checking if variable is == to 'o'
            letterO++; // if it is == to 'o' then count it and run to next iteration -- can also be written as letterO += 1;
        }
        System.out.println(letterO); // 3 -- print final count of 'o'






    }
}
