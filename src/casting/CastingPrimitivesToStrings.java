package casting;

public class CastingPrimitivesToStrings {
    public static void main(String[] args) {

        /* CONVERTING PRIMITIVES TO STRING 2 WAYS:
         1. + (concatenation)
         2. valueOf() method
        */
        int num = 36;
        String numStr1 = "" + 45 + num; // 4536 ... this example shows that order of "" matters
        String numStr2 = 45 + num + ""; // 81
        String numStr3 = String.valueOf(num + 45); // 81

        System.out.println(numStr1);
        System.out.println(numStr2);
        System.out.println(numStr3);



    }
}
