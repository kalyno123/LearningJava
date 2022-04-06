package stringMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class _14_isEmpty {
    public static void main(String[] args) {

    /*empty(); METHOD TASK: USED TO CHECK IF A GIVEN STRING IS EMPTY OR NOT
    IT is NON-STATIC = WE CAN CALL IT SUING OBJECT VARIABLE
    IT IS A RETURN TYPE AND RETURNS A BOOLEAN
    IT DOES NOT TAKE ANY ARGUMENT
    */
        String name = "John";

        System.out.println(name.isEmpty()); //false
        System.out.println(name.replace(name, "").isEmpty()); // true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true
        System.out.println(" ".isEmpty()); // false

    }
}
