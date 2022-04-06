package loops.whileLoops;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userNumber = scan.nextInt();
        int randomNumber = random.nextInt(10) + 1;
        int myNumber = 7;

        // SCANNER NUMBER
        while (userNumber != myNumber){
            userNumber = scan.nextInt();
        }
        System.out.println("Finally you guessed the number!");

        // RANDOM NUMBER
        int attempt = 1;
        while (randomNumber != myNumber){
            System.out.println("My random attempt is = " + userNumber);
            userNumber = random.nextInt(10 + 1);
            attempt++;
        }
        System.out.println("Finally you guessed the number!");
        System.out.println("You could find it after " + attempt + " times!!!");




    }
}
