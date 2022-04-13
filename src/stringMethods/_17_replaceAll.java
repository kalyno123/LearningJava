package stringMethods;

public class _17_replaceAll {
    public static void main(String[] args) {

        /* REPLACEALL METHOD:
        String also provides us with a method called replaceAll(String regex, String replacement);.
        This takes a regex pattern and replaces everything that matches that regex condition with the replacement String.

        replaceAll(); METHOD
        args
        return
        static?
        */


        String str = "Hello World";
        System.out.println("String before replaceAll = " + str);

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String before replaceAll = " + str);

        String str2= "hello123world";
        str2 = str2.replaceAll("[^0-9]", "");
        System.out.println(str2);

        /* TASK 1:
        Create a String as: String str = “ abc 123 $#^ ”;
        Remove all special characters
        Expected output: abc123
        */
        String str3 = " abc 123 $#^ ";
        //str3 = str3.replaceAll("[\\$\\s\\#\\^]",""); THIS IS NOT DYNAMIC
        str3 = str3.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str3);

        /* TASK 2:
        Create a String as below:
        String str = “How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood”;
        Replace all wood with “****”
        Expected output: How much **** would a ****-Chuck chuck if a ****-chuck could chuck ****
        */
        String str4 = "How much wood would a wood-Chuck chuck if a wood-chuck could chuck wood";
        str4 = str4.replaceAll("wood", "****");
        System.out.println(str4);





    }
}
