package ifElseStatement.nestedIfElseStatement;

import java.util.Scanner;

public class GoldNumber {
    public static void main(String[] args) {
    /* PSEUDO CODE:
    1. generates a random number bt -50 and 50
    2. if number is positive, then we will win 10 points
    3. if number is more than 25, then we will win extra 10 points
    4. if number is -7, then we will win extra 10 points
    5. lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points

    IF THEY CANNOT BE PRESENT AT THE SAME TIME THEN THEY ARE LINKED. SO USE IF ELSEIF ELSE.
    IF THEY CAN BE PRESENT AT THE SAME TIME THEN THEY ARE NOT LINKED. SO USE IF ELSE IF ELSE.
    */
        int point = 0;
        int random = (int) (Math.random() * 101) - 50;
        System.out.println("random number = " + random);

        if (random > 0){ // positive
            point += 10;
            if (random > 25){
                point += 10;
            }else if (random == 7){
                point += 100;
            }
        }else if (random < 0){ // negative
                point += 0;
            if (random < -25){
                point += 0;
            }else if (random == -7){
                point += 10;
            }
        }else { // zero
            point += 0;
        }
        System.out.println("Points = " + point);


        System.out.println("Please enter your age");

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age >= 16){
            System.out.println("You can drive");
                if (age >= 18){
                    System.out.println("You can work");
                        if (age >= 21){
                                System.out.println("You can drink");
                            if (age >= 25){
                                    System.out.println("You can rent a car");
                            }
                        }
                    }
                }






    }
}
