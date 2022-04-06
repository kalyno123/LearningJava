package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        /* split(); Method: This is a String Method. It is used to split a string from all args(regex) occurrences.
        It returns a String array excluding all occurrence of given args.
        It takes regex as an argument.
        It is a non-static method so that means it must be invoked by objectVariable.
        NOTE: it is case-sensitive.
        */

        String s = "Banana is nice";

        String[] sSplitFromSpaces = s.split(" ");
        System.out.println(Arrays.toString(sSplitFromSpaces)); //[Banana, is, nice]

        String[] sSplitFromI = s.split("i"); // THIS METHOD IS CASE SENSITIVE
        System.out.println(Arrays.toString(sSplitFromI)); // [Banana , s n, ce] -- all occurrences if "i" is excluded

        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA)); // [B, n, n,  is nice]

        String[] sSplitFromIs = s.split("is");
        System.out.println(Arrays.toString(sSplitFromIs)); // [B, n, n,  is nice]





    }
}
