package mathClass;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        int x = 45;
        int y = 12;
        int z = 65;
        int v = 123;
        int w = -123;

        int minValueOfXY = Math.min(x,y); // 45,12
        int minValueOfZV = Math.min(z,v); // 65,124
        int minValueOfZVW = Math.min(minValueOfZV,w); // zv,w --> 65,-123
        int minValueOfEvery = Math.min(minValueOfZVW, minValueOfXY); // zab, xy --> -123,45

        // ----------------------------------------------------------------------------------
        /* EXERCISE FOR min() AND max():
        Find min and max of given 3 numbers.
        x = 4, y =67, z =-54 */

        // can go to print statement right away without store the int values
        int a = 4, b = 67, c = -54;
        // this above can be coded without coding the below portion; go straight to print
        int minValueAB = Math.min(a, b);
        int minValueABC = Math.min(minValueAB,c);
        int maxValueAB = Math.max(a,b);
        int maxValueABC = Math.max(maxValueAB,c);

        System.out.println("Min of every number is = " + Math.min(Math.min(a,b),c));
        System.out.println("Max of every number is = " + Math.max(Math.max(a,b),c));


        /* EXERCISE PSEUDO CODE:
        1. print max of given numbers: 4, 56, 23.
         */
        int max1 = 4;
        int max2 = 56;
        int max3 = 23;
        System.out.println("Max of given numbers are = " + Math.max(Math.max(max1, max2), max3));
        // System.out.println("Max of given numbers are = " + Math.max(Math.max(4, 56), 23));


        /* PSEUDO CODE FOR EXERCISE:
        1. ask user for 4 number.
        2. print max and min of given values.
         */
        Scanner numInput = new Scanner(System.in);

        System.out.println("Please enter 4 numbers:");
        int num1 = numInput.nextInt(), num2 = numInput.nextInt(), num3 = numInput.nextInt(), num4 = numInput.nextInt();

        System.out.println("Max = " + Math.max(Math.max(Math.max(num1, num2), num3), num4));
        System.out.println("Min = " + Math.min(Math.min(Math.min(num1, num2), num3), num4));
// System.out.println("Max = " + Math.max(Math.max(Math.max(numInput.nextInt(), numInput.nextInt()), numInput.nextInt()), numInput.nextInt()));

    }

}
