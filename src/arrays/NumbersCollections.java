package arrays;

import java.util.Arrays;

public class NumbersCollections {
    public static void main(String[] args) {
    /*
    Create an array to store 1, 2, 3. Then, print array.
    */
        int[] numbers = {1, 2, 3}; // when you know the data(s) you can just declare and assign at the same time
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3]

        System.out.println("\n-----1st way-----\n");
        int[] numbers1 = new int[3]; // [0, 0, 0]
        numbers1[0] = 1; // [1, 0, 0]
        numbers1[1] = 2; // [1, 2, 0]
        numbers1[2] = 3; // [1, 2, 3]

        System.out.println(Arrays.toString(numbers1));
        // this way is good for if you initially didn't know the data values

        System.out.println("\n-----2nd way-----\n");
        int[] numbers2 = {1, 2, 3};
        System.out.println(Arrays.toString(numbers2));
        // this is the BEST WAY since you know what the data values are

        System.out.println("\n-----3rd way-----\n");
        int[] numbers3 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers3));
        // this way isn't preferred but be familiar with it


    }
}
