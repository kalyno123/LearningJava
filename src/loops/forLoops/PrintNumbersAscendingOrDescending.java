package loops.forLoops;

import java.util.Random;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {

        /* HOW TO GENERATE RANDOM NUMBERS:
        1. created random generator method
        2. Math.random()
        3. Random objectName = new Random(); --> its overloaded method; some take args, some don't.
            - you MUST specify the bounds as the args in the ();
         */

        Random random = new Random();
        int num1 = random.nextInt(26); // random numbers between 0-25
        int num2 = random.nextInt(26); // random numbers between 0-25

        System.out.println(num1);
        System.out.println(num2);

        // 1ST WAY:
        if (num1>num2){
            for (int i = num2; i <= num1; i++){
                if (i % 5 != 0)System.out.println(i);
            }
        }else{
            for (int i = num1; i <= num2; i++){
                if (i % 5 != 0) System.out.println(i);
            }
        }

        // 2ND WAY:
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if (i % 5 != 0) System.out.println(i);
        }
        // this is how to do it showing the expected output exactly as printed
        String s = "";
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if (i % 5 != 0) s += i + " - ";
        }
            System.out.println(s.substring(0, s.length() - 3));
        if(!s.isEmpty()) System.out.println(s.substring(0, s.length() - 3));
        else System.out.println(s);


    }
}
