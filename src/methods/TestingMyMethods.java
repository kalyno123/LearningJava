package methods;

import utilities.SalsMethods;

public class TestingMyMethods {
    public static void main(String[] args) {

    int num1 = 2, num2 = 6, num3 = 3, num4 = 9;

    // write a program which is going to print max of 4 numbers
        System.out.println(Math.max(Math.max(Math.max(num1, num2), num3), num4));

    // write a program which is going to print max of 4 numbers using the printMaxOf4 method created
        SalsMethods.printMaxOf4(num1, num2, num3, num4); // same as the println() method

    // write a program which is going to print max of 4 numbers using the printMaxOf4 method created
        System.out.println(SalsMethods.findMaxOf4(num1, num2, num3, num4)); // same but with return must invoke println() if you want to see returned value


    }
}
