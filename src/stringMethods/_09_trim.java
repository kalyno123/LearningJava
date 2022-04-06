package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
    /* STRING METHOD FORMAT CONSIDERATIONS:
    - what is the task? what it does?
    - is it static or non-static?
    - is it return type or void?
    - if it is return type, then what it returns?
    - does it take any arguments?
    */

        /* trim(); METHOD TASK: REMOVE WHITE SPACES FORM THE BEGINNING AND END OF A STRING
        IT IS NON-STATIC AND WE CAN CALL WITH OBJECT NAME
        IT IS A RETURN TYPE AND IT RETURNS A STRING (without the beginning and ending spaces)
        IT DOES NOT TAKE ANY ARGUMENTS
        NOTE: IT WILL NOT TRIM THE SPACES IN BETWEEN THE STRINGS ITSELF
        */

        String str = "  Hello   ";
        System.out.println(str); // '    Hello     '
        System.out.println(str.trim()); // 'Hello'
        System.out.println(str.length()); // 10 --> length of string before trim
        System.out.println(str.trim().length()); // 5 --> length of string after trim

        String str1 = "     Good       Morning  ";
        System.out.println(str1); // '     Good       Morning  '
        System.out.println(str1.length()); // 25 --> length of string before trim
        System.out.println(str1.trim().length()); // 18 --> length of string after trim
        // NOTE: IT WILL NOT TRIM THE SPACES IN BETWEEN THE STRINGS ITSELF
    }
}
