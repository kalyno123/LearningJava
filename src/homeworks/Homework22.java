package homeworks;

import java.util.*;

public class Homework22 {

    /* TASK 1: Create a method called fibonacciSeries1();
    This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
    */
    public static int[] fibonacciSeries1(int n){
        /* int[] result = new int[n];

        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;

        for (int i = 0; i < n - 2; i++){// n-2 to avoid index out of bound exception when looping due to result[i+2]
            result[i + 2] = result[i + 1] + result[i];
        }
        return result; */

        int n1 = 0, n2 = 1, n3;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n1;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return array;
    }


    /* TASK 2: Create a method called fibonacciSeries2();
    This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21
    */
    public static int fibonacciSeries2(int n){
        int n1 = 0, n2 = 1, n3 = 1;
        for (int i = 1; i < n - 1; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;

        // return fibonacciSeries1(n)[n -1];
    }

    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciSeries2(n - 1) + fibonacciSeries2(n - 2);
    }


    /* TASK 3: Create a method called findUniques();
    This method will take 2 int array argument, and it will return an int array which has only the unique values from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.
    */
    public static int[] findUniques(int[] a, int[] b){
        HashSet<Integer> duplicates = new HashSet<>();
        for (int elementA : a){
            for (int elementB : b){
                if (elementA == elementB) duplicates.add(elementA);
            }
        }

        HashSet<Integer> uniques = new HashSet<>();
        for (int i : a) if (!duplicates.contains(i)) uniques.add(i);
        for (int i : b) if (!duplicates.contains(i)) uniques.add(i);


        int[] result = new int[uniques.size()];
        int index = 0;
        for (int element : uniques){
            result[index++] = element;
        }
        return result;
    }


    /* TASK 4: Create a method called isPowerOf3();
    This method will take an int argument, and it will return true if given int argument is equal to 3 power of the X. Otherwise, it will return false.
    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243 ...
    */
    public static boolean isPowerOf3(int x){
        //if (x == 1) return true;
        //else return (x % 3 == 0);

        if (x < 1 ) return false;
        double doubleNum = x;
        while (doubleNum % 3 == 0){
            doubleNum /= 3;
        }
        return doubleNum == 1.0;
    }


    /* TASK 5: Create a method called firstDuplicate();
    This method will take an int array argument, and it will return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return the one for which second occurrence has the smallest index.
    */
    public static int firstDuplicate(int[] a){
        int dup = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    dup = a[i];
                    break;
                }
            }
            if (dup != -1) break;
        }
        return dup;
    }


    public static void main(String[] args) {

        System.out.println("\n-----TASK 1------");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));

        System.out.println("\n-----TASK 2------");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("\n-----TASK 3------");
        int[] t3_testData1A = {};
        int[] t3_testData1B = {};
        System.out.println(Arrays.toString(findUniques(t3_testData1A, t3_testData1B)));

        int[] t3_testData2A = {};
        int[] t3_testData2B = {1, 2, 3, 2};
        System.out.println(Arrays.toString(findUniques(t3_testData2A, t3_testData2B)));

        int[] t3_testData3A = {1, 2, 3, 4};
        int[] t3_testData3B = {3, 4, 5, 5};
        System.out.println(Arrays.toString(findUniques(t3_testData3A, t3_testData3B)));

        int[] t3_testData4A = {8, 9};
        int[] t3_testData4B = {9, 8, 9};
        System.out.println(Arrays.toString(findUniques(t3_testData4A, t3_testData4B)));

        System.out.println("\n-----TASK 4------");
        System.out.println(isPowerOf3(15));
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2243));
        System.out.println(isPowerOf3(1));

        System.out.println("\n-----TASK 5------");
        int[] t5_testData1 = {};
        System.out.println(firstDuplicate(t5_testData1));

        int[] t5_testData2 = {1};
        System.out.println(firstDuplicate(t5_testData2));

        int[] t5_testData3 = {1, 2, 2, 3};
        System.out.println(firstDuplicate(t5_testData3));

        int[] t5_testData4 = {1, 2, 3, 3, 4, 1};
        System.out.println(firstDuplicate(t5_testData4));
    }
}
