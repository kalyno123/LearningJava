package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {

    /* STRING METHOD FORMAT CONSIDERATIONS:
    - what is the task? what it does?
    - is it static or non-static?
    - is it return type or void?
    - if it is return type, then what it returns?
    - does it take any arguments?
    */

        /* valueOf(); METHOD TASK: CONVERT VARIABLE INTO STRING
        IT IS STATIC = YOU CAN CALL IT WITH CLASS NAME
        IT IS A RETURN TYPE AND IT RETURNS STRING
        IT TAKES DIFFERENT ARGUMENTS AS IT A OVERLOADED METHOD AND CONVERTS GIVEN ARGS INTO STRING
        */
        int i = 5;
        String num = String.valueOf(i); // converting int variable to strings using concat();
        System.out.println(i + i); // 10 --> this is two ints values added together using addition operator 5 + 5 = 10
        System.out.println(num + num); // 55 --> this is putting two 5's as String next to each other with concat();




    }
}
