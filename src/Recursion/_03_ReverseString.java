package Recursion;

public class _03_ReverseString {

    /* TASK 1:
    Write a recursive method to reverse a given String
    str = "Apple"
    Expected:
    elppA
    */
        public static String recursiveReverse(String str){
            if (str.length() <= 1) return str;
            return recursiveReverse(str.substring(1) + str.charAt(0)); // else (str.length() > 0)
        }

        // reverse("pple") + A --->



    public static void main(String[] args) {
        System.out.println(recursiveReverse("Apple"));
    }



}
