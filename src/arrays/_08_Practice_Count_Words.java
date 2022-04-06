package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        System.out.println("\n--------TASK-1--------\n");
    /* TASK-1:
    Assume you are given a String as below. Please find how many words you have in the given.
    String s1 = "Today is Tuesday"; -----> {"Today", "is", "Tuesday"}
    RESULT:
    3
    */
        String s1 = "Today is Tuesday";

        System.out.println("\n----TASK-1 ONE WAY----\n");
        int countSpaces = 0;
        for (char c : s1.toCharArray()){
            if (c == ' ') countSpaces++;
        }
        System.out.println(countSpaces+1); // 3

        System.out.println("\n----TASK-1 SPLIT WAY----\n");
        String[] words = s1.split(" ");
        System.out.println(words.length); // 3 -- CAN ALSO BE: (s1.split(" ").length)


        System.out.println("\n--------TASK-2--------\n");
    /* TASK-2:
    Assume you are given a String as below. Please find how many words you have in the given String starts with A or a.
    String s2 = "Some countries I visited were Argentina, Belgium and Malta";
    RESULT:
    2
    */
        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        String[] task2 = s2.split(" "); // first create a new String[] by splitting each word in the string one by one
        System.out.println(Arrays.toString(task2)); // [Some, countries, I, visited, were, Argentina,, Belgium, and, Malta]

        int countAa = 0; // counter for A & a
        for (String element : task2){ // looping through each element of the String array
            if (element.startsWith("A") || element.startsWith("a")) countAa++; // checking if any element starts with A or a if true then add it to counter
        }
        System.out.println(countAa); // 2





    }
}
