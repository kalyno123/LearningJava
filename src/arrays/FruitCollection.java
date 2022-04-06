package arrays;

import java.util.Arrays;

public class FruitCollection {
    public static void main(String[] args) {

    /* Task-1
    Create an array that will store 4 fruit names. Then, print the empty array
    EXPECTED OUTPUT:
    [null, null, null, null]
    */
        String[] fruits = new String[4]; // 4 is the number of elements in the array
        System.out.println(Arrays.toString(fruits));

    /* Task-2
    Store your fav fruit in the index of 0. Then, store the 4th fav fruit in the index of 3. Print the array again.
    EXPECTED OUTPUT:
    [Apple, null, null, Banana]
    */
        fruits[0] = "watermelon";
        fruits[3] = "apple";

    // HOW TO FIND SIZE OF ELEMENT AN ARRAY HAS:
        System.out.println(fruits.length); //4; DO NOT PUT () BC THIS LENGTH IS NOT A STRING METHOD. IT IS AN INSTANCE VARIABLE

        //What if we try to get a value that is null
        System.out.println(fruits[1]); // null; it will just printout 'null'

        // using array's object variables with String methods; can be done here bc the objectVariables are Strings
        System.out.println(fruits[0].toUpperCase()); // APPLE
        System.out.println(fruits[0].charAt(0)); // A
        System.out.println(fruits[3].length()); // 6
        System.out.println(fruits[3].startsWith("a")); // true

        System.out.println(fruits[1].length()); // whenever you try to manipulate a null Java.lang will throw a NullPointerException


    }
}
