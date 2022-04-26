package Recursion;

public class _01_SumOfNumbers {

    /* TASK 1:
    Write a method that finds the sum of the numbers from 1-n. Both 1 and n are included.
    Method must be return type and static.
    n=5                         n=7
    1+2+3+4+5 = 15              1+2+3+4+5+6+7 = 28
    */
        public static int numberSum(int n){
            int sum = 0;
            for (int i = 1; i <= n; i++){
               sum += i;
            }
            return sum;
        }

        public static int recursiveSum(int n){
            if (n > 0) // if number(n) if greater than 0 then the condition is true
                // when the condition is true it'll go to the below return statement
                return n + recursiveSum(n-1); // n-1 bc whatever n is ... when
            return 0;
        }





    public static void main(String[] args) {

        System.out.println(numberSum(5)); // 15
        System.out.println(numberSum(7)); // 28

        System.out.println(recursiveSum(5)); // 15
        System.out.println(recursiveSum(7)); //28



    }


}
