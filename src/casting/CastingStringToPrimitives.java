package casting;

public class CastingStringToPrimitives {
    public static void main(String[] args) {

        // FIND THE SUM OF THE VALUES.
        String num1 = "23";
        String num2 = "12";
        System.out.println(num1 + num2); // 2312

        int num1Int = Integer.parseInt(num1); // RETURN PRIMITIVES; STRING --> INT
        int num2Int = Integer.parseInt(num2);
        System.out.println(num1Int + num2Int); // 35

        Integer num1Integer = Integer.valueOf(num1); // RETURNS WRAPPER CLASS; STRING --> INTEGER
        Integer num2Integer = Integer.valueOf(num1);
        System.out.println(num1Integer + num2Integer); // 46

        int num1IntValueOf = Integer.valueOf(num1); // STRING --> INTEGER --> INT

       // wrapper class into string use value of; string into primitive use parse

        //------------------------------------------------------------------------------
        // RECAP example w/ akin:
        String s = "10.5";

        Double d1 = Double.valueOf(s); // 10.5 --> d1 is more than 8 bytes
        System.out.println(d1 + 2); // 12.5

        double d2 = Double.valueOf(s); // 10.5 --> d2 is 8 bytes
        System.out.println(d2 + 2);

        /* d1 and d2 if hover cursor over Double.valueOf() it'll suggest to change to parse as the appropriate casting
        if not using any extra method to manipulate the data then just use parse. use value of if more than 1 method. */

        double d3 = Double.parseDouble(s); // 10.5
        System.out.println(d3 + 2);



    }
}
