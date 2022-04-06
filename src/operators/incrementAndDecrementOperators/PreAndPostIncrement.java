package operators.incrementAndDecrementOperators;

public class PreAndPostIncrement {
    public static void main(String[] args){

    int a = 10;
    // THREE DIFFERENT WAYS OF SAYING THE SAME THING USING INCREMENTAL OPERATORS:
        // a = a + 1;
       // a += 1; SHORTHAND ASSIGNMENT OPERATOR
        System.out.println(a++); // post INCREMENTAL OPERATOR --> 10 + 1 = a (10) waiting for next time variable (a) used to add
        System.out.println(a); // (11); showing the new value of (a) after post-increment addition after being recalled
        System.out.println(++a); // pre INCREMENTAL OPERATOR --> 11 + 1 = a (12) add immediately w/o waiting for next recall of (a)


        int b = 5;
    // USING DECREMENTAL OPERATORS:
        System.out.println(--b); // 4; b -= 1 aka b = b - 1
        System.out.println(b); // 4; showing the new value of b after pre-decrement subtraction

        System.out.println(b--); // 4; b -= 1 but hold results until (b) is called again due to post-decrement
        System.out.println(b);   // 3; showing the new value of b after being called again from post-decrement
    }

}
