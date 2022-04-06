package stringMethods;

public class _05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

    /* STRING METHOD FORMAT CONSIDERATIONS:
    - what is the task? what it does?
    - is it static or non-static?
    - is it return type or void?
    - if it is return type, then what it returns?
    - does it take any arguments?
    */

        /* toLowerCase(); and toUpperCase(); METHOD TASK: IT CONVERTS LETTERS TO UPPERCASE OR LOWERCASE
        - IT IS NON-STATIC = WE CAN CALL IT WITH OBJECT VARIABLE
        - IT IS A RETURN TYPE AND IT RETURNS THE MODIFIED STRING OBJECT BACK
        - IT DOES NOT TAKE ANY ARGUMENT
        */
        String s1 = "HELLO world";

        System.out.println(s1); // HELLO world
        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD

    // toLowerCase(); and toUpperCase(); METHODS ONLY APPLIES TO LETTER NUMBER CHARACTERS SPACE ETC WILL NOT BE EFFECTED

        System.out.println("ed238ry29r8hihr2 8r928yr82 r8222832 ry98r".toUpperCase()); // every letter will be UPPERCASE

        String sentence = "I like coding 100x a day";
        String s = sentence.toUpperCase(); // I LIKE CODING 100X A DAY
        System.out.println(s.toLowerCase().toUpperCase().toLowerCase()); // i like coding 100x a day

    }
}
