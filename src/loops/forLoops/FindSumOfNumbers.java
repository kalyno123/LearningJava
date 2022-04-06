package loops.forLoops;

public class FindSumOfNumbers {
    public static void main(String[] args) {
    /*Write a Java program to find sum of number from 10 to 15 ( 10 and 15 are included)
    10 + 11 + 12 + 13 + 14 + 15
    Expected output:
    75
    */
        int sum = 0; // 1. create a result container which will eventually have you expected outcome

        for(int i = 10; i <= 15; i++){ // 2. start filling our container
            sum += i; // 10 - 21 - 33 - 46 - 60 - 75
        }// 3. print the result
        System.out.println(sum); // 75 ____ if this sout was put above the } then it will print each iteration.
        // whatever is inside the code block it will print each iteration. if you want final iteration then sout must be outside the loop block.




    }
}
