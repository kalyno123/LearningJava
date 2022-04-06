package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {

    /* contains(); METHOD TASK: FIND IF THE GIVEN STRING CONTAINS ANOTHER STRING OR CHAR
    IT IS NON-STATIC = WE CAN CALL IT WITH OBJECT VARIABLE
    IT IS A RETURN TYPE AND IT RETURNS A BOOLEAN (true or false)
    IT TAKES A STRING A AN ARGUMENT
    */
        System.out.println("Please enter your address:");
        String address = ScannerHelper.getAStringFromUser();

        /* if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        CAN ALSO USE (address.toLowerCase().contains("chicago")) BUT NOTE METHOD SHOULD MATCH THE STRING YOUR LOOKING FOR
        */

       System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");

    }
}
