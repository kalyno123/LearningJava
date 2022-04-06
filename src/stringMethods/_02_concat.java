package stringMethods;

public class _02_concat {
    public static void main(String[] args) {

    /* STRING METHOD FORMAT CONSIDERATIONS:
    - what is the task? what it does?
    - is it static or non-static?
    - is it return type or void?
    - if it is return type, then what it returns?
    - does it take any arguments?
    */
        /* concat(); METHOD TASK: IT IS USED TO COMBINE MULTIPLE STRINGS, AND FORMS A NEW ONE
        - IT IS NON-STATIC = WE CAN CALL IT WITH THE OBJECT VARIABLE WE CREATED
        - IT IS A RETURN TYPE METHOD AND RETURN NEWLY COMBINED STRINGS
        - IT TAKES A STRING AS AN ARGUMENT
         */

        String s1 = "Tech";
        String s2 = "Global";
        String s3 = s1.concat(s2); // this is concat(); String Method

        System.out.println(s3.concat(" School")); // TechGlobal School
        System.out.println("Hello".concat("World")); // HelloWorld
        System.out.println("Hello".concat(" ").concat("World")); // Hello World

    }
}
