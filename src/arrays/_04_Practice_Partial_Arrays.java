package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
    /*TASK-1
    Create an array to store below numbers
    10, -3, -7, 0, 0, 7, 22
    Print all elements one by one in separate lines using FOR EACH LOOP
    RESULT:
    10
    -3
    -7
    0
    0
    7
    22
    */
    int[] numbers = {10, -3, -7, 0, 0, 7, 22};
    for (int element : numbers){
        System.out.println(element);
    }


        System.out.println("\n-------TASK-2-------\n");
    /* TASK-2
    Find the sum of all the elements
    RESULT:
    29
    */
        System.out.println("\n---------TASK-2 for-i loop----------\n");
    int sum1 = 0;
    for (int i = 0; i < numbers.length; i++){
        sum1 += numbers[i];
    } System.out.println(sum1);

        System.out.println("\n---------TASK-2 for-each loop----------\n");
    int sum2 = 0;
    for (int element : numbers){
        sum2 += element;
    } System.out.println(sum2);


        System.out.println("\n-------TASK-3-------\n");
    /* TASK-3
    Find the sum of first 3 elements in the array
    RESULT:
    0
    */
    int sumOf3 = 0;
    for (int i = 0; i <= 2; i++){ //OR (int i = 0; i < numbers < 3; i++)
        sumOf3 += numbers[i];
    } System.out.println(sumOf3);


        System.out.println("\n-------TASK-4-------\n");
    /* TASK-4
    Find the sum of last 5 elements in the array
    RESULT:
    22
    */
    int sum = 0;
    for (int i = numbers.length-5; i < numbers.length; i++){ //OR (int i = numbers.length-5; i <= numbers.length-1; i++)
        sum += numbers[i];
    } System.out.println(sum);
    // numbers.length-5 --> returns index of numbers[2] ; numbers.length


        System.out.println("\n-------TASK-5-------\n");
    /* TASK-5
    Find the product of last 4 elements in the array but exclude zero if there are any
    RESULT:
    156
    */
    int product = 1; // CONTAINER MUST START W/ 1 WHEN MULTIPLYING
    for (int i = numbers.length-4; i < numbers.length; i++){
        if (numbers[i] == 0) continue; // OR if (numbers[i] != 0) product *= numbers[i];
        // control statement 'continue' here means if any elements = 0 skip and continue to next iteration of loop
        product *= numbers[i];
    } System.out.println(product);


        System.out.println("\n-------TASK-6-------\n");
    /* TASK-6
    Check your collection and print true if one of the element is 0
    Print false if none of the elements is zero
    RESULT:
    true
    */
    boolean hasZero = false;
    for (int element : numbers){
        if (element == 0) {
            hasZero = true;
            break;
        }
        /* if (element == 0) hasZero = true;
        break;
        NOTE: if you're not going to keep your curly braces put your next codes next to the if condition in one line */
    } System.out.println(hasZero);









    }
}
