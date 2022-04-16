package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {

        /* indexOf(); and lastIndexOf(); METHOD TASK: FIND THE FIRST INDEX OR LAST INDEX OF CHAR OR STRING
        NON-STATIC = WE CAN CALL IT WITH OBJECT VARIABLE (did you call the class name or not when invoking this method?)
        IT IS RETURN TYPE AND IT RETURNS AN INT-INDEX
        IT TAKES AN ARGUMENT WHICH IS AN CHAR OR STRING (if you put char letters it'll be converted to its ascii value)
        NOTE: if the given char or String does not exist, then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        */

        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C')); // 7 --- 'C' IS TAKEN WITH ITS ASCII VALUE SO C = 124
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); // 45
        System.out.println(sentence.indexOf("Chicago")); // 7
        System.out.println(sentence.indexOf("Miami")); // 19
        System.out.println(sentence.indexOf("chicago")); // -1
        System.out.println(sentence.indexOf("Florida")); // -1
        // NOTE: the method will return -1 if given char or string is not found in the given string










    }
}
