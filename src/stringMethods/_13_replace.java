package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /* replace(); METHOD TASK: USED TO REPLACE CHARACTER(S) FROM GIVEN STRING
        IT IS NON-STATIC = CAN BE CALLED USING OBJECT VARIABLE
        IT IS A RETURN TYPE AND IT RETURNS A STRING
        IT TAKES A STING OR CHAR AS AN ARGUMENT
        NOTE: it is an overloaded method
        NOTE: it replaces ALL the occurrences
        NOTE: if the prefix of what you want to replace doesn't match or exact then it will not replace another
        NOTE: char can be passed, or replaced, if one character will be replaced with another character
         */

        String sentence = "Can I can a can?";
        System.out.println(sentence.replace("can", "xxx")); // Can I xxx a xxx? --> it is case-sensitive

        String s = "banana";
        System.out.println(s.replace('a', '$')); // b$n$n$ --> replace all occurrences

        System.out.println("Hello".replace("good", "nice")); // Hello
        // if the prefix of what you want to replace doesn't match or exist then it will not replace anything






    }
}
