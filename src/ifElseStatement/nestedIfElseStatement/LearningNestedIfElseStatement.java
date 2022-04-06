package ifElseStatement.nestedIfElseStatement;

public class LearningNestedIfElseStatement {
    public static void main(String[] args) {

         /* NESTED IF STATEMENT IS USED FOR WHEN YOU'RE CHECKING THE CONDITION ONE THAN ONCE. FOR EXAMPLE, IF YOU'RE CHECKING
    FOR A LETTER AND THEN CHECKING AGAIN IF THE LETTER IS UPPERCASE THEN CHECK AGAIN IN LOWER CASE.
     */

    /* PSEUDO CODE:
    1. Generate a random number bt -50 and 50
    2. Check if it is positive, and print message "Number is positive"
    3. If positive, also check if it is odd and print message "Number is positive and odd"
    4. If it is negative, and print message "Number is negative"
    5. If negative, also check if it is odd and print message "Number is negative and odd"
    6. If number is zero then just print "Number is zero"
    NOTE: if number is not positive, then you don't need to check if it is odd etc ...
    */
    // if possibilities are LINKED then can you ELSE IF otherwise if NOT LINKED then must use another IF statement.

        int random = (int) (Math.random() * 101) - 50;
        System.out.println("random number = " + random);

        if (random > 0){ // <-- checking if number is positive
            //System.out.println("Number is positive"); --> not needed since 2nd IF print positive
            if (random % 2 != 0) { // checking if # is ODD or not <-- use != 0 if odd; use == 0 if even
                System.out.println("Number is positive and odd");
            }else {
                System.out.println("Number is positive and even");
            }
        }else if (random < 0){
            //System.out.println("Number is negative");
            if (random % 2 != 0){
                System.out.println("Number is negative and odd");
            }else {
                System.out.println("number is negative and even");
            }
        }else {
            System.out.println("Number is zero and even");
        }


    }
}
