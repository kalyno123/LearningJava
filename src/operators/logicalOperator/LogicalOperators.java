package operators.logicalOperator;

public class LogicalOperators {
    public static void main(String[] args) {

        //CONDITION: student must turn in interview hw OR java hw
        boolean isInterviewHWSent = true;
        boolean isJavaHWSent = false;

        System.out.println("The student turned in EITHER OR of the assignments: " + (isInterviewHWSent || isJavaHWSent));
        /* if there is ONE item that satisfy the conditions then it is acceptable or TRUE
        if NEITHER item satisfy the conditions then it is NOT ACCEPTABLE or FALSE
         */

        //CONDITION: student must turn in interview hw AND java hw
        boolean isInterviewHomeworkSent = true;
        boolean isJavaHomeworkSent = true;

        System.out.println("The student turned BOTH of the assignments: " + (isInterviewHomeworkSent && isJavaHomeworkSent));
        /* if BOTH item that satisfy the conditions then it is acceptable or TRUE
        if there is one item satisfy the conditions then it is NOT ACCEPTABLE or FALSE
         */

        /* YOU CAN USE MORE THAN ONE OR || and AND && OPERATORS IN AN EXPRESSION
        ex: randomNum1 > 25 && randomNum2 > 25 && randomNum3 > 25
        ex: randomNum1 > 25 || randomNum2 > 25 || randomNum3 > 25
        ex:(randomNum1 > 25 && randomNum2 > 25) || (randomNum1 > 25 && randomNum2 > 25)
        */

    /* so when || then as along as ONE expression is TRUE the WHOLE thing is TRUE;
         but if BOTH expression are FALSE then the WHOLE thing is FALSE

        so when && then BOTH expression must be TRUE for the WHOLE thing is TRUE;
         but if ONE expression are FALSE then the WHOLE thing is FALSE */

    }
}
