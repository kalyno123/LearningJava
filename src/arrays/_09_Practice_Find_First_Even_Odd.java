package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        /* PRACTICE TASK:
        FIND THE 1ST ODD AND EVEN NUMBER
        RESULT:
        First Even = 0
        First Odd = 5
        */
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        boolean isFirstEvenFound = false; // this 'container' is known as "raising flag"
        boolean isFirstOddFound = false;
        //int firstEven = 1; --> assign to 1 bc it is not even when first even is found it will be updated to the even number

        for (int element : numbers) {
            if (element % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                //firstEven = element;
                System.out.println("First Even = " + element);
            } else if (!isFirstOddFound) {
                isFirstOddFound = true;
                System.out.println("First Odd = " + element);
            }
            if (isFirstEvenFound && isFirstOddFound) break;
        }
        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");


        /* ANOTHER WAY TO DO THE TASK:
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        int even = 1, odd = 0;

        for (int number : numbers) {
            if (even % 2 == 0 && odd % 2 == 1) break;
            if (even == 1 && number % 2 == 0) even = number;
            else if (odd == 0 && number % 2 == 1) odd = number;
        }
        System.out.println("First even is = " + even);
        System.out.println("First odd is = " + odd);
        */


        /* ANOTHER WAY TO DO THE TASK:
        int countEven = 0;
        int countOdd = 0;
        for (int number:numbers) {
            if (countEven != 0 && countOdd != 0) break;
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            }
            else if (number % 2 == 1 && countOdd == 0){
                System.out.println("First odd number is: " + number);
                countOdd++;
            }
            if (countEven != 0 && countOdd != 0) break;
        }
        */




    }
}
