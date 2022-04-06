package ifElseStatement.ifStatements;

public class BalanceExamples {
    public static void main(String[] args) {

        double balance = 150;
        // you can use relational and logical operators.
        // expression which is going to be true if balance is less than 0.
        boolean isBalanceLessThan0 = balance < 0; // balance is less than 0; FALSE
        boolean isBalanceEquals100 = balance == 0; // balance is = to 0; FALSE
        boolean isBalanceGreaterThanOrEqualTo1000 = balance >= 1000; // balance is greater than or equal to 0; FALSE

        // create an expression for checking if balance is not equals to -1.
        boolean isBalanceNotEqual_1 = balance != -1; // balance is NOT equal to -1; TRUE

        if(isBalanceNotEqual_1){ // IF this is TRUE, execute otherwise skip.
            System.out.println("Your balance is not equal to -1");
        }


    }
}
