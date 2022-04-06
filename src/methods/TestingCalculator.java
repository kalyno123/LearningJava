package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {

        int i1 = 15, i2 = 2;
        int resultInt = Calculator.divide(i1, i2); // returns int --> (15 / 2)
        System.out.println(resultInt); // 7

        double d1 = 15, d2 = 2;
        double resultDouble = Calculator.divide(i1, i2); // returns double --> (15 / 2)
        System.out.println(resultDouble); // 7.0


        int sumInt1 = 10, sumInt2 = 2;
        int sumResult1 = Calculator.additionInt(sumInt1, sumInt2); // returns int --> (10 + 2)
        System.out.println(sumResult1); // 12

        double sumDub1 = 10.5, sumDub2 = 2.5;
        double sumResult2 = Calculator.additionDouble(sumDub1, sumDub2); // returns double --> (10.5 + 2.5)
        System.out.println(sumResult2); // 13.0

        int absInt1 = 20, absInt2 = 2;
        int absResult1 = Calculator.absdifferenceInt(absInt1, absInt2); // returns int --> Math.abs(20 - 2)
        System.out.println(absResult1); // 18

        double absDub1 = 20.5, absDub2 = 2.0;
        double absResult2 = Calculator.absdifferenceDouble(absDub1, absDub2); // returns double --> Math.abs(20.5 - 2.0)
        System.out.println(absResult2); // 18.5

        int multiplyInt1 = 5, multiplyInt2 = 2;
        int multiplyResult1 = Calculator.multiplicationInt(multiplyInt1, multiplyInt2); // returns int --> (5 * 2)
        System.out.println(multiplyResult1); // 10

        double multiplyDub1 = 5.5, multiplyDub2 = 2.5;
        double multiplyResult2 = Calculator.multiplicationDouble(multiplyDub1, multiplyDub2); // returns int --> (5.5 * 2.5)
        System.out.println(multiplyResult2); // 13.75




    }
}
