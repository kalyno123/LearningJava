package methods;

import utilities.Calculator;
import utilities.RandomNumberGenerator;

public class TestingRandomNumberGenerator {
    public static void main(String[] args) {

       // generate 2 random numbers between 37 and 63 and find their quotient.
        // (Math.random() * 63 - 37 + 1) + 37        (inside () simplify to = 27)

        int random1 = RandomNumberGenerator.getRandomNumber(37, 63);
        int random2 = RandomNumberGenerator.getRandomNumber(37, 63);

        System.out.println("Random number = " + random1);
        System.out.println("Random number = " + random2);

        System.out.println(Calculator.divide(random1, random2));






    }
}
