package methods;

import utilities.MathHelper;

public class FindTheGreatestOf3Numbers {
    public static void main(String[] args) {

        // Math.Max(5, 1, 3); --> this would result in a compiler error

        int max1 = MathHelper.maxOfThree(5, 1, 3); // --> now able to use 3 values to find max with the newly created method
        // must but int inside the new method bc that was the argument set when it was created
        System.out.println(max1);

        double max2 = MathHelper.maxOfThree(1.1, 2.2, 3.3);
        System.out.println();

        byte b1 = (byte)(Math.random()*10), b2 = (byte)(Math.random()*10), b3 = (byte)(Math.random()*10);
        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);
        System.out.println("Min number is = " + MathHelper.minOfThree(b1, b2, b3));




    }
}
